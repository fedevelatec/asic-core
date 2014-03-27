package com.fedevela.core.asic.pojos;

/**
 * Created by fvelazquez on 27/03/14.
 */
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AttachmentPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "FILE_NAME")
    private String fileName;
    @Basic(optional = false)
    @Column(name = "BASE_PATH")
    private String basePath;
    @Basic(optional = false)
    @Column(name = "TARGET_PATH")
    private String targetPath;

    public AttachmentPK() {
    }

    public AttachmentPK(String fileName, String basePath, String targetPath) {
        this.fileName = fileName;
        this.basePath = basePath;
        this.targetPath = targetPath;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the basePath
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * @param basePath the basePath to set
     */
    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * @return the targetPath
     */
    public String getTargetPath() {
        return targetPath;
    }

    /**
     * @param targetPath the targetPath to set
     */
    public void setTargetPath(String targetPath) {
        this.targetPath = targetPath;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AttachmentPK other = (AttachmentPK) obj;
        if ((this.fileName == null) ? (other.fileName != null) : !this.fileName.equals(other.fileName)) {
            return false;
        }
        if ((this.basePath == null) ? (other.basePath != null) : !this.basePath.equals(other.basePath)) {
            return false;
        }
        if ((this.targetPath == null) ? (other.targetPath != null) : !this.targetPath.equals(other.targetPath)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (this.fileName != null ? this.fileName.hashCode() : 0);
        hash = 89 * hash + (this.basePath != null ? this.basePath.hashCode() : 0);
        hash = 89 * hash + (this.targetPath != null ? this.targetPath.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AttachmentPK{" + "fileName=" + fileName + ", basePath=" + basePath + ", targetPath=" + targetPath + '}';
    }
}
