package com.fedevela.core.asic.beans;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "configuracion")
public class OperatoriaCfg implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idOperatoria;
    private String descripcion;
    private Long scltcod;
    private Long doccodU;
    private Long ssccod;
    private Boolean cfgIngreso = false;
    private Boolean capValidarOperatoriaS = false;
    private Boolean capValidarIngresoS = false;
    private Boolean capValidarCapturaS = false;
    private Boolean capValidarOperatoriaU = false;
    private Boolean capValidarIngresoU = true;
    private Boolean capValidarCapturaU = true;
    private Boolean capValidarOperatoriaT = false;
    private Boolean capValidarIngresoT = false;
    private Boolean capValidarCapturaT = false;
    /**
     * Se utiliza para definir otros tipos de etiquetas que pueden ser válidos.
     * Nota: Los tipos actuales del core son: S, U, T.
     */
    private String tipos;

    public Long getIdOperatoria() {
        return idOperatoria;
    }

    public void setIdOperatoria(Long idOperatoria) {
        this.idOperatoria = idOperatoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Boolean getCapValidarIngresoU() {
        return capValidarIngresoU;
    }

    public void setCapValidarIngresoU(Boolean capValidarIngresoU) {
        this.capValidarIngresoU = capValidarIngresoU;
    }

    public Long getDoccodU() {
        return doccodU;
    }

    public void setDoccodU(Long doccodU) {
        this.doccodU = doccodU;
    }

    public Long getSsccod() {
        return ssccod;
    }

    public void setSsccod(Long ssccod) {
        this.ssccod = ssccod;
    }

    public Boolean getCapValidarOperatoriaS() {
        return capValidarOperatoriaS;
    }

    public void setCapValidarOperatoriaS(Boolean capValidarOperatoriaS) {
        this.capValidarOperatoriaS = capValidarOperatoriaS;
    }

    public Boolean getCapValidarOperatoriaU() {
        return capValidarOperatoriaU;
    }

    public void setCapValidarOperatoriaU(Boolean capValidarOperatoriaU) {
        this.capValidarOperatoriaU = capValidarOperatoriaU;
    }

    public Boolean getCapValidarOperatoriaT() {
        return capValidarOperatoriaT;
    }

    public void setCapValidarOperatoriaT(Boolean capValidarOperatoriaT) {
        this.capValidarOperatoriaT = capValidarOperatoriaT;
    }

    public Boolean getCapValidarCapturaU() {
        return capValidarCapturaU;
    }

    public void setCapValidarCapturaU(Boolean capValidarCapturaU) {
        this.capValidarCapturaU = capValidarCapturaU;
    }

    public Boolean getCapValidarIngresoT() {
        return capValidarIngresoT;
    }

    public void setCapValidarIngresoT(Boolean capValidarIngresoT) {
        this.capValidarIngresoT = capValidarIngresoT;
    }

    public Boolean getCapValidarCapturaT() {
        return capValidarCapturaT;
    }

    public void setCapValidarCapturaT(Boolean capValidarCapturaT) {
        this.capValidarCapturaT = capValidarCapturaT;
    }

    public Boolean getCapValidarIngresoS() {
        return capValidarIngresoS;
    }

    public void setCapValidarIngresoS(Boolean capValidarIngresoS) {
        this.capValidarIngresoS = capValidarIngresoS;
    }

    public Boolean getCapValidarCapturaS() {
        return capValidarCapturaS;
    }

    public void setCapValidarCapturaS(Boolean capValidarCapturaS) {
        this.capValidarCapturaS = capValidarCapturaS;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public Boolean getCfgIngreso() {
        return cfgIngreso;
    }

    public void setCfgIngreso(Boolean cfgIngreso) {
        this.cfgIngreso = cfgIngreso;
    }
}
