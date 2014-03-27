package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "RESTRICCIONES_GUARDA", catalog = "", schema = "PROD")
@XmlRootElement
public class RestriccionesGuarda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TIPO_GUARDA")
    private String tipoGuarda;
    @Basic(optional = false)
    @Column(name = "RESTRICCION_DESC")
    private String restriccionDesc;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restriccionGuarda")
//    private Set<Clientes> clientesSet;

    public RestriccionesGuarda() {
    }

    public RestriccionesGuarda(String tipoGuarda) {
        this.tipoGuarda = tipoGuarda;
    }

    public RestriccionesGuarda(String tipoGuarda, String restriccionDesc) {
        this.tipoGuarda = tipoGuarda;
        this.restriccionDesc = restriccionDesc;
    }

    public String getTipoGuarda() {
        return tipoGuarda;
    }

    public void setTipoGuarda(String tipoGuarda) {
        this.tipoGuarda = tipoGuarda;
    }

    public String getRestriccionDesc() {
        return restriccionDesc;
    }

    public void setRestriccionDesc(String restriccionDesc) {
        this.restriccionDesc = restriccionDesc;
    }

    //    @XmlTransient
//    @JsonIgnore
//    public Set<Clientes> getClientesSet() {
//        return clientesSet;
//    }
//
//    public void setClientesSet(Set<Clientes> clientesSet) {
//        this.clientesSet = clientesSet;
//    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipoGuarda != null ? tipoGuarda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RestriccionesGuarda)) {
            return false;
        }
        RestriccionesGuarda other = (RestriccionesGuarda) object;
        if ((this.tipoGuarda == null && other.tipoGuarda != null) || (this.tipoGuarda != null && !this.tipoGuarda.equals(other.tipoGuarda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.adea.pojos.RestriccionesGuarda[ tipoGuarda=" + tipoGuarda + " ]";
    }
}
