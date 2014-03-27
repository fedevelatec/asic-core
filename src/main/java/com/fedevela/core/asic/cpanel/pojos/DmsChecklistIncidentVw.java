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
@Table(name = "DMS_CHECKLIST_INCIDENT_VW", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsChecklistIncidentVw.findAll", query = "SELECT d FROM DmsChecklistIncidentVw d"),
        @NamedQuery(name = "DmsChecklistIncidentVw.findByIdCategory", query = "SELECT d FROM DmsChecklistIncidentVw d WHERE d.idCategory = :idCategory"),
        @NamedQuery(name = "DmsChecklistIncidentVw.findByCategoryDescription", query = "SELECT d FROM DmsChecklistIncidentVw d WHERE d.categoryDescription = :categoryDescription"),
        @NamedQuery(name = "DmsChecklistIncidentVw.findByDescription", query = "SELECT d FROM DmsChecklistIncidentVw d WHERE d.description = :description"),
        @NamedQuery(name = "DmsChecklistIncidentVw.findByRuleCount", query = "SELECT d FROM DmsChecklistIncidentVw d WHERE d.ruleCount = :ruleCount")})
public class DmsChecklistIncidentVw implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmsChecklistIncidentVwPK dmsChecklistIncidentVwPK;
    @Column(name = "GROUP_DESCRIPTION")
    private String groupDescription;
    @Basic(optional = false)
    @Column(name = "ID_CATEGORY")
    private BigInteger idCategory;
    @Column(name = "CATEGORY_DESCRIPTION")
    private String categoryDescription;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "RULE_COUNT")
    private BigInteger ruleCount;

    public DmsChecklistIncidentVw() {
    }

    public DmsChecklistIncidentVw(DmsChecklistIncidentVwPK dmsChecklistIncidentVwPK) {
        this.dmsChecklistIncidentVwPK = dmsChecklistIncidentVwPK;
    }

    public DmsChecklistIncidentVw(BigInteger idOperation,
                                  BigInteger idProduct,
                                  BigInteger idDocument,
                                  BigInteger idGroupChecklist,
                                  BigInteger idIncidentType,
                                  BigInteger idGroup) {
        dmsChecklistIncidentVwPK = new DmsChecklistIncidentVwPK(idOperation, idProduct, idDocument, idGroupChecklist, idIncidentType, idGroup);
    }

    public DmsChecklistIncidentVwPK getDmsChecklistIncidentVwPK() {
        return dmsChecklistIncidentVwPK;
    }

    public void setDmsChecklistIncidentVwPK(DmsChecklistIncidentVwPK dmsChecklistIncidentVwPK) {
        this.dmsChecklistIncidentVwPK = dmsChecklistIncidentVwPK;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getRuleCount() {
        return ruleCount;
    }

    public void setRuleCount(BigInteger ruleCount) {
        this.ruleCount = ruleCount;
    }
}
