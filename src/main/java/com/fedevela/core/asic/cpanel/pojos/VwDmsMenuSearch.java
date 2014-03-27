package com.fedevela.core.asic.cpanel.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "VW_DMSMENU_SEARCH", catalog = "", schema = "PROD")
@XmlRootElement
public class VwDmsMenuSearch implements Serializable {

    private static final long serialVersionUID = 15896L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDMENU")
    private Long idMenu;
    @Column(name = "ID_PARENT")
    private Long idParent;
    @Basic(optional = false)
    @Column(name = "E_ORDER")
    private Integer eOrder;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "ICONO")
    private String icono;
    @Basic(optional = false)
    @Column(name = "RUTA")
    private char ruta;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "IDAPLICACION")
    private Long idAplicacion;
    @Column(name = "SEPARATOR")
    private String separator;
    @Column(name = "ON_CLICK")
    private String onClick;
    @Column(name = "CHILD_COUNT")
    private Long childCount;
    @Column(name = "DESCRIPTION_CHILD_COUNT")
    private String descriptionChildCount;
    @Column(name = "TIPO")
    private String tipo;

    public VwDmsMenuSearch() {
    }

    public Long getChildCount() {
        return childCount;
    }

    public void setChildCount(Long childCount) {
        this.childCount = childCount;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescriptionChildCount() {
        return descriptionChildCount;
    }

    public void setDescriptionChildCount(String descriptionChildCount) {
        this.descriptionChildCount = descriptionChildCount;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public Long getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(Long idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public Long getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Long idMenu) {
        this.idMenu = idMenu;
    }

    public Long getIdParent() {
        return idParent;
    }

    public void setIdParent(Long idParent) {
        this.idParent = idParent;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public char getRuta() {
        return ruta;
    }

    public void setRuta(char ruta) {
        this.ruta = ruta;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer geteOrder() {
        return eOrder;
    }

    public void seteOrder(Integer eOrder) {
        this.eOrder = eOrder;
    }

    @JsonIgnore
    public boolean isHasChild() {
        return ((childCount != null) && (childCount > 0));
    }

    public boolean getHasChild() {
        return ((childCount != null) && (childCount > 0));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VwDmsMenuSearch other = (VwDmsMenuSearch) obj;
        if (this.idMenu != other.idMenu && (this.idMenu == null || !this.idMenu.equals(other.idMenu))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.idMenu != null ? this.idMenu.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "VwDmsMenuSearch{" + "idMenu=" + idMenu + ", idParent=" + idParent + ", nombre=" + nombre + ", descripcion=" + descripcion + ", icono=" + icono + ", ruta=" + ruta + ", status=" + status + ", idAplicacion=" + idAplicacion + ", separator=" + separator + ", onClick=" + onClick + ", childCount=" + childCount + ", descriptionChildCount=" + descriptionChildCount + ", tipo=" + tipo + '}';
    }

}

