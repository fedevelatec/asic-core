package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CABECERA_DOC_DATO", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({@NamedQuery(name = "CabeceraDocDato.findAll", query = "SELECT c FROM CabeceraDocDato c")})
public class CabeceraDocDato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Lob
    @Column(name = "DATO")
    private String dato;
    @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private CabeceraDoc cabeceraDoc;

    public CabeceraDocDato() {
    }

    public CabeceraDocDato(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public CabeceraDoc getCabeceraDoc() {
        return cabeceraDoc;
    }

    public void setCabeceraDoc(CabeceraDoc cabeceraDoc) {
        this.cabeceraDoc = cabeceraDoc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabeceraDocDato)) {
            return false;
        }
        CabeceraDocDato other = (CabeceraDocDato) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.gui.utils.pruebas.CabeceraDocDato[ nunicodoc=" + nunicodoc + " ]";
    }

}
