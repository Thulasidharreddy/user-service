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
public class InnodbTables implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong tableId;
    private final String name;
    private final Integer flag;
    private final Integer nCols;
    private final Long space;
    private final String rowFormat;
    private final UInteger zipPageSize;
    private final String spaceType;
    private final Integer instantCols;
    private final Integer totalRowVersions;

    public InnodbTables(InnodbTables value) {
        this.tableId = value.tableId;
        this.name = value.name;
        this.flag = value.flag;
        this.nCols = value.nCols;
        this.space = value.space;
        this.rowFormat = value.rowFormat;
        this.zipPageSize = value.zipPageSize;
        this.spaceType = value.spaceType;
        this.instantCols = value.instantCols;
        this.totalRowVersions = value.totalRowVersions;
    }

    public InnodbTables(
        ULong tableId,
        String name,
        Integer flag,
        Integer nCols,
        Long space,
        String rowFormat,
        UInteger zipPageSize,
        String spaceType,
        Integer instantCols,
        Integer totalRowVersions
    ) {
        this.tableId = tableId;
        this.name = name;
        this.flag = flag;
        this.nCols = nCols;
        this.space = space;
        this.rowFormat = rowFormat;
        this.zipPageSize = zipPageSize;
        this.spaceType = spaceType;
        this.instantCols = instantCols;
        this.totalRowVersions = totalRowVersions;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.TABLE_ID</code>.
     */
    public ULong getTableId() {
        return this.tableId;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.FLAG</code>.
     */
    public Integer getFlag() {
        return this.flag;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.N_COLS</code>.
     */
    public Integer getNCols() {
        return this.nCols;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.SPACE</code>.
     */
    public Long getSpace() {
        return this.space;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.ROW_FORMAT</code>.
     */
    public String getRowFormat() {
        return this.rowFormat;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.ZIP_PAGE_SIZE</code>.
     */
    public UInteger getZipPageSize() {
        return this.zipPageSize;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.SPACE_TYPE</code>.
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    /**
     * Getter for <code>information_schema.INNODB_TABLES.INSTANT_COLS</code>.
     */
    public Integer getInstantCols() {
        return this.instantCols;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_TABLES.TOTAL_ROW_VERSIONS</code>.
     */
    public Integer getTotalRowVersions() {
        return this.totalRowVersions;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbTables other = (InnodbTables) obj;
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
        if (this.flag == null) {
            if (other.flag != null)
                return false;
        }
        else if (!this.flag.equals(other.flag))
            return false;
        if (this.nCols == null) {
            if (other.nCols != null)
                return false;
        }
        else if (!this.nCols.equals(other.nCols))
            return false;
        if (this.space == null) {
            if (other.space != null)
                return false;
        }
        else if (!this.space.equals(other.space))
            return false;
        if (this.rowFormat == null) {
            if (other.rowFormat != null)
                return false;
        }
        else if (!this.rowFormat.equals(other.rowFormat))
            return false;
        if (this.zipPageSize == null) {
            if (other.zipPageSize != null)
                return false;
        }
        else if (!this.zipPageSize.equals(other.zipPageSize))
            return false;
        if (this.spaceType == null) {
            if (other.spaceType != null)
                return false;
        }
        else if (!this.spaceType.equals(other.spaceType))
            return false;
        if (this.instantCols == null) {
            if (other.instantCols != null)
                return false;
        }
        else if (!this.instantCols.equals(other.instantCols))
            return false;
        if (this.totalRowVersions == null) {
            if (other.totalRowVersions != null)
                return false;
        }
        else if (!this.totalRowVersions.equals(other.totalRowVersions))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableId == null) ? 0 : this.tableId.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.flag == null) ? 0 : this.flag.hashCode());
        result = prime * result + ((this.nCols == null) ? 0 : this.nCols.hashCode());
        result = prime * result + ((this.space == null) ? 0 : this.space.hashCode());
        result = prime * result + ((this.rowFormat == null) ? 0 : this.rowFormat.hashCode());
        result = prime * result + ((this.zipPageSize == null) ? 0 : this.zipPageSize.hashCode());
        result = prime * result + ((this.spaceType == null) ? 0 : this.spaceType.hashCode());
        result = prime * result + ((this.instantCols == null) ? 0 : this.instantCols.hashCode());
        result = prime * result + ((this.totalRowVersions == null) ? 0 : this.totalRowVersions.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbTables (");

        sb.append(tableId);
        sb.append(", ").append(name);
        sb.append(", ").append(flag);
        sb.append(", ").append(nCols);
        sb.append(", ").append(space);
        sb.append(", ").append(rowFormat);
        sb.append(", ").append(zipPageSize);
        sb.append(", ").append(spaceType);
        sb.append(", ").append(instantCols);
        sb.append(", ").append(totalRowVersions);

        sb.append(")");
        return sb.toString();
    }
}
