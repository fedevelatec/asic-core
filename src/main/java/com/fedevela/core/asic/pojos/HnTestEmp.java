package com.fedevela.core.asic.pojos;

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
import javax.persistence.TemporalType;

/**
 * Pojo de la tabla de HN testimonios empresariales.
 */
@Entity
@Table(name="HN_TEST_EMP", schema="PROD")
public class HnTestEmp implements Serializable{
    @Id
    @Column(name="NUNICODOCT")
    private long nunicodoct;
    @Column(name="NUNICODOC")
    private long nunicodoc;
    @Column(name="CREDITO_PU")
    private String creditoPu;
    @Column(name="CLIENTE_PROMOTOR")
    private String clientePromotor;
    @Column(name="NOM_PROYECTO")
    private String nomProyecto;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="FECHA_ESCRITURA")
    private Date fechaEscritura;
    @Column(name="NUM_NOTARIO")
    private String numNotario;
    @Column(name="NUM_ESCRITURA")
    private String numEscritura;
    @Column(name="DH_NUM")
    private String dhNum;
    @Column(name="CREDITO_HN")
    private String creditoHn;
    @Column(name="LINEA_CREDITO")
    private String lineaCredito;
    @Column(name="SUB_ITEM")
    private short subItem;
    @Column(name="DOCCOD")
    private short doccod;
    @Column(name="OTROS_PROMOTORES")
    private String otros_promotores;

    @Override
    public String toString() {
        return "HnTestEmp{" + "nunicodoct=" + nunicodoct + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HnTestEmp other = (HnTestEmp) obj;
        if (this.nunicodoct != other.nunicodoct) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (int) (this.nunicodoct ^ (this.nunicodoct >>> 32));
        return hash;
    }

    public String getClientePromotor() {
        return clientePromotor;
    }

    public void setClientePromotor(String clientePromotor) {
        this.clientePromotor = clientePromotor;
    }

    public String getCreditoHn() {
        return creditoHn;
    }

    public void setCreditoHn(String creditoHn) {
        this.creditoHn = creditoHn;
    }

    public String getCreditoPu() {
        return creditoPu;
    }

    public void setCreditoPu(String creditoPu) {
        this.creditoPu = creditoPu;
    }

    public String getDhNum() {
        return dhNum;
    }

    public void setDhNum(String dhNum) {
        this.dhNum = dhNum;
    }

    public short getDoccod() {
        return doccod;
    }

    public void setDoccod(short doccod) {
        this.doccod = doccod;
    }

    public Date getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(Date fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public String getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(String lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    public String getNumEscritura() {
        return numEscritura;
    }

    public void setNumEscritura(String numEscritura) {
        this.numEscritura = numEscritura;
    }

    public String getNumNotario() {
        return numNotario;
    }

    public void setNumNotario(String numNotario) {
        this.numNotario = numNotario;
    }

    public long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    public String getOtros_promotores() {
        return otros_promotores;
    }

    public void setOtros_promotores(String otros_promotores) {
        this.otros_promotores = otros_promotores;
    }

    public short getSubItem() {
        return subItem;
    }

    public void setSubItem(short subItem) {
        this.subItem = subItem;
    }
}
