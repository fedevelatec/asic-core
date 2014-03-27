package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="HORIZONTALCA", schema="PROD")
public class Horizontalca implements Serializable{
    @EmbeddedId
    protected HorizontalcaPK horizontalcaPK;
    @Column(name="HABILITADO", length=1)
    private String habilitado;
    @Column(name="CAPACIDAD_CAJAS_EFECT")
    private Short capacidadCajasEfect;
    @Column(name="CANT_ESPACIOS_NULOS")
    private Short cantEspaciosNulos;
    @Column(name="CANT_ESPACIOS_VACIOS")
    private Short cantEspaciosVacios;
    @Column(name="HZ_NUNICO")
    private Integer hzNunico;
    @Column(name="TENGO_OPP", length=1)
    private String tengoOpp;
    @Column(name="TIPO_HORIZ",length=4)
    private String tipoHoriz;

    public Horizontalca(HorizontalcaPK horizontalcaPK) {
        this.horizontalcaPK = horizontalcaPK;
    }

    public Horizontalca() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Horizontalca other = (Horizontalca) obj;
        if (this.horizontalcaPK != other.horizontalcaPK && (this.horizontalcaPK == null || !this.horizontalcaPK.equals(other.horizontalcaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.horizontalcaPK != null ? this.horizontalcaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Horizontalca{" + "horizontalcaPK=" + horizontalcaPK + '}';
    }

    public Short getCantEspaciosNulos() {
        return cantEspaciosNulos;
    }

    public void setCantEspaciosNulos(Short cantEspaciosNulos) {
        this.cantEspaciosNulos = cantEspaciosNulos;
    }

    public Short getCantEspaciosVacios() {
        return cantEspaciosVacios;
    }

    public void setCantEspaciosVacios(Short cantEspaciosVacios) {
        this.cantEspaciosVacios = cantEspaciosVacios;
    }

    public Short getCapacidadCajasEfect() {
        return capacidadCajasEfect;
    }

    public void setCapacidadCajasEfect(Short capacidadCajasEfect) {
        this.capacidadCajasEfect = capacidadCajasEfect;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public HorizontalcaPK getHorizontalcaPK() {
        return horizontalcaPK;
    }

    public void setHorizontalcaPK(HorizontalcaPK horizontalcaPK) {
        this.horizontalcaPK = horizontalcaPK;
    }

    public Integer getHzNunico() {
        return hzNunico;
    }

    public void setHzNunico(Integer hzNunico) {
        this.hzNunico = hzNunico;
    }

    public String getTengoOpp() {
        return tengoOpp;
    }

    public void setTengoOpp(String tengoOpp) {
        this.tengoOpp = tengoOpp;
    }

    public String getTipoHoriz() {
        return tipoHoriz;
    }

    public void setTipoHoriz(String tipoHoriz) {
        this.tipoHoriz = tipoHoriz;
    }

}
