package com.fedevela.core.asic.beans;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "expurgo")
public class ExpurgosBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private List<ExpurgoBean> _expurgos;

    public ExpurgosBean() {
    }

    public ExpurgosBean(List<ExpurgoBean> _expurgos) {
        this._expurgos = _expurgos;
    }

    @XmlElement(name = "elemento")
    public List<ExpurgoBean> getExpurgos() {
        return _expurgos;
    }

    public void setExpurgos(List<ExpurgoBean> _expurgos) {
        this._expurgos = _expurgos;
    }
}
