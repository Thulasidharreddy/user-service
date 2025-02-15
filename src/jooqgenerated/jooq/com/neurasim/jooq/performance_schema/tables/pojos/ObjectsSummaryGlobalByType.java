/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ObjectsSummaryGlobalByType implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String objectType;
    private final String objectSchema;
    private final String objectName;
    private final ULong countStar;
    private final ULong sumTimerWait;
    private final ULong minTimerWait;
    private final ULong avgTimerWait;
    private final ULong maxTimerWait;

    public ObjectsSummaryGlobalByType(ObjectsSummaryGlobalByType value) {
        this.objectType = value.objectType;
        this.objectSchema = value.objectSchema;
        this.objectName = value.objectName;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
    }

    public ObjectsSummaryGlobalByType(
        String objectType,
        String objectSchema,
        String objectName,
        ULong countStar,
        ULong sumTimerWait,
        ULong minTimerWait,
        ULong avgTimerWait,
        ULong maxTimerWait
    ) {
        this.objectType = objectType;
        this.objectSchema = objectSchema;
        this.objectName = objectName;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.OBJECT_TYPE</code>.
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.OBJECT_SCHEMA</code>.
     */
    public String getObjectSchema() {
        return this.objectSchema;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.OBJECT_NAME</code>.
     */
    public String getObjectName() {
        return this.objectName;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return this.countStar;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return this.sumTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return this.minTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return this.avgTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.objects_summary_global_by_type.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return this.maxTimerWait;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ObjectsSummaryGlobalByType other = (ObjectsSummaryGlobalByType) obj;
        if (this.objectType == null) {
            if (other.objectType != null)
                return false;
        }
        else if (!this.objectType.equals(other.objectType))
            return false;
        if (this.objectSchema == null) {
            if (other.objectSchema != null)
                return false;
        }
        else if (!this.objectSchema.equals(other.objectSchema))
            return false;
        if (this.objectName == null) {
            if (other.objectName != null)
                return false;
        }
        else if (!this.objectName.equals(other.objectName))
            return false;
        if (this.countStar == null) {
            if (other.countStar != null)
                return false;
        }
        else if (!this.countStar.equals(other.countStar))
            return false;
        if (this.sumTimerWait == null) {
            if (other.sumTimerWait != null)
                return false;
        }
        else if (!this.sumTimerWait.equals(other.sumTimerWait))
            return false;
        if (this.minTimerWait == null) {
            if (other.minTimerWait != null)
                return false;
        }
        else if (!this.minTimerWait.equals(other.minTimerWait))
            return false;
        if (this.avgTimerWait == null) {
            if (other.avgTimerWait != null)
                return false;
        }
        else if (!this.avgTimerWait.equals(other.avgTimerWait))
            return false;
        if (this.maxTimerWait == null) {
            if (other.maxTimerWait != null)
                return false;
        }
        else if (!this.maxTimerWait.equals(other.maxTimerWait))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.objectType == null) ? 0 : this.objectType.hashCode());
        result = prime * result + ((this.objectSchema == null) ? 0 : this.objectSchema.hashCode());
        result = prime * result + ((this.objectName == null) ? 0 : this.objectName.hashCode());
        result = prime * result + ((this.countStar == null) ? 0 : this.countStar.hashCode());
        result = prime * result + ((this.sumTimerWait == null) ? 0 : this.sumTimerWait.hashCode());
        result = prime * result + ((this.minTimerWait == null) ? 0 : this.minTimerWait.hashCode());
        result = prime * result + ((this.avgTimerWait == null) ? 0 : this.avgTimerWait.hashCode());
        result = prime * result + ((this.maxTimerWait == null) ? 0 : this.maxTimerWait.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ObjectsSummaryGlobalByType (");

        sb.append(objectType);
        sb.append(", ").append(objectSchema);
        sb.append(", ").append(objectName);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);

        sb.append(")");
        return sb.toString();
    }
}
