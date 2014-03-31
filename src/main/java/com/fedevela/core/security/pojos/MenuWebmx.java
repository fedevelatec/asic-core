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
@Table(name = "MENU_WEBMX", catalog = "", schema = "MEXWEB")
@SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "MEXWEB.SEQ_WEBMX_IDMENU", allocationSize = 1)
@XmlRootElement
public class MenuWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDMENU")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    private Long idmenu;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ICONO")
    private String icono;
    @Basic(optional = false)
    @Column(name = "RUTA")
    private String ruta;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "ON_CLICK")
    private String onClick;
    @Column(name = "SEPARATOR")
    private String separator;
    /*@JoinTable(name = "PRIVILEGIO_WEBMX", joinColumns = {
        @JoinColumn(name = "IDMENU", referencedColumnName = "IDMENU")}, inverseJoinColumns = {
        @JoinColumn(name = "IDROL", referencedColumnName = "IDROL")})
    @ManyToMany(cascade= CascadeType.REMOVE)
    @NotFound( action= NotFoundAction.IGNORE )
    private List<RolWebmx> rolWebmxList;*/
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "menuWebmx")
    @NotFound( action= NotFoundAction.IGNORE )
    private List<MenuWebmx> menuWebmxList;
    @JoinColumn(name = "ID_PARENT", referencedColumnName = "IDMENU")
    @ManyToOne
    @NotFound( action= NotFoundAction.IGNORE )
    private MenuWebmx menuWebmx;
    @JoinColumn(name = "IDAPLICACION", referencedColumnName = "IDAPLICACION")
    @ManyToOne(optional = false)
    private AplicacionWebmx aplicacionWebmx;
    @Basic(optional = false)
    @Column(name = "E_ORDER")
    private Integer eOrder;

    public MenuWebmx() {
    }

    public MenuWebmx(Long idmenu) {
        this.idmenu = idmenu;
    }

    public MenuWebmx(Long idmenu, String nombre, String ruta) {
        this.idmenu = idmenu;
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public Long getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(Long idmenu) {
        this.idmenu = idmenu;
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

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    /*@JsonIgnore
    public List<RolWebmx> getRolWebmxList() {
        return rolWebmxList;
    }

    public void setRolWebmxList(List<RolWebmx> rolWebmxList) {
        this.rolWebmxList = rolWebmxList;
    }*/

    @JsonIgnore
    public List<MenuWebmx> getMenuWebmxList() {
        return menuWebmxList;
    }

    public void setMenuWebmxList(List<MenuWebmx> menuWebmxList) {
        this.menuWebmxList = menuWebmxList;
    }

    @JsonIgnore
    public MenuWebmx getMenuWebmx() {
        return menuWebmx;
    }

    public void setMenuWebmx(MenuWebmx menuWebmx) {
        this.menuWebmx = menuWebmx;
    }

    public Long getIdParent() {
        return menuWebmx == null ? null : menuWebmx.getIdmenu();
    }

    public AplicacionWebmx getAplicacionWebmx() {
        return aplicacionWebmx;
    }

    public void setAplicacionWebmx(AplicacionWebmx aplicacionWebmx) {
        this.aplicacionWebmx = aplicacionWebmx;
    }

    /**
     * @return the onClick
     */
    public String getOnClick() {
        return onClick;
    }

    /**
     * @param onClick the onClick to set
     */
    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    /**
     * @return the separator
     */
    public String getSeparator() {
        return separator;
    }

    /**
     * @param separator the separator to set
     */
    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public Integer geteOrder() {
        return eOrder;
    }

    public void seteOrder(Integer eOrder) {
        this.eOrder = eOrder;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.idmenu != null ? this.idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MenuWebmx other = (MenuWebmx) obj;
        if (this.idmenu != other.idmenu && (this.idmenu == null || !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MenuWebmx{" + "idmenu=" + idmenu + ", nombre=" + nombre + ", descripcion=" + descripcion + ", icono=" + icono + ", ruta=" + ruta + ", status=" + status + ", onClick=" + onClick + ", separator=" + separator + '}';
    }
}
