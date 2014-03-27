package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * CabeceraDoc is a mapping of CABECERA_DOC Table. <ul> <li>comments:
 * Equivalente a REFERENC pero para LEGAJOS. Los legajos van dentro de las
 * Cajas, y se refieren a otra refernciacion que es para los documentos que
 * estan dentro de las Cajas.
 *
 * Tiene relacion maestro-detalle con detalle-sello. En detalle_sello se tiene
 * el numero unico de caja donde esta el legajo.
 *
 * LEGAJO = DOCUMENTO = EXPEDIENTE pero <> PAQUETES. Las etiquetas de Legajos
 * empiezan con 'U', los de paquetes empeizan con 'P'. </li> </ul>
 *
 * @author Francisco Villa Ramos
 */
@Entity
@Table(name = "CABECERA_DOC", catalog = "", schema = "PROD")
@XmlRootElement
public class CabeceraDoc implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Basic(optional = false)
    @Column(name = "DOCADEACLT")
    private Long docadeaclt;
    @Column(name = "NROIDENTDOC")
    private String nroidentdoc;
    @Column(name = "DFCH")
    @Temporal(TemporalType.DATE)
    private Date dfch;
    @Basic(optional = false)
    @Column(name = "EST_GRL")
    private Long estGrl;
    @Basic(optional = false)
    @Column(name = "ARESPONSABLE", updatable = false)
    private String aresponsable;
    @Basic(optional = false)
    @Column(name = "DFCHALT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfchalt;
    @Column(name = "DFCHALTSIST", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dfchaltsist;
    @Column(name = "NROREFERENC")
    private String nroreferenc;
    @Column(name = "ORIG_TIPODOC")
    private Long origTipodoc;
    @Column(name = "IMG")
    private String img;
    @Column(name = "PATH")
    private String path;
    @Column(name = "CANT_IMGS")
    private Long cantImgs;
    @Column(name = "IMG_KB")
    private Long imgKb;
    @Column(name = "DFCHDDE")
    @Temporal(TemporalType.DATE)
    private Date dfchdde;
    @Column(name = "DFCHH")
    @Temporal(TemporalType.DATE)
    private Date dfchh;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "DOCCOD")
    private Long doccod;
    @Column(name = "TERCERO")
    private Long tercero;
    @Column(name = "TITULAR")
    private Long titular;
    @Column(name = "SSCCOD")
    private Long ssccod;
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cabeceraDoc", fetch = FetchType.EAGER)
    private Set<CabeceraDocCte1Ph> cabeceraDocCte1Ph = new HashSet<CabeceraDocCte1Ph>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cabeceraDoc", fetch = FetchType.EAGER)
    private Set<ChecklistCap> checklistCap = new HashSet<ChecklistCap>();
    //    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cabeceraDoc")
//    private DetalleSello detalleSello;
    @Deprecated
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cabeceraDoc", optional = true)
    private CdDatosGrales cdDatosGrales;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cabeceraDoc")
    private CabeceraDocDato cabeceraDocDato;

    @JsonIgnore
    public Set<ChecklistCap> getChecklistCap() {
        return checklistCap;
    }

    public void setChecklistCap(Set<ChecklistCap> checklistCap) {
        this.checklistCap = checklistCap;
    }

    @JsonIgnore
    public Set<CabeceraDocCte1Ph> getCabeceraDocCte1Ph() {
        return cabeceraDocCte1Ph;
    }

    public void setCabeceraDocCte1Ph(Set<CabeceraDocCte1Ph> cabeceraDocCte1Ph) {
        this.cabeceraDocCte1Ph = cabeceraDocCte1Ph;
    }

    public String getAresponsable() {
        return aresponsable;
    }

    public void setAresponsable(String aresponsable) {
        this.aresponsable = aresponsable;
    }

    public Long getCantImgs() {
        return cantImgs;
    }

    public void setCantImgs(Long cantImgs) {
        this.cantImgs = cantImgs;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getDfch() {
        return dfch;
    }

    public void setDfch(Date dfch) {
        this.dfch = dfch;
    }

    public Date getDfchalt() {
        return dfchalt;
    }

    public void setDfchalt(Date dfchalt) {
        this.dfchalt = dfchalt;
    }

    public Date getDfchaltsist() {
        return dfchaltsist;
    }

    public void setDfchaltsist(Date dfchaltsist) {
        this.dfchaltsist = dfchaltsist;
    }

    public Date getDfchdde() {
        return dfchdde;
    }

    public void setDfchdde(Date dfchdde) {
        this.dfchdde = dfchdde;
    }

    public Date getDfchh() {
        return dfchh;
    }

    public void setDfchh(Date dfchh) {
        this.dfchh = dfchh;
    }

    public Long getDocadeaclt() {
        return docadeaclt;
    }

    public void setDocadeaclt(Long docadeaclt) {
        this.docadeaclt = docadeaclt;
    }

    public Long getDoccod() {
        return doccod;
    }

    public void setDoccod(Long doccod) {
        this.doccod = doccod;
    }

    public Long getEstGrl() {
        return estGrl;
    }

    public void setEstGrl(Long estGrl) {
        this.estGrl = estGrl;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getImgKb() {
        return imgKb;
    }

    public void setImgKb(Long imgKb) {
        this.imgKb = imgKb;
    }

    public String getNroidentdoc() {
        return nroidentdoc;
    }

    public void setNroidentdoc(String nroidentdoc) {
        this.nroidentdoc = nroidentdoc;
    }

    public String getNroreferenc() {
        return nroreferenc;
    }

    public void setNroreferenc(String nroreferenc) {
        this.nroreferenc = nroreferenc;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getOrigTipodoc() {
        return origTipodoc;
    }

    public void setOrigTipodoc(Long origTipodoc) {
        this.origTipodoc = origTipodoc;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Long getSsccod() {
        return ssccod;
    }

    public void setSsccod(Long ssccod) {
        this.ssccod = ssccod;
    }

    public Long getTercero() {
        return tercero;
    }

    public void setTercero(Long tercero) {
        this.tercero = tercero;
    }

    public Long getTitular() {
        return titular;
    }

    public void setTitular(Long titular) {
        this.titular = titular;
    }

//    @XmlTransient
//    @JsonIgnore
//    public DetalleSello getDetalleSello() {
//        return detalleSello;
//    }
//
//    public void setDetalleSello(DetalleSello detalleSello) {
//        this.detalleSello = detalleSello;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoc != null ? nunicodoc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CabeceraDoc)) {
            return false;
        }
        CabeceraDoc other = (CabeceraDoc) object;
        if ((this.nunicodoc == null && other.nunicodoc != null) || (this.nunicodoc != null && !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.CabeceraDoc[nunicodoc=" + nunicodoc + "]";
    }

    @Deprecated
    @XmlTransient
    public CdDatosGrales getCdDatosGrales() {
        return cdDatosGrales;
    }

    @Deprecated
    public void setCdDatosGrales(CdDatosGrales cdDatosGrales) {
        this.cdDatosGrales = cdDatosGrales;
    }

    @XmlTransient
    public CabeceraDocDato getCabeceraDocDato() {
        return cabeceraDocDato;
    }

    public void setCabeceraDocDato(CabeceraDocDato cabeceraDocDato) {
        this.cabeceraDocDato = cabeceraDocDato;
    }
}
