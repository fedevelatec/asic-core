package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "MV_RETIRO_DETA_GRAL", schema="PROD")
@XmlRootElement
public class MvRetiroDetaGral implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MvRetiroDetaGralPK mvRetiroDetaGralPK;
    @Column(name = "ID_TIPO")
    private String idTipo;
    @JoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private MvRetiroGral mvRetiroGral;

    public MvRetiroDetaGral() {
    }

    public MvRetiroDetaGral(MvRetiroDetaGralPK mvRetiroDetaGralPK) {
        this.mvRetiroDetaGralPK = mvRetiroDetaGralPK;
    }

    public MvRetiroDetaGral(long idRetiro, long etiqueta) {
        this.mvRetiroDetaGralPK = new MvRetiroDetaGralPK(idRetiro, etiqueta);
    }

    public MvRetiroDetaGralPK getMvRetiroDetaGralPK() {
        return mvRetiroDetaGralPK;
    }

    public void setMvRetiroDetaGralPK(MvRetiroDetaGralPK mvRetiroDetaGralPK) {
        this.mvRetiroDetaGralPK = mvRetiroDetaGralPK;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public MvRetiroGral getMvRetiroGral() {
        return mvRetiroGral;
    }

    public void setMvRetiroGral(MvRetiroGral mvRetiroGral) {
        this.mvRetiroGral = mvRetiroGral;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mvRetiroDetaGralPK != null ? mvRetiroDetaGralPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvRetiroDetaGral)) {
            return false;
        }
        MvRetiroDetaGral other = (MvRetiroDetaGral) object;
        if ((this.mvRetiroDetaGralPK == null && other.mvRetiroDetaGralPK != null) || (this.mvRetiroDetaGralPK != null && !this.mvRetiroDetaGralPK.equals(other.mvRetiroDetaGralPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adea.ws.bbvaAdquis.MvRetiroDetaGral[ mvRetiroDetaGralPK=" + mvRetiroDetaGralPK + " ]";
    }

}
