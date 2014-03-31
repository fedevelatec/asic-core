package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "VW_MENU_WEBMX", catalog = "", schema = "MEXWEB")
public class VwMenuWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDMENU")
    private double idmenu;
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
    @Basic(optional = false)
    @Column(name = "IDAPLICACION")
    private double idaplicacion;
    @Basic(optional = false)
    @Column(name = "ID_PARENT")
    private double idParent;
    @Column(name = "SEPARATOR")
    private String separator;
    @Column(name = "ON_CLICK")
    private String onClick;
    @Basic(optional = false)
    @Column(name = "ID_AUTHORITY")
    private String idAuthority;

    public VwMenuWebmx() {
    }

    public double getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(double idmenu) {
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

    public double getIdaplicacion() {
        return idaplicacion;
    }

    public void setIdaplicacion(double idaplicacion) {
        this.idaplicacion = idaplicacion;
    }

    public double getIdParent() {
        return idParent;
    }

    public void setIdParent(double idParent) {
        this.idParent = idParent;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public String getIdAuthority() {
        return idAuthority;
    }

    public void setIdAuthority(String idAuthority) {
        this.idAuthority = idAuthority;
    }
}
