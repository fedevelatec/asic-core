package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "FLOW_INGRESOS_DETA_MP", catalog = "", schema = "PROD")
@XmlRootElement
public class FlowIngresosDetaMp implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FlowIngresosDetaMpPK flowIngresosDetaMpPK;
    @Basic(optional = false)
    @Column(name = "CONCILIADO")
    private Character conciliado;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Short status;
    @Basic(optional = false)
    @Column(name = "FECHA_LECTURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLectura;
    @Column(name = "ID_SUCURSAL")
    private Long idSucursal;
    @Column(name = "NUNICODOC_ANT")
    private Long nunicodocAnt;
    @Column(name = "FLAGS")
    private Short flags;
    @Column(name = "MENSAJES")
    private String mensajes;
    @Column(name = "USUARIO")
    private String usuario;
    //    @Column(name = "MAQUINA")
//    private String maquina;
//    @Column(name = "USUARIO_RED")
//    private String usuarioRed;
//    @Column(name = "IP")
//    private String ip;
    @JoinColumn(name = "IDRECIBO", referencedColumnName = "IDRECIBO")
    @ManyToOne(optional = false)
    private FlowIngresosCabMp flowIngresosCabMp;
//    @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false)
//    @OneToOne
//    private EtiqDocum etiqDocum;
//    @JoinColumn(name = "CAJA_ID", referencedColumnName = "CAJA_ID")
//    @ManyToOne(optional = false)
//    private Caja caja;

    public FlowIngresosDetaMp() {
        conciliado = 'N';
        status = 1;
    }

    public FlowIngresosDetaMp(FlowIngresosDetaMpPK flowIngresosDetaMpPK) {
        this();
        this.flowIngresosDetaMpPK = flowIngresosDetaMpPK;
    }

    public FlowIngresosDetaMp(Long nunicodoc, Long cajaId, Character conciliado, Short status, Date fechaLectura) {
        this();
        flowIngresosDetaMpPK = new FlowIngresosDetaMpPK(nunicodoc, cajaId);
        this.conciliado = conciliado;
        this.status = status;
        this.fechaLectura = fechaLectura;
    }

    public FlowIngresosDetaMpPK getFlowIngresosDetaMpPK() {
        return flowIngresosDetaMpPK;
    }

    public void setFlowIngresosDetaMpPK(FlowIngresosDetaMpPK flowIngresosDetaMpPK) {
        this.flowIngresosDetaMpPK = flowIngresosDetaMpPK;
    }

    public Character getConciliado() {
        return conciliado;
    }

    public void setConciliado(Character conciliado) {
        this.conciliado = conciliado;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getFechaLectura() {
        return fechaLectura;
    }

    public void setFechaLectura(Date fechaLectura) {
        this.fechaLectura = fechaLectura;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Long getNunicodocAnt() {
        return nunicodocAnt;
    }

    public void setNunicodocAnt(Long nunicodocAnt) {
        this.nunicodocAnt = nunicodocAnt;
    }

    public Short getFlags() {
        return flags;
    }

    public void setFlags(Short flags) {
        this.flags = flags;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //    public String getMaquina() {
//        return maquina;
//    }
//
//    public void setMaquina(String maquina) {
//        this.maquina = maquina;
//    }
//
//    public String getUsuarioRed() {
//        return usuarioRed;
//    }
//
//    public void setUsuarioRed(String usuarioRed) {
//        this.usuarioRed = usuarioRed;
//    }
//
//    public String getIp() {
//        return ip;
//    }
//
//    public void setIp(String ip) {
//        this.ip = ip;
//    }
    public FlowIngresosCabMp getFlowIngresosCabMp() {
        return flowIngresosCabMp;
    }

    public void setFlowIngresosCabMp(FlowIngresosCabMp flowIngresosCabMp) {
        this.flowIngresosCabMp = flowIngresosCabMp;
    }
//
//    public EtiqDocum getEtiqDocum() {
//        return etiqDocum;
//    }
//
//    public void setEtiqDocum(EtiqDocum etiqDocum) {
//        this.etiqDocum = etiqDocum;
//    }

    @Override
    public FlowIngresosDetaMp clone() throws CloneNotSupportedException {
        return (FlowIngresosDetaMp) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.flowIngresosDetaMpPK != null ? this.flowIngresosDetaMpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FlowIngresosDetaMp other = (FlowIngresosDetaMp) obj;
        if (this.flowIngresosDetaMpPK != other.flowIngresosDetaMpPK && (this.flowIngresosDetaMpPK == null || !this.flowIngresosDetaMpPK.equals(other.flowIngresosDetaMpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FlowIngresosDetaMp{" + "flowIngresosDetaMpPK=" + flowIngresosDetaMpPK + ", conciliado=" + conciliado + ", status=" + status + ", fechaLectura=" + fechaLectura + ", idSucursal=" + idSucursal + ", nunicodocAnt=" + nunicodocAnt + ", flags=" + flags + ", mensajes=" + mensajes + ", usuario=" + usuario + ", flowIngresosCabMp=" + flowIngresosCabMp + '}';
    }
}
