package com.fedevela.core.deutche.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import com.fedevela.core.asic.pojos.CatEntidadFed;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fvilla
 */
@Entity
@Table(name = "DEUSCH_EXPEDIENTE", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "DeuschExpediente.findAll", query = "SELECT d FROM DeuschExpediente d"),
        @NamedQuery(name = "DeuschExpediente.findByFolio", query = "SELECT d FROM DeuschExpediente d WHERE d.folio = :folio"),
        @NamedQuery(name = "DeuschExpediente.findByCliente", query = "SELECT d FROM DeuschExpediente d WHERE d.cliente = :cliente"),
        @NamedQuery(name = "DeuschExpediente.findByMonto", query = "SELECT d FROM DeuschExpediente d WHERE d.monto = :monto")})
public class DeuschExpediente implements Serializable {
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
    @Column(name = "ID_ARCHIVO")
    private Long idArchivo;
    @JoinColumn(name = "ID_ENTIDAD_FED", referencedColumnName = "ID_ENTIDAD_FED")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private CatEntidadFed idEntidadFed;

    public DeuschExpediente() {
    }

    public DeuschExpediente(Integer folio) {
        this.folio = folio;
    }

    public DeuschExpediente(Integer folio, String cliente, BigDecimal monto) {
        this.folio = folio;
        this.cliente = cliente;
        this.monto = monto;
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

    public CatEntidadFed getIdEntidadFed() {
        return idEntidadFed;
    }

    public void setIdEntidadFed(CatEntidadFed idEntidadFed) {
        this.idEntidadFed = idEntidadFed;
    }

    public Long getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Long idArchivo) {
        this.idArchivo = idArchivo;
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
        if (!(object instanceof DeuschExpediente)) {
            return false;
        }
        DeuschExpediente other = (DeuschExpediente) object;
        if ((this.folio == null && other.folio != null) || (this.folio != null && !this.folio.equals(other.folio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.deustchebank.pojos.DeuschExpediente[folio=" + folio + "]";
    }

}
