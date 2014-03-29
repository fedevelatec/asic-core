package com.fedevela.core.hn.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "HN_CAMBIOS", catalog = "", schema = "PROD")
public class HnCambios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnCambiosPk hnCambiosPk;
    @Column(name = "TEST_RBT")
    private Integer testRbt;
    @Column(name = "USUARIO")
    private String usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hnCambios", fetch = FetchType.EAGER)
    private Set<HnCambiosCheckList> hnCambiosCheckList;

    public HnCambios() {
    }

    public HnCambios(HnCambiosPk hnCambiosPk, Integer testRbt, Set<HnCambiosCheckList> hnCambiosCheckList) {
        this.hnCambiosPk = hnCambiosPk;
        this.testRbt = testRbt;
        this.hnCambiosCheckList = hnCambiosCheckList;
    }

    public HnCambios(HnCambiosPk hnCambiosPk) {
        this.hnCambiosPk = hnCambiosPk;
    }



    public HnCambiosPk getHnCambiosPk() {
        return hnCambiosPk;
    }

    public void setHnCambiosPk(HnCambiosPk hnCambiosPk) {
        this.hnCambiosPk = hnCambiosPk;
    }

    public Integer getTestRbt() {
        return testRbt;
    }

    public void setTestRbt(Integer testRbt) {
        this.testRbt = testRbt;
    }

    public Set<HnCambiosCheckList> getHnCambiosCheckList() {
        return hnCambiosCheckList;
    }

    public void setHnCambiosCheckList(Set<HnCambiosCheckList> hnCambiosCheckList) {
        this.hnCambiosCheckList = hnCambiosCheckList;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HnCambios other = (HnCambios) obj;
        if (this.hnCambiosPk != other.hnCambiosPk && (this.hnCambiosPk == null || !this.hnCambiosPk.equals(other.hnCambiosPk))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (this.hnCambiosPk != null ? this.hnCambiosPk.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "HnCambios{" + "hnCambiosPk=" + hnCambiosPk + ", testRbt=" + testRbt + '}';
    }

}
