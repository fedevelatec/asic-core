package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import com.fedevela.core.asic.pojos.Clientes;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AV_LOTE_AVALUO", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "AvLoteAvaluo.findAll", query = "SELECT a FROM AvLoteAvaluo a"),
        @NamedQuery(name = "AvLoteAvaluo.findByLote", query = "SELECT a FROM AvLoteAvaluo a WHERE a.avLoteAvaluoPK.lote = :lote"),
        @NamedQuery(name = "AvLoteAvaluo.findByFecha", query = "SELECT a FROM AvLoteAvaluo a WHERE a.fecha = :fecha"),
        @NamedQuery(name = "AvLoteAvaluo.findByUsuario", query = "SELECT a FROM AvLoteAvaluo a WHERE a.usuario = :usuario"),
        @NamedQuery(name = "AvLoteAvaluo.findByAutorizado", query = "SELECT a FROM AvLoteAvaluo a WHERE a.autorizado = :autorizado"),
        @NamedQuery(name = "AvLoteAvaluo.findByFechaAutorizacion", query = "SELECT a FROM AvLoteAvaluo a WHERE a.fechaAutorizacion = :fechaAutorizacion"),
        @NamedQuery(name = "AvLoteAvaluo.findByObservaciones", query = "SELECT a FROM AvLoteAvaluo a WHERE a.observaciones = :observaciones"),
        @NamedQuery(name = "AvLoteAvaluo.findByAutorizo", query = "SELECT a FROM AvLoteAvaluo a WHERE a.autorizo = :autorizo"),
        @NamedQuery(name = "AvLoteAvaluo.findByCliente", query = "SELECT a FROM AvLoteAvaluo a WHERE a.avLoteAvaluoPK.cliente = :cliente"),
        @NamedQuery(name = "AvLoteAvaluo.findByTipo", query = "SELECT a FROM AvLoteAvaluo a WHERE a.tipo = :tipo")})
public class AvLoteAvaluo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvLoteAvaluoPK avLoteAvaluoPK;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "AUTORIZADO")
    private BigInteger autorizado;
    @Column(name = "FECHA_AUTORIZACION")
    @Temporal(TemporalType.DATE)
    private Date fechaAutorizacion;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "AUTORIZO")
    private String autorizo;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private short tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avLoteAvaluo")
    private List<AvCajaLote> avCajaLoteList;
//    @JoinColumn(name = "CLIENTE", referencedColumnName = "SCLTCOD", insertable = false, updatable = false)
//    @ManyToOne(optional = false)
//    private Clientes clientes;

    public AvLoteAvaluo() {
    }

    public AvLoteAvaluo(AvLoteAvaluoPK avLoteAvaluoPK) {
        this.avLoteAvaluoPK = avLoteAvaluoPK;
    }

    public AvLoteAvaluo(AvLoteAvaluoPK avLoteAvaluoPK, short tipo) {
        this.avLoteAvaluoPK = avLoteAvaluoPK;
        this.tipo = tipo;
    }

    public AvLoteAvaluo(int lote, short cliente) {
        this.avLoteAvaluoPK = new AvLoteAvaluoPK(lote, cliente);
    }

    public AvLoteAvaluoPK getAvLoteAvaluoPK() {
        return avLoteAvaluoPK;
    }

    public void setAvLoteAvaluoPK(AvLoteAvaluoPK avLoteAvaluoPK) {
        this.avLoteAvaluoPK = avLoteAvaluoPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public BigInteger getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(BigInteger autorizado) {
        this.autorizado = autorizado;
    }

    public Date getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(Date fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAutorizo() {
        return autorizo;
    }

    public void setAutorizo(String autorizo) {
        this.autorizo = autorizo;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public List<AvCajaLote> getAvCajaLoteList() {
        return avCajaLoteList;
    }

    public void setAvCajaLoteList(List<AvCajaLote> avCajaLoteList) {
        this.avCajaLoteList = avCajaLoteList;
    }

//    public Clientes getClientes() {
//        return clientes;
//    }
//
//    public void setClientes(Clientes clientes) {
//        this.clientes = clientes;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avLoteAvaluoPK != null ? avLoteAvaluoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvLoteAvaluo)) {
            return false;
        }
        AvLoteAvaluo other = (AvLoteAvaluo) object;
        if ((this.avLoteAvaluoPK == null && other.avLoteAvaluoPK != null) || (this.avLoteAvaluoPK != null && !this.avLoteAvaluoPK.equals(other.avLoteAvaluoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.transfer.pojos.AvLoteAvaluo[avLoteAvaluoPK=" + avLoteAvaluoPK + "]";
    }

}
