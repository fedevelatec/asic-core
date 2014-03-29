package com.fedevela.core.hn.cnbv.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HN_EXPEDIENTES_CNBV_ORIG", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnExpedientesCnbvOrig.findAll", query = "SELECT h FROM HnExpedientesCnbvOrig h"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByNoCredito", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.noCredito = ?"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByNunicodoc", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.nunicodoc = ?"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByEstado", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.estado = :estado"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByCiudad", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.ciudad = :ciudad"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByDomicilioInmueble", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.domicilioInmueble = :domicilioInmueble"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByEconomiaAcreditado", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.economiaAcreditado = :economiaAcreditado"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByTipoProducto", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.tipoProducto = :tipoProducto"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByTipoTasa", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.tipoTasa = :tipoTasa"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByTasaInicial", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.tasaInicial = :tasaInicial"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByTasaActual", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.tasaActual = :tasaActual"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByMoneda", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.moneda = :moneda"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByFechaFirma", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.fechaFirma = :fechaFirma"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByFechaVencimiento", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.fechaVencimiento = :fechaVencimiento"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByPlazoMeses", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.plazoMeses = :plazoMeses"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByDestinoCredito", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.destinoCredito = :destinoCredito"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByMontoOriginalCredito", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.montoOriginalCredito = :montoOriginalCredito"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByFechaAvaluo", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.fechaAvaluo = :fechaAvaluo"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByValorAvaluo", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.valorAvaluo = :valorAvaluo"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findBySeguroVida", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.seguroVida = :seguroVida"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findBySeguroDanos", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.seguroDanos = :seguroDanos"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByTotalSeguros", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.totalSeguros = :totalSeguros"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByComisionAdministracion", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.comisionAdministracion = :comisionAdministracion"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByMuestra", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.muestra = :muestra"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByStatus", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.status = :status"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByLogin", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.login = :login"),
        @NamedQuery(name = "HnExpedientesCnbvOrig.findByNow", query = "SELECT h FROM HnExpedientesCnbvOrig h WHERE h.now = :now")})
public class HnExpedientesCnbvOrig implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NO_CREDITO")
    private String noCredito;
    @Column(name = "NUNICODOC")
    private BigInteger nunicodoc;
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "DOMICILIO_INMUEBLE")
    private String domicilioInmueble;
    @Column(name = "ECONOMIA_ACREDITADO")
    private String economiaAcreditado;
    @Column(name = "TIPO_PRODUCTO")
    private String tipoProducto;
    @Column(name = "TIPO_TASA")
    private String tipoTasa;
    @Column(name = "TASA_INICIAL")
    private BigDecimal tasaInicial;
    @Column(name = "TASA_ACTUAL")
    private BigDecimal tasaActual;
    @Column(name = "MONEDA")
    private String moneda;
    @Column(name = "FECHA_FIRMA")
    @Temporal(TemporalType.DATE)
    private Date fechaFirma;
    @Column(name = "FECHA_VENCIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "PLAZO_MESES")
    private BigInteger plazoMeses;
    @Column(name = "DESTINO_CREDITO")
    private String destinoCredito;
    @Column(name = "MONTO_ORIGINAL_CREDITO")
    private BigDecimal montoOriginalCredito;
    @Column(name = "FECHA_AVALUO")
    @Temporal(TemporalType.DATE)
    private Date fechaAvaluo;
    @Column(name = "VALOR_AVALUO")
    private BigDecimal valorAvaluo;
    @Column(name = "SEGURO_VIDA")
    private BigDecimal seguroVida;
    @Column(name = "SEGURO_DANOS")
    private BigDecimal seguroDanos;
    @Column(name = "TOTAL_SEGUROS")
    private BigDecimal totalSeguros;
    @Column(name = "COMISION_ADMINISTRACION")
    private BigDecimal comisionAdministracion;
    @Column(name = "MUESTRA")
    private String muestra;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;

    public HnExpedientesCnbvOrig() {
    }

    public HnExpedientesCnbvOrig(String noCredito) {
        this.noCredito = noCredito;
    }

    public String getNoCredito() {
        return noCredito;
    }

    public void setNoCredito(String noCredito) {
        this.noCredito = noCredito;
    }

    public BigInteger getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(BigInteger nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDomicilioInmueble() {
        return domicilioInmueble;
    }

    public void setDomicilioInmueble(String domicilioInmueble) {
        this.domicilioInmueble = domicilioInmueble;
    }

    public String getEconomiaAcreditado() {
        return economiaAcreditado;
    }

    public void setEconomiaAcreditado(String economiaAcreditado) {
        this.economiaAcreditado = economiaAcreditado;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getTipoTasa() {
        return tipoTasa;
    }

    public void setTipoTasa(String tipoTasa) {
        this.tipoTasa = tipoTasa;
    }

    public BigDecimal getTasaInicial() {
        return tasaInicial;
    }

    public void setTasaInicial(BigDecimal tasaInicial) {
        this.tasaInicial = tasaInicial;
    }

    public BigDecimal getTasaActual() {
        return tasaActual;
    }

    public void setTasaActual(BigDecimal tasaActual) {
        this.tasaActual = tasaActual;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Date getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(Date fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public BigInteger getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(BigInteger plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public String getDestinoCredito() {
        return destinoCredito;
    }

    public void setDestinoCredito(String destinoCredito) {
        this.destinoCredito = destinoCredito;
    }

    public BigDecimal getMontoOriginalCredito() {
        return montoOriginalCredito;
    }

    public void setMontoOriginalCredito(BigDecimal montoOriginalCredito) {
        this.montoOriginalCredito = montoOriginalCredito;
    }

    public Date getFechaAvaluo() {
        return fechaAvaluo;
    }

    public void setFechaAvaluo(Date fechaAvaluo) {
        this.fechaAvaluo = fechaAvaluo;
    }

    public BigDecimal getValorAvaluo() {
        return valorAvaluo;
    }

    public void setValorAvaluo(BigDecimal valorAvaluo) {
        this.valorAvaluo = valorAvaluo;
    }

    public BigDecimal getSeguroVida() {
        return seguroVida;
    }

    public void setSeguroVida(BigDecimal seguroVida) {
        this.seguroVida = seguroVida;
    }

    public BigDecimal getSeguroDanos() {
        return seguroDanos;
    }

    public void setSeguroDanos(BigDecimal seguroDanos) {
        this.seguroDanos = seguroDanos;
    }

    public BigDecimal getTotalSeguros() {
        return totalSeguros;
    }

    public void setTotalSeguros(BigDecimal totalSeguros) {
        this.totalSeguros = totalSeguros;
    }

    public BigDecimal getComisionAdministracion() {
        return comisionAdministracion;
    }

    public void setComisionAdministracion(BigDecimal comisionAdministracion) {
        this.comisionAdministracion = comisionAdministracion;
    }

    public String getMuestra() {
        return muestra;
    }

    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noCredito != null ? noCredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnExpedientesCnbvOrig)) {
            return false;
        }
        HnExpedientesCnbvOrig other = (HnExpedientesCnbvOrig) object;
        if ((this.noCredito == null && other.noCredito != null) || (this.noCredito != null && !this.noCredito.equals(other.noCredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.cnbv.pojos.HnExpedientesCnbvOrig[noCredito=" + noCredito + "]";
    }

}
