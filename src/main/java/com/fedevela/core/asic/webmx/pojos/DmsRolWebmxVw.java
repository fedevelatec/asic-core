package com.fedevela.core.asic.webmx.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "DMS_ROL_WEBMX_VW", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DmsRolWebmxVw.findAll", query = "SELECT d FROM DmsRolWebmxVw d"),
        @NamedQuery(name = "DmsRolWebmxVw.findByIdRol", query = "SELECT d FROM DmsRolWebmxVw d WHERE d.idRol = :idRol"),
        @NamedQuery(name = "DmsRolWebmxVw.findByName", query = "SELECT d FROM DmsRolWebmxVw d WHERE d.name = :name"),
        @NamedQuery(name = "DmsRolWebmxVw.findByDescription", query = "SELECT d FROM DmsRolWebmxVw d WHERE d.description = :description")})
public class DmsRolWebmxVw implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ROL")
    private BigInteger idRol;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String description;

    public DmsRolWebmxVw() {
    }

    public BigInteger getIdRol() {
        return idRol;
    }

    public void setIdRol(BigInteger idRol) {
        this.idRol = idRol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
