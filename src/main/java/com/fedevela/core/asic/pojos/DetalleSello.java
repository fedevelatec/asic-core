package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * DetalleSello is a mapping of DETALLE_SELLO Table. <ul> <li>comments:
 * Relacionado con la identificacion de los legajos, Muy importante, es para
 * saber en que Caja esta cada legajo. Tiene relacion maestro-detalle con
 * cabecera-doc. Se relacionan por nunicodoc. Identifica donde esta el legajo.
 * </li> </ul>
 *
 */
@Entity
@Table(name = "DETALLE_SELLO", catalog = "", schema = "PROD")
public class DetalleSello implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "NUNICOSELLO")
    private Long nunicosello;
    @Basic(optional = false)
    @Column(name = "TIPO_UBIC")
    private Long tipoUbic;
    @Column(name = "POSICION")
    private Long posicion;
    @Column(name = "FLAGS")
    private Long flags;
//    @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false)
//    @OneToOne(optional = false)
//    private CabeceraDoc cabeceraDoc;

    public Long getFlags() {
        return flags;
    }

    public void setFlags(Long flags) {
        this.flags = flags;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicosello() {
        return nunicosello;
    }

    public void setNunicosello(Long nunicosello) {
        this.nunicosello = nunicosello;
    }

    public Long getPosicion() {
        return posicion;
    }

    public void setPosicion(Long posicion) {
        this.posicion = posicion;
    }

    public Long getTipoUbic() {
        return tipoUbic;
    }

    public void setTipoUbic(Long tipoUbic) {
        this.tipoUbic = tipoUbic;
    }

//    @XmlTransient
//    @JsonIgnore
//    public CabeceraDoc getCabeceraDoc() {
//        return cabeceraDoc;
//    }
//
//    public void setCabeceraDoc(CabeceraDoc cabeceraDoc) {
//        this.cabeceraDoc = cabeceraDoc;
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DetalleSello other = (DetalleSello) obj;
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return String.valueOf(this.nunicodoc);
    }
}
