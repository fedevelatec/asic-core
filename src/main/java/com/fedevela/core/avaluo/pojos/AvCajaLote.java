package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AV_CAJA_LOTE", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "AvCajaLote.findAll", query = "SELECT a FROM AvCajaLote a"),
        @NamedQuery(name = "AvCajaLote.findByLote", query = "SELECT a FROM AvCajaLote a WHERE a.avCajaLotePK.lote = :lote"),
        @NamedQuery(name = "AvCajaLote.findByCaja", query = "SELECT a FROM AvCajaLote a WHERE a.avCajaLotePK.caja = :caja"),
        @NamedQuery(name = "AvCajaLote.findByStatus", query = "SELECT a FROM AvCajaLote a WHERE a.status = :status"),
        @NamedQuery(name = "AvCajaLote.findByFechaCierre", query = "SELECT a FROM AvCajaLote a WHERE a.fechaCierre = :fechaCierre"),
        @NamedQuery(name = "AvCajaLote.findByUsuarioCierre", query = "SELECT a FROM AvCajaLote a WHERE a.usuarioCierre = :usuarioCierre"),
        @NamedQuery(name = "AvCajaLote.findByObservaciones", query = "SELECT a FROM AvCajaLote a WHERE a.observaciones = :observaciones"),
        @NamedQuery(name = "AvCajaLote.findByCliente", query = "SELECT a FROM AvCajaLote a WHERE a.avCajaLotePK.cliente = :cliente")})
public class AvCajaLote implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvCajaLotePK avCajaLotePK;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "FECHA_CIERRE")
    @Temporal(TemporalType.DATE)
    private Date fechaCierre;
    @Column(name = "USUARIO_CIERRE")
    private String usuarioCierre;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @JoinColumns({
            @JoinColumn(name = "LOTE", referencedColumnName = "LOTE", insertable = false, updatable = false),
            @JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AvLoteAvaluo avLoteAvaluo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avCajaLote")
    private List<AvAvaluoCaja> avAvaluoCajaList;

    public AvCajaLote() {
    }

    public AvCajaLote(AvCajaLotePK avCajaLotePK) {
        this.avCajaLotePK = avCajaLotePK;
    }

    public AvCajaLote(int lote, BigInteger caja, short cliente) {
        this.avCajaLotePK = new AvCajaLotePK(lote, caja, cliente);
    }

    public AvCajaLotePK getAvCajaLotePK() {
        return avCajaLotePK;
    }

    public void setAvCajaLotePK(AvCajaLotePK avCajaLotePK) {
        this.avCajaLotePK = avCajaLotePK;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public AvLoteAvaluo getAvLoteAvaluo() {
        return avLoteAvaluo;
    }

    public void setAvLoteAvaluo(AvLoteAvaluo avLoteAvaluo) {
        this.avLoteAvaluo = avLoteAvaluo;
    }

    public List<AvAvaluoCaja> getAvAvaluoCajaList() {
        return avAvaluoCajaList;
    }

    public void setAvAvaluoCajaList(List<AvAvaluoCaja> avAvaluoCajaList) {
        this.avAvaluoCajaList = avAvaluoCajaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avCajaLotePK != null ? avCajaLotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvCajaLote)) {
            return false;
        }
        AvCajaLote other = (AvCajaLote) object;
        if ((this.avCajaLotePK == null && other.avCajaLotePK != null) || (this.avCajaLotePK != null && !this.avCajaLotePK.equals(other.avCajaLotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.transfer.pojos.AvCajaLote[avCajaLotePK=" + avCajaLotePK + "]";
    }

}
