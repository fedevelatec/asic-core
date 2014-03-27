package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAQUETE", schema="PROD")
public class Paquete implements Serializable{
    @Id
    @Basic(optional=false)
    @Column(name="NUNICO_PACK")
    private long nunicoPack;
    @Column(name="SCLTCOD")
    private short scltcod;
    @Column(name="TIPO_DE_ETIQ")
    private short tipoEtiqueta;
    @Column(name="ESTADO_UBICACION")
    private String estadoUbicacion;
    @Column(name="DESCRIPCION")
    private String descripcion;
    @Column(name="NUNICO_CAJA")
    private long nunicoCaja;
    @Column(name="PEDIDO")
    private long pedido;

    @Override
    public String toString() {
        return "Paquete{" + "nunicoPack=" + nunicoPack + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paquete other = (Paquete) obj;
        if (this.nunicoPack != other.nunicoPack) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.nunicoPack ^ (this.nunicoPack >>> 32));
        return hash;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoUbicacion() {
        return estadoUbicacion;
    }

    public void setEstadoUbicacion(String estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }

    public long getNunicoCaja() {
        return nunicoCaja;
    }

    public void setNunicoCaja(long nunicoCaja) {
        this.nunicoCaja = nunicoCaja;
    }

    public long getNunicoPack() {
        return nunicoPack;
    }

    public void setNunicoPack(long nunicoPack) {
        this.nunicoPack = nunicoPack;
    }

    public long getPedido() {
        return pedido;
    }

    public void setPedido(long pedido) {
        this.pedido = pedido;
    }

    public short getScltcod() {
        return scltcod;
    }

    public void setScltcod(short scltcod) {
        this.scltcod = scltcod;
    }

    public short getTipoEtiqueta() {
        return tipoEtiqueta;
    }

    public void setTipoEtiqueta(short tipoEtiqueta) {
        this.tipoEtiqueta = tipoEtiqueta;
    }
}
