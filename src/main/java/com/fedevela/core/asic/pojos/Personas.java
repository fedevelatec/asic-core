package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PERSONAS", schema="PROD")
@NamedQueries({
        @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"),
        @NamedQuery(name = "Personas.findByCodigo", query = "SELECT p FROM Personas p WHERE p.codigo = :codigo"),
        @NamedQuery(name = "Personas.findByPersoneria", query = "SELECT p FROM Personas p WHERE p.personeria = :personeria"),
        @NamedQuery(name = "Personas.findByTipo", query = "SELECT p FROM Personas p WHERE p.tipo = :tipo"),
        @NamedQuery(name = "Personas.findByNumero", query = "SELECT p FROM Personas p WHERE p.numero = :numero"),
        @NamedQuery(name = "Personas.findByDescripcion", query = "SELECT p FROM Personas p WHERE p.descripcion = :descripcion"),
        @NamedQuery(name = "Personas.findByNroclienteext", query = "SELECT p FROM Personas p WHERE p.nroclienteext = :nroclienteext")})
public class Personas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Secuenciafrances")
    @SequenceGenerator(name="Secuenciafrances", sequenceName="PROD.SECUENCIA_FRANCES", allocationSize=1)
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "PERSONERIA")
    private short personeria;
    @Basic(optional = false)
    @Column(name = "TIPO")
    private short tipo;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "NROCLIENTEEXT")
    private String nroclienteext;

    public Personas() {
    }

    public Personas(Long codigo) {
        this.codigo = codigo;
    }

    public Personas(Long codigo, short personeria, short tipo, String numero) {
        this.codigo = codigo;
        this.personeria = personeria;
        this.tipo = tipo;
        this.numero = numero;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public short getPersoneria() {
        return personeria;
    }

    public void setPersoneria(short personeria) {
        this.personeria = personeria;
    }

    public short getTipo() {
        return tipo;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNroclienteext() {
        return nroclienteext;
    }

    public void setNroclienteext(String nroclienteext) {
        this.nroclienteext = nroclienteext;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.pojos.Personas[codigo=" + codigo + "]";
    }

}
