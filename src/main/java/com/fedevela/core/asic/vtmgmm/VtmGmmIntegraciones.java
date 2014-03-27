package com.fedevela.core.asic.vtmgmm;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.NamedQueries;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "VTM_GMM_INTEGRACIONES", schema="PROD")
public class VtmGmmIntegraciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRAMITE")
    private String tramite;
    @Column(name = "LEIDO")
    private Character leido;
    @Column(name = "INTEGRADO")
    private Character integrado;
    @Basic(optional = false)
    @Column(name = "SINIESTRO")
    private String siniestro;
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Column(name = "NUNICODOCT")
    private Long nunicodoct;
    @Basic(optional = false)
    @Column(name = "ORDEN")
    private Long orden;
    @Column(name = "CAJA_ID")
    private Long cajaId;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "TIPO_POLIZA")
    private String tipoPoliza;
    @Column(name = "N_LIQUIDACION")
    private Long nLiquidacion;
    @Column(name = "USUARIO_INTEGRO")
    private String usuarioIntegro;


    public Long getnLiquidacion() {
        return nLiquidacion;
    }

    public void setnLiquidacion(Long nLiquidacion) {
        this.nLiquidacion = nLiquidacion;
    }

    public String getTipoPoliza() {
        return tipoPoliza;
    }

    public void setTipoPoliza(String tipoPoliza) {
        this.tipoPoliza = tipoPoliza;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public VtmGmmIntegraciones() {
    }

    public VtmGmmIntegraciones(String tramite) {
        this.tramite = tramite;
    }

    public VtmGmmIntegraciones(String tramite, String siniestro, Long orden) {
        this.tramite = tramite;
        this.siniestro = siniestro;
        this.orden = orden;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public Character getLeido() {
        return leido;
    }

    public void setLeido(Character leido) {
        this.leido = leido;
    }

    public Character getIntegrado() {
        return integrado;
    }

    public void setIntegrado(Character integrado) {
        this.integrado = integrado;
    }

    public String getSiniestro() {
        return siniestro;
    }

    public void setSiniestro(String siniestro) {
        this.siniestro = siniestro;
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

    public long getOrden() {
        return orden;
    }

    public void setOrden(long orden) {
        this.orden = orden;
    }

    public Long getCajaId() {
        return cajaId;
    }

    public void setCajaId(Long cajaId) {
        this.cajaId = cajaId;
    }





    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tramite != null ? tramite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VtmGmmIntegraciones)) {
            return false;
        }
        VtmGmmIntegraciones other = (VtmGmmIntegraciones) object;
        if ((this.tramite == null && other.tramite != null) || (this.tramite != null && !this.tramite.equals(other.tramite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeams.core.adea.vtmgmm.VtmGmmIntegraciones[tramite=" + tramite + "]";
    }

    /**
     * @return the usuarioIntegro
     */
    public String getUsuarioIntegro() {
        return usuarioIntegro;
    }

    /**
     * @param usuarioIntegro the usuarioIntegro to set
     */
    public void setUsuarioIntegro(String usuarioIntegro) {
        this.usuarioIntegro = usuarioIntegro;
    }

}
