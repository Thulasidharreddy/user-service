/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbCmp implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer pageSize;
    private final Integer compressOps;
    private final Integer compressOpsOk;
    private final Integer compressTime;
    private final Integer uncompressOps;
    private final Integer uncompressTime;

    public InnodbCmp(InnodbCmp value) {
        this.pageSize = value.pageSize;
        this.compressOps = value.compressOps;
        this.compressOpsOk = value.compressOpsOk;
        this.compressTime = value.compressTime;
        this.uncompressOps = value.uncompressOps;
        this.uncompressTime = value.uncompressTime;
    }

    public InnodbCmp(
        Integer pageSize,
        Integer compressOps,
        Integer compressOpsOk,
        Integer compressTime,
        Integer uncompressOps,
        Integer uncompressTime
    ) {
        this.pageSize = pageSize;
        this.compressOps = compressOps;
        this.compressOpsOk = compressOpsOk;
        this.compressTime = compressTime;
        this.uncompressOps = uncompressOps;
        this.uncompressTime = uncompressTime;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.page_size</code>.
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.compress_ops</code>.
     */
    public Integer getCompressOps() {
        return this.compressOps;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.compress_ops_ok</code>.
     */
    public Integer getCompressOpsOk() {
        return this.compressOpsOk;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.compress_time</code>.
     */
    public Integer getCompressTime() {
        return this.compressTime;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.uncompress_ops</code>.
     */
    public Integer getUncompressOps() {
        return this.uncompressOps;
    }

    /**
     * Getter for <code>information_schema.INNODB_CMP.uncompress_time</code>.
     */
    public Integer getUncompressTime() {
        return this.uncompressTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbCmp other = (InnodbCmp) obj;
        if (this.pageSize == null) {
            if (other.pageSize != null)
                return false;
        }
        else if (!this.pageSize.equals(other.pageSize))
            return false;
        if (this.compressOps == null) {
            if (other.compressOps != null)
                return false;
        }
        else if (!this.compressOps.equals(other.compressOps))
            return false;
        if (this.compressOpsOk == null) {
            if (other.compressOpsOk != null)
                return false;
        }
        else if (!this.compressOpsOk.equals(other.compressOpsOk))
            return false;
        if (this.compressTime == null) {
            if (other.compressTime != null)
                return false;
        }
        else if (!this.compressTime.equals(other.compressTime))
            return false;
        if (this.uncompressOps == null) {
            if (other.uncompressOps != null)
                return false;
        }
        else if (!this.uncompressOps.equals(other.uncompressOps))
            return false;
        if (this.uncompressTime == null) {
            if (other.uncompressTime != null)
                return false;
        }
        else if (!this.uncompressTime.equals(other.uncompressTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pageSize == null) ? 0 : this.pageSize.hashCode());
        result = prime * result + ((this.compressOps == null) ? 0 : this.compressOps.hashCode());
        result = prime * result + ((this.compressOpsOk == null) ? 0 : this.compressOpsOk.hashCode());
        result = prime * result + ((this.compressTime == null) ? 0 : this.compressTime.hashCode());
        result = prime * result + ((this.uncompressOps == null) ? 0 : this.uncompressOps.hashCode());
        result = prime * result + ((this.uncompressTime == null) ? 0 : this.uncompressTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbCmp (");

        sb.append(pageSize);
        sb.append(", ").append(compressOps);
        sb.append(", ").append(compressOpsOk);
        sb.append(", ").append(compressTime);
        sb.append(", ").append(uncompressOps);
        sb.append(", ").append(uncompressTime);

        sb.append(")");
        return sb.toString();
    }
}
