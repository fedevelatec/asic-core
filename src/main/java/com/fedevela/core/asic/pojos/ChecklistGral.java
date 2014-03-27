package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="CHECKLIST_GRAL", schema="PROD")
public class ChecklistGral implements Serializable{
    @Id
    @Column(name="NUNICODOCT")
    private long nunicodoct;
    @Column(name="NUNICODOC")
    private long nunicodoc;
    @Column(name="SCLTCOD")
    private short scltcod;
    @Column(name="DOCCOD")
    private short doccod;
    @Column(name="OBSERVACIONES")
    private String observaciones;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_PROCESO")
    private Date fechaProceso;
    @Column(name="PROCESADA")
    private String procesada;
    @Column(name="CANT_IMAGENES")
    private int cantImagenes;

    @Override
    public String toString() {
        return "ChecklistGral{" + "nunicodoct=" + nunicodoct + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ChecklistGral other = (ChecklistGral) obj;
        if (this.nunicodoct != other.nunicodoct) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.nunicodoct ^ (this.nunicodoct >>> 32));
        return hash;
    }

    public int getCantImagenes() {
        return cantImagenes;
    }

    public void setCantImagenes(int cantImagenes) {
        this.cantImagenes = cantImagenes;
    }

    public short getDoccod() {
        return doccod;
    }

    public void setDoccod(short doccod) {
        this.doccod = doccod;
    }

    public Date getFechaProceso() {
        return fechaProceso;
    }

    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    public long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getProcesada() {
        return procesada;
    }

    public void setProcesada(String procesada) {
        this.procesada = procesada;
    }

    public short getScltcod() {
        return scltcod;
    }

    public void setScltcod(short scltcod) {
        this.scltcod = scltcod;
    }
}
