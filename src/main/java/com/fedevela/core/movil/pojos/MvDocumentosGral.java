package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "MV_DOCUMENTOS_GRAL", schema="PROD")
@XmlRootElement
public class MvDocumentosGral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private BigInteger nunicodoc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private BigDecimal nunicodoct;
    @Basic(optional = false)
    @Column(name = "PAQUETE")
    private String paquete;
    @Basic(optional = false)
    @Column(name = "ID_TIPO_ENVIO")
    private char idTipoEnvio;
    @Column(name = "FECHA_CARGA")
    @Temporal(TemporalType.DATE)
    private Date fechaCarga;
    @Column(name = "FECHA_CAPTURA")
    @Temporal(TemporalType.DATE)
    private Date fechaCaptura;
    @Basic(optional = false)
    @Column(name = "ID_TIPO_DOCUMENTO")
    private BigInteger idTipoDocumento;
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "INGRESADO")
    private String ingresado;

    public MvDocumentosGral() {
    }

    public MvDocumentosGral(BigDecimal nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public MvDocumentosGral(BigDecimal nunicodoct, BigInteger nunicodoc, String paquete, char idTipoEnvio, BigInteger idTipoDocumento, String ingresado) {
        this.nunicodoct = nunicodoct;
        this.nunicodoc = nunicodoc;
        this.paquete = paquete;
        this.idTipoEnvio = idTipoEnvio;
        this.idTipoDocumento = idTipoDocumento;
        this.ingresado = ingresado;
    }

    public BigInteger getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(BigInteger nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public BigDecimal getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(BigDecimal nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public char getIdTipoEnvio() {
        return idTipoEnvio;
    }

    public void setIdTipoEnvio(char idTipoEnvio) {
        this.idTipoEnvio = idTipoEnvio;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(Date fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

    public BigInteger getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(BigInteger idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getIngresado() {
        return ingresado;
    }

    public void setIngresado(String ingresado) {
        this.ingresado = ingresado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoct != null ? nunicodoct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvDocumentosGral)) {
            return false;
        }
        MvDocumentosGral other = (MvDocumentosGral) object;
        if ((this.nunicodoct == null && other.nunicodoct != null) || (this.nunicodoct != null && !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adea.ws.bbvaAdquis.MvDocumentosGral[ nunicodoct=" + nunicodoct + " ]";
    }

}
