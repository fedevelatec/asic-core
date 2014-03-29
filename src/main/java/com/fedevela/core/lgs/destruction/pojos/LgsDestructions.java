package com.fedevela.core.lgs.destruction.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import com.fedevela.core.asic.cpanel.pojos.DmsLabelTypes;
import com.fedevela.core.workflow.pojos.DmsWorkflowStates;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LGS_DESTRUCTIONS", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "LgsDestructions.findAll", query = "SELECT l FROM LgsDestructions l"),
        @NamedQuery(name = "LgsDestructions.findByIdLabel", query = "SELECT l FROM LgsDestructions l WHERE l.lgsDestructionsPK.idLabel = :idLabel"),
        @NamedQuery(name = "LgsDestructions.findByIdLabelType", query = "SELECT l FROM LgsDestructions l WHERE l.lgsDestructionsPK.idLabelType = :idLabelType"),
        @NamedQuery(name = "LgsDestructions.findByLogin", query = "SELECT l FROM LgsDestructions l WHERE l.login = :login"),
        @NamedQuery(name = "LgsDestructions.findByNow", query = "SELECT l FROM LgsDestructions l WHERE l.now = :now")})
public class LgsDestructions implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LgsDestructionsPK lgsDestructionsPK;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.DATE)
    private Date now;
    @JoinColumn(name = "ID_WORKFLOW_STATE", referencedColumnName = "ID_WORKFLOW_STATE")
    @ManyToOne(optional = false)
    private DmsWorkflowStates dmsWorkflowStates;
    @JoinColumn(name = "ID_LABEL_TYPE", referencedColumnName = "ID_LABEL_TYPE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsLabelTypes dmsLabelTypes;

    public LgsDestructions() {
    }

    public LgsDestructions(LgsDestructionsPK lgsDestructionsPK) {
        this.lgsDestructionsPK = lgsDestructionsPK;
    }

    public LgsDestructions(LgsDestructionsPK lgsDestructionsPK, String login, Date now) {
        this.lgsDestructionsPK = lgsDestructionsPK;
        this.login = login;
        this.now = now;
    }

    public LgsDestructions(BigInteger idLabel, BigInteger idLabelType) {
        this.lgsDestructionsPK = new LgsDestructionsPK(idLabel, idLabelType);
    }

    public LgsDestructionsPK getLgsDestructionsPK() {
        return lgsDestructionsPK;
    }

    public void setLgsDestructionsPK(LgsDestructionsPK lgsDestructionsPK) {
        this.lgsDestructionsPK = lgsDestructionsPK;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public DmsWorkflowStates getDmsWorkflowStates() {
        return dmsWorkflowStates;
    }

    public void setDmsWorkflowStates(DmsWorkflowStates dmsWorkflowStates) {
        this.dmsWorkflowStates = dmsWorkflowStates;
    }

    public DmsLabelTypes getDmsLabelTypes() {
        return dmsLabelTypes;
    }

    public void setDmsLabelTypes(DmsLabelTypes dmsLabelTypes) {
        this.dmsLabelTypes = dmsLabelTypes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lgsDestructionsPK != null ? lgsDestructionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgsDestructions)) {
            return false;
        }
        LgsDestructions other = (LgsDestructions) object;
        if ((this.lgsDestructionsPK == null && other.lgsDestructionsPK != null) || (this.lgsDestructionsPK != null && !this.lgsDestructionsPK.equals(other.lgsDestructionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.lgs.destruction.pojos.LgsDestructions[lgsDestructionsPK=" + lgsDestructionsPK + "]";
    }

}
