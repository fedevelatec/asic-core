package com.fedevela.core.security.beans;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "new-user-configure")
public class NewUserConfigureBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String authority;
    private String rol;
    private String aplicacion;

    public NewUserConfigureBean() {
    }

    public NewUserConfigureBean(String authority, String rol, String aplicacion) {
        this.authority = authority;
        this.rol = rol;
        this.aplicacion = aplicacion;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

}
