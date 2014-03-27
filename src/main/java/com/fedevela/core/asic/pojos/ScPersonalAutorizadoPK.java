package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SC_PERSONAL_AUTORIZADO database table.
 *
 */
@Embeddable
public class ScPersonalAutorizadoPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="ID_PERSONAL", unique=true, nullable=false, precision=5)
    private long idPersonal;

    @Column(unique=true, nullable=false, precision=5)
    private long cliente;

    public ScPersonalAutorizadoPK() {
    }

    public ScPersonalAutorizadoPK(long idPersonal, long cliente) {
        super();
        this.idPersonal = idPersonal;
        this.cliente = cliente;
    }

    public long getIdPersonal() {
        return this.idPersonal;
    }
    public void setIdPersonal(long idPersonal) {
        this.idPersonal = idPersonal;
    }
    public long getCliente() {
        return this.cliente;
    }
    public void setCliente(long cliente) {
        this.cliente = cliente;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScPersonalAutorizadoPK)) {
            return false;
        }
        ScPersonalAutorizadoPK castOther = (ScPersonalAutorizadoPK)other;
        return
                (this.idPersonal == castOther.idPersonal)
                        && (this.cliente == castOther.cliente);

    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) (this.idPersonal ^ (this.idPersonal >>> 32)));
        hash = hash * prime + ((int) (this.cliente ^ (this.cliente >>> 32)));

        return hash;
    }
}