package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import com.fedevela.core.asic.pojos.Clientes;
import com.fedevela.core.asic.pojos.ScPersonalAutorizado;
import com.fedevela.core.movil.pojos.CatTipoRetiro;
import com.fedevela.core.movil.pojos.MvRetiroCancelado;
import com.fedevela.core.movil.pojos.MvRetiroDeta;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
//import javax.persistence.OneToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "MV_RETIRO_GRAL", schema="PROD")
@XmlRootElement
public class MvRetiroGral implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    // @Basic(optional = false)
    //@Column(name = "ID_RETIRO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MvRetiroGral")
    @SequenceGenerator(name = "MvRetiroGral", sequenceName = "PROD.SEQ_PK_MV_RETIRO", allocationSize = 1)
    @Column(name = "ID_RETIRO", unique = true, nullable = false, precision = 16)
    private Long idRetiro;
    @Column(name = "ID_RET_MOVIL")
    private String idRetMovil;
    @Column(name = "ENTREGA")
    private String entrega;
    @Basic(optional = false)
    @Column(name = "ESTATUS")
    private Long estatus;
    @Column(name = "FECHA_RETIRO")
    @Temporal(TemporalType.DATE)
    private Date fechaRetiro;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "MODO_RETIRO")
    private Short modoRetiro;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TIPO")
    private Short tipo;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_RETIRO", nullable = false)
    private CatTipoRetiro catTipoRetiro;
    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE", nullable = false),
            @JoinColumn(name = "ID_PERSONAL", referencedColumnName = "ID_PERSONAL", nullable = false)})
    private ScPersonalAutorizado scPersonalAutorizado;
    @ManyToOne
    @JoinColumn(name = "SCLTCOD", referencedColumnName = "SCLTCOD", nullable = false)
    private Clientes cliente;
    //bi-directional one-to-one association to MvRetiroCancelado

    @OneToMany(fetch = FetchType.EAGER , mappedBy = "mvRetiroGral", cascade = CascadeType.ALL)
    private List<MvRetiroDetaGral> mvRetiroDetasGral;



    public MvRetiroGral() {
    }

    /*
    public MvRetiroGral(Long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public MvRetiroGral(Long idRetiro, Long estatus) {
        this.idRetiro = idRetiro;
        this.estatus = estatus;
    }*/

    public Long getIdRetiro() {
        return this.idRetiro;
    }

    public void setIdRetiro(Long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public String getIdRetMovil() {
        return idRetMovil;
    }

    public void setIdRetMovil(String idRetMovil) {
        this.idRetMovil = idRetMovil;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public Long getEstatus() {
        return estatus;
    }

    public void setEstatus(Long estatus) {
        this.estatus = estatus;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Short getModoRetiro() {
        return modoRetiro;
    }

    public void setModoRetiro(Short modoRetiro) {
        this.modoRetiro = modoRetiro;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Short getTipo() {
        return tipo;
    }

    public void setTipo(Short tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRetiro != null ? idRetiro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MvRetiroGral)) {
            return false;
        }
        MvRetiroGral other = (MvRetiroGral) object;
        if ((this.idRetiro == null && other.idRetiro != null) || (this.idRetiro != null && !this.idRetiro.equals(other.idRetiro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.adea.ws.bbvaAdquis.MvRetiroGral[ idRetiro=" + idRetiro + " ]";
    }

    public void setCatTipoRetiro(CatTipoRetiro catTipoRetiro) {
        //compiled code
        //throw new RuntimeException("Compiled Code");
        this.catTipoRetiro = catTipoRetiro;
    }

    public CatTipoRetiro getCatTipoRetiro() {
        //compiled code
        //throw new RuntimeException("Compiled Code");
        return this.catTipoRetiro;
    }
    public ScPersonalAutorizado getScPersonalAutorizado() {
        //compiled code
        return this.scPersonalAutorizado;
    }

    public void setScPersonalAutorizado(ScPersonalAutorizado scPersonalAutorizado) {
        //compiled code
        //throw new RuntimeException("Compiled Code");
        this.scPersonalAutorizado= scPersonalAutorizado;
    }
    public Clientes getCliente() {
        //compiled code
        // throw new RuntimeException("Compiled Code");
        return this.cliente;
    }

    public void setCliente(Clientes cliente) {
        //compiled code
        //throw new RuntimeException("Compiled Code");
        this.cliente=cliente;
    }
  /*
    public MvRetiroCanceladoGral getMvRetiroCancelado() {
        //compiled code
        //throw new RuntimeException("Compiled Code");
        //return this. ;
    }

    public void setMvRetiroCanceladoGral(MvRetiroCanceladoGral mvRetiroCanceladoGral) {
        //compiled code
        //throw new RuntimeException("Compiled Code");
    }*/

    public void setMvRetiroDetasGral(List<MvRetiroDetaGral> mvRetiroDetasGral) {
        //compiled code
        //throw new RuntimeException("Compiled Code");
        this.mvRetiroDetasGral = mvRetiroDetasGral;
    }

    public List<MvRetiroDetaGral> getMvRetiroDetasGral() {
        //compiled code
        // throw new RuntimeException("Compiled Code");
        return this.mvRetiroDetasGral;
    }



}
