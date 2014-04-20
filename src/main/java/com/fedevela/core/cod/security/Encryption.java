package com.fedevela.core.cod.security;

/**
 * Created by Federico on 20/04/14.
 */
import com.fedevela.core.cod.TypeCast;
import java.security.MessageDigest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encryption {

    private Logger log = LoggerFactory.getLogger(Encryption.class);
    private String data;

    /**
     *
     * @param data
     */
    public Encryption(String data) {
        this.data = data;
    }

    /**
     *
     * @param algorithm
     * @return
     */
    private String EXEC(String algorithm) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(algorithm);
            md.update(data.getBytes());
        } catch (Exception ex) {
            log.error(ex.getCause().getMessage(), ex);
        }
        return TypeCast.toString(md.digest());
    }

    /**
     *
     * @return
     */
    public String SHA1() {
        return EXEC("SHA-1");
    }

    /**
     *
     * @return
     */
    public String MD5() {
        return EXEC("MD5");
    }
}