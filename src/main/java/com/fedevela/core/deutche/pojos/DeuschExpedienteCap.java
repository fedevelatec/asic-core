package com.fedevela.core.deutche.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fvilla
 */
@Entity
@Table(name = "DEUSCH_EXPEDIENTE_CAP", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DeuschExpedienteCap.findAll", query = "SELECT d FROM DeuschExpedienteCap d")})
public class DeuschExpedienteCap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FOLIO")
    private Integer folio;
    @Basic(optional = false)
    @Column(name = "CLIENTE")
    private String cliente;
    @Basic(optional = false)
    @Column(name = "MONTO")
    private BigDecimal monto;
    @Basic(optional = false)
    @Column(name = "NUNICODOC")
    private long nunicodoc;
    @Column(name = "CAMBIOS")
    private Short cambios;
    @Column(name = "ID_ENTIDAD_FED")
    private Short idEntidadFed;

    public Short getIdEntidadFed() {
        return idEntidadFed;
    }

    public void setIdEntidadFed(Short idEntidadFed) {
        this.idEntidadFed = idEntidadFed;
    }



    public DeuschExpedienteCap() {
    }

    public DeuschExpedienteCap(Integer folio) {
        this.folio = folio;
    }

    public DeuschExpedienteCap(Integer folio, String cliente, BigDecimal monto, long nunicodoc) {
        this.folio = folio;
        this.cliente = cliente;
        this.monto = monto;
        this.nunicodoc = nunicodoc;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Short getCambios() {
        return cambios;
    }

    public void setCambios(Short cambios) {
        this.cambios = cambios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (folio != null ? folio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeuschExpedienteCap)) {
            return false;
        }
        DeuschExpedienteCap other = (DeuschExpedienteCap) object;
        if ((this.folio == null && other.folio != null) || (this.folio != null && !this.folio.equals(other.folio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.deustchebank.pojos.DeuschExpedienteCap[folio=" + folio + "]";
    }

}
