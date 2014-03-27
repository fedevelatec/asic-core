package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONFIGURACION_APP", schema="PROD")
public class ConfiguracionApp implements java.io.Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @Column(name = "CLAVE")
    private String clave;

    @Basic(optional = false)
    @Column(name = "VALOR")
    private String valor;


    public ConfiguracionApp(){
    }

    public ConfiguracionApp(String clave){
        this.clave = clave;
    }

    public ConfiguracionApp(String clave, String valor){
        this.valor = valor;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clave != null ? clave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracionApp)) {
            return false;
        }
        ConfiguracionApp other = (ConfiguracionApp) object;
        if ((this.clave == null && other.clave != null) || (this.clave != null && !this.clave.equals(other.clave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.pojos.ConfiguracionApp[clave=" + clave + "]";
    }
}
