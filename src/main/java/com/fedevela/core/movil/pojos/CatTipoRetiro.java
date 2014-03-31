package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CAT_TIPO_RETIRO database table.
 *
 */
@Entity
@Table(name="CAT_TIPO_RETIRO", schema="PROD")
public class CatTipoRetiro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="ID_TIPO_RETIRO", unique=true, nullable=false, precision=3)
    private long idTipoRetiro;

    @Column(length=300)
    private String descripcion;

    //bi-directional many-to-one association to CatTipoRetiro
    @ManyToOne
    @JoinColumn(name="ID_TIPO_PARENT")
    private CatTipoRetiro catTipoRetiro;

    //bi-directional many-to-one association to CatTipoRetiro
    @OneToMany(mappedBy="catTipoRetiro")
    private List<CatTipoRetiro> catTipoRetiros;

    public CatTipoRetiro() {
    }

    public long getIdTipoRetiro() {
        return this.idTipoRetiro;
    }

    public void setIdTipoRetiro(long idTipoRetiro) {
        this.idTipoRetiro = idTipoRetiro;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CatTipoRetiro getCatTipoRetiro() {
        return this.catTipoRetiro;
    }

    public void setCatTipoRetiro(CatTipoRetiro catTipoRetiro) {
        this.catTipoRetiro = catTipoRetiro;
    }

    public List<CatTipoRetiro> getCatTipoRetiros() {
        return this.catTipoRetiros;
    }

    public void setCatTipoRetiros(List<CatTipoRetiro> catTipoRetiros) {
        this.catTipoRetiros = catTipoRetiros;
    }

}