package com.fedevela.core.hn.cnbv.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import com.fedevela.core.asic.cpanel.pojos.DmsCategories;
import com.fedevela.core.asic.cpanel.pojos.DmsDocuments;
import com.fedevela.core.asic.cpanel.pojos.DmsRules;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "HN_CHECK_LIST_CNBV", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnCheckListCnbv.findAll", query = "SELECT h FROM HnCheckListCnbv h"),
        @NamedQuery(name = "HnCheckListCnbv.findByNunicodoc", query = "SELECT h FROM HnCheckListCnbv h WHERE h.hnCheckListCnbvPK.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "HnCheckListCnbv.findByIdDocument", query = "SELECT h FROM HnCheckListCnbv h WHERE h.hnCheckListCnbvPK.idDocument = :idDocument"),
        @NamedQuery(name = "HnCheckListCnbv.findByIdCategory", query = "SELECT h FROM HnCheckListCnbv h WHERE h.hnCheckListCnbvPK.idCategory = :idCategory"),
        @NamedQuery(name = "HnCheckListCnbv.findByIdRule", query = "SELECT h FROM HnCheckListCnbv h WHERE h.hnCheckListCnbvPK.idRule = :idRule"),
        @NamedQuery(name = "HnCheckListCnbv.findByEntryValue", query = "SELECT h FROM HnCheckListCnbv h WHERE h.entryValue = :entryValue"),
        @NamedQuery(name = "HnCheckListCnbv.findByLogin", query = "SELECT h FROM HnCheckListCnbv h WHERE h.login = :login"),
        @NamedQuery(name = "HnCheckListCnbv.findByNow", query = "SELECT h FROM HnCheckListCnbv h WHERE h.now = :now")})
public class HnCheckListCnbv implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnCheckListCnbvPK hnCheckListCnbvPK;
    @Column(name = "ENTRY_VALUE")
    private String entryValue;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @JoinColumn(name = "ID_RULE", referencedColumnName = "ID_RULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsRules dmsRules;
    @JoinColumn(name = "ID_DOCUMENT", referencedColumnName = "ID_DOCUMENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsDocuments dmsDocuments;
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsCategories dmsCategories;

    public HnCheckListCnbv() {
    }

    public HnCheckListCnbv(HnCheckListCnbvPK hnCheckListCnbvPK) {
        this.hnCheckListCnbvPK = hnCheckListCnbvPK;
    }

    public HnCheckListCnbv(BigInteger nunicodoc, BigInteger idDocument, BigInteger idCategory, String idRule) {
        this.hnCheckListCnbvPK = new HnCheckListCnbvPK(nunicodoc, idDocument, idCategory, idRule);
    }

    public HnCheckListCnbvPK getHnCheckListCnbvPK() {
        return hnCheckListCnbvPK;
    }

    public void setHnCheckListCnbvPK(HnCheckListCnbvPK hnCheckListCnbvPK) {
        this.hnCheckListCnbvPK = hnCheckListCnbvPK;
    }

    public String getEntryValue() {
        return entryValue;
    }

    public void setEntryValue(String entryValue) {
        this.entryValue = entryValue;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public DmsRules getDmsRules() {
        return dmsRules;
    }

    public void setDmsRules(DmsRules dmsRules) {
        this.dmsRules = dmsRules;
    }

    public DmsDocuments getDmsDocuments() {
        return dmsDocuments;
    }

    public void setDmsDocuments(DmsDocuments dmsDocuments) {
        this.dmsDocuments = dmsDocuments;
    }

    public DmsCategories getDmsCategories() {
        return dmsCategories;
    }

    public void setDmsCategories(DmsCategories dmsCategories) {
        this.dmsCategories = dmsCategories;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hnCheckListCnbvPK != null ? hnCheckListCnbvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnCheckListCnbv)) {
            return false;
        }
        HnCheckListCnbv other = (HnCheckListCnbv) object;
        if ((this.hnCheckListCnbvPK == null && other.hnCheckListCnbvPK != null) || (this.hnCheckListCnbvPK != null && !this.hnCheckListCnbvPK.equals(other.hnCheckListCnbvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.cnbv.pojos.HnCheckListCnbv[hnCheckListCnbvPK=" + hnCheckListCnbvPK + "]";
    }

}
