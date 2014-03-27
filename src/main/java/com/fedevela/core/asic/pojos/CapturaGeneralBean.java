package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class CapturaGeneralBean implements Serializable {

    private CabeceraDoc cabeceraDoc;
    //ATRIBUTO PERSONAS DE LA TABLA PERSONAS
    private Personas personas;
    private DetalleSello detalleSello;
    private List<DetalleSelloDocum> listDetalleSelloDocums;

    public CapturaGeneralBean() {
    }

    public CapturaGeneralBean(CabeceraDoc cabeceraDoc) {
        this.cabeceraDoc = cabeceraDoc;
    }

    public CapturaGeneralBean(CabeceraDoc cabeceraDoc, DetalleSello detalleSello) {
        this.cabeceraDoc = cabeceraDoc;
        this.detalleSello = detalleSello;
    }

    public CapturaGeneralBean(CabeceraDoc cabeceraDoc, Personas personas, DetalleSello detalleSello) {
        this.cabeceraDoc = cabeceraDoc;
        this.personas = personas;
        this.detalleSello = detalleSello;
    }

    public List<DetalleSelloDocum> getListDetalleSelloDocums() {
        return listDetalleSelloDocums;
    }

    public void setListDetalleSelloDocums(List<DetalleSelloDocum> listDetalleSelloDocums) {
        this.listDetalleSelloDocums = listDetalleSelloDocums;
    }

    public CabeceraDoc getCabeceraDoc() {
        return cabeceraDoc;
    }

    public void setCabeceraDoc(CabeceraDoc cabeceraDoc) {
        this.cabeceraDoc = cabeceraDoc;
    }

    public DetalleSello getDetalleSello() {
        return detalleSello;
    }

    public void setDetalleSello(DetalleSello detalleSello) {
        this.detalleSello = detalleSello;
    }

    public void setTipoUbic(Long tipoUbic) {
        if (detalleSello != null) {
            detalleSello.setTipoUbic(tipoUbic);
        }
    }

    public void setPosicion(Long posicion) {
        if (detalleSello != null) {
            detalleSello.setPosicion(posicion);
        }
    }

    public void setNunicosello(Long nunicosello) {
        if (detalleSello != null) {
            detalleSello.setNunicosello(nunicosello);
        }
    }

    public void setFlags(Long flags) {
        if (detalleSello != null) {
            detalleSello.setFlags(flags);
        }
    }

    public Long getTipoUbic() {
        if (detalleSello != null) {
            return null;
        } else {
            return detalleSello.getTipoUbic();
        }
    }

    /**
     * detalleSello
     *
     * @return
     */
    public Long getPosicion() {
        return detalleSello.getPosicion();
    }

    /**
     * detalleSello
     *
     * @return
     */
    public Long getNunicosello() {
        return detalleSello.getNunicosello();
    }

    /**
     * detalleSello
     *
     * @return
     */
    public Long getNunicodoc() {
        return detalleSello.getNunicodoc();
    }

    /**
     * detalleSello
     *
     * @return
     */
    public Long getFlags() {
        return detalleSello.getFlags();
    }

    /**
     *
     * @param titular
     */
    public void setTitular(Long titular) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setTitular(titular);
        }
    }

    /**
     *
     * @param tercero
     */
    public void setTercero(Long tercero) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setTercero(tercero);
        }
    }

    public void setSsccod(Long ssccod) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setSsccod(ssccod);
        }
    }

    public void setScltcod(Long scltcod) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setScltcod(scltcod);
        }
    }

    public void setPath(String path) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setPath(path);
        }
    }

    public void setOrigTipodoc(Long origTipodoc) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setOrigTipodoc(origTipodoc);
        }
    }

    /**
     *
     * @param nunicodoc
     */
    public void setNunicodoc(Long nunicodoc) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setNunicodoc(nunicodoc);
        }
        if (detalleSello != null) {
            detalleSello.setNunicodoc(nunicodoc);
        }
    }

    public void setNroreferenc(String nroreferenc) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setNroreferenc(nroreferenc);
        }
    }

    public void setNroidentdoc(String nroidentdoc) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setNroidentdoc(nroidentdoc);
        }
    }

    public void setImgKb(Long imgKb) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setImgKb(imgKb);
        }
    }

    public void setImg(String img) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setImg(img);
        }
    }

    public void setEstGrl(Long estGrl) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setEstGrl(estGrl);
        }
    }

    public void setDoccod(Long doccod) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDoccod(doccod);
        }
    }

    public void setDocadeaclt(Long docadeaclt) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDocadeaclt(docadeaclt);
        }
    }

    public void setDfchh(Date dfchh) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDfchh(dfchh);
        }
    }

    public void setDfchdde(Date dfchdde) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDfchdde(dfchdde);
        }
    }

    public void setDfchaltsist(Date dfchaltsist) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDfchaltsist(dfchaltsist);
        }
    }

    public void setDfchalt(Date dfchalt) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDfchalt(dfchalt);
        }
    }

    public void setDfch(Date dfch) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDfch(dfch);
        }
    }

    public void setDescripcion(String descripcion) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setDescripcion(descripcion);
        }
    }

    public void setCantImgs(Long cantImgs) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setCantImgs(cantImgs);
        }
    }

    public void setAresponsable(String aresponsable) {
        if (cabeceraDoc != null) {
            cabeceraDoc.setAresponsable(aresponsable);
        }
    }

    public Long getTitular() {
        return cabeceraDoc.getTitular();
    }

    public Long getTercero() {
        return cabeceraDoc.getTercero();
    }

    public Long getSsccod() {
        return cabeceraDoc.getSsccod();
    }

    public Long getScltcod() {
        return cabeceraDoc.getScltcod();
    }

    public String getPath() {
        return cabeceraDoc.getPath();
    }

    public Long getOrigTipodoc() {
        return cabeceraDoc.getOrigTipodoc();
    }

    public String getNroreferenc() {
        return cabeceraDoc.getNroreferenc();
    }

    public String getNroidentdoc() {
        return cabeceraDoc.getNroidentdoc();
    }

    public Long getImgKb() {
        return cabeceraDoc.getImgKb();
    }

    public String getImg() {
        return cabeceraDoc.getImg();
    }

    public Long getEstGrl() {
        return cabeceraDoc.getEstGrl();
    }

    public Long getDoccod() {
        return cabeceraDoc.getDoccod();
    }

    public Long getDocadeaclt() {
        return cabeceraDoc.getDocadeaclt();
    }

    public Date getDfchh() {
        return cabeceraDoc.getDfchh();
    }

    public Date getDfchdde() {
        return cabeceraDoc.getDfchdde();
    }

    public Date getDfchaltsist() {
        return cabeceraDoc.getDfchaltsist();
    }

    public Date getDfchalt() {
        return cabeceraDoc.getDfchalt();
    }

    public Date getDfch() {
        return cabeceraDoc.getDfch();
    }

    public String getDescripcion() {
        return cabeceraDoc.getDescripcion();
    }

    public Long getCantImgs() {
        return cabeceraDoc.getCantImgs();
    }

    public String getAresponsable() {
        return cabeceraDoc.getAresponsable();
    }

    //******************************************************************************
    // SET Y GET DEL OBJETO PERSONA
    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    public CabeceraDocDato getCabeceraDocDato() {
        return cabeceraDoc.getCabeceraDocDato();
    }

    public void setCabeceraDocDato(CabeceraDocDato cdd) {
        cabeceraDoc.setCabeceraDocDato(cdd);
    }
}
