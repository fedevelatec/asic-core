package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "FLOW_INGRESOS_CAB_MP", catalog = "", schema = "PROD")
@SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "PROD.SEQ_IDRECIBO_INGRESOS", allocationSize = 1)
@XmlRootElement
public class FlowIngresosCabMp implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    @Column(name = "IDRECIBO")
    private Long idrecibo;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "ACTIVO")
    private Character activo;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "USUARIO_CERRO")
    private String usuarioCerro;
    @Column(name = "COMENTARIOS")
    private String comentarios;
    @Column(name = "FECHA_CIERRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCierre;
    @Column(name = "APP")
    private String app;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flowIngresosCabMp")
    private Set<FlowIngresosCajaMp> cajas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flowIngresosCabMp")
    private Set<FlowIngresosDetaMp> expedientes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "flowIngresosCabMp")
    private Set<FlowIngresosDetaMpb> documentos;
    @JoinColumn(name = "IDOPERATORIA", referencedColumnName = "IDOPERATORIA")
    @ManyToOne(optional = false)
    private FlowOperatoria idoperatoria;
    @JoinColumn(name = "SCLTCOD", referencedColumnName = "SCLTCOD")
    @ManyToOne(optional = false)
    private Clientes scltcod;

    public FlowIngresosCabMp() {
        activo = 'S';
    }

    public FlowIngresosCabMp(Long idrecibo) {
        this();
        this.idrecibo = idrecibo;
    }

    public FlowIngresosCabMp(Long idrecibo, Date fecha, Character activo) {
        this();
        this.idrecibo = idrecibo;
        this.fecha = fecha;
        this.activo = activo;
    }

    public Long getIdrecibo() {
        return idrecibo;
    }

    public void setIdrecibo(Long idrecibo) {
        this.idrecibo = idrecibo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Character getActivo() {
        return activo;
    }

    public void setActivo(Character activo) {
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuarioCerro() {
        return usuarioCerro;
    }

    public void setUsuarioCerro(String usuarioCerro) {
        this.usuarioCerro = usuarioCerro;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    @XmlTransient
    @JsonIgnore
    public Set<FlowIngresosCajaMp> getCajas() {
        return cajas;
    }

    public void setCajas(Set<FlowIngresosCajaMp> cajas) {
        this.cajas = cajas;
    }

    @XmlTransient
    @JsonIgnore
    public Set<FlowIngresosDetaMp> getExpedientes() {
        return expedientes;
    }

    public void setExpedientes(Set<FlowIngresosDetaMp> expedientes) {
        this.expedientes = expedientes;
    }

    @XmlTransient
    @JsonIgnore
    public Set<FlowIngresosDetaMpb> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Set<FlowIngresosDetaMpb> documentos) {
        this.documentos = documentos;
    }

    public FlowOperatoria getIdoperatoria() {
        return idoperatoria;
    }

    public void setIdoperatoria(FlowOperatoria idoperatoria) {
        this.idoperatoria = idoperatoria;
    }

    public Clientes getScltcod() {
        return scltcod;
    }

    public void setScltcod(Clientes scltcod) {
        this.scltcod = scltcod;
    }

    @Override
    public FlowIngresosCabMp clone() throws CloneNotSupportedException {
        return (FlowIngresosCabMp) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrecibo != null ? idrecibo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlowIngresosCabMp)) {
            return false;
        }
        FlowIngresosCabMp other = (FlowIngresosCabMp) object;
        if ((this.idrecibo == null && other.idrecibo != null) || (this.idrecibo != null && !this.idrecibo.equals(other.idrecibo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.FlowIngresosCabMp[ idrecibo=" + idrecibo + " ]";
    }
}
