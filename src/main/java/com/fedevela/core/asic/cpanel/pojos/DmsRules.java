package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_RULES", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsRules.findAll", query = "SELECT d FROM DmsRules d"),
        @NamedQuery(name = "DmsRules.findByIdRule", query = "SELECT d FROM DmsRules d WHERE d.idRule = :idRule"),
        @NamedQuery(name = "DmsRules.findByDescription", query = "SELECT d FROM DmsRules d WHERE d.description = :description"),
        @NamedQuery(name = "DmsRules.findByRowstatus", query = "SELECT d FROM DmsRules d WHERE d.rowstatus = :rowstatus")})
public class DmsRules implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_RULE")
    private String idRule;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "ROWSTATUS")
    private String rowstatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsRules")
    private List<DmsIncidentRules> dmsIncidentRulesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dmsRules")
    private List<DmsChecklistRules> dmsChecklistRulesList;

    public DmsRules() {
        rowstatus = "A";
    }

    public DmsRules(String idRule) {
        this();
        this.idRule = idRule;
    }

    public DmsRules(String idRule, String rowstatus) {
        this.idRule = idRule;
        this.rowstatus = rowstatus;
    }

    public String getIdRule() {
        return idRule;
    }

    public void setIdRule(String idRule) {
        this.idRule = idRule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRowstatus() {
        return rowstatus;
    }

    public void setRowstatus(String rowstatus) {
        this.rowstatus = rowstatus;
    }

    public List<DmsIncidentRules> getDmsIncidentRulesList() {
        return dmsIncidentRulesList;
    }

    public void setDmsIncidentRulesList(List<DmsIncidentRules> dmsIncidentRulesList) {
        this.dmsIncidentRulesList = dmsIncidentRulesList;
    }

    public List<DmsChecklistRules> getDmsChecklistRulesList() {
        return dmsChecklistRulesList;
    }

    public void setDmsChecklistRulesList(List<DmsChecklistRules> dmsChecklistRulesList) {
        this.dmsChecklistRulesList = dmsChecklistRulesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRule != null ? idRule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmsRules)) {
            return false;
        }
        DmsRules other = (DmsRules) object;
        if ((this.idRule == null && other.idRule != null) || (this.idRule != null && !this.idRule.equals(other.idRule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.cpanel.pojos.DmsRules[idRule=" + idRule + "]";
    }

}
