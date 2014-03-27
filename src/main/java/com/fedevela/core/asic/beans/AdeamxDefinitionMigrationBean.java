package com.fedevela.core.asic.beans;

/**
 * Created by fvelazquez on 26/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.Type;

@Entity
@XmlRootElement
public class AdeamxDefinitionMigrationBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
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
    @Column(name = "TYPE_ID")
    private String typeId;
    @Column(name = "PARENT_ID")
    private Long parentId;
    @Column(name = "NIVEL")
    private Short nivel;
    @Column(name = "NEW_ID")
    private Long newId;
    @Column(name = "NEW_PARENT_ID")
    private Long newParentId;

    public AdeamxDefinitionMigrationBean() {
    }

    public AdeamxDefinitionMigrationBean(Long id) {
        this.id = id;
    }

    public AdeamxDefinitionMigrationBean(Long id, Integer eOrder, String description, char rowStatus) {
        this.id = id;
        this.eOrder = eOrder;
        this.description = description;
        this.rowStatus = rowStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer geteOrder() {
        return eOrder;
    }

    public void seteOrder(Integer eOrder) {
        this.eOrder = eOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public char getRowStatus() {
        return rowStatus;
    }

    public void setRowStatus(char rowStatus) {
        this.rowStatus = rowStatus;
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

    public String getConfigure() {
        return configure;
    }

    public void setConfigure(String configure) {
        this.configure = configure;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Short getNivel() {
        return nivel;
    }

    public void setNivel(Short nivel) {
        this.nivel = nivel;
    }

    public Long getNewId() {
        return newId;
    }

    public void setNewId(Long newId) {
        this.newId = newId;
    }

    public Long getNewParentId() {
        return newParentId;
    }

    public void setNewParentId(Long newParentId) {
        this.newParentId = newParentId;
    }

}
