package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "ATTACHMENT", catalog = "", schema = "PROD")
public class Attachment implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AttachmentPK attachmentPK;
    @Basic(optional = false)
    @Column(name = "SCLTCOD")
    private short scltcod;
    @Column(name = "FILE_TYPE")
    private String fileType;
    @Column(name = "FILE_SIZE")
    private Long fileSize;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private Short status;
    @Basic(optional = false)
    @Column(name = "LOGIN")
    private String login;
    @Basic(optional = false)
    @Column(name = "NOW")
    @Temporal(TemporalType.TIMESTAMP)
    private Date now;
    @Transient
    private String shortFileName;

    public Attachment() {
        status = 0;
    }

    public Attachment(String fileName, String basePath, String targetPath) {
        this();
        this.attachmentPK = new AttachmentPK(fileName, basePath, targetPath);
        int posExt = fileName.lastIndexOf(".");
        if (posExt >= 0) {
            shortFileName = fileName.substring(0, posExt);
            fileType = fileName.substring(posExt + 1);
        } else {
            shortFileName = fileName;
        }
    }

    /**
     * File name without extension.
     */
    public String getShortFileName() {
        return shortFileName;
    }

    /**
     * basePath + targetPath + fileName
     *
     * @return
     */
    public String getFullFileName() {
        return getFullPath() + attachmentPK.getFileName();
    }

    /**
     * basePath + targetPath
     *
     * @return
     */
    public String getFullPath() {
        StringBuilder result = new StringBuilder();
        if (attachmentPK.getBasePath() != null) {
            result.append(attachmentPK.getBasePath());
        }
        if (attachmentPK.getTargetPath() != null) {
            result.append(attachmentPK.getTargetPath());
        }
        return result.toString();
    }

    public AttachmentPK getAttachmentPK() {
        return attachmentPK;
    }

    public void setAttachmentPK(AttachmentPK attachmentPK) {
        this.attachmentPK = attachmentPK;
        fileType = attachmentPK.getFileName().substring(attachmentPK.getFileName().lastIndexOf(".") + 1);
    }

    public short getScltcod() {
        return scltcod;
    }

    public void setScltcod(short scltcod) {
        this.scltcod = scltcod;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
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

    /**
     * @return the status
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Attachment other = (Attachment) obj;
        if (this.attachmentPK != other.attachmentPK && (this.attachmentPK == null || !this.attachmentPK.equals(other.attachmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + (this.attachmentPK != null ? this.attachmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Attachment{" + "attachmentPK=" + attachmentPK + ", scltcod=" + scltcod + ", fileType=" + fileType + ", fileSize=" + fileSize + ", status=" + status + ", login=" + login + ", now=" + now + '}';
    }
}
