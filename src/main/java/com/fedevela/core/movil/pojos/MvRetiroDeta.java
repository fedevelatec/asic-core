package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import static javax.persistence.FetchType.EAGER;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the MV_RETIRO_DETA database table.
 *
 */
@Entity
@Table(name = "MV_RETIRO_DETA", schema = "PROD")
@XmlRootElement
public class MvRetiroDeta implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private MvRetiroDetaPK id;

    @Column(name = "ID_TIPO", length = 1)
    private String idTipo;

    @JoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = EAGER)
    private MvRetiro mvRetiro;

    //TODO add relation to MvRetiroDeta

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mvRetiroDeta")
    private List<MvRetiroDetaPrecinto> mvRetiroDetaPrecinto;

    //private MvRetiroDetaPrecinto mvRetiroDetaPrecinto;


    public MvRetiroDeta() {
    }

    public MvRetiroDeta(MvRetiroDetaPK id) {
        super();
        this.id = id;
    }

    public MvRetiroDeta(long idRetiro, long etiqueta) {
        this.id = new MvRetiroDetaPK(idRetiro, etiqueta);
    }


    public MvRetiroDetaPK getId() {
        return this.id;
    }

    public void setId(MvRetiroDetaPK id) {
        this.id = id;
    }

    public String getIdTipo() {
        return this.idTipo;
    }

    public void setIdTipo(String idTipo) {
        this.idTipo = idTipo;
    }

    public void setMvRetiro(MvRetiro mvRetiro) {
        this.mvRetiro = mvRetiro;
    }

    public MvRetiro getMvRetiro() {
        return mvRetiro;
    }

    public List<MvRetiroDetaPrecinto> getMvRetiroDetaPrecinto() {
        return mvRetiroDetaPrecinto;
    }

    public void setMvRetiroDetaPrecinto(List<MvRetiroDetaPrecinto> mvRetiroDetaPrecinto) {
        this.mvRetiroDetaPrecinto = mvRetiroDetaPrecinto;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MvRetiroDeta other = (MvRetiroDeta) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "MvRetiroDeta [id=" + id + ", idTipo=" + idTipo + "]";
    }

}