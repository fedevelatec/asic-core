package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * Datos generales de cabecera doc
 */
@Entity
@Table(name = "CD_DATOS_GRALES", catalog = "", schema = "PROD")
public class CdDatosGrales implements Serializable{
    @Id
    @Column(name = "NUNICODOC")
    private Long nunicodoc;

    @Column(name = "VALUE1")
    private String value1;
    @Column(name = "VALUE2")
    private String value2;
    @Column(name = "VALUE3")
    private String value3;


    @JoinColumn(name = "NUNICODOC", referencedColumnName = "NUNICODOC", insertable = false, updatable = false)
    @OneToOne(optional=true)
    private CabeceraDoc cabeceraDoc;

    @Column(name = "EXPURGO")
    private String expurgo;

    public Long getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(Long nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }


    public CabeceraDoc getCabeceraDoc() {
        return cabeceraDoc;
    }

    public void setCabeceraDoc(CabeceraDoc cabeceraDoc) {
        this.cabeceraDoc = cabeceraDoc;
    }

    /**
     * @return the expurgo
     */
    public String getExpurgo() {
        return expurgo;
    }

    /**
     * @param expurgo the expurgo to set
     */
    public void setExpurgo(String expurgo) {
        this.expurgo = expurgo;
    }
}
