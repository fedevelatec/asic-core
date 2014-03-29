package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
public class LetraModelBean {

    private Long nunicodoct;
    private String letra;

    public LetraModelBean(Long nunicodoct, String letra) {
        this.nunicodoct = nunicodoct;
        this.letra = letra;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Long getNunicodoct() {
        return nunicodoct;
    }

    public void setNunicodoct(Long nunicodoct) {
        this.nunicodoct = nunicodoct;
    }

    @Override
    public String toString() {
        return letra;
    }


}
