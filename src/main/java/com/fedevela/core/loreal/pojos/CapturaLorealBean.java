package com.fedevela.core.loreal.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import com.fedevela.core.asic.pojos.CapturaGeneralBean;
import java.math.BigDecimal;

/**
 * Objeto de transferencia para las propiedades a guardar de una captura.
 */
public class CapturaLorealBean extends CapturaGeneralBean{

    private LrlExpediente lrlExpediente;

    public void setLrlExpediente(LrlExpediente lrlExpediente) {
        this.lrlExpediente = lrlExpediente;
    }

    public CapturaLorealBean() {
        super();
        lrlExpediente = new LrlExpediente();
    }

    public LrlExpediente getLrlExpediente() {
        return lrlExpediente;
    }


    public void setTipo(Long tipo) {
        lrlExpediente.setTipo(tipo);
    }

    @Override
    public void setNunicodoc(Long nunicodoc) {
        super.setNunicodoc(nunicodoc);
        lrlExpediente.setNunicodoc(nunicodoc);
    }

    public void setLrlExpedientePK(LrlExpedientePK lrlExpedientePK) {
        lrlExpediente.setLrlExpedientePK(lrlExpedientePK);
    }

    public void setImportePago(BigDecimal importePago) {
        lrlExpediente.setImportePago(importePago);
    }

    public void setIdPago(String idPago) {
        lrlExpediente.setIdPago(idPago);
    }

    public void setIdArchivo(Long idArchivo) {
        lrlExpediente.setIdArchivo(idArchivo);
    }

    public void setEstatus(Long estatus) {
        lrlExpediente.setEstatus(estatus);
    }

    public void setBeneficiario(String beneficiario) {
        lrlExpediente.setBeneficiario(beneficiario);
    }

    public Long getTipo() {
        return lrlExpediente.getTipo();
    }

    public Long getNunicodoc() {
        return lrlExpediente.getNunicodoc();
    }

    public LrlExpedientePK getLrlExpedientePK() {
        return lrlExpediente.getLrlExpedientePK();
    }

    public BigDecimal getImportePago() {
        return lrlExpediente.getImportePago();
    }

    public String getIdPago() {
        return lrlExpediente.getIdPago();
    }

    public Long getIdArchivo() {
        return lrlExpediente.getIdArchivo();
    }

    public Long getEstatus() {
        return lrlExpediente.getEstatus();
    }

    public String getBeneficiario() {
        return lrlExpediente.getBeneficiario();
    }
}
