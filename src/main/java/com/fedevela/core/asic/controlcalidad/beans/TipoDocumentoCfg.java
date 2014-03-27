package com.fedevela.core.asic.controlcalidad.beans;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "doccods")
public class TipoDocumentoCfg implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<Short> doccod;

    @XmlElement(name = "doccod")
    public List<Short> getDoccods() {
        return doccod;
    }

    public void setDoccods(List<Short> doccods) {
        doccod = doccods;
    }
}

