package com.fedevela.core.asic.imagen.beans;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.*;
import java.text.MessageFormat;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Pagina implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaginaPK id;
    @Basic(optional = false)
    @Column(name = "NOMBRE_IMAGEN")
    private String nombreImagen;
    @Basic(optional = false)
    @Column(name = "FORMATO_RUTA_IMAGEN")
    private String formatoRutaImagen;
    @Column(name = "RUTA_DESTINO")
    private String rutaDestino;
    @Column(name = "LOTE")
    private String lote;
    @Transient
    private String rutaArchivo;

    public Pagina() {
    }

    public Pagina(PaginaPK id) {
        this.id = id;
    }

    public PaginaPK getId() {
        return id;
    }

    public void setId(PaginaPK id) {
        this.id = id;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    public String getFormatoRutaImagen() {
        return formatoRutaImagen;
    }

    public void setFormatoRutaImagen(String formatoRutaImagen) {
        this.formatoRutaImagen = formatoRutaImagen;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getRutaDestino() {
        return rutaDestino;
    }

    public void setRutaDestino(String rutaDestino) {
        this.rutaDestino = rutaDestino;
    }

    public String getRutaArchivo() {
        rutaArchivo = MessageFormat.format(formatoRutaImagen,
                new Object[]{
                        rutaDestino,
                        lote,
                        id.getNunicodoc(),
                        id.getNunicodoct(),
                        nombreImagen
                });
        //System.out.println(rutaArchivo);
        if(rutaArchivo.contains("T00000000000/")){
            rutaArchivo = rutaArchivo.replaceAll("T00000000000/", "");
        }
        return rutaArchivo;
    }

    /**
     * Metodo no soportado ya que solo es de tipo lectura, se decara para que en
     * los WS se pueda visualizar el metodo GET
     *
     * @param rutaArchivo
     */
    public void setRutaArchivo(String rutaArchivo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pagina other = (Pagina) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }
}
