package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "FLOW_INGRESOS_DETA_MPB", catalog = "", schema = "PROD")
@XmlRootElement
public class FlowIngresosDetaMpb implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
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
    @Id
    @Basic(optional = false)
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Column(name = "ID_SUCURSAL")
    private Long idSucursal;
    @Column(name = "FLAGS")
    private Short flags;
    @Column(name = "MENSAJES")
    private String mensajes;
    @Column(name = "USUARIO")
    private String usuario;
    //    @Column(name = "IP")
//    private String ip;
//    @Column(name = "MAQUINA")
//    private String maquina;
//    @Column(name = "USUARIO_RED")
//    private String usuarioRed;
    @JoinColumn(name = "IDRECIBO", referencedColumnName = "IDRECIBO")
    @ManyToOne(optional = false)
    private FlowIngresosCabMp flowIngresosCabMp;
    @JoinColumn(name = "NUNICODOCT", referencedColumnName = "NUNICODOC", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private EtiqDocumHn etiqDocumHn;
    @JoinColumn(name = "CAJA_ID", referencedColumnName = "CAJA_ID")
    @ManyToOne(optional = false)
    private Caja caja;

    public FlowIngresosDetaMpb() {
        conciliado = 'N';
        status = 1;
    }

    public FlowIngresosDetaMpb(Long nunicodoct) {
        this();
        this.nunicodoct = nunicodoct;
    }

    public FlowIngresosDetaMpb(Long nunicodoct, Character conciliado, Short status, Date fechaLectura) {
        this();
        this.nunicodoct = nunicodoct;
        this.conciliado = conciliado;
        this.status = status;
        this.fechaLectura = fechaLectura;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
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

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
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

    //    public String getIp() {
//        return ip;
//    }
//
//    public void setIp(String ip) {
//        this.ip = ip;
//    }
//
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
    public FlowIngresosCabMp getFlowIngresosCabMp() {
        return flowIngresosCabMp;
    }

    public void setFlowIngresosCabMp(FlowIngresosCabMp flowIngresosCabMp) {
        this.flowIngresosCabMp = flowIngresosCabMp;
    }

    public EtiqDocumHn getEtiqDocumHn() {
        return etiqDocumHn;
    }

    public void setEtiqDocumHn(EtiqDocumHn etiqDocumHn) {
        this.etiqDocumHn = etiqDocumHn;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public FlowIngresosDetaMpb clone() throws CloneNotSupportedException {
        return (FlowIngresosDetaMpb) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nunicodoct != null ? nunicodoct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlowIngresosDetaMpb)) {
            return false;
        }
        FlowIngresosDetaMpb other = (FlowIngresosDetaMpb) object;
        if ((this.nunicodoct == null && other.nunicodoct != null) || (this.nunicodoct != null && !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.FlowIngresosDetaMpb[ nunicodoct=" + nunicodoct + " ]";
    }
}
