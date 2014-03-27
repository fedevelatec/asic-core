package com.fedevela.core.asic.vtmgmm;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "BD_VTM_GMM", schema="PROD")
public class BdVtmGmm implements Serializable {

    @Column(name = "TRAMITE")
    @Id
    private String tramite;

    @Column(name = "SINIESTRO")
    private String siniestro;

    @Column(name = "POLIZA")
    private String poliza;

    @Column(name = "TIPO_POLIZA")
    private String tipoPoliza;

    @Column(name = "CAJA")
    private String caja;

    @Column(name = "NUNICODOC")
    private Long nunicodoc;

    @Column(name = "CONCILIADO")
    private String conciliado;

    @Column(name = "NUNICODOCT")
    private Long nunicodoct;

    //@Column(name = "FECHA_BASE")
    //@Temporal(javax.persistence.TemporalType.TIMESTAMP)
    //private Date fechaBase;

    //@Column(name = "BUSCAR_CONSULTA")
    //private String buscarConsulta;

    //@Column(name = "STATUS_CONSULTA")
    //private Integer statusConsulta;

    //@Column(name = "N_LIQUIDACION")
    //private Integer nLiquidacion;

    public BdVtmGmm() {
    }

    public BdVtmGmm(String tramite, String siniestro, String poliza, String tipoPoliza, String caja, Long nunicodoc, String conciliado, Long nunicodoct, Date fechaBase, String buscarConsulta, Integer statusConsulta, Integer nLiquidacion) {
        this.tramite = tramite;
        this.siniestro = siniestro;
        this.poliza = poliza;
        this.tipoPoliza = tipoPoliza;
        this.caja = caja;
        this.nunicodoc = nunicodoc;
        this.conciliado = conciliado;
        this.nunicodoct = nunicodoct;

    }


    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getConciliado() {
        return conciliado;
    }

    public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public String getPoliza() {
        return poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getSiniestro() {
        return siniestro;
    }

    public void setSiniestro(String siniestro) {
        this.siniestro = siniestro;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BdVtmGmm other = (BdVtmGmm) obj;
        if ((this.tramite == null) ? (other.tramite != null) : !this.tramite.equals(other.tramite)) {
            return false;
        }
        if ((this.siniestro == null) ? (other.siniestro != null) : !this.siniestro.equals(other.siniestro)) {
            return false;
        }
        if ((this.poliza == null) ? (other.poliza != null) : !this.poliza.equals(other.poliza)) {
            return false;
        }
        if ((this.tipoPoliza == null) ? (other.tipoPoliza != null) : !this.tipoPoliza.equals(other.tipoPoliza)) {
            return false;
        }
        if ((this.caja == null) ? (other.caja != null) : !this.caja.equals(other.caja)) {
            return false;
        }
        if (this.nunicodoc != other.nunicodoc && (this.nunicodoc == null || !this.nunicodoc.equals(other.nunicodoc))) {
            return false;
        }
        if ((this.conciliado == null) ? (other.conciliado != null) : !this.conciliado.equals(other.conciliado)) {
            return false;
        }
        if (this.nunicodoct != other.nunicodoct && (this.nunicodoct == null || !this.nunicodoct.equals(other.nunicodoct))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.tramite != null ? this.tramite.hashCode() : 0);
        hash = 47 * hash + (this.siniestro != null ? this.siniestro.hashCode() : 0);
        hash = 47 * hash + (this.poliza != null ? this.poliza.hashCode() : 0);
        hash = 47 * hash + (this.tipoPoliza != null ? this.tipoPoliza.hashCode() : 0);
        hash = 47 * hash + (this.caja != null ? this.caja.hashCode() : 0);
        hash = 47 * hash + (this.nunicodoc != null ? this.nunicodoc.hashCode() : 0);
        hash = 47 * hash + (this.conciliado != null ? this.conciliado.hashCode() : 0);
        hash = 47 * hash + (this.nunicodoct != null ? this.nunicodoct.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "BdVtmGmm{" + "tramite=" + tramite + ", siniestro=" + siniestro + ", poliza=" + poliza + ", tipoPoliza=" + tipoPoliza + ", caja=" + caja + ", nunicodoc=" + nunicodoc + ", conciliado=" + conciliado + ", nunicodoct=" + nunicodoct + '}';
    }

}
