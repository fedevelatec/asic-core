package com.fedevela.core.avaluo.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "AV_AVALUO_CAJA", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "AvAvaluoCaja.findAll", query = "SELECT a FROM AvAvaluoCaja a"),
        @NamedQuery(name = "AvAvaluoCaja.findByIdAvaluo", query = "SELECT a FROM AvAvaluoCaja a WHERE a.idAvaluo = :idAvaluo"),
        @NamedQuery(name = "AvAvaluoCaja.findByReferencia", query = "SELECT a FROM AvAvaluoCaja a WHERE a.referencia = :referencia"),
        @NamedQuery(name = "AvAvaluoCaja.findByNunicodoc", query = "SELECT a FROM AvAvaluoCaja a WHERE a.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "AvAvaluoCaja.findByConciliado", query = "SELECT a FROM AvAvaluoCaja a WHERE a.conciliado = :conciliado"),
        @NamedQuery(name = "AvAvaluoCaja.findByIdGerencia", query = "SELECT a FROM AvAvaluoCaja a WHERE a.idGerencia = :idGerencia"),
        @NamedQuery(name = "AvAvaluoCaja.findBySecuencia", query = "SELECT a FROM AvAvaluoCaja a WHERE a.secuencia = :secuencia")})
public class AvAvaluoCaja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_AVALUO")
    private Long idAvaluo;
    @Column(name = "REFERENCIA")
    private String referencia;
    @Column(name = "NUNICODOC")
    private BigInteger nunicodoc;
    @Basic(optional = false)
    @Column(name = "CONCILIADO")
    private String conciliado;
    @Column(name = "ID_GERENCIA")
    private BigInteger idGerencia;
    @Basic(optional = false)
    @Column(name = "SECUENCIA")
    private BigInteger secuencia;
    @JoinColumns({
            @JoinColumn(name = "LOTE", referencedColumnName = "LOTE"),
            @JoinColumn(name = "CAJA", referencedColumnName = "CAJA"),
            @JoinColumn(name = "CLIENTE", referencedColumnName = "CLIENTE")})
    @ManyToOne(optional = false)
    private AvCajaLote avCajaLote;

    public AvAvaluoCaja() {
    }

    public AvAvaluoCaja(Long idAvaluo) {
        this.idAvaluo = idAvaluo;
    }

    public AvAvaluoCaja(Long idAvaluo, String conciliado, BigInteger secuencia) {
        this.idAvaluo = idAvaluo;
        this.conciliado = conciliado;
        this.secuencia = secuencia;
    }

    public Long getIdAvaluo() {
        return idAvaluo;
    }

    public void setIdAvaluo(Long idAvaluo) {
        this.idAvaluo = idAvaluo;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public BigInteger getNunicodoc() {
        return nunicodoc;
    }

    public void setNunicodoc(BigInteger nunicodoc) {
        this.nunicodoc = nunicodoc;
    }

    public String getConciliado() {
        return conciliado;
    }

    public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
    }

    public BigInteger getIdGerencia() {
        return idGerencia;
    }

    public void setIdGerencia(BigInteger idGerencia) {
        this.idGerencia = idGerencia;
    }

    public BigInteger getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(BigInteger secuencia) {
        this.secuencia = secuencia;
    }

    public AvCajaLote getAvCajaLote() {
        return avCajaLote;
    }

    public void setAvCajaLote(AvCajaLote avCajaLote) {
        this.avCajaLote = avCajaLote;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAvaluo != null ? idAvaluo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvAvaluoCaja)) {
            return false;
        }
        AvAvaluoCaja other = (AvAvaluoCaja) object;
        if ((this.idAvaluo == null && other.idAvaluo != null) || (this.idAvaluo != null && !this.idAvaluo.equals(other.idAvaluo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeadms.core.transfer.pojos.AvAvaluoCaja[idAvaluo=" + idAvaluo + "]";
    }

}
