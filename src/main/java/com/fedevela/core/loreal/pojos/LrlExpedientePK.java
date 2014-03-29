package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LrlExpedientePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "NUM_DOCUMENTO")
    private String numDocumento;
    @Basic(optional = false)
    @Column(name = "PERIODO")
    private String periodo;
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Basic(optional = false)
    @Column(name = "SSCCOD")
    private Long ssccod;

    public LrlExpedientePK() {
    }

    public LrlExpedientePK(String numDocumento, String periodo, Long scltcod, Long ssccod) {
        this.numDocumento = numDocumento;
        this.periodo = periodo;
        this.scltcod = scltcod;
        this.ssccod = ssccod;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LrlExpedientePK other = (LrlExpedientePK) obj;
        if ((this.numDocumento == null) ? (other.numDocumento != null) : !this.numDocumento.equals(other.numDocumento)) {
            return false;
        }
        if ((this.periodo == null) ? (other.periodo != null) : !this.periodo.equals(other.periodo)) {
            return false;
        }
        if (this.scltcod != other.scltcod && (this.scltcod == null || !this.scltcod.equals(other.scltcod))) {
            return false;
        }
        if (this.ssccod != other.ssccod && (this.ssccod == null || !this.ssccod.equals(other.ssccod))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.numDocumento != null ? this.numDocumento.hashCode() : 0);
        hash = 71 * hash + (this.periodo != null ? this.periodo.hashCode() : 0);
        hash = 71 * hash + (this.scltcod != null ? this.scltcod.hashCode() : 0);
        hash = 71 * hash + (this.ssccod != null ? this.ssccod.hashCode() : 0);
        return hash;
    }




    public Long getScltcod() {
        return scltcod;
    }

    public void setScltcod(Long scltcod) {
        this.scltcod = scltcod;
    }

    public Long getSsccod() {
        return ssccod;
    }

    public void setSsccod(Long ssccod) {
        this.ssccod = ssccod;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }


    @Override
    public String toString() {
        return "com.adeamx.adeadms.loreal.pojos.LrlExpediente1PK[numDocumento=" + numDocumento + ", periodo=" + periodo + ", scltcod=" + scltcod + ", ssccod=" + ssccod + "]";
    }

}
