package com.fedevela.core.parser.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CargaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "RENGLON")
    private int renglon;

    public CargaPK() {
    }

    public CargaPK(String id, int renglon) {
        this.id = id;
        this.renglon = renglon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrden() {
        return renglon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id.hashCode();
        hash += renglon;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CargaPK)) {
            return false;
        }
        CargaPK other = (CargaPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.renglon != other.renglon) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.cldocumentos.pojos.CargaPK[id=" + id + ", orden=" + renglon + "]";
    }

}
