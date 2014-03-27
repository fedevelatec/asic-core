package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FlowOperatoriaBean is a mapping of FLOW_OPERATORIA Table.
 *
 */
@Entity
@Table(name = "FLOW_OPERATORIA", schema = "PROD")
public class FlowOperatoria implements Serializable {

    @Id
    @Column(name = "IDOPERATORIA")
    private Long idoperatoria;
    @Column(name = "ACTIVA_TMP")
    private String activaTmp;
    @Column(name = "CAJA_TIPO_ID")
    private Long cajaTipoId;
    @Column(name = "OTROS")
    private String otros;
    @Column(name = "ACTIVA")
    private String activa;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FCH_ULTIMA_MODIF")
    private java.util.Date fchUltimaModif;
    @Column(name = "CREADOR")
    private String creador;
    @Column(name = "SCLTCOD")
    private Long scltcod;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "TIPO_CIERRE_CAJA")
    private Short tipoCierreCaja;

    public FlowOperatoria() {
    }

    public FlowOperatoria(Long idOperatoria) {
        this.idoperatoria = idOperatoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.idoperatoria != null ? this.idoperatoria.hashCode() : 0);
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
        final FlowOperatoria other = (FlowOperatoria) obj;
        if (this.idoperatoria != other.idoperatoria && (this.idoperatoria == null || !this.idoperatoria.equals(other.idoperatoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return descripcion;
    }

    public Short getTipoCierreCaja() {
        return tipoCierreCaja;
    }

    public void setTipoCierreCaja(Short tipoCierreCaja) {
        this.tipoCierreCaja = tipoCierreCaja;
    }

    /**
     * Getter method for activaTmp.
     * <br>
     * Meta Data Information (in progress):
     * <ul>
     * <li>full name: FLOW_OPERATORIA.ACTIVA_TMP</li>
     * <li>comments: Utilizado por Modulo de Adea 2000 que activa, inactiva
     * clientes para almacenar que operatorias de cada cliente estaban activadas
     * y luego poder volver a activar solo dichas operatorias. </li>
     * <li>column size: 1</li>
     * <li>jdbc type returned by the driver: Types.CHAR</li>
     * </ul>
     *
     * @return the value of activaTmp
     */
    public String getActivaTmp() {
        return activaTmp;
    }

    /**
     * Setter method for activaTmp.
     *
     * @param newVal the new value to be assigned to activaTmp
     */
    public void setActivaTmp(String newVal) {
        activaTmp = newVal;
    }

    /**
     * Getter method for cajaTipoId.
     * <br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.CAJA_TIPO_ID</li>
     * <li>comments: CAJA_TIPO_ID de tabla CAJA_TIPO</li>
     * <li>column size: 2</li>
     * <li>jdbc type returned by the driver: Types.DECIMAL</li>
     * </ul>
     *
     * @return the value of cajaTipoId
     */
    public Long getCajaTipoId() {
        return cajaTipoId;
    }

    /**
     * Setter method for cajaTipoId.
     * <br>
     *
     * @param newVal the new value to be assigned to cajaTipoId
     */
    public void setCajaTipoId(Long newVal) {
        cajaTipoId = newVal;
    }

    /**
     * Setter method for cajaTipoId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary
     * types.
     *
     * @param newVal the new value to be assigned to cajaTipoId
     */
    public void setCajaTipoId(byte newVal) {
        setCajaTipoId(new Long(newVal));
    }

    /**
     * Getter method for otros.
     * <br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.OTROS</li>
     * <li>comments: Aqui van 3 valores separados por asterisco * [TEXTO OTROS
     * DE TIPO DE CAJA*TEXTO OTROS DE PUNTO 1*TEXTO CANTIDAD CAJAS CONTEO
     * MANUAL]</li>
     * <li>column size: 200</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of otros
     */
    public String getOtros() {
        return otros;
    }

    /**
     * Setter method for otros.
     * <br>
     *
     * @param newVal the new value to be assigned to otros
     */
    public void setOtros(String newVal) {
        otros = newVal;
    }

    /**
     * Getter method for activa.
     * <br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.ACTIVA</li>
     * <li>comments: Activa=S Si, N=Eliminada.</li>
     * <li>column size: 1</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of activa
     */
    public String getActiva() {
        return activa;
    }

    /**
     * Setter method for activa.
     * <br>
     * The new value is set only if compareTo() says it is different, or if one
     * of either the new value or the current value is null. In case the new
     * value is different, it is set and the field is marked as 'modified'.
     *
     * @param newVal the new value to be assigned to activa
     */
    public void setActiva(String newVal) {
        activa = newVal;
    }

    /**
     * Getter method for fchUltimaModif.
     * <br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.FCH_ULTIMA_MODIF</li>
     * <li>comments: Fecha ultima modificacion.</li>
     * <li>column size: 7</li>
     * <li>jdbc type returned by the driver: Types.DATE</li>
     * </ul>
     *
     * @return the value of fchUltimaModif
     */
    public java.util.Date getFchUltimaModif() {
        return fchUltimaModif;
    }

    /**
     * Setter method for fchUltimaModif.
     * <br>
     *
     * @param newVal the new value to be assigned to fchUltimaModif
     */
    public void setFchUltimaModif(java.util.Date newVal) {
        fchUltimaModif = newVal;
    }

    /**
     * Setter method for fchUltimaModif.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary
     * types.
     *
     * @param newVal the new value to be assigned to fchUltimaModif
     */
    public void setFchUltimaModif(long newVal) {
        setFchUltimaModif(new java.util.Date(newVal));
    }

    /**
     * Getter method for creador.
     * <br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.CREADOR</li>
     * <li>comments: Usuario creador o que modifico la operatoria.</li>
     * <li>column size: 200</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of creador
     */
    public String getCreador() {
        return creador;
    }

    /**
     * Setter method for creador.
     *
     * @param newVal the new value to be assigned to creador
     */
    public void setCreador(String newVal) {
        creador = newVal;
    }

    /**
     * Getter method for scltcod.
     * <br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.SCLTCOD</li>
     * <li>comments: Codigo Cliente.</li>
     * <li>column size: 4</li>
     * <li>jdbc type returned by the driver: Types.DECIMAL</li>
     * </ul>
     *
     * @return the value of scltcod
     */
    public Long getScltcod() {
        return scltcod;
    }

    /**
     * Setter method for scltcod.
     *
     * @param newVal the new value to be assigned to scltcod
     */
    public void setScltcod(Long newVal) {
        scltcod = newVal;
    }

    /**
     * Setter method for scltcod.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary
     * types.
     *
     * @param newVal the new value to be assigned to scltcod
     */
    public void setScltcod(short newVal) {
        setScltcod(new Long(newVal));
    }

    /**
     * Getter method for descripcion.
     * <br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.DESCRIPCION</li>
     * <li>comments: Descripcion Operatoria.</li>
     * <li>column size: 200</li>
     * <li>jdbc type returned by the driver: Types.VARCHAR</li>
     * </ul>
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Setter method for descripcion.
     *
     * @param newVal the new value to be assigned to descripcion
     */
    public void setDescripcion(String newVal) {
        descripcion = newVal;
    }

    /**
     * Getter method for idoperatoria.
     * <br>
     * PRIMARY KEY.<br>
     * <ul>
     * <li>full name: FLOW_OPERATORIA.IDOPERATORIA</li>
     * <li>comments: ID Operatoria.</li>
     * <li>column size: 22</li>
     * <li>jdbc type returned by the driver: Types.DECIMAL</li>
     * </ul>
     *
     * @return the value of idoperatoria
     */
    public Long getIdoperatoria() {
        return idoperatoria;
    }

    /**
     * Setter method for idoperatoria.
     * <br>
     *
     * @param newVal the new value to be assigned to idoperatoria
     */
    public void setIdoperatoria(Long newVal) {
        idoperatoria = newVal;
    }
}
