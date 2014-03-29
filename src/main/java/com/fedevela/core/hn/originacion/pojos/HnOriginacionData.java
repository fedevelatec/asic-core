package com.fedevela.core.hn.originacion.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "HN_ORIGINACION_DATA", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnOriginacionData.findAll", query = "SELECT h FROM HnOriginacionData h"),
        @NamedQuery(name = "HnOriginacionData.findByIdOriginacionData", query = "SELECT h FROM HnOriginacionData h WHERE h.idOriginacionData = :idOriginacionData"),
        @NamedQuery(name = "HnOriginacionData.findByPeriodo", query = "SELECT h FROM HnOriginacionData h WHERE h.periodo = :periodo"),
        @NamedQuery(name = "HnOriginacionData.findByEntiofi", query = "SELECT h FROM HnOriginacionData h WHERE h.entiofi = :entiofi"),
        @NamedQuery(name = "HnOriginacionData.findByCuenta", query = "SELECT h FROM HnOriginacionData h WHERE h.cuenta = :cuenta"),
        @NamedQuery(name = "HnOriginacionData.findBySubpro", query = "SELECT h FROM HnOriginacionData h WHERE h.subpro = :subpro"),
        @NamedQuery(name = "HnOriginacionData.findByMoneda", query = "SELECT h FROM HnOriginacionData h WHERE h.moneda = :moneda"),
        @NamedQuery(name = "HnOriginacionData.findByVeinteDigitos", query = "SELECT h FROM HnOriginacionData h WHERE h.veinteDigitos = :veinteDigitos"),
        @NamedQuery(name = "HnOriginacionData.findByLargo", query = "SELECT h FROM HnOriginacionData h WHERE h.largo = :largo"),
        @NamedQuery(name = "HnOriginacionData.findByCreditoAdea", query = "SELECT h FROM HnOriginacionData h WHERE h.creditoAdea = :creditoAdea")})
public class HnOriginacionData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ORIGINACION_DATA")
    private BigDecimal idOriginacionData;
    @Column(name = "PERIODO")
    private String periodo;
    @Column(name = "ENTIOFI")
    private String entiofi;
    @Column(name = "CUENTA")
    private String cuenta;
    @Column(name = "SUBPRO")
    private String subpro;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "VEINTE_DIGITOS")
    private String veinteDigitos;
    @Column(name = "LARGO")
    private BigInteger largo;
    @Column(name = "CREDITO_ADEA")
    private String creditoAdea;

    public HnOriginacionData() {
    }

    public HnOriginacionData(BigDecimal idOriginacionData) {
        this.idOriginacionData = idOriginacionData;
    }

    public BigDecimal getIdOriginacionData() {
        return idOriginacionData;
    }

    public void setIdOriginacionData(BigDecimal idOriginacionData) {
        this.idOriginacionData = idOriginacionData;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEntiofi() {
        return entiofi;
    }

    public void setEntiofi(String entiofi) {
        this.entiofi = entiofi;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getSubpro() {
        return subpro;
    }

    public void setSubpro(String subpro) {
        this.subpro = subpro;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getVeinteDigitos() {
        return veinteDigitos;
    }

    public void setVeinteDigitos(String veinteDigitos) {
        this.veinteDigitos = veinteDigitos;
    }

    public BigInteger getLargo() {
        return largo;
    }

    public void setLargo(BigInteger largo) {
        this.largo = largo;
    }

    public String getCreditoAdea() {
        return creditoAdea;
    }

    public void setCreditoAdea(String creditoAdea) {
        this.creditoAdea = creditoAdea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOriginacionData != null ? idOriginacionData.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnOriginacionData)) {
            return false;
        }
        HnOriginacionData other = (HnOriginacionData) object;
        if ((this.idOriginacionData == null && other.idOriginacionData != null) || (this.idOriginacionData != null && !this.idOriginacionData.equals(other.idOriginacionData))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.originacion.pojos.HnOriginacionData[idOriginacionData=" + idOriginacionData + "]";
    }

}
