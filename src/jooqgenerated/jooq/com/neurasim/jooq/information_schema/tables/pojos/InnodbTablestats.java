/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbTablestats implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong tableId;
    private final String name;
    private final String statsInitialized;
    private final ULong numRows;
    private final ULong clustIndexSize;
    private final ULong otherIndexSize;
    private final ULong modifiedCounter;
    private final ULong autoinc;
    private final Integer refCount;

    public InnodbTablestats(InnodbTablestats value) {
        this.tableId = value.tableId;
        this.name = value.name;
        this.statsInitialized = value.statsInitialized;
        this.numRows = value.numRows;
        this.clustIndexSize = value.clustIndexSize;
        this.otherIndexSize = value.otherIndexSize;
        this.modifiedCounter = value.modifiedCounter;
        this.autoinc = value.autoinc;
        this.refCount = value.refCount;
    }

    public InnodbTablestats(
        ULong tableId,
        String name,
        String statsInitialized,
        ULong numRows,
        ULong clustIndexSize,
        ULong otherIndexSize,
        ULong modifiedCounter,
        ULong autoinc,
        Integer refCount
    ) {
        this.tableId = tableId;
        this.name = name;
        this.statsInitialized = statsInitialized;
        this.numRows = numRows;
        this.clustIndexSize = clustIndexSize;
        this.otherIndexSize = otherIndexSize;
        this.modifiedCounter = modifiedCounter;
        this.autoinc = autoinc;
        this.refCount = refCount;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESTATS.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return this.tableId;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESTATS.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESTATS.STATS_INITIALIZED</code>.
     */
    public String getStatsInitialized() {
        return this.statsInitialized;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESTATS.NUM_ROWS</code>.
     */
    public ULong getNumRows() {
        return this.numRows;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESTATS.CLUST_INDEX_SIZE</code>.
     */
    public ULong getClustIndexSize() {
        return this.clustIndexSize;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESTATS.OTHER_INDEX_SIZE</code>.
     */
    public ULong getOtherIndexSize() {
        return this.otherIndexSize;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLESTATS.MODIFIED_COUNTER</code>.
     */
    public ULong getModifiedCounter() {
        return this.modifiedCounter;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESTATS.AUTOINC</code>.
     */
    public ULong getAutoinc() {
        return this.autoinc;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLESTATS.REF_COUNT</code>.
     */
    public Integer getRefCount() {
        return this.refCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbTablestats other = (InnodbTablestats) obj;
        if (this.tableId == null) {
            if (other.tableId != null)
                return false;
        }
        else if (!this.tableId.equals(other.tableId))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.statsInitialized == null) {
            if (other.statsInitialized != null)
                return false;
        }
        else if (!this.statsInitialized.equals(other.statsInitialized))
            return false;
        if (this.numRows == null) {
            if (other.numRows != null)
                return false;
        }
        else if (!this.numRows.equals(other.numRows))
            return false;
        if (this.clustIndexSize == null) {
            if (other.clustIndexSize != null)
                return false;
        }
        else if (!this.clustIndexSize.equals(other.clustIndexSize))
            return false;
        if (this.otherIndexSize == null) {
            if (other.otherIndexSize != null)
                return false;
        }
        else if (!this.otherIndexSize.equals(other.otherIndexSize))
            return false;
        if (this.modifiedCounter == null) {
            if (other.modifiedCounter != null)
                return false;
        }
        else if (!this.modifiedCounter.equals(other.modifiedCounter))
            return false;
        if (this.autoinc == null) {
            if (other.autoinc != null)
                return false;
        }
        else if (!this.autoinc.equals(other.autoinc))
            return false;
        if (this.refCount == null) {
            if (other.refCount != null)
                return false;
        }
        else if (!this.refCount.equals(other.refCount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableId == null) ? 0 : this.tableId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.statsInitialized == null) ? 0 : this.statsInitialized.hashCode());
        result = prime * result + ((this.numRows == null) ? 0 : this.numRows.hashCode());
        result = prime * result + ((this.clustIndexSize == null) ? 0 : this.clustIndexSize.hashCode());
        result = prime * result + ((this.otherIndexSize == null) ? 0 : this.otherIndexSize.hashCode());
        result = prime * result + ((this.modifiedCounter == null) ? 0 : this.modifiedCounter.hashCode());
        result = prime * result + ((this.autoinc == null) ? 0 : this.autoinc.hashCode());
        result = prime * result + ((this.refCount == null) ? 0 : this.refCount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTablestats (");

        sb.append(tableId);
        sb.append(", ").append(name);
        sb.append(", ").append(statsInitialized);
        sb.append(", ").append(numRows);
        sb.append(", ").append(clustIndexSize);
        sb.append(", ").append(otherIndexSize);
        sb.append(", ").append(modifiedCounter);
        sb.append(", ").append(autoinc);
        sb.append(", ").append(refCount);

        sb.append(")");
        return sb.toString();
    }
}
