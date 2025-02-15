/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbCachedIndexes implements Serializable {

    private static final long serialVersionUID = 1L;

    private final UInteger spaceId;
    private final ULong indexId;
    private final ULong nCachedPages;

    public InnodbCachedIndexes(InnodbCachedIndexes value) {
        this.spaceId = value.spaceId;
        this.indexId = value.indexId;
        this.nCachedPages = value.nCachedPages;
    }

    public InnodbCachedIndexes(
        UInteger spaceId,
        ULong indexId,
        ULong nCachedPages
    ) {
        this.spaceId = spaceId;
        this.indexId = indexId;
        this.nCachedPages = nCachedPages;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_CACHED_INDEXES.SPACE_ID</code>.
     */
    public UInteger getSpaceId() {
        return this.spaceId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_CACHED_INDEXES.INDEX_ID</code>.
     */
    public ULong getIndexId() {
        return this.indexId;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_CACHED_INDEXES.N_CACHED_PAGES</code>.
     */
    public ULong getNCachedPages() {
        return this.nCachedPages;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbCachedIndexes other = (InnodbCachedIndexes) obj;
        if (this.spaceId == null) {
            if (other.spaceId != null)
                return false;
        }
        else if (!this.spaceId.equals(other.spaceId))
            return false;
        if (this.indexId == null) {
            if (other.indexId != null)
                return false;
        }
        else if (!this.indexId.equals(other.indexId))
            return false;
        if (this.nCachedPages == null) {
            if (other.nCachedPages != null)
                return false;
        }
        else if (!this.nCachedPages.equals(other.nCachedPages))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.spaceId == null) ? 0 : this.spaceId.hashCode());
        result = prime * result + ((this.indexId == null) ? 0 : this.indexId.hashCode());
        result = prime * result + ((this.nCachedPages == null) ? 0 : this.nCachedPages.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbCachedIndexes (");

        sb.append(spaceId);
        sb.append(", ").append(indexId);
        sb.append(", ").append(nCachedPages);

        sb.append(")");
        return sb.toString();
    }
}
