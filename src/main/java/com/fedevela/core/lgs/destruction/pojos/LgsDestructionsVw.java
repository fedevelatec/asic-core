package com.fedevela.core.lgs.destruction.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "LGS_DESTRUCTIONS_VW", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "LgsDestructionsVw.findAll", query = "SELECT l FROM LgsDestructionsVw l"),
        @NamedQuery(name = "LgsDestructionsVw.findByIdLabel", query = "SELECT l FROM LgsDestructionsVw l WHERE l.idLabel = :idLabel"),
        @NamedQuery(name = "LgsDestructionsVw.findByIdLabelType", query = "SELECT l FROM LgsDestructionsVw l WHERE l.idLabelType = :idLabelType"),
        @NamedQuery(name = "LgsDestructionsVw.findByIdCustomer", query = "SELECT l FROM LgsDestructionsVw l WHERE l.idCustomer = :idCustomer"),
        @NamedQuery(name = "LgsDestructionsVw.findByLabelType", query = "SELECT l FROM LgsDestructionsVw l WHERE l.labelType = :labelType"),
        @NamedQuery(name = "LgsDestructionsVw.findByCustomer", query = "SELECT l FROM LgsDestructionsVw l WHERE l.customer = :customer"),
        @NamedQuery(name = "LgsDestructionsVw.findByBoxDetails", query = "SELECT l FROM LgsDestructionsVw l WHERE l.boxDetails = :boxDetails"),
        @NamedQuery(name = "LgsDestructionsVw.findByDestructionDate", query = "SELECT l FROM LgsDestructionsVw l WHERE l.destructionDate = :destructionDate")})
public class LgsDestructionsVw implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_LABEL")
    private BigInteger idLabel;
    @Column(name = "ID_LABEL_TYPE")
    private BigInteger idLabelType;
    @Column(name = "ID_WORKFLOW_STATE")
    private String idWorkflowState;
    @Column(name = "ID_CUSTOMER")
    private short idCustomer;
    @Column(name = "LABEL_TYPE")
    private String labelType;
    @Column(name = "WORKFLOW_STATE")
    private String workflowState;
    @Column(name = "CUSTOMER")
    private String customer;
    @Column(name = "BOX_DETAILS")
    private String boxDetails;
    @Column(name = "DESTRUCTION_DATE")
    @Temporal(TemporalType.DATE)
    private Date destructionDate;

    public LgsDestructionsVw() {
    }

    public BigInteger getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(BigInteger idLabel) {
        this.idLabel = idLabel;
    }

    public BigInteger getIdLabelType() {
        return idLabelType;
    }

    public void setIdLabelType(BigInteger idLabelType) {
        this.idLabelType = idLabelType;
    }

    public String getIdWorkflowState() {
        return idWorkflowState;
    }

    public void setIdWorkflowState(String idWorkflowState) {
        this.idWorkflowState = idWorkflowState;
    }

    public short getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(short idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBoxDetails() {
        return boxDetails;
    }

    public void setBoxDetails(String boxDetails) {
        this.boxDetails = boxDetails;
    }

    public Date getDestructionDate() {
        return destructionDate;
    }

    public void setDestructionDate(Date destructionDate) {
        this.destructionDate = destructionDate;
    }
}
