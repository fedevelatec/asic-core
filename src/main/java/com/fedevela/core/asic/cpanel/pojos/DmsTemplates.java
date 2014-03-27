package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_TEMPLATES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsTemplates.findAll", query = "SELECT d FROM DmsTemplates d"),
        @NamedQuery(name = "DmsTemplates.findByIdTemplate", query = "SELECT d FROM DmsTemplates d WHERE d.idTemplate = :idTemplate"),
        @NamedQuery(name = "DmsTemplates.findByEvalue", query = "SELECT d FROM DmsTemplates d WHERE d.evalue = :evalue"),
        @NamedQuery(name = "DmsTemplates.findByRowstatus", query = "SELECT d FROM DmsTemplates d WHERE d.rowstatus = :rowstatus")})
public class DmsTemplates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_TEMPLATE")
    private String idTemplate;
    @Column(name = "EVALUE")
    private String evalue;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;

    public DmsTemplates() {
        rowstatus = "A";
    }

    public DmsTemplates(String idTemplate) {
        this();
        this.idTemplate = idTemplate;
    }

    public DmsTemplates(String idTemplate, String rowstatus) {
        this.idTemplate = idTemplate;
        this.rowstatus = rowstatus;
    }

    public String getIdTemplate() {
        return idTemplate;
    }

    public void setIdTemplate(String idTemplate) {
        this.idTemplate = idTemplate;
    }

    public String getEvalue() {
        return evalue;
    }

    public void setEvalue(String evalue) {
        this.evalue = evalue;
    }

    public String getRowstatus() {
        return rowstatus;
    }

    public void setRowstatus(String rowstatus) {
        this.rowstatus = rowstatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTemplate != null ? idTemplate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsTemplates)) {
            return false;
        }
        DmsTemplates other = (DmsTemplates) object;
        if ((this.idTemplate == null && other.idTemplate != null) || (this.idTemplate != null && !this.idTemplate.equals(other.idTemplate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsTemplates[idTemplate=" + idTemplate + "]";
    }
}
