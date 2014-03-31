package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "ROL_WEBMX", catalog = "", schema = "MEXWEB")
public class RolWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDROL")
    private Long idrol;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private char status;
    /*@ManyToMany(mappedBy = "rolWebmxList")
    private List<MenuWebmx> menuWebmxList;*/
//    @JoinTable(name = "GRANTROL_WEBMX", schema = "MEXWEB", joinColumns = {
//        @JoinColumn(name = "IDROL", referencedColumnName = "IDROL")}, inverseJoinColumns = {
//        @JoinColumn(name = "LOGIN", referencedColumnName = "LOGIN")})
//    @ManyToMany
//    private List<UsuarioWebmx> usuarioWebmxList;

    public RolWebmx() {
    }

    public RolWebmx(Long idrol) {
        this.idrol = idrol;
    }

    public RolWebmx(Long idrol, String nombre, char status) {
        this.idrol = idrol;
        this.nombre = nombre;
        this.status = status;
    }

    public Long getIdrol() {
        return idrol;
    }

    public void setIdrol(Long idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    /*@JsonIgnore
    public List<MenuWebmx> getMenuWebmxList() {
        return menuWebmxList;
    }

    public void setMenuWebmxList(List<MenuWebmx> menuWebmxList) {
        this.menuWebmxList = menuWebmxList;
    }*/

    //    @JsonIgnore
//    public List<UsuarioWebmx> getUsuarioWebmxList() {
//        return usuarioWebmxList;
//    }
//
//    public void setUsuarioWebmxList(List<UsuarioWebmx> usuarioWebmxList) {
//        this.usuarioWebmxList = usuarioWebmxList;
//    }
    public String getDisplay() {
        return idrol + " - " + descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrol != null ? idrol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolWebmx)) {
            return false;
        }
        RolWebmx other = (RolWebmx) object;
        if ((this.idrol == null && other.idrol != null) || (this.idrol != null && !this.idrol.equals(other.idrol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.RolWebmx[idrol=" + idrol + "]";
    }
}
