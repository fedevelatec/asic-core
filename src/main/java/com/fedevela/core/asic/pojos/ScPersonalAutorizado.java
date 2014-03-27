package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SC_PERSONAL_AUTORIZADO database table.
 *
 */
@Entity
@Table(name="SC_PERSONAL_AUTORIZADO", schema="PROD")
public class ScPersonalAutorizado implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private ScPersonalAutorizadoPK id;

    @Column(length=500)
    private String cargo;

    @Column(length=500)
    private String departamento;

    @Column(length=2000)
    private String domicilio;

    @Column(length=100)
    private String email;

    @Column(name="ID_CC", nullable=false, precision=5)
    private BigDecimal idCc;

    @Column(length=20)
    private String login;

    @Column(nullable=false, length=100)
    private String nombre;

    @Column(precision=10)
    private BigDecimal perfil;

    @Column(nullable=false, length=1)
    private String status;

    @Column(length=100)
    private String telefono;

    @Column(nullable=false, precision=1)
    private BigDecimal tipo;

    public ScPersonalAutorizado() {
    }

    public ScPersonalAutorizadoPK getId() {
        return this.id;
    }

    public void setId(ScPersonalAutorizadoPK id) {
        this.id = id;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getIdCc() {
        return this.idCc;
    }

    public void setIdCc(BigDecimal idCc) {
        this.idCc = idCc;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPerfil() {
        return this.perfil;
    }

    public void setPerfil(BigDecimal perfil) {
        this.perfil = perfil;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public BigDecimal getTipo() {
        return this.tipo;
    }

    public void setTipo(BigDecimal tipo) {
        this.tipo = tipo;
    }

}