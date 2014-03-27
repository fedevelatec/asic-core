package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CAJA", catalog = "", schema = "PROD")
@XmlRootElement
public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CAJA_ID")
    private Long cajaId;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private Short cliente;
    @Basic(optional = false)
    @Column(name = "NUNICO_HZ")
    private Integer nunicoHz;
    @Basic(optional = false)
    @Column(name = "CAJA_ADEA")
    private Integer cajaAdea;
    @Column(name = "REFERENCIADA")
    private String referenciada;
    @Column(name = "ESTADO_UBICACION")
    private String estadoUbicacion;
    @Column(name = "NROPRECINTO1")
    private Integer nroprecinto1;
    @Column(name = "NROPRECINTO2")
    private Integer nroprecinto2;
    @Column(name = "TIENEETIQUBICFISICA")
    private Character tieneetiqubicfisica;
    @Column(name = "TIENEDOCINTERNAENCONSULTA")
    private Character tienedocinternaenconsulta;
    @Column(name = "TIPO_DE_CONSULTA")
    private String tipoDeConsulta;
    @Basic(optional = false)
    @Column(name = "TIPO_CAJA")
    private String tipoCaja;
    @Column(name = "TIPO_UBIC_ID")
    private Short tipoUbicId;
    @Column(name = "CAJA_TIPO_ID")
    private Short cajaTipoId;
    @Column(name = "LOGIN")
    private String login;

    public Caja() {
    }

    public Caja(Long cajaId) {
        this.cajaId = cajaId;
    }

    public Caja(Long cajaId, Short cliente, Integer nunicoHz, Integer cajaAdea, String tipoCaja) {
        this.cajaId = cajaId;
        this.cliente = cliente;
        this.nunicoHz = nunicoHz;
        this.cajaAdea = cajaAdea;
        this.tipoCaja = tipoCaja;
    }

    public Integer getCajaAdea() {
        return cajaAdea;
    }

    public void setCajaAdea(Integer cajaAdea) {
        this.cajaAdea = cajaAdea;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }

    public Short getCajaTipoId() {
        return cajaTipoId;
    }

    public void setCajaTipoId(Short cajaTipoId) {
        this.cajaTipoId = cajaTipoId;
    }

    public Short getCliente() {
        return cliente;
    }

    public void setCliente(Short cliente) {
        this.cliente = cliente;
    }

    public String getEstadoUbicacion() {
        return estadoUbicacion;
    }

    public void setEstadoUbicacion(String estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getNroprecinto1() {
        return nroprecinto1;
    }

    public void setNroprecinto1(Integer nroprecinto1) {
        this.nroprecinto1 = nroprecinto1;
    }

    public Integer getNroprecinto2() {
        return nroprecinto2;
    }

    public void setNroprecinto2(Integer nroprecinto2) {
        this.nroprecinto2 = nroprecinto2;
    }

    public Integer getNunicoHz() {
        return nunicoHz;
    }

    public void setNunicoHz(Integer nunicoHz) {
        this.nunicoHz = nunicoHz;
    }

    public String getReferenciada() {
        return referenciada;
    }

    public void setReferenciada(String referenciada) {
        this.referenciada = referenciada;
    }

    public Character getTienedocinternaenconsulta() {
        return tienedocinternaenconsulta;
    }

    public void setTienedocinternaenconsulta(Character tienedocinternaenconsulta) {
        this.tienedocinternaenconsulta = tienedocinternaenconsulta;
    }

    public Character getTieneetiqubicfisica() {
        return tieneetiqubicfisica;
    }

    public void setTieneetiqubicfisica(Character tieneetiqubicfisica) {
        this.tieneetiqubicfisica = tieneetiqubicfisica;
    }

    public String getTipoCaja() {
        return tipoCaja;
    }

    public void setTipoCaja(String tipoCaja) {
        this.tipoCaja = tipoCaja;
    }

    public String getTipoDeConsulta() {
        return tipoDeConsulta;
    }

    public void setTipoDeConsulta(String tipoDeConsulta) {
        this.tipoDeConsulta = tipoDeConsulta;
    }

    public Short getTipoUbicId() {
        return tipoUbicId;
    }

    public void setTipoUbicId(Short tipoUbicId) {
        this.tipoUbicId = tipoUbicId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caja other = (Caja) obj;
        if (this.cajaId != other.cajaId && (this.cajaId == null || !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.cajaId != null ? this.cajaId.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Caja{" + "cajaId=" + cajaId + ", cliente=" + cliente + ", nunicoHz=" + nunicoHz + ", cajaAdea=" + cajaAdea + ", referenciada=" + referenciada + ", estadoUbicacion=" + estadoUbicacion + ", nroprecinto1=" + nroprecinto1 + ", nroprecinto2=" + nroprecinto2 + ", tieneetiqubicfisica=" + tieneetiqubicfisica + ", tienedocinternaenconsulta=" + tienedocinternaenconsulta + ", tipoDeConsulta=" + tipoDeConsulta + ", tipoCaja=" + tipoCaja + ", tipoUbicId=" + tipoUbicId + ", cajaTipoId=" + cajaTipoId + ", login=" + login + '}';
    }
}
