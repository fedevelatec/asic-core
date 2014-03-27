package com.fedevela.core.asic.definition.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "ADEAMX_TYPE", catalog = "", schema = "PROD")
@XmlRootElement
public class AdeamxType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ICON")
    private String icon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adeamxType")
    private List<AdeamxDefinition> adeamxDefinitionList;

    public AdeamxType() {
    }

    public AdeamxType(String id) {
        this.id = id;
    }

    public AdeamxType(String id, String description) {
        this.id = id;
        this.description = description;
    }

    @XmlTransient
    @JsonIgnore
    public List<AdeamxDefinition> getAdeamxDefinitionList() {
        return adeamxDefinitionList;
    }

    public void setAdeamxDefinitionList(List<AdeamxDefinition> adeamxDefinitionList) {
        this.adeamxDefinitionList = adeamxDefinitionList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdeamxType other = (AdeamxType) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AdeamxType{" + "id=" + id + ", description=" + description + ", adeamxDefinitionList=" + adeamxDefinitionList + '}';
    }
}
