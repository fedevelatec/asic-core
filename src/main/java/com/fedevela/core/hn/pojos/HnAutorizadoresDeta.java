package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HN_AUTORIZADORES_DETA", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnAutorizadoresDeta.findAll", query = "SELECT h FROM HnAutorizadoresDeta h"),
        @NamedQuery(name = "HnAutorizadoresDeta.findByIdoperador", query = "SELECT h FROM HnAutorizadoresDeta h WHERE h.idoperador = :idoperador"),
        @NamedQuery(name = "HnAutorizadoresDeta.findByUsuario", query = "SELECT h FROM HnAutorizadoresDeta h WHERE h.usuario = :usuario")})
public class HnAutorizadoresDeta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "IDOPERADOR")
    private BigDecimal idoperador;
    @Column(name = "USUARIO")
    private String usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hnAutorizadoresDeta")
    private List<HnAutorizadores> hnAutorizadoresList;

    public HnAutorizadoresDeta() {
    }

    public HnAutorizadoresDeta(BigDecimal idoperador) {
        this.idoperador = idoperador;
    }

    public BigDecimal getIdoperador() {
        return idoperador;
    }

    public void setIdoperador(BigDecimal idoperador) {
        this.idoperador = idoperador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public List<HnAutorizadores> getHnAutorizadoresList() {
        return hnAutorizadoresList;
    }

    public void setHnAutorizadoresList(List<HnAutorizadores> hnAutorizadoresList) {
        this.hnAutorizadoresList = hnAutorizadoresList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoperador != null ? idoperador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnAutorizadoresDeta)) {
            return false;
        }
        HnAutorizadoresDeta other = (HnAutorizadoresDeta) object;
        if ((this.idoperador == null && other.idoperador != null) || (this.idoperador != null && !this.idoperador.equals(other.idoperador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.fovissste.pojos.so.HnAutorizadoresDeta[idoperador=" + idoperador + "]";
    }

}
