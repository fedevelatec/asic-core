package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "APLICACION_WEBMX", catalog = "", schema = "MEXWEB")
@SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "MEXWEB.SEQ_WEBMX_IDAPLICACION", allocationSize = 1)
@XmlRootElement
public class AplicacionWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDAPLICACION")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    private Long idaplicacion;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ICONO")
    private String icono;
    @Basic(optional = false)
    @Column(name = "RUTA")
    private String ruta;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private char status;
    //    @JoinTable(name = "GRANTAPP_WEBMX", schema = "MEXWEB", joinColumns = {
//        @JoinColumn(name = "IDAPLICACION", referencedColumnName = "IDAPLICACION")}, inverseJoinColumns = {
//        @JoinColumn(name = "LOGIN", referencedColumnName = "LOGIN")})
//    @ManyToMany
//    private List<UsuarioWebmx> usuarioWebmxList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aplicacionWebmx")
    @NotFound( action= NotFoundAction.IGNORE )
    private List<MenuWebmx> menuWebmxList;

    public AplicacionWebmx() {
    }

    public AplicacionWebmx(Long idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    public AplicacionWebmx(Long idaplicacion, String nombre, String icono, String ruta, char status) {
        this.idaplicacion = idaplicacion;
        this.nombre = nombre;
        this.icono = icono;
        this.ruta = ruta;
        this.status = status;
    }

    public Long getIdaplicacion() {
        return idaplicacion;
    }

    public void setIdaplicacion(Long idaplicacion) {
        this.idaplicacion = idaplicacion;
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

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    //    @JsonIgnore
//    public List<UsuarioWebmx> getUsuarioWebmxList() {
//        return usuarioWebmxList;
//    }
//
//    public void setUsuarioWebmxList(List<UsuarioWebmx> usuarioWebmxList) {
//        this.usuarioWebmxList = usuarioWebmxList;
//    }
    @JsonIgnore
    public List<MenuWebmx> getMenuWebmxList() {
        return menuWebmxList;
    }

    public void setMenuWebmxList(List<MenuWebmx> menuWebmxList) {
        this.menuWebmxList = menuWebmxList;
    }

    public String getDisplay() {
        return idaplicacion + " - " + descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaplicacion != null ? idaplicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AplicacionWebmx)) {
            return false;
        }
        AplicacionWebmx other = (AplicacionWebmx) object;
        if ((this.idaplicacion == null && other.idaplicacion != null) || (this.idaplicacion != null && !this.idaplicacion.equals(other.idaplicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.security.pojos.AplicacionWebmx[idaplicacion=" + idaplicacion + "]";
    }
}
