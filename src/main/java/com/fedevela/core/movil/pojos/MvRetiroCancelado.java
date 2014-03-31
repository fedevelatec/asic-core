package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MV_RETIRO_CANCELADO database table.
 *
 */
@Entity
@Table(name="MV_RETIRO_CANCELADO", schema="PROD")
public class MvRetiroCancelado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID_RETIRO", unique=true, nullable=false, precision=16)
    private long idRetiro;

    @Column(nullable=false, length=300)
    private String observaciones;

    @Column(nullable=false, precision=1)
    private Long tipo;

    //bi-directional one-to-one association to MvRetiro
    @OneToOne
    @JoinColumn(name="ID_RETIRO", nullable=false, insertable=false, updatable=false)
    private MvRetiro mvRetiro;

    public MvRetiroCancelado() {
    }

    public MvRetiroCancelado(long idRetiro) {
        this.idRetiro = idRetiro;
    }



    public long getIdRetiro() {
        return this.idRetiro;
    }

    public void setIdRetiro(long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public String getObservaciones() {
        return this.observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Long getTipo() {
        return this.tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public MvRetiro getMvRetiro() {
        return this.mvRetiro;
    }

    public void setMvRetiro(MvRetiro mvRetiro) {
        this.mvRetiro = mvRetiro;
    }

}