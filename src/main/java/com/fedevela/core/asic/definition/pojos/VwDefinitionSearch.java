package com.fedevela.core.asic.definition.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "VW_DEFINITION_SEARCH", catalog = "", schema = "PROD")
@XmlRootElement
public class VwDefinitionSearch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "PARENT_ID")
    private Long parentId;
    @Basic(optional = false)
    @Column(name = "E_ORDER")
    private Integer eOrder;
    @Basic(optional = false)
    @Column(name = "TYPE_ID")
    private String typeId;
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
    @Column(name = "CHILD_COUNT")
    private Integer childCount;
    @Column(name = "DESCRIPTION_CHILD_COUNT")
    private String descriptionChildCount;
    @Column(name = "ICON")
    private String icon;

    public VwDefinitionSearch() {
    }

    public Integer getChildCount() {
        return childCount;
    }

    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionChildCount() {
        return descriptionChildCount;
    }

    public void setDescriptionChildCount(String descriptionChildCount) {
        this.descriptionChildCount = descriptionChildCount;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @JsonIgnore
    public boolean isHasChild() {
        return ((childCount != null) && (childCount > 0));
    }

    public boolean getHasChild() {
        return ((childCount != null) && (childCount > 0));
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
        final VwDefinitionSearch other = (VwDefinitionSearch) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "VwDefinitionSearch{" + "id=" + id + ", parentId=" + parentId + ", eOrder=" + eOrder + ", typeId=" + typeId + ", description=" + description + ", feature=" + feature + ", rowStatus=" + rowStatus + ", feature1=" + feature1 + ", feature2=" + feature2 + ", feature3=" + feature3 + ", feature4=" + feature4 + ", feature5=" + feature5 + ", feature6=" + feature6 + ", feature7=" + feature7 + ", feature8=" + feature8 + ", childCount=" + childCount + ", descriptionChildCount=" + descriptionChildCount + '}';
    }
}
