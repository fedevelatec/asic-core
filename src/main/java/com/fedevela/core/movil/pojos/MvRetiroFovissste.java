package com.fedevela.core.movil.pojos;

/**
 * Created by fvelazquez on 31/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author fvilla
 *
 * <b>SVN REPORT</b><br>
 * <ul>
 * <li>$Revision: 8704 $</li>
 * <li>$Date: 2012-11-13 16:06:56 -0600 (mar, 13 nov 2012) $</li>
 * <li>$Author: jamejia $</li>
 * <li>$HeadURL: http://beethoven/repo/adeadms-core/trunk/src/main/java/com/adeadms/core/movil/pojos/MvRetiroFovissste.java $</li>
 * </ul>
 */



@Entity
@Table(name="MV_RETIRO_FOVISSSTE", schema="PROD")
public class MvRetiroFovissste implements Serializable{
    @Id
    @Column(name="ID_RETIRO", unique=true, nullable=false, precision=16)
    private long idRetiro;
    @Column(name="PAQUETE")
    private String paquete;
    //    @OneToOne
//    @JoinColumn(name="ID_RETIRO", nullable=false, insertable=false, updatable=false)
    @JoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private MvRetiro mvRetiro;

    /**
     *
     @JoinColumn(name = "ID_RETIRO", referencedColumnName = "ID_RETIRO", insertable = false, updatable = false)
     @OneToOne(optional = false)
     private MvRetiro mvRetiro;
     */

    public long getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(long idRetiro) {
        this.idRetiro = idRetiro;
    }

    public MvRetiro getMvRetiro() {
        return mvRetiro;
    }

    public void setMvRetiro(MvRetiro mvRetiro) {
        this.mvRetiro = mvRetiro;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }
}
