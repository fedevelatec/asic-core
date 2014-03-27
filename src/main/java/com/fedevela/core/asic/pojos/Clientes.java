package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "CLIENTES", schema = "PROD")
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Basic(optional = false)
    @Column(name = "ACLTRZSC")
    private String acltrzsc;
    @Column(name = "ULTNUNICOHZCLIENTE")
    private Integer ultnunicohzcliente;
    @Column(name = "REFERENCIA_POR_CONTRATO")
    private String referenciaPorContrato;
    @Column(name = "TIPO_DE_CONSULTA")
    private String tipoDeConsulta;
    @Column(name = "ESTADO")
    private Character estado;

    public Clientes() {
    }

    public Clientes(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Clientes(Long scltcod, String acltrzsc) {
        this.scltcod = scltcod;
        this.acltrzsc = acltrzsc;
    }

    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }


    public String getAcltrzsc() {
        return acltrzsc;
    }

    public void setAcltrzsc(String acltrzsc) {
        this.acltrzsc = acltrzsc;
    }

    @JsonIgnore
    public Integer getUltnunicohzcliente() {
        return ultnunicohzcliente;
    }

    public void setUltnunicohzcliente(Integer ultnunicohzcliente) {
        this.ultnunicohzcliente = ultnunicohzcliente;
    }

    @JsonIgnore
    public String getReferenciaPorContrato() {
        return referenciaPorContrato;
    }

    public void setReferenciaPorContrato(String referenciaPorContrato) {
        this.referenciaPorContrato = referenciaPorContrato;
    }

    @JsonIgnore
    public String getTipoDeConsulta() {
        return tipoDeConsulta;
    }

    public void setTipoDeConsulta(String tipoDeConsulta) {
        this.tipoDeConsulta = tipoDeConsulta;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.scltcod != null ? this.scltcod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        if (this.scltcod != other.scltcod && (this.scltcod == null || !this.scltcod.equals(other.scltcod))) {
            return false;
        }
        return true;
    }



    @Override
    public String toString() {
        return acltrzsc;
    }
}
