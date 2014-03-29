package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import com.fedevela.core.asic.pojos.Sucursal;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "LRL_EXPEDIENTE", catalog = "", schema = "PROD")
public class LrlExpediente implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LrlExpedientePK lrlExpedientePK;
    @Column(name = "BENEFICIARIO")
    private String beneficiario;
    @Column(name = "IMPORTE_PAGO")
    private BigDecimal importePago;
    @Column(name = "ID_PAGO")
    private String idPago;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private Long tipo;
    @Basic(optional = false)
    @Column(name = "ESTATUS")
    private Long estatus;
    @Column(name = "ID_ARCHIVO")
    private Long idArchivo;
    @Column(name = "NUNICODOC")
    private Long nunicodoc;

    @ManyToOne(optional = true, fetch=FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "SCLTCOD", referencedColumnName = "SCLTCOD", insertable=false, updatable=false),
            @JoinColumn(name = "SSCCOD", referencedColumnName = "SSCCOD", insertable=false, updatable=false)})
    private Sucursal sucursal;

    @Formula("(select count(a.status) from prod.checklist_dig a where a.status = 3 and a.nunicodoc = nunicodoc)")
    private Long estatusDig;

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    public Long getEstatusDig() {
        return estatusDig;
    }

    public void setEstatusDig(Long estatusDig) {
        this.estatusDig = estatusDig;
    }

    public Long getIdArchivo() {
        return idArchivo;
    }

    public void setIdArchivo(Long idArchivo) {
        this.idArchivo = idArchivo;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getEstatus() {
        return estatus;
    }

    public void setEstatus(Long estatus) {
        this.estatus = estatus;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public LrlExpediente() {
    }

    public LrlExpediente(LrlExpedientePK lrlExpedientePK) {
        this.lrlExpedientePK = lrlExpedientePK;
    }

    public LrlExpediente(LrlExpedientePK lrlExpediente1PK, Long tipo, Long estatus) {
        this.lrlExpedientePK = lrlExpediente1PK;
        this.tipo = tipo;
        this.estatus = estatus;
    }

    public LrlExpediente(String numDocumento, String periodo, Long scltcod, Long ssccod) {
        this.lrlExpedientePK = new LrlExpedientePK(numDocumento, periodo, scltcod, ssccod);
    }

    public LrlExpedientePK getLrlExpedientePK() {
        return lrlExpedientePK;
    }

    public void setLrlExpedientePK(LrlExpedientePK lrlExpediente1PK) {
        this.lrlExpedientePK = lrlExpediente1PK;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public BigDecimal getImportePago() {
        return importePago;
    }

    public void setImportePago(BigDecimal importePago) {
        this.importePago = importePago;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lrlExpedientePK != null ? lrlExpedientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LrlExpediente)) {
            return false;
        }
        LrlExpediente other = (LrlExpediente) object;
        if ((this.lrlExpedientePK == null && other.lrlExpedientePK != null) || (this.lrlExpedientePK != null && !this.lrlExpedientePK.equals(other.lrlExpedientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.loreal.pojos.LrlExpediente[lrlExpediente1PK=" + lrlExpedientePK + "]";
    }

}
