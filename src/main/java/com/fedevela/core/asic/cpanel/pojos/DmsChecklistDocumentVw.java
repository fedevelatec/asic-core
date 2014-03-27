package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_CHECKLIST_DOCUMENT_VW", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsChecklistDocumentVw.findAll", query = "SELECT d FROM DmsChecklistDocumentVw d"),
        @NamedQuery(name = "DmsChecklistDocumentVw.findByIdCategory", query = "SELECT d FROM DmsChecklistDocumentVw d WHERE d.idCategory = :idCategory"),
        @NamedQuery(name = "DmsChecklistDocumentVw.findByCategoryDescription", query = "SELECT d FROM DmsChecklistDocumentVw d WHERE d.categoryDescription = :categoryDescription"),
        @NamedQuery(name = "DmsChecklistDocumentVw.findByGroupDescription", query = "SELECT d FROM DmsChecklistDocumentVw d WHERE d.groupDescription = :groupDescription"),
        @NamedQuery(name = "DmsChecklistDocumentVw.findByDescription", query = "SELECT d FROM DmsChecklistDocumentVw d WHERE d.description = :description"),
        @NamedQuery(name = "DmsChecklistDocumentVw.findByIncidentCount", query = "SELECT d FROM DmsChecklistDocumentVw d WHERE d.incidentCount = :incidentCount"),
        @NamedQuery(name = "DmsChecklistDocumentVw.findByRuleCount", query = "SELECT d FROM DmsChecklistDocumentVw d WHERE d.ruleCount = :ruleCount")})
public class DmsChecklistDocumentVw implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsChecklistDocumentVwPK dmsChecklistDocumentVwPK;
    @Basic(optional = false)
    @Column(name = "ID_CATEGORY")
    private BigInteger idCategory;
    @Column(name = "CATEGORY_DESCRIPTION")
    private String categoryDescription;
    @Column(name = "GROUP_DESCRIPTION")
    private String groupDescription;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "INCIDENT_COUNT")
    private BigInteger incidentCount;
    @Column(name = "RULE_COUNT")
    private BigInteger ruleCount;

    public DmsChecklistDocumentVw() {
    }

    public DmsChecklistDocumentVw(DmsChecklistDocumentVwPK dmsChecklistDocumentVwPK) {
        this.dmsChecklistDocumentVwPK = dmsChecklistDocumentVwPK;
    }

    public DmsChecklistDocumentVw(BigInteger idOperation, BigInteger idProduct, BigInteger idDocument, BigInteger idGroup) {
        dmsChecklistDocumentVwPK = new DmsChecklistDocumentVwPK(idOperation, idProduct, idDocument, idGroup);
    }

    public DmsChecklistDocumentVwPK getDmsChecklistDocumentVwPK() {
        return dmsChecklistDocumentVwPK;
    }

    public void setDmsChecklistDocumentVwPK(DmsChecklistDocumentVwPK dmsChecklistDocumentVwPK) {
        this.dmsChecklistDocumentVwPK = dmsChecklistDocumentVwPK;
    }

    public BigInteger getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(BigInteger idCategory) {
        this.idCategory = idCategory;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getIncidentCount() {
        return incidentCount;
    }

    public void setIncidentCount(BigInteger incidentCount) {
        this.incidentCount = incidentCount;
    }

    public BigInteger getRuleCount() {
        return ruleCount;
    }

    public void setRuleCount(BigInteger ruleCount) {
        this.ruleCount = ruleCount;
    }
}
