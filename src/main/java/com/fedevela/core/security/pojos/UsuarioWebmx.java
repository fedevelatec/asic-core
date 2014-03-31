package com.fedevela.core.security.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import com.fedevela.core.asic.pojos.Clientes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import net.codicentro.core.annotation.CWColumn;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "USUARIO_WEBMX", catalog = "", schema = "MEXWEB")
public class UsuarioWebmx implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOGIN")
    @CWColumn(header = "Usuario")
    private String login;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    @CWColumn(header = "Nombre")
    private String nombre;
    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;
    @JoinColumn(name = "CLIENTE", referencedColumnName = "SCLTCOD")
    @ManyToOne(optional = false)
    @CWColumn(header = "Cliente")
    private Clientes cliente;
    @Column(name = "EMAIL")
    @CWColumn(header = "Correo Electrónico")
    private String email;
    @Basic(optional = false)
    @Column(name = "FECHAALTA", insertable = true, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CWColumn(format = "DD/MM/YYYY", header = "Fecha Alta")
    private Date fechaalta;
    @Column(name = "FECHABAJA")
    @Temporal(TemporalType.TIMESTAMP)
    @CWColumn(format = "DD/MM/YYYY", header = "Fecha Baja")
    private Date fechabaja;
    @Basic(optional = false)
    @Column(name = "STATUS")
    @CWColumn(header = "Estatus")
    private Character status;
    @Basic(optional = false)
    @Column(name = "INTENTOS")
    private Short intentos;
    @Column(name = "FECHAREVOCADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharevocado;
    @Column(name = "FECHA_VIGENCIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVigencia;
    @Column(name = "NO_ACCESO")
    @CWColumn(header = "Número Accesos")
    private Long noAcceso;
    @Transient
    private List<Authority> authorityList;
    @Transient
    private List<String> authorities;
    @Transient
    private List<RolWebmx> rols;
    @Transient
    private List<Long> roles;
    @Transient
    private List<AplicacionWebmx> aplicaciones;
    @Transient
    private List<Long> apps;

    public UsuarioWebmx() {
    }

    public UsuarioWebmx(String login) {
        this.login = login;
    }

    public UsuarioWebmx(String login, String password, String nombre, Long cliente, Date fechaalta, Character status, Short intentos) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.cliente = new Clientes(cliente);
        this.fechaalta = fechaalta;
        this.status = status;
        this.intentos = intentos;
    }

    @JsonIgnore
    public List<String> getAuthorities() {
        if ((authorities == null || authorities.isEmpty()) && authorityList != null && !authorityList.isEmpty()) {
            authorities = new ArrayList<String>();
            for (Authority authority : authorityList) {
                authorities.add(authority.getIdAuthority());
            }
        }
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    @JsonIgnore
    public List<Long> getRoles() {
        if ((roles == null || roles.isEmpty()) && rols != null && !rols.isEmpty()) {
            roles = new ArrayList<Long>();
            for (RolWebmx rol : rols) {
                roles.add(rol.getIdrol());
            }
        }
        return roles;
    }

    public void setRoles(List<Long> roles) {
        this.roles = roles;
    }

    @JsonIgnore
    public List<Authority> getAuthorityList() {
        return authorityList;
    }

    public void setAuthorityList(List<Authority> authorityList) {
        this.authorityList = authorityList;
    }

    @JsonIgnore
    public List<RolWebmx> getRols() {
        return rols;
    }

    public void setRols(List<RolWebmx> rols) {
        this.rols = rols;
    }

    @JsonIgnore
    public List<AplicacionWebmx> getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(List<AplicacionWebmx> aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    @JsonIgnore
    public List<Long> getApps() {
        if ((apps == null || apps.isEmpty()) && aplicaciones != null && !aplicaciones.isEmpty()) {
            apps = new ArrayList<Long>();
            for (AplicacionWebmx app : aplicaciones) {
                apps.add(app.getIdaplicacion());
            }
        }
        return apps;
    }

    public void setApps(List<Long> apps) {
        this.apps = apps;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getEmail() {
        return email;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Date getFechabaja() {
        return fechabaja;
    }

    public void setFechabaja(Date fechabaja) {
        this.fechabaja = fechabaja;
    }

    public Date getFecharevocado() {
        return fecharevocado;
    }

    public void setFecharevocado(Date fecharevocado) {
        this.fecharevocado = fecharevocado;
    }

    public Short getIntentos() {
        return intentos;
    }

    public void setIntentos(Short intentos) {
        this.intentos = intentos;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getNoAcceso() {
        return noAcceso;
    }

    public void setNoAcceso(Long noAcceso) {
        this.noAcceso = noAcceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioWebmx other = (UsuarioWebmx) obj;
        if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.login != null ? this.login.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "UsuarioWebmx{" + "login=" + login + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", cliente=" + cliente + ", email=" + email + ", fechaalta=" + fechaalta + ", fechabaja=" + fechabaja + ", status=" + status + ", intentos=" + intentos + ", fecharevocado=" + fecharevocado + ", fechaVigencia=" + fechaVigencia + ", noAcceso=" + noAcceso + '}';
    }

}
