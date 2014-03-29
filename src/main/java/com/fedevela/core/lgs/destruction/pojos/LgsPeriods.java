package com.fedevela.core.lgs.destruction.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "LGS_PERIODS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "LgsPeriods.findAll", query = "SELECT l FROM LgsPeriods l"),
        @NamedQuery(name = "LgsPeriods.findByIdPeriod", query = "SELECT l FROM LgsPeriods l WHERE l.idPeriod = :idPeriod"),
        @NamedQuery(name = "LgsPeriods.findByDescription", query = "SELECT l FROM LgsPeriods l WHERE l.description = :description")})
public class LgsPeriods implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PERIOD")
    private BigInteger idPeriod;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lgsPeriods")
    private List<LgsDestructionPlanConfig> lgsDestructionPlanConfigList;

    public LgsPeriods() {
    }

    public LgsPeriods(BigInteger idPeriod) {
        this.idPeriod = idPeriod;
    }

    public BigInteger getIdPeriod() {
        return idPeriod;
    }

    public void setIdPeriod(BigInteger idPeriod) {
        this.idPeriod = idPeriod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LgsDestructionPlanConfig> getLgsDestructionPlanConfigList() {
        return lgsDestructionPlanConfigList;
    }

    public void setLgsDestructionPlanConfigList(List<LgsDestructionPlanConfig> lgsDestructionPlanConfigList) {
        this.lgsDestructionPlanConfigList = lgsDestructionPlanConfigList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPeriod != null ? idPeriod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsPeriods)) {
            return false;
        }
        LgsPeriods other = (LgsPeriods) object;
        if ((this.idPeriod == null && other.idPeriod != null) || (this.idPeriod != null && !this.idPeriod.equals(other.idPeriod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsPeriods[idPeriod=" + idPeriod + "]";
    }

}
