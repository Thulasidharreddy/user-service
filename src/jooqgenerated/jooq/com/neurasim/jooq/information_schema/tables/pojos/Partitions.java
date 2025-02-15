/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Partitions implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String partitionName;
    private final String subpartitionName;
    private final UInteger partitionOrdinalPosition;
    private final UInteger subpartitionOrdinalPosition;
    private final String secondaryLoad;
    private final String partitionMethod;
    private final String subpartitionMethod;
    private final String partitionExpression;
    private final String subpartitionExpression;
    private final String partitionDescription;
    private final ULong tableRows;
    private final ULong avgRowLength;
    private final ULong dataLength;
    private final ULong maxDataLength;
    private final ULong indexLength;
    private final ULong dataFree;
    private final LocalDateTime createTime;
    private final LocalDateTime updateTime;
    private final LocalDateTime checkTime;
    private final Long checksum;
    private final String partitionComment;
    private final String nodegroup;
    private final String tablespaceName;

    public Partitions(Partitions value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.partitionName = value.partitionName;
        this.subpartitionName = value.subpartitionName;
        this.partitionOrdinalPosition = value.partitionOrdinalPosition;
        this.subpartitionOrdinalPosition = value.subpartitionOrdinalPosition;
        this.secondaryLoad = value.secondaryLoad;
        this.partitionMethod = value.partitionMethod;
        this.subpartitionMethod = value.subpartitionMethod;
        this.partitionExpression = value.partitionExpression;
        this.subpartitionExpression = value.subpartitionExpression;
        this.partitionDescription = value.partitionDescription;
        this.tableRows = value.tableRows;
        this.avgRowLength = value.avgRowLength;
        this.dataLength = value.dataLength;
        this.maxDataLength = value.maxDataLength;
        this.indexLength = value.indexLength;
        this.dataFree = value.dataFree;
        this.createTime = value.createTime;
        this.updateTime = value.updateTime;
        this.checkTime = value.checkTime;
        this.checksum = value.checksum;
        this.partitionComment = value.partitionComment;
        this.nodegroup = value.nodegroup;
        this.tablespaceName = value.tablespaceName;
    }

    public Partitions(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String partitionName,
        String subpartitionName,
        UInteger partitionOrdinalPosition,
        UInteger subpartitionOrdinalPosition,
        String secondaryLoad,
        String partitionMethod,
        String subpartitionMethod,
        String partitionExpression,
        String subpartitionExpression,
        String partitionDescription,
        ULong tableRows,
        ULong avgRowLength,
        ULong dataLength,
        ULong maxDataLength,
        ULong indexLength,
        ULong dataFree,
        LocalDateTime createTime,
        LocalDateTime updateTime,
        LocalDateTime checkTime,
        Long checksum,
        String partitionComment,
        String nodegroup,
        String tablespaceName
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.partitionName = partitionName;
        this.subpartitionName = subpartitionName;
        this.partitionOrdinalPosition = partitionOrdinalPosition;
        this.subpartitionOrdinalPosition = subpartitionOrdinalPosition;
        this.secondaryLoad = secondaryLoad;
        this.partitionMethod = partitionMethod;
        this.subpartitionMethod = subpartitionMethod;
        this.partitionExpression = partitionExpression;
        this.subpartitionExpression = subpartitionExpression;
        this.partitionDescription = partitionDescription;
        this.tableRows = tableRows;
        this.avgRowLength = avgRowLength;
        this.dataLength = dataLength;
        this.maxDataLength = maxDataLength;
        this.indexLength = indexLength;
        this.dataFree = dataFree;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.checkTime = checkTime;
        this.checksum = checksum;
        this.partitionComment = partitionComment;
        this.nodegroup = nodegroup;
        this.tablespaceName = tablespaceName;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_NAME</code>.
     */
    public String getPartitionName() {
        return this.partitionName;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.SUBPARTITION_NAME</code>.
     */
    public String getSubpartitionName() {
        return this.subpartitionName;
    }

    /**
     * Getter for
     * <code>information_schema.PARTITIONS.PARTITION_ORDINAL_POSITION</code>.
     */
    public UInteger getPartitionOrdinalPosition() {
        return this.partitionOrdinalPosition;
    }

    /**
     * Getter for
     * <code>information_schema.PARTITIONS.SUBPARTITION_ORDINAL_POSITION</code>.
     */
    public UInteger getSubpartitionOrdinalPosition() {
        return this.subpartitionOrdinalPosition;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.SECONDARY_LOAD</code>.
     */
    public String getSecondaryLoad() {
        return this.secondaryLoad;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_METHOD</code>.
     */
    public String getPartitionMethod() {
        return this.partitionMethod;
    }

    /**
     * Getter for
     * <code>information_schema.PARTITIONS.SUBPARTITION_METHOD</code>.
     */
    public String getSubpartitionMethod() {
        return this.subpartitionMethod;
    }

    /**
     * Getter for
     * <code>information_schema.PARTITIONS.PARTITION_EXPRESSION</code>.
     */
    public String getPartitionExpression() {
        return this.partitionExpression;
    }

    /**
     * Getter for
     * <code>information_schema.PARTITIONS.SUBPARTITION_EXPRESSION</code>.
     */
    public String getSubpartitionExpression() {
        return this.subpartitionExpression;
    }

    /**
     * Getter for
     * <code>information_schema.PARTITIONS.PARTITION_DESCRIPTION</code>.
     */
    public String getPartitionDescription() {
        return this.partitionDescription;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLE_ROWS</code>.
     */
    public ULong getTableRows() {
        return this.tableRows;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.AVG_ROW_LENGTH</code>.
     */
    public ULong getAvgRowLength() {
        return this.avgRowLength;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.DATA_LENGTH</code>.
     */
    public ULong getDataLength() {
        return this.dataLength;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.MAX_DATA_LENGTH</code>.
     */
    public ULong getMaxDataLength() {
        return this.maxDataLength;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.INDEX_LENGTH</code>.
     */
    public ULong getIndexLength() {
        return this.indexLength;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.DATA_FREE</code>.
     */
    public ULong getDataFree() {
        return this.dataFree;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.CREATE_TIME</code>.
     */
    public LocalDateTime getCreateTime() {
        return this.createTime;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.UPDATE_TIME</code>.
     */
    public LocalDateTime getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.CHECK_TIME</code>.
     */
    public LocalDateTime getCheckTime() {
        return this.checkTime;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.CHECKSUM</code>.
     */
    public Long getChecksum() {
        return this.checksum;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.PARTITION_COMMENT</code>.
     */
    public String getPartitionComment() {
        return this.partitionComment;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.NODEGROUP</code>.
     */
    public String getNodegroup() {
        return this.nodegroup;
    }

    /**
     * Getter for <code>information_schema.PARTITIONS.TABLESPACE_NAME</code>.
     */
    public String getTablespaceName() {
        return this.tablespaceName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Partitions other = (Partitions) obj;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.partitionName == null) {
            if (other.partitionName != null)
                return false;
        }
        else if (!this.partitionName.equals(other.partitionName))
            return false;
        if (this.subpartitionName == null) {
            if (other.subpartitionName != null)
                return false;
        }
        else if (!this.subpartitionName.equals(other.subpartitionName))
            return false;
        if (this.partitionOrdinalPosition == null) {
            if (other.partitionOrdinalPosition != null)
                return false;
        }
        else if (!this.partitionOrdinalPosition.equals(other.partitionOrdinalPosition))
            return false;
        if (this.subpartitionOrdinalPosition == null) {
            if (other.subpartitionOrdinalPosition != null)
                return false;
        }
        else if (!this.subpartitionOrdinalPosition.equals(other.subpartitionOrdinalPosition))
            return false;
        if (this.secondaryLoad == null) {
            if (other.secondaryLoad != null)
                return false;
        }
        else if (!this.secondaryLoad.equals(other.secondaryLoad))
            return false;
        if (this.partitionMethod == null) {
            if (other.partitionMethod != null)
                return false;
        }
        else if (!this.partitionMethod.equals(other.partitionMethod))
            return false;
        if (this.subpartitionMethod == null) {
            if (other.subpartitionMethod != null)
                return false;
        }
        else if (!this.subpartitionMethod.equals(other.subpartitionMethod))
            return false;
        if (this.partitionExpression == null) {
            if (other.partitionExpression != null)
                return false;
        }
        else if (!this.partitionExpression.equals(other.partitionExpression))
            return false;
        if (this.subpartitionExpression == null) {
            if (other.subpartitionExpression != null)
                return false;
        }
        else if (!this.subpartitionExpression.equals(other.subpartitionExpression))
            return false;
        if (this.partitionDescription == null) {
            if (other.partitionDescription != null)
                return false;
        }
        else if (!this.partitionDescription.equals(other.partitionDescription))
            return false;
        if (this.tableRows == null) {
            if (other.tableRows != null)
                return false;
        }
        else if (!this.tableRows.equals(other.tableRows))
            return false;
        if (this.avgRowLength == null) {
            if (other.avgRowLength != null)
                return false;
        }
        else if (!this.avgRowLength.equals(other.avgRowLength))
            return false;
        if (this.dataLength == null) {
            if (other.dataLength != null)
                return false;
        }
        else if (!this.dataLength.equals(other.dataLength))
            return false;
        if (this.maxDataLength == null) {
            if (other.maxDataLength != null)
                return false;
        }
        else if (!this.maxDataLength.equals(other.maxDataLength))
            return false;
        if (this.indexLength == null) {
            if (other.indexLength != null)
                return false;
        }
        else if (!this.indexLength.equals(other.indexLength))
            return false;
        if (this.dataFree == null) {
            if (other.dataFree != null)
                return false;
        }
        else if (!this.dataFree.equals(other.dataFree))
            return false;
        if (this.createTime == null) {
            if (other.createTime != null)
                return false;
        }
        else if (!this.createTime.equals(other.createTime))
            return false;
        if (this.updateTime == null) {
            if (other.updateTime != null)
                return false;
        }
        else if (!this.updateTime.equals(other.updateTime))
            return false;
        if (this.checkTime == null) {
            if (other.checkTime != null)
                return false;
        }
        else if (!this.checkTime.equals(other.checkTime))
            return false;
        if (this.checksum == null) {
            if (other.checksum != null)
                return false;
        }
        else if (!this.checksum.equals(other.checksum))
            return false;
        if (this.partitionComment == null) {
            if (other.partitionComment != null)
                return false;
        }
        else if (!this.partitionComment.equals(other.partitionComment))
            return false;
        if (this.nodegroup == null) {
            if (other.nodegroup != null)
                return false;
        }
        else if (!this.nodegroup.equals(other.nodegroup))
            return false;
        if (this.tablespaceName == null) {
            if (other.tablespaceName != null)
                return false;
        }
        else if (!this.tablespaceName.equals(other.tablespaceName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.partitionName == null) ? 0 : this.partitionName.hashCode());
        result = prime * result + ((this.subpartitionName == null) ? 0 : this.subpartitionName.hashCode());
        result = prime * result + ((this.partitionOrdinalPosition == null) ? 0 : this.partitionOrdinalPosition.hashCode());
        result = prime * result + ((this.subpartitionOrdinalPosition == null) ? 0 : this.subpartitionOrdinalPosition.hashCode());
        result = prime * result + ((this.secondaryLoad == null) ? 0 : this.secondaryLoad.hashCode());
        result = prime * result + ((this.partitionMethod == null) ? 0 : this.partitionMethod.hashCode());
        result = prime * result + ((this.subpartitionMethod == null) ? 0 : this.subpartitionMethod.hashCode());
        result = prime * result + ((this.partitionExpression == null) ? 0 : this.partitionExpression.hashCode());
        result = prime * result + ((this.subpartitionExpression == null) ? 0 : this.subpartitionExpression.hashCode());
        result = prime * result + ((this.partitionDescription == null) ? 0 : this.partitionDescription.hashCode());
        result = prime * result + ((this.tableRows == null) ? 0 : this.tableRows.hashCode());
        result = prime * result + ((this.avgRowLength == null) ? 0 : this.avgRowLength.hashCode());
        result = prime * result + ((this.dataLength == null) ? 0 : this.dataLength.hashCode());
        result = prime * result + ((this.maxDataLength == null) ? 0 : this.maxDataLength.hashCode());
        result = prime * result + ((this.indexLength == null) ? 0 : this.indexLength.hashCode());
        result = prime * result + ((this.dataFree == null) ? 0 : this.dataFree.hashCode());
        result = prime * result + ((this.createTime == null) ? 0 : this.createTime.hashCode());
        result = prime * result + ((this.updateTime == null) ? 0 : this.updateTime.hashCode());
        result = prime * result + ((this.checkTime == null) ? 0 : this.checkTime.hashCode());
        result = prime * result + ((this.checksum == null) ? 0 : this.checksum.hashCode());
        result = prime * result + ((this.partitionComment == null) ? 0 : this.partitionComment.hashCode());
        result = prime * result + ((this.nodegroup == null) ? 0 : this.nodegroup.hashCode());
        result = prime * result + ((this.tablespaceName == null) ? 0 : this.tablespaceName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Partitions (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(partitionName);
        sb.append(", ").append(subpartitionName);
        sb.append(", ").append(partitionOrdinalPosition);
        sb.append(", ").append(subpartitionOrdinalPosition);
        sb.append(", ").append(secondaryLoad);
        sb.append(", ").append(partitionMethod);
        sb.append(", ").append(subpartitionMethod);
        sb.append(", ").append(partitionExpression);
        sb.append(", ").append(subpartitionExpression);
        sb.append(", ").append(partitionDescription);
        sb.append(", ").append(tableRows);
        sb.append(", ").append(avgRowLength);
        sb.append(", ").append(dataLength);
        sb.append(", ").append(maxDataLength);
        sb.append(", ").append(indexLength);
        sb.append(", ").append(dataFree);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(checkTime);
        sb.append(", ").append(checksum);
        sb.append(", ").append(partitionComment);
        sb.append(", ").append(nodegroup);
        sb.append(", ").append(tablespaceName);

        sb.append(")");
        return sb.toString();
    }
}
