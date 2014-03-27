package com.fedevela.core.asic.definition.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "ADEAMX_DEFINITION", catalog = "", schema = "PROD")
@SequenceGenerator(name = "PK_AUTOGEN", sequenceName = "PROD.SEQ_ADEAMX_DEFINITION_ID", allocationSize = 1)
@XmlRootElement
public class AdeamxDefinition implements Serializable, Comparable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_AUTOGEN")
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "E_ORDER")
    private Integer eOrder;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "FEATURE")
    private String feature;
    @Basic(optional = false)
    @Column(name = "ROW_STATUS")
    private char rowStatus;
    @Column(name = "FEATURE_1")
    private String feature1;
    @Column(name = "FEATURE_2")
    private String feature2;
    @Column(name = "FEATURE_3")
    private String feature3;
    @Column(name = "FEATURE_4")
    private String feature4;
    @Column(name = "FEATURE_5")
    private String feature5;
    @Column(name = "FEATURE_6")
    private String feature6;
    @Column(name = "FEATURE_7")
    private String feature7;
    @Column(name = "FEATURE_8")
    private String feature8;
    @Column(name = "WIKI")
    private String wiki;
    @Lob
    @Type(type = "org.hibernate.type.StringClobType")
    @Column(name = "CONFIGURE")
    private String configure;
    @JoinColumn(name = "TYPE_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private AdeamxType adeamxType;
    @OneToMany(mappedBy = "adeamxDefinition",fetch= FetchType.EAGER)
    private List<AdeamxDefinition> adeamxDefinitionList;
    @JoinColumn(name = "PARENT_ID", referencedColumnName = "ID")
    @ManyToOne
    private AdeamxDefinition adeamxDefinition;
    @javax.persistence.Transient
    private boolean hasChild;

    public AdeamxDefinition() {
    }

    public AdeamxDefinition(Long id) {
        this.id = id;
    }

    public AdeamxDefinition(Long id, Integer eOrder, String description, char rowStatus) {
        this.id = id;
        this.eOrder = eOrder;
        this.description = description;
        this.rowStatus = rowStatus;
    }

    @JsonIgnore
    public AdeamxDefinition getAdeamxDefinition() {
        return adeamxDefinition;
    }

    public void setAdeamxDefinition(AdeamxDefinition adeamxDefinition) {
        this.adeamxDefinition = adeamxDefinition;
    }

    public Long getParentId() {
        return (adeamxDefinition == null) ? null : adeamxDefinition.getId();
    }

    @JsonIgnore
    public List<AdeamxDefinition> getAdeamxDefinitionList() {
        return adeamxDefinitionList;
    }

    public void setAdeamxDefinitionList(List<AdeamxDefinition> adeamxDefinitionList) {
        this.adeamxDefinitionList = adeamxDefinitionList;
    }

    public AdeamxType getAdeamxType() {
        return adeamxType;
    }

    public void setAdeamxType(AdeamxType adeamxType) {
        this.adeamxType = adeamxType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEOrder() {
        return eOrder;
    }

    public void setEOrder(Integer eOrder) {
        this.eOrder = eOrder;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFeature1() {
        return feature1;
    }

    public void setFeature1(String feature1) {
        this.feature1 = feature1;
    }

    public String getFeature2() {
        return feature2;
    }

    public void setFeature2(String feature2) {
        this.feature2 = feature2;
    }

    public String getFeature3() {
        return feature3;
    }

    public void setFeature3(String feature3) {
        this.feature3 = feature3;
    }

    public String getFeature4() {
        return feature4;
    }

    public void setFeature4(String feature4) {
        this.feature4 = feature4;
    }

    public String getFeature5() {
        return feature5;
    }

    public void setFeature5(String feature5) {
        this.feature5 = feature5;
    }

    public String getFeature6() {
        return feature6;
    }

    public void setFeature6(String feature6) {
        this.feature6 = feature6;
    }

    public String getFeature7() {
        return feature7;
    }

    public void setFeature7(String feature7) {
        this.feature7 = feature7;
    }

    public String getFeature8() {
        return feature8;
    }

    public void setFeature8(String feature8) {
        this.feature8 = feature8;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
    }

    @JsonIgnore
    public boolean isHasChild() {
        return hasChild;
    }

    public boolean getHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdeamxDefinition other = (AdeamxDefinition) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        AdeamxDefinition definition = (AdeamxDefinition) o;
        return eOrder.compareTo(definition.getEOrder());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AdeamxDefinition{" + "id=" + id + ", eOrder=" + eOrder + ", description=" + description + ", feature=" + feature + ", rowStatus=" + rowStatus + ", feature1=" + feature1 + ", feature2=" + feature2 + ", feature3=" + feature3 + ", feature4=" + feature4 + ", feature5=" + feature5 + ", feature6=" + feature6 + ", feature7=" + feature7 + ", feature8=" + feature8 + ", wiki=" + wiki + ", adeamxType=" + adeamxType + ", adeamxDefinitionList=" + adeamxDefinitionList + ", adeamxDefinition=" + adeamxDefinition + ", hasChild=" + hasChild + '}';
    }
}
