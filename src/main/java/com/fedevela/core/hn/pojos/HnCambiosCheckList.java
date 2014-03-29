package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HN_CAMBIOS_CHECKLIST", catalog = "", schema = "PROD")
public class HnCambiosCheckList implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnCambiosCheckListPk hnCambiosCheckListPk;
    @Column(name = "OBSERVACIONES")
    private String observaciones;
    @Column(name = "IDCARTERA")
    private Integer idCartera;
    @Column(name = "PRESENTE")
    private Integer presente;
    @Column(name = "CKH_RBT_OPTIONS")
    private String chkRbtOptions;
    @Column(name = "TEST_SIN_FIRMA")
    private String testSinFirma;
    @JoinColumns({
            @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false),
            @JoinColumn(name = "TIPO_CAMBIO", referencedColumnName = "TIPO_CAMBIO", insertable = false, updatable = false),
            @JoinColumn(name = "FECHA_ULT", referencedColumnName = "FECHA_ULT", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private HnCambios hnCambios;


    public HnCambiosCheckList() {
    }

    public HnCambiosCheckList(HnCambiosCheckListPk hnCambiosCheckListPk, String observaciones, Integer idCartera, Integer presente, String chkRbtOptions, String testSinFirma) {
        this.hnCambiosCheckListPk = hnCambiosCheckListPk;
        this.observaciones = observaciones;
        this.idCartera = idCartera;
        this.presente = presente;
        this.chkRbtOptions = chkRbtOptions;
        this.testSinFirma = testSinFirma;
    }

    public String getChkRbtOptions() {
        return chkRbtOptions;
    }

    public void setChkRbtOptions(String chkRbtOptions) {
        this.chkRbtOptions = chkRbtOptions;
    }

    public HnCambiosCheckListPk getHnCambiosCheckListPk() {
        return hnCambiosCheckListPk;
    }

    public void setHnCambiosCheckListPk(HnCambiosCheckListPk hnCambiosCheckListPk) {
        this.hnCambiosCheckListPk = hnCambiosCheckListPk;
    }

    public Integer getIdCartera() {
        return idCartera;
    }

    public void setIdCartera(Integer idCartera) {
        this.idCartera = idCartera;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getPresente() {
        return presente;
    }

    public void setPresente(Integer presente) {
        this.presente = presente;
    }

    public String getTestSinFirma() {
        return testSinFirma;
    }

    public void setTestSinFirma(String testSinFirma) {
        this.testSinFirma = testSinFirma;
    }

    public HnCambios getHnCambios() {
        return hnCambios;
    }

    public void setHnCambios(HnCambios hnCambios) {
        this.hnCambios = hnCambios;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HnCambiosCheckList other = (HnCambiosCheckList) obj;
        if (this.hnCambiosCheckListPk != other.hnCambiosCheckListPk && (this.hnCambiosCheckListPk == null || !this.hnCambiosCheckListPk.equals(other.hnCambiosCheckListPk))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.hnCambiosCheckListPk != null ? this.hnCambiosCheckListPk.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "HnCambiosCheckList{" + "hnCambiosCheckListPk=" + hnCambiosCheckListPk + ", observaciones=" + observaciones + ", idCartera=" + idCartera + ", presente=" + presente + ", chkRbtOptions=" + chkRbtOptions + ", testSinFirma=" + testSinFirma + '}';
    }

}
