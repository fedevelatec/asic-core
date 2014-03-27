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

@Entity
@Table(name="BD_VTM_GMM2", schema="PROD")
public class BdVtmGmm2 implements Serializable{

    @Column(name="TRAMITE")
    @Id
    private String tramite;

    @Column(name="SINIESTRO")
    private String siniestro;

    @Column(name="POLIZA")
    private String poliza;

    @Column(name="TIPO_POLIZA")
    private String tipoPoliza;

    @Column(name="CAJA")
    private String caja;

    @Column(name="NUNICODOC")
    private Long nunicodoc;

    @Column(name="CONCILIADO")
    private String conciliado;

    @Column(name="NUNICODOCT")
    private Long nunicodoct;


    public BdVtmGmm2(){
    }

    public BdVtmGmm2(String tramite, String siniestro, String poliza, String tipoPoliza, String caja, Long nunicodoc, String conciliado, Long nunicodoct, Date fechaBase, String buscarConsulta, Integer statusConsulta, Integer nLiquidacion){
        this.tramite = tramite;
        this.siniestro = siniestro;
        this.poliza = poliza;
        this.tipoPoliza = tipoPoliza;
        this.caja = caja;
        this.nunicodoc = nunicodoc;
        this.conciliado = conciliado;
        this.nunicodoct = nunicodoct;
    }

    public String getCaja()
    {
        return this.caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getConciliado() {
        return this.conciliado;
    }

    public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
    }

    public Long getNunicodoc() {
        return this.nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicodoct() {
        return this.nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public String getPoliza() {
        return this.poliza;
    }

    public void setPoliza(String poliza) {
        this.poliza = poliza;
    }

    public String getSiniestro() {
        return this.siniestro;
    }

    public void setSiniestro(String siniestro) {
        this.siniestro = siniestro;
    }

    public String getTipoPoliza() {
        return this.tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }

    public String getTramite() {
        return this.tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }


    public boolean equals(Object obj)
    {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BdVtmGmm2 other = (BdVtmGmm2)obj;
        if (this.tramite == null ? other.tramite != null : !this.tramite.equals(other.tramite)) {
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        int hash = 3;
        hash = 47 * hash + (this.tramite != null ? this.tramite.hashCode() : 0);
        return hash;
    }

    public String toString()
    {
        return "BdVtmGmm{tramite=" + this.tramite + ", siniestro=" + this.siniestro + ", poliza=" + this.poliza + ", tipoPoliza=" + this.tipoPoliza + ", caja=" + this.caja + ", nunicodoc=" + this.nunicodoc + ", conciliado=" + this.conciliado + ", nunicodoct=" + this.nunicodoct + '}';
    }

}
