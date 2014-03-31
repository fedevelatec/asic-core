package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "VW_TRANSACTION_WEBMX", catalog = "", schema = "MEXWEB")
public class VwTransactionWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private BigInteger id;
    @Basic(optional = false)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @Column(name = "FULL_NAME")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "LOGIN_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginDate;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Basic(optional = false)
    @Column(name = "TRANSACTION_NAME")
    private String transactionName;
    @Column(name = "TRANSACTION_DETAILS")
    private String transactionDetails;
    @Basic(optional = false)
    @Column(name = "ID_APPLICATION")
    private double idApplication;

    public VwTransactionWebmx() {
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public double getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(double idApplication) {
        this.idApplication = idApplication;
    }
}
