package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="LOG_MOVIMIENTOS_CAB" ,schema="PROD")
public class LogMovimientosCab  implements java.io.Serializable {

    @Id
    @Column(name = "ID_MOVIMIENTO", unique = true, nullable = false, precision = 11, scale = 0)
    private long idMovimiento;

    @Column(name = "SCLTCOD", nullable = false, precision = 4, scale = 0)
    private short scltod;
    @Column(name = "NUNICODOC", nullable = false, precision = 10, scale = 0)
    private long nunicodoc;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "FECHA_MOV", nullable = false, length = 7)
    private Date fechaMov;
    @Column(name = "USUARIO", nullable = false, length = 50)
    private String usuario;
    @Column(name = "MOVIMIENTO", nullable = false, precision = 1, scale = 0)
    private int movimiento;
    @Column(name = "MAQUINA", nullable = false, length = 50)
    private String maquina;
    @Column(name = "IP_MAQUINA", nullable = false, length = 30)
    private String ipMaquina;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "logMovimientosCab", fetch=FetchType.EAGER)
    private Set<LogMovimientosDeta> logMovimientosDetas = new HashSet<LogMovimientosDeta>();

    public LogMovimientosCab() {
    }


    public LogMovimientosCab(long idMovimiento, short scltod, long nunicodoc, Date fechaMov, String usuario, int movimiento, String maquina, String ipMaquina) {
        this.idMovimiento = idMovimiento;
        this.scltod = scltod;
        this.nunicodoc = nunicodoc;
        this.fechaMov = fechaMov;
        this.usuario = usuario;
        this.movimiento = movimiento;
        this.maquina = maquina;
        this.ipMaquina = ipMaquina;
    }
    public LogMovimientosCab(long idMovimiento, short scltod, long nunicodoc, Date fechaMov, String usuario, int movimiento, String maquina, String ipMaquina, Set logMovimientosDetas) {
        this.idMovimiento = idMovimiento;
        this.scltod = scltod;
        this.nunicodoc = nunicodoc;
        this.fechaMov = fechaMov;
        this.usuario = usuario;
        this.movimiento = movimiento;
        this.maquina = maquina;
        this.ipMaquina = ipMaquina;
        this.logMovimientosDetas = logMovimientosDetas;
    }

    public long getIdMovimiento() {
        return this.idMovimiento;
    }

    public void setIdMovimiento(long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public short getScltod() {
        return this.scltod;
    }

    public void setScltod(short scltod) {
        this.scltod = scltod;
    }

    public long getNunicodoc() {
        return this.nunicodoc;
    }

    public void setNunicodoc(long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }
    public Date getFechaMov() {
        return this.fechaMov;
    }

    public void setFechaMov(Date fechaMov) {
        this.fechaMov = fechaMov;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getMovimiento() {
        return this.movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public String getMaquina() {
        return this.maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getIpMaquina() {
        return this.ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    public Set<LogMovimientosDeta> getLogMovimientosDetas() {
        return this.logMovimientosDetas;
    }

    public void setLogMovimientosDetas(Set<LogMovimientosDeta> logMovimientosDetas) {
        this.logMovimientosDetas = logMovimientosDetas;
    }




}


