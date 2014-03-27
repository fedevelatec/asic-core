package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Table(name = "LOG_CAJA_PRECINTO", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "LogCajaPrecinto.findAll", query = "SELECT l FROM LogCajaPrecinto l"),
        @NamedQuery(name = "LogCajaPrecinto.findByCajaId", query = "SELECT l FROM LogCajaPrecinto l WHERE l.logCajaPrecintoPK.cajaId = :cajaId"),
        @NamedQuery(name = "LogCajaPrecinto.findByNroprecinto1", query = "SELECT l FROM LogCajaPrecinto l WHERE l.nroprecinto1 = :nroprecinto1"),
        @NamedQuery(name = "LogCajaPrecinto.findByNroprecinto2", query = "SELECT l FROM LogCajaPrecinto l WHERE l.nroprecinto2 = :nroprecinto2"),
        @NamedQuery(name = "LogCajaPrecinto.findByLogin", query = "SELECT l FROM LogCajaPrecinto l WHERE l.login = :login"),
        @NamedQuery(name = "LogCajaPrecinto.findByMovimiento", query = "SELECT l FROM LogCajaPrecinto l WHERE l.logCajaPrecintoPK.movimiento = :movimiento"),
        @NamedQuery(name = "LogCajaPrecinto.findByTerminal", query = "SELECT l FROM LogCajaPrecinto l WHERE l.terminal = :terminal"),
        @NamedQuery(name = "LogCajaPrecinto.findByOsUser", query = "SELECT l FROM LogCajaPrecinto l WHERE l.osUser = :osUser"),
        @NamedQuery(name = "LogCajaPrecinto.findByIpAddress", query = "SELECT l FROM LogCajaPrecinto l WHERE l.ipAddress = :ipAddress"),
        @NamedQuery(name = "LogCajaPrecinto.findByDbUser", query = "SELECT l FROM LogCajaPrecinto l WHERE l.dbUser = :dbUser"),
        @NamedQuery(name = "LogCajaPrecinto.findByNow", query = "SELECT l FROM LogCajaPrecinto l WHERE l.logCajaPrecintoPK.now = :now")})
public class LogCajaPrecinto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LogCajaPrecintoPK logCajaPrecintoPK;
    @Column(name = "NROPRECINTO1")
//    private BigInteger nroprecinto1;
    private String nroprecinto1;
    @Column(name = "NROPRECINTO2")
//    private BigInteger nroprecinto2;
    private String nroprecinto2;
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "TERMINAL")
    private String terminal;
    @Basic(optional = false)
    @Column(name = "OS_USER")
    private String osUser;
    @Column(name = "IP_ADDRESS")
    private String ipAddress;
    @Basic(optional = false)
    @Column(name = "DB_USER")
    private String dbUser;

    public LogCajaPrecinto() {
    }

    public LogCajaPrecinto(LogCajaPrecintoPK logCajaPrecintoPK) {
        this.logCajaPrecintoPK = logCajaPrecintoPK;
    }

    public LogCajaPrecinto(LogCajaPrecintoPK logCajaPrecintoPK, String terminal, String osUser, String dbUser) {
        this.logCajaPrecintoPK = logCajaPrecintoPK;
        this.terminal = terminal;
        this.osUser = osUser;
        this.dbUser = dbUser;
    }

    public LogCajaPrecinto(BigInteger cajaId, char movimiento, Date now) {
        this.logCajaPrecintoPK = new LogCajaPrecintoPK(cajaId, movimiento, now);
    }

    public LogCajaPrecintoPK getLogCajaPrecintoPK() {
        return logCajaPrecintoPK;
    }

    public void setLogCajaPrecintoPK(LogCajaPrecintoPK logCajaPrecintoPK) {
        this.logCajaPrecintoPK = logCajaPrecintoPK;
    }

//    public BigInteger getNroprecinto1() {
//        return nroprecinto1;
//    }
//
//    public void setNroprecinto1(BigInteger nroprecinto1) {
//        this.nroprecinto1 = nroprecinto1;
//    }
//
//    public BigInteger getNroprecinto2() {
//        return nroprecinto2;
//    }
//
//    public void setNroprecinto2(BigInteger nroprecinto2) {
//        this.nroprecinto2 = nroprecinto2;
//    }

    public String getNroprecinto1() {
        return nroprecinto1;
    }

    public void setNroprecinto1(String nroprecinto1) {
        this.nroprecinto1 = nroprecinto1;
    }

    public String getNroprecinto2() {
        return nroprecinto2;
    }

    public void setNroprecinto2(String nroprecinto2) {
        this.nroprecinto2 = nroprecinto2;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getOsUser() {
        return osUser;
    }

    public void setOsUser(String osUser) {
        this.osUser = osUser;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (logCajaPrecintoPK != null ? logCajaPrecintoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LogCajaPrecinto)) {
            return false;
        }
        LogCajaPrecinto other = (LogCajaPrecinto) object;
        if ((this.logCajaPrecintoPK == null && other.logCajaPrecintoPK != null) || (this.logCajaPrecintoPK != null && !this.logCajaPrecintoPK.equals(other.logCajaPrecintoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adea.entity.log.LogCajaPrecinto[ logCajaPrecintoPK=" + logCajaPrecintoPK + " ]";
    }

}
