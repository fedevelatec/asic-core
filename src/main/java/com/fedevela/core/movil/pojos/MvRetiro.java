package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import com.fedevela.core.asic.pojos.Clientes;
import com.fedevela.core.asic.pojos.ScPersonalAutorizado;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.CascadeType.ALL;

/**
 * The persistent class for the MV_RETIRO database table.
 *
 */


@Entity
@Table(name = "MV_RETIRO", schema = "PROD")
public class MvRetiro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_RETIRO", unique = true, nullable = false, precision = 16)
    @GeneratedValue(strategy = SEQUENCE, generator = "MvRetiro")
    @SequenceGenerator(name = "MvRetiro", sequenceName = "PROD.SEQ_PK_MV_RETIRO", allocationSize = 1)
    private long idRetiro;
    @Column(length = 200)
    private String entrega;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_RETIRO")
    private Date fechaRetiro;
    @Column(name = "ID_RET_MOVIL", length = 20)
    private String idRetMovil;
    @Column(name = "ESTATUS")
    private Long estatus;
    @Column(length = 254)
    private String observaciones;
    @Column(name="MODO_RETIRO")
    private Short modoRetiro;
    @Column(name="DIRECCION", length=254)
    private String direccion;
    //uni-directional many-to-one association to CatTipoRetiro
    @ManyToOne
    @JoinColumn(name = "ID_TIPO_RETIRO", nullable = false)
    private CatTipoRetiro catTipoRetiro;
    //uni-directional many-to-one association to ScPersonalAutorizado
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE", nullable = false),
            @JoinColumn(name = "ID_PERSONAL", referencedColumnName = "ID_PERSONAL", nullable = false)
    })
    private ScPersonalAutorizado scPersonalAutorizado;
    //uni-directional many-to-one association to ScPersonalAutorizado
    @ManyToOne
    @JoinColumn(name = "SCLTCOD", referencedColumnName = "SCLTCOD", nullable = false)
    private Clientes cliente;
    //bi-directional one-to-one association to MvRetiroCancelado
    @OneToOne(mappedBy = "mvRetiro", cascade = ALL)
    private MvRetiroCancelado mvRetiroCancelado;

    /*//bi-directional one-to-one association to MvRetiroCancelado
    @OneToOne(mappedBy = "mvRetiro", cascade = ALL)
    private MvRetiroFovissste mvRetiroFovissste;*/

    //bi-directional one-to-one association to MvRetiroFovisste
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "mvRetiro")
    private MvRetiroFovissste mvRetiroFovissste;


    @OneToMany(fetch = FetchType.EAGER, mappedBy = "mvRetiro", cascade = ALL)
    private List<MvRetiroDeta> mvRetiroDetas;

    public MvRetiro() {
    }

    public long getIdRetiro() {
        return this.idRetiro;
    }

    public void setIdRetiro(long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public String getEntrega() {
        return this.entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public Date getFechaRetiro() {
        return this.fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getIdRetMovil() {
        return this.idRetMovil;
    }

    public void setIdRetMovil(String idRetMovil) {
        this.idRetMovil = idRetMovil;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public CatTipoRetiro getCatTipoRetiro() {
        return this.catTipoRetiro;
    }

    public void setCatTipoRetiro(CatTipoRetiro catTipoRetiro) {
        this.catTipoRetiro = catTipoRetiro;
    }

    public ScPersonalAutorizado getScPersonalAutorizado() {
        return this.scPersonalAutorizado;
    }

    public void setScPersonalAutorizado(ScPersonalAutorizado scPersonalAutorizado) {
        this.scPersonalAutorizado = scPersonalAutorizado;
    }

    public MvRetiroCancelado getMvRetiroCancelado() {
        return this.mvRetiroCancelado;
    }

    public void setMvRetiroCancelado(MvRetiroCancelado mvRetiroCancelado) {
        this.mvRetiroCancelado = mvRetiroCancelado;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setMvRetiroDetas(List<MvRetiroDeta> mvRetiroDetas) {
        this.mvRetiroDetas = mvRetiroDetas;
    }

    public List<MvRetiroDeta> getMvRetiroDetas() {
        return mvRetiroDetas;
    }

    public void setEstatus(Long estatus) {
        this.estatus = estatus;
    }

    public Long getEstatus() {
        return estatus;
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

    public MvRetiroFovissste getMvRetiroFovissste() {
        return mvRetiroFovissste;
    }

    public void setMvRetiroFovissste(MvRetiroFovissste mvRetiroFovissste) {
        this.mvRetiroFovissste = mvRetiroFovissste;
    }
}
