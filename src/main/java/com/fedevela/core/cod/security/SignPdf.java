package com.fedevela.core.cod.security;

/**
 * Created by Federico on 20/04/14.
 */
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfSignatureAppearance;
import com.lowagie.text.pdf.PdfStamper;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import com.fedevela.core.cod.TypeCast;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignPdf
        implements Serializable
{
    private static Logger logger = LoggerFactory.getLogger(SignPdf.class);
    private String password;
    private boolean visible = true;
    private KeyStore ks = null;

    public SignPdf(String ksurl, String ksPassword, String password, boolean visible)
    {
        try
        {
            this.visible = visible;
            this.password = password;
            this.ks = KeyStore.getInstance(KeyStore.getDefaultType());
            this.ks.load(new URL(ksurl).openStream(), ksPassword.toCharArray());
        }
        catch (Exception ex)
        {
            logger.error(ex.getLocalizedMessage(), ex);
        }
    }

    public OutputStream sign(InputStream pdf, Map<String, Object> property)
    {
        try
        {
            PdfReader reader = new PdfReader(pdf);
            OutputStream writer = new ByteArrayOutputStream();
            PdfStamper stp = PdfStamper.createSignature(reader, writer, '\000');
            PdfSignatureAppearance sap = stp.getSignatureAppearance();
            String alias = (String)this.ks.aliases().nextElement();
            PrivateKey key = (PrivateKey)this.ks.getKey(alias, this.password.toCharArray());
            Certificate[] chain = this.ks.getCertificateChain(alias);
            sap.setCrypto(key, chain, null, PdfSignatureAppearance.VERISIGN_SIGNED);
            if (property.containsKey("REASON")) {
                sap.setReason((String)property.get("REASON"));
            }
            if (property.containsKey("LOCATION")) {
                sap.setLocation((String)property.get("LOCATION"));
            }
            if (property.containsKey("CONTACT")) {
                sap.setContact((String)property.get("CONTACT"));
            }
            Calendar c = Calendar.getInstance();
            c.setLenient(false);
            c.setTime(new Date());
            c.add(5, -1);
            sap.setSignDate(c);
            if (this.visible)
            {
                float llx = !property.containsKey("LEFT") ? 0.0F : TypeCast.toFloat(property.get("LEFT")).floatValue();
                float lly = !property.containsKey("TOP") ? 0.0F : TypeCast.toFloat(property.get("TOP")).floatValue();
                float urx = !property.containsKey("WIDTH") ? 0.0F : TypeCast.toFloat(property.get("WIDTH")).floatValue();
                float ury = !property.containsKey("HEIGHT") ? 0.0F : TypeCast.toFloat(property.get("HEIGHT")).floatValue();
                sap.setVisibleSignature(new Rectangle(llx, lly, urx, ury), 1, null);
            }
            stp.close();
            return writer;
        }
        catch (Exception ex)
        {
            logger.error(ex.getLocalizedMessage(), ex);
        }
        return null;
    }
}
