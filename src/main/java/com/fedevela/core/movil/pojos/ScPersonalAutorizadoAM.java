package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "PROD", name = "SC_PERSONAL_AUTORIZADO_AM")
public class ScPersonalAutorizadoAM implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(name = "ID_PERSONAL", length = 100)
    long idPersonal;
    @Id
    @Basic(optional = false)
    @Column(name = "NOMBRE", length = 100)
    String nombre;
    @Id
    @Basic(optional = false)
    @Column(name = "STATUS", length = 100)
    String status;
    @Id
    @Basic(optional = false)
    @Column(name = "PASSWORD", length = 100)
    String password;

    public ScPersonalAutorizadoAM() {
    }

    public ScPersonalAutorizadoAM(long id, String nombre, String estatus, String contrasenya) {
        this.idPersonal = id;
        this.nombre = nombre;
        this.status = estatus;
        this.password = contrasenya;
    }

    public long getId() {
        return idPersonal;
    }

    public void setId(long id) {
        this.idPersonal = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatus() {
        return status;
    }

    public void setEstatus(String estatus) {
        this.status = estatus;
    }

    public String getContrasenya() {
        return password;
    }

    public void setContrasenya(String contrasenya) {
        this.password = contrasenya;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ScPersonalAutorizadoAM other = (ScPersonalAutorizadoAM) obj;

        return (this.idPersonal == other.idPersonal);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + ((Object)this.idPersonal).hashCode();
        return hash;
    }
}