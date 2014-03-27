package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "SUCURSAL", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "Sucursal.findAll", query = "SELECT s FROM Sucursal s")})
public class Sucursal implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SucursalPK sucursalPK;
    @Basic(optional = false)
    @Column(name = "ASCDESC")
    private String ascdesc;
    @Column(name = "ASCDIR")
    private String ascdir;
    @Column(name = "ASCNRO")
    private String ascnro;
    @Column(name = "ASCPISO")
    private String ascpiso;
    @Column(name = "ASCDPTO")
    private String ascdpto;
    @Column(name = "ASCTORRE")
    private String asctorre;
    @Column(name = "ASCLOC")
    private String ascloc;
    @Column(name = "SSCCP")
    private Long ssccp;
    @Column(name = "ASCPROV")
    private String ascprov;
    @Column(name = "ASCTEL")
    private String asctel;
    @Column(name = "ASCFAX")
    private String ascfax;
    @Column(name = "SUC_CCOSTO")
    private String sucCcosto;
    @Column(name = "SUC_COD_REF")
    private String sucCodRef;
    @Column(name = "SUCDMCCOD")
    private Long sucdmccod;

    public Sucursal() {
    }

    public Sucursal(SucursalPK sucursalPK) {
        this.sucursalPK = sucursalPK;
    }

    public Sucursal(SucursalPK sucursalPK, String ascdesc) {
        this.sucursalPK = sucursalPK;
        this.ascdesc = ascdesc;
    }

    public Sucursal(Long scltcod, Long ssccod) {
        this.sucursalPK = new SucursalPK(scltcod, ssccod);
    }

    public SucursalPK getSucursalPK() {
        return sucursalPK;
    }

    public void setSucursalPK(SucursalPK sucursalPK) {
        this.sucursalPK = sucursalPK;
    }

    public String getAscdesc() {
        return ascdesc;
    }

    public void setAscdesc(String ascdesc) {
        this.ascdesc = ascdesc;
    }

    public String getAscdir() {
        return ascdir;
    }

    public void setAscdir(String ascdir) {
        this.ascdir = ascdir;
    }

    public String getAscnro() {
        return ascnro;
    }

    public void setAscnro(String ascnro) {
        this.ascnro = ascnro;
    }

    public String getAscpiso() {
        return ascpiso;
    }

    public void setAscpiso(String ascpiso) {
        this.ascpiso = ascpiso;
    }

    public String getAscdpto() {
        return ascdpto;
    }

    public void setAscdpto(String ascdpto) {
        this.ascdpto = ascdpto;
    }

    public String getAsctorre() {
        return asctorre;
    }

    public void setAsctorre(String asctorre) {
        this.asctorre = asctorre;
    }

    public String getAscloc() {
        return ascloc;
    }

    public void setAscloc(String ascloc) {
        this.ascloc = ascloc;
    }

    public Long getSsccp() {
        return ssccp;
    }

    public void setSsccp(Long ssccp) {
        this.ssccp = ssccp;
    }

    public String getAscprov() {
        return ascprov;
    }

    public void setAscprov(String ascprov) {
        this.ascprov = ascprov;
    }

    public String getAsctel() {
        return asctel;
    }

    public void setAsctel(String asctel) {
        this.asctel = asctel;
    }

    public String getAscfax() {
        return ascfax;
    }

    public void setAscfax(String ascfax) {
        this.ascfax = ascfax;
    }

    public String getSucCcosto() {
        return sucCcosto;
    }

    public void setSucCcosto(String sucCcosto) {
        this.sucCcosto = sucCcosto;
    }

    public String getSucCodRef() {
        return sucCodRef;
    }

    public void setSucCodRef(String sucCodRef) {
        this.sucCodRef = sucCodRef;
    }

    public Long getSucdmccod() {
        return sucdmccod;
    }

    public void setSucdmccod(Long sucdmccod) {
        this.sucdmccod = sucdmccod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sucursalPK != null ? sucursalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursal)) {
            return false;
        }
        Sucursal other = (Sucursal) object;
        if ((this.sucursalPK == null && other.sucursalPK != null) || (this.sucursalPK != null && !this.sucursalPK.equals(other.sucursalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return ascdesc;
    }

}
