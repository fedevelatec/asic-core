package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CINTILLO", catalog = "", schema = "PROD")
@XmlRootElement
public class Cintillo implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "CAJA_ID")
    private BigDecimal cajaId;
    @Column(name = "FOLIO_CINTILLO1")
    private String folioCintillo1;
    @Column(name = "FOLIO_CINTILLO2")
    private String folioCintillo2;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "LOG")
    private String log;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Cintillo() {
    }

    public Cintillo(BigDecimal cajaId) {
        this.cajaId = cajaId;
    }

    public Cintillo(BigDecimal cajaId, Date fecha) {
        this.cajaId = cajaId;
        this.fecha = fecha;
    }

    public BigDecimal getCajaId() {
        return cajaId;
    }

    public void setCajaId(BigDecimal cajaId) {
        this.cajaId = cajaId;
    }

    public String getFolioCintillo1() {
        return folioCintillo1;
    }

    public void setFolioCintillo1(String folioCintillo1) {
        this.folioCintillo1 = folioCintillo1;
    }

    public String getFolioCintillo2() {
        return folioCintillo2;
    }

    public void setFolioCintillo2(String folioCintillo2) {
        this.folioCintillo2 = folioCintillo2;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaId != null ? cajaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cintillo)) {
            return false;
        }
        Cintillo other = (Cintillo) object;
        if ((this.cajaId == null && other.cajaId != null) || (this.cajaId != null && !this.cajaId.equals(other.cajaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.Cintillo[ cajaId=" + cajaId + " ]";
    }

}
