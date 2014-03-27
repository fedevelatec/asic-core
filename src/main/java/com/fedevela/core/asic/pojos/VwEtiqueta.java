package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "VW_ETIQUETA", catalog = "", schema = "PROD")
@XmlRootElement
public class VwEtiqueta implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VwEtiquetaPK vwEtiquetaPK;
    @Column(name = "NUNICOSELLO")
    private Long nunicosello;
    @Column(name = "NROPRECINTO1")
    private Integer nroprecinto1;
    @Column(name = "NROPRECINTO2")
    private Integer nroprecinto2;
    @Column(name = "NUNICODOC")
    private Long nunicodoc;
    @Column(name = "OPERATORIA")
    private Long operatoria;
    @Column(name = "DOCADEACLT")
    private Long docadeaclt;
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Column(name = "DOCCOD")
    private Short doccod;
    @Column(name = "ESTADO_UBICACION")
    private String estadoUbicacion;
    @Column(name = "LOTE")
    private Long lote;
    @Column(name = "POSICION_LOTE")
    private Long posicionLote;
    @Column(name = "POSICION_GLOBAL")
    private Long posicionGlobal;
    @Column(name = "DOCDESC")
    private String docdesc;
    @Column(name = "RECIBO_INGRESO")
    private Long reciboIngreso;
    @Column(name = "INGRESADA")
    private Character ingresada;
    @Column(name = "CAPTURADA")
    private Character capturada;
    @Column(name = "DISPERSO")
    private Character disperso;

    public VwEtiqueta() {
    }

    public Character getCapturada() {
        return capturada;
    }

    public void setCapturada(Character capturada) {
        this.capturada = capturada;
    }

    public Long getDocadeaclt() {
        return docadeaclt;
    }

    public void setDocadeaclt(Long docadeaclt) {
        this.docadeaclt = docadeaclt;
    }

    public Short getDoccod() {
        return doccod;
    }

    public void setDoccod(Short doccod) {
        this.doccod = doccod;
    }

    public String getDocdesc() {
        return docdesc;
    }

    public void setDocdesc(String docdesc) {
        this.docdesc = docdesc;
    }

    public String getEstadoUbicacion() {
        return estadoUbicacion;
    }

    public void setEstadoUbicacion(String estadoUbicacion) {
        this.estadoUbicacion = estadoUbicacion;
    }

    public Character getIngresada() {
        return ingresada;
    }

    public void setIngresada(Character ingresada) {
        this.ingresada = ingresada;
    }

    public Integer getNroprecinto1() {
        return nroprecinto1;
    }

    public void setNroprecinto1(Integer nroprecinto1) {
        this.nroprecinto1 = nroprecinto1;
    }

    public Integer getNroprecinto2() {
        return nroprecinto2;
    }

    public void setNroprecinto2(Integer nroprecinto2) {
        this.nroprecinto2 = nroprecinto2;
    }

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public Long getNunicosello() {
        return nunicosello;
    }

    public void setNunicosello(Long nunicosello) {
        this.nunicosello = nunicosello;
    }

    public Long getOperatoria() {
        return operatoria;
    }

    public void setOperatoria(Long operatoria) {
        this.operatoria = operatoria;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public VwEtiquetaPK getVwEtiquetaPK() {
        return vwEtiquetaPK;
    }

    public void setVwEtiquetaPK(VwEtiquetaPK vwEtiquetaPK) {
        this.vwEtiquetaPK = vwEtiquetaPK;
    }

    public Long getLote() {
        return lote;
    }

    public void setLote(Long lote) {
        this.lote = lote;
    }

    public Long getPosicionLote() {
        return posicionLote;
    }

    public void setPosicionLote(Long posicionLote) {
        this.posicionLote = posicionLote;
    }

    public Long getPosicionGlobal() {
        return posicionGlobal;
    }

    public void setPosicionGlobal(Long posicionGlobal) {
        this.posicionGlobal = posicionGlobal;
    }

    public Long getReciboIngreso() {
        return reciboIngreso;
    }

    public void setReciboIngreso(Long reciboIngreso) {
        this.reciboIngreso = reciboIngreso;
    }

    public Character getDisperso() {
        return disperso;
    }

    public void setDisperso(Character disperso) {
        this.disperso = disperso;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VwEtiqueta other = (VwEtiqueta) obj;
        if (this.vwEtiquetaPK != other.vwEtiquetaPK && (this.vwEtiquetaPK == null || !this.vwEtiquetaPK.equals(other.vwEtiquetaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.vwEtiquetaPK != null ? this.vwEtiquetaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "VwEtiqueta{" + "vwEtiquetaPK=" + vwEtiquetaPK + ", nunicosello=" + nunicosello + ", nroprecinto1=" + nroprecinto1 + ", nroprecinto2=" + nroprecinto2 + ", nunicodoc=" + nunicodoc + ", operatoria=" + operatoria + ", docadeaclt=" + docadeaclt + ", scltcod=" + scltcod + ", doccod=" + doccod + ", estadoUbicacion=" + estadoUbicacion + ", lote=" + lote + ", posicionLote=" + posicionLote + ", posicionGlobal=" + posicionGlobal + ", docdesc=" + docdesc + ", ingresada=" + ingresada + ", capturada=" + capturada + '}';
    }
}
