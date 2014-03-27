package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PAGINA_DIG", catalog = "", schema = "PROD")
public class PaginaDig implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaginaDigPK paginaDigPK;
    @Basic(optional = false)
    @Column(name = "NOMBRE_IMAGEN")
    private String nombreImagen;
    @JoinColumns({
            @JoinColumn(name = "NUNICODOC", insertable=false, updatable=false),
            @JoinColumn(name = "NUNICODOCT", insertable=false, updatable=false)
    })
    @ManyToOne(optional=false)
    private ChecklistDig checklistDig;

    public ChecklistDig getChecklistDig() {
        return checklistDig;
    }

    public void setChecklistDig(ChecklistDig checklistDig) {
        this.checklistDig = checklistDig;
    }


    public PaginaDig() {
    }

    public PaginaDig(PaginaDigPK paginaDigPK) {
        this.paginaDigPK = paginaDigPK;
    }

    public PaginaDig(PaginaDigPK paginaDigPK, String nombreImagen) {
        this.paginaDigPK = paginaDigPK;
        this.nombreImagen = nombreImagen;
    }

    public PaginaDig(Long nunicodoc, Long nunicodoct, Long pagina) {
        this.paginaDigPK = new PaginaDigPK(nunicodoc, nunicodoct, pagina);
    }

    public PaginaDigPK getPaginaDigPK() {
        return paginaDigPK;
    }

    public void setPaginaDigPK(PaginaDigPK paginaDigPK) {
        this.paginaDigPK = paginaDigPK;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paginaDigPK != null ? paginaDigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaginaDig)) {
            return false;
        }
        PaginaDig other = (PaginaDig) object;
        if ((this.paginaDigPK == null && other.paginaDigPK != null) || (this.paginaDigPK != null && !this.paginaDigPK.equals(other.paginaDigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.PaginaDig[paginaDigPK=" + paginaDigPK + "]";
    }

}
