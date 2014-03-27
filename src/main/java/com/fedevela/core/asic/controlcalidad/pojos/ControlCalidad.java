package com.fedevela.core.asic.controlcalidad.pojos;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CONTROL_CALIDAD", catalog = "", schema = "PROD")
@XmlRootElement
@NamedQueries({
        @NamedQuery(name = "ControlCalidad.findAll", query = "SELECT c FROM ControlCalidad c")})
public class ControlCalidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ControlCalidadPK controlCalidadPK;
    @Column(name = "ID_CAJA")
    private Long idCaja;
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Column(name = "OPERATORIA")
    private Long operatoria;
    @Lob
    @Column(name = "ENTRADA")
    private String entrada;
    @Lob
    @Column(name = "SALIDA")
    private String salida;
    @Column(name = "USUARIO")
    private String usuario;

    public ControlCalidad() {
    }

    public ControlCalidad(ControlCalidadPK controlCalidadPK) {
        this.controlCalidadPK = controlCalidadPK;
    }

    public ControlCalidad(long nunicodoc, Date fecha) {
        this.controlCalidadPK = new ControlCalidadPK(nunicodoc, fecha);
    }

    public ControlCalidadPK getControlCalidadPK() {
        return controlCalidadPK;
    }

    public void setControlCalidadPK(ControlCalidadPK controlCalidadPK) {
        this.controlCalidadPK = controlCalidadPK;
    }

    public Long getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Long idCaja) {
        this.idCaja = idCaja;
    }

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Long getOperatoria() {
        return operatoria;
    }

    public void setOperatoria(Long operatoria) {
        this.operatoria = operatoria;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (controlCalidadPK != null ? controlCalidadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlCalidad)) {
            return false;
        }
        ControlCalidad other = (ControlCalidad) object;
        if ((this.controlCalidadPK == null && other.controlCalidadPK != null) || (this.controlCalidadPK != null && !this.controlCalidadPK.equals(other.controlCalidadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.controlcalidad.pojos.ControlCalidad[ controlCalidadPK=" + controlCalidadPK + " ]";
    }

}

