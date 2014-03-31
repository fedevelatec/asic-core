package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "USER_MENU_WEBMX_VW", catalog = "", schema = "MEXWEB")
public class UserMenuWebmxVw implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private UserMenuWebmxVwPK userMenuWebmxVwPK;
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

    public UserMenuWebmxVw() {
    }

    public UserMenuWebmxVw(UserMenuWebmxVwPK userMenuWebmxVwPK) {
        this.userMenuWebmxVwPK = userMenuWebmxVwPK;
    }

    public UserMenuWebmxVw(double idmenu, double idParent, String login, double idaplicacion) {
        userMenuWebmxVwPK = new UserMenuWebmxVwPK(idmenu, idParent, login, idaplicacion);
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

    /**
     * @return the userMenuWebmxVwPK
     */
    public UserMenuWebmxVwPK getUserMenuWebmxVwPK() {
        return userMenuWebmxVwPK;
    }

    /**
     * @param userMenuWebmxVwPK the userMenuWebmxVwPK to set
     */
    public void setUserMenuWebmxVwPK(UserMenuWebmxVwPK userMenuWebmxVwPK) {
        this.userMenuWebmxVwPK = userMenuWebmxVwPK;
    }
}
