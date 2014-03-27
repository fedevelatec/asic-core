package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "LOTE", catalog = "", schema = "PROD")
public class Lote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LotePK lotePK;
    @Basic(optional = false)
    @Column(name = "NO_ITEMS")
    private BigInteger noItems;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private char status;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;
    @Column(name = "FECHA_CIERRE")
    @Temporal(TemporalType.DATE)
    private Date fechaCierre;
    @Column(name = "USUARIO_CIERRE")
    private String usuarioCierre;
    @Basic(optional = false)
    @Column(name = "NO_MAX_ITEMS")
    private BigInteger noMaxItems;
    @Basic(optional = false)
    @Column(name = "OPERATORIA")
    private short operatoria;

    public Lote() {
    }

    public Lote(LotePK lotePK) {
        this.lotePK = lotePK;
    }

    public Lote(LotePK lotePK, BigInteger noItems, char status, String nombre, Date fechaCreacion, String usuarioCreacion, BigInteger noMaxItems, short operatoria) {
        this.lotePK = lotePK;
        this.noItems = noItems;
        this.status = status;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
        this.noMaxItems = noMaxItems;
        this.operatoria = operatoria;
    }

    public Lote(BigInteger idLote, short scltcod) {
        this.lotePK = new LotePK(idLote, scltcod);
    }

    public LotePK getLotePK() {
        return lotePK;
    }

    public void setLotePK(LotePK lotePK) {
        this.lotePK = lotePK;
    }

    public BigInteger getNoItems() {
        return noItems;
    }

    public void setNoItems(BigInteger noItems) {
        this.noItems = noItems;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getUsuarioCierre() {
        return usuarioCierre;
    }

    public void setUsuarioCierre(String usuarioCierre) {
        this.usuarioCierre = usuarioCierre;
    }

    public BigInteger getNoMaxItems() {
        return noMaxItems;
    }

    public void setNoMaxItems(BigInteger noMaxItems) {
        this.noMaxItems = noMaxItems;
    }

    public short getOperatoria() {
        return operatoria;
    }

    public void setOperatoria(short operatoria) {
        this.operatoria = operatoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lotePK != null ? lotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lote)) {
            return false;
        }
        Lote other = (Lote) object;
        if ((this.lotePK == null && other.lotePK != null) || (this.lotePK != null && !this.lotePK.equals(other.lotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.Lote[lotePK=" + lotePK + "]";
    }

}
