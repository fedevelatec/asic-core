package com.fedevela.core.hn.cnbv.pojos;

/**
 * Created by fvelazquez on 28/03/14.
 */
import com.fedevela.core.asic.cpanel.pojos.DmsCategories;
import com.fedevela.core.asic.cpanel.pojos.DmsDocuments;
import com.fedevela.core.asic.cpanel.pojos.DmsIncidentTypes;
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
@Table(name = "HN_INCIDENTS_CNBV", catalog = "", schema = "PROD")
@NamedQueries({
        @NamedQuery(name = "HnIncidentsCnbv.findAll", query = "SELECT h FROM HnIncidentsCnbv h"),
        @NamedQuery(name = "HnIncidentsCnbv.findByNunicodoc", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.hnIncidentsCnbvPK.nunicodoc = :nunicodoc"),
        @NamedQuery(name = "HnIncidentsCnbv.findByIdDocument", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.hnIncidentsCnbvPK.idDocument = :idDocument"),
        @NamedQuery(name = "HnIncidentsCnbv.findByIdCategory", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.hnIncidentsCnbvPK.idCategory = :idCategory"),
        @NamedQuery(name = "HnIncidentsCnbv.findByIdIncidentType", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.hnIncidentsCnbvPK.idIncidentType = :idIncidentType"),
        @NamedQuery(name = "HnIncidentsCnbv.findByIdRule", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.hnIncidentsCnbvPK.idRule = :idRule"),
        @NamedQuery(name = "HnIncidentsCnbv.findByEntryValue", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.entryValue = :entryValue"),
        @NamedQuery(name = "HnIncidentsCnbv.findByLogin", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.login = :login"),
        @NamedQuery(name = "HnIncidentsCnbv.findByNow", query = "SELECT h FROM HnIncidentsCnbv h WHERE h.now = :now")})
public class HnIncidentsCnbv implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HnIncidentsCnbvPK hnIncidentsCnbvPK;
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
    @JoinColumn(name = "ID_INCIDENT_TYPE", referencedColumnName = "ID_INCIDENT_TYPE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsIncidentTypes dmsIncidentTypes;
    @JoinColumn(name = "ID_DOCUMENT", referencedColumnName = "ID_DOCUMENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsDocuments dmsDocuments;
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "ID_CATEGORY", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DmsCategories dmsCategories;

    public HnIncidentsCnbv() {
    }

    public HnIncidentsCnbv(HnIncidentsCnbvPK hnIncidentsCnbvPK) {
        this.hnIncidentsCnbvPK = hnIncidentsCnbvPK;
    }

    public HnIncidentsCnbv(BigInteger nunicodoc, BigInteger idDocument, BigInteger idCategory, BigInteger idIncidentType, String idRule) {
        this.hnIncidentsCnbvPK = new HnIncidentsCnbvPK(nunicodoc, idDocument, idCategory, idIncidentType, idRule);
    }

    public HnIncidentsCnbvPK getHnIncidentsCnbvPK() {
        return hnIncidentsCnbvPK;
    }

    public void setHnIncidentsCnbvPK(HnIncidentsCnbvPK hnIncidentsCnbvPK) {
        this.hnIncidentsCnbvPK = hnIncidentsCnbvPK;
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

    public DmsIncidentTypes getDmsIncidentTypes() {
        return dmsIncidentTypes;
    }

    public void setDmsIncidentTypes(DmsIncidentTypes dmsIncidentTypes) {
        this.dmsIncidentTypes = dmsIncidentTypes;
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
        hash += (hnIncidentsCnbvPK != null ? hnIncidentsCnbvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HnIncidentsCnbv)) {
            return false;
        }
        HnIncidentsCnbv other = (HnIncidentsCnbv) object;
        if ((this.hnIncidentsCnbvPK == null && other.hnIncidentsCnbvPK != null) || (this.hnIncidentsCnbvPK != null && !this.hnIncidentsCnbvPK.equals(other.hnIncidentsCnbvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adeamx.adeadms.hn.cnbv.pojos.HnIncidentsCnbv[hnIncidentsCnbvPK=" + hnIncidentsCnbvPK + "]";
    }
}
