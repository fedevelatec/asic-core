package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
public class LrlSociedad extends LrlExpedientePK {
    private String cveSociedad;
    private String descSociedad;

    public String getCveSociedad() {
        return cveSociedad;
    }

    public void setCveSociedad(String cveSociedad) {
        this.cveSociedad = cveSociedad;
    }

    public String getDescSociedad() {
        return descSociedad;
    }

    public void setDescSociedad(String descSociedad) {
        this.descSociedad = descSociedad;
    }

    @Override
    public String toString() {
        return getPeriodo() + " - " + getCveSociedad() + " - " + getDescSociedad();
    }



}
