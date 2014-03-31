package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;

@Entity
@Table(name = "CLAVE_WEBMX", catalog = "", schema = "MEXWEB")
public class ClaveWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ClaveWebmxPK claveWebmxPK;
    @Basic(optional = false)
    @Column(name = "CARACTERES")
    private String caracteres;
    @JoinColumn(name = "IDTARJETA", referencedColumnName = "IDTARJETA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TarjetaWebmx tarjetaWebmx;

    public ClaveWebmx() {
    }

    public ClaveWebmx(ClaveWebmxPK claveWebmxPK) {
        this.claveWebmxPK = claveWebmxPK;
    }

    public ClaveWebmx(ClaveWebmxPK claveWebmxPK, String caracteres) {
        this.claveWebmxPK = claveWebmxPK;
        this.caracteres = caracteres;
    }

    public ClaveWebmx(Long idtarjeta, Short posicion) {
        this.claveWebmxPK = new ClaveWebmxPK(idtarjeta, posicion);
    }

    public ClaveWebmxPK getClaveWebmxPK() {
        return claveWebmxPK;
    }

    public void setClaveWebmxPK(ClaveWebmxPK claveWebmxPK) {
        this.claveWebmxPK = claveWebmxPK;
    }

    public String getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(String caracteres) {
        this.caracteres = caracteres;
    }

    public TarjetaWebmx getTarjetaWebmx() {
        return tarjetaWebmx;
    }

    public void setTarjetaWebmx(TarjetaWebmx tarjetaWebmx) {
        this.tarjetaWebmx = tarjetaWebmx;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (claveWebmxPK != null ? claveWebmxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClaveWebmx)) {
            return false;
        }
        ClaveWebmx other = (ClaveWebmx) object;
        if ((this.claveWebmxPK == null && other.claveWebmxPK != null) || (this.claveWebmxPK != null && !this.claveWebmxPK.equals(other.claveWebmxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.ClaveWebmx[claveWebmxPK=" + claveWebmxPK + "]";
    }
}
