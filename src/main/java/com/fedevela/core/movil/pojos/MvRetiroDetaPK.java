package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MV_RETIRO_DETA database table.
 *
 */
@Embeddable
public class MvRetiroDetaPK implements Serializable {
    //default serial version id, required for serializable classes.
    private static final long serialVersionUID = 1L;

    @Column(name="ID_RETIRO", unique=true, nullable=false, precision=16)
    private long idRetiro;

    @Column(unique=true, nullable=false, precision=12)
    private long etiqueta;

    public MvRetiroDetaPK() {
    }


    public MvRetiroDetaPK(long idRetiro, long etiqueta) {
        super();
        this.idRetiro = idRetiro;
        this.etiqueta = etiqueta;
    }



    public long getIdRetiro() {
        return this.idRetiro;
    }
    public void setIdRetiro(long idRetiro) {
        this.idRetiro = idRetiro;
    }
    public long getEtiqueta() {
        return this.etiqueta;
    }
    public void setEtiqueta(long etiqueta) {
        this.etiqueta = etiqueta;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MvRetiroDetaPK)) {
            return false;
        }
        MvRetiroDetaPK castOther = (MvRetiroDetaPK)other;
        return
                (this.idRetiro == castOther.idRetiro)
                        && (this.etiqueta == castOther.etiqueta);

    }

    public int hashCode() {
        final int prime = 31;
        int hash = 17;
        hash = hash * prime + ((int) (this.idRetiro ^ (this.idRetiro >>> 32)));
        hash = hash * prime + ((int) (this.etiqueta ^ (this.etiqueta >>> 32)));

        return hash;
    }
}