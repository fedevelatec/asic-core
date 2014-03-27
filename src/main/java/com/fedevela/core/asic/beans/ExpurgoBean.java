package com.fedevela.core.asic.beans;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ExpurgoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    /*
     * Identificador del expurgo.
     * Este identificador se puede utilizar por ejemplo, si existe un catálogo de expurgos este puede ser el ID, para no estar guardando la descripcion.
     * ejemplo: 1
     */
    private Short _indice;
    private String _descripcion;
    /*
     * Este dato se utilizar para poder indentificar el prefijo del nombre del componente. Ejemplo chkExp, donde chkExp + doccod + indice nos puede generar el ID del componente; chkExp1022_1
     */
    private String _prefijo;
    private Object _valor;

    public Short getIndice() {
        return _indice;
    }

    public void setIndice(Short _indice) {
        this._indice = _indice;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public Object getValor() {
        return _valor;
    }

    public void setValor(Object _valor) {
        this._valor = _valor;
    }

    public String getPrefijo() {
        return _prefijo;
    }

    public void setPrefijo(String _prefijo) {
        this._prefijo = _prefijo;
    }
}

