package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HorizontalcaPK implements Serializable{
    @Basic(optional=false)
    @Column(name="PLANTA_ID")
    private Short plantaId;
    @Basic(optional=false)
    @Column(name="PISO_NIV_ID")
    private Short pisoNivId;
    @Basic(optional=false)
    @Column(name="AREA_ID", length=1)
    private String areaId;
    @Basic(optional=false)
    @Column(name="ESTANTERIA_ID")
    private Short estanteriaId;
    @Basic(optional=false)
    @Column(name="CELDA_ID")
    private Short celdaId;
    @Basic(optional=false)
    @Column(name="HORIZ_ID")
    private Short horizId;

    public HorizontalcaPK(Short plantaId, Short pisoNivId, String areaId, Short estanteriaId, Short celdaId, Short horizId) {
        this.plantaId = plantaId;
        this.pisoNivId = pisoNivId;
        this.areaId = areaId;
        this.estanteriaId = estanteriaId;
        this.celdaId = celdaId;
        this.horizId = horizId;
    }

    public HorizontalcaPK() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HorizontalcaPK other = (HorizontalcaPK) obj;
        if (this.plantaId != other.plantaId && (this.plantaId == null || !this.plantaId.equals(other.plantaId))) {
            return false;
        }
        if (this.pisoNivId != other.pisoNivId && (this.pisoNivId == null || !this.pisoNivId.equals(other.pisoNivId))) {
            return false;
        }
        if ((this.areaId == null) ? (other.areaId != null) : !this.areaId.equals(other.areaId)) {
            return false;
        }
        if (this.estanteriaId != other.estanteriaId && (this.estanteriaId == null || !this.estanteriaId.equals(other.estanteriaId))) {
            return false;
        }
        if (this.celdaId != other.celdaId && (this.celdaId == null || !this.celdaId.equals(other.celdaId))) {
            return false;
        }
        if (this.horizId != other.horizId && (this.horizId == null || !this.horizId.equals(other.horizId))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.plantaId != null ? this.plantaId.hashCode() : 0);
        hash = 41 * hash + (this.pisoNivId != null ? this.pisoNivId.hashCode() : 0);
        hash = 41 * hash + (this.areaId != null ? this.areaId.hashCode() : 0);
        hash = 41 * hash + (this.estanteriaId != null ? this.estanteriaId.hashCode() : 0);
        hash = 41 * hash + (this.celdaId != null ? this.celdaId.hashCode() : 0);
        hash = 41 * hash + (this.horizId != null ? this.horizId.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "HorizontalcaPK{" + "pantaId=" + plantaId + "pisoNivId=" + pisoNivId + "areaId=" + areaId + "estanteriaId=" + estanteriaId + "celdaId=" + celdaId + "horizId=" + horizId + '}';
    }


    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public Short getCeldaId() {
        return celdaId;
    }

    public void setCeldaId(Short celdaId) {
        this.celdaId = celdaId;
    }

    public Short getEstanteriaId() {
        return estanteriaId;
    }

    public void setEstanteriaId(Short estanteriaId) {
        this.estanteriaId = estanteriaId;
    }

    public Short getHorizId() {
        return horizId;
    }

    public void setHorizId(Short horizId) {
        this.horizId = horizId;
    }

    public Short getPlantaId() {
        return plantaId;
    }

    public void setPlantaId(Short plantaId) {
        this.plantaId = plantaId;
    }

    public Short getPisoNivId() {
        return pisoNivId;
    }

    public void setPisoNivId(Short pisoNivId) {
        this.pisoNivId = pisoNivId;
    }

}
