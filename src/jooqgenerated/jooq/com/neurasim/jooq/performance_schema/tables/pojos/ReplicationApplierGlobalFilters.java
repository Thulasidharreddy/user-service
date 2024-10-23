/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.ReplicationApplierGlobalFiltersConfiguredBy;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierGlobalFilters implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String filterName;
    private final String filterRule;
    private final ReplicationApplierGlobalFiltersConfiguredBy configuredBy;
    private final LocalDateTime activeSince;

    public ReplicationApplierGlobalFilters(ReplicationApplierGlobalFilters value) {
        this.filterName = value.filterName;
        this.filterRule = value.filterRule;
        this.configuredBy = value.configuredBy;
        this.activeSince = value.activeSince;
    }

    public ReplicationApplierGlobalFilters(
        String filterName,
        String filterRule,
        ReplicationApplierGlobalFiltersConfiguredBy configuredBy,
        LocalDateTime activeSince
    ) {
        this.filterName = filterName;
        this.filterRule = filterRule;
        this.configuredBy = configuredBy;
        this.activeSince = activeSince;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_global_filters.FILTER_NAME</code>.
     */
    public String getFilterName() {
        return this.filterName;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_global_filters.FILTER_RULE</code>.
     */
    public String getFilterRule() {
        return this.filterRule;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_global_filters.CONFIGURED_BY</code>.
     */
    public ReplicationApplierGlobalFiltersConfiguredBy getConfiguredBy() {
        return this.configuredBy;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_global_filters.ACTIVE_SINCE</code>.
     */
    public LocalDateTime getActiveSince() {
        return this.activeSince;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ReplicationApplierGlobalFilters other = (ReplicationApplierGlobalFilters) obj;
        if (this.filterName == null) {
            if (other.filterName != null)
                return false;
        }
        else if (!this.filterName.equals(other.filterName))
            return false;
        if (this.filterRule == null) {
            if (other.filterRule != null)
                return false;
        }
        else if (!this.filterRule.equals(other.filterRule))
            return false;
        if (this.configuredBy == null) {
            if (other.configuredBy != null)
                return false;
        }
        else if (!this.configuredBy.equals(other.configuredBy))
            return false;
        if (this.activeSince == null) {
            if (other.activeSince != null)
                return false;
        }
        else if (!this.activeSince.equals(other.activeSince))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.filterName == null) ? 0 : this.filterName.hashCode());
        result = prime * result + ((this.filterRule == null) ? 0 : this.filterRule.hashCode());
        result = prime * result + ((this.configuredBy == null) ? 0 : this.configuredBy.hashCode());
        result = prime * result + ((this.activeSince == null) ? 0 : this.activeSince.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReplicationApplierGlobalFilters (");

        sb.append(filterName);
        sb.append(", ").append(filterRule);
        sb.append(", ").append(configuredBy);
        sb.append(", ").append(activeSince);

        sb.append(")");
        return sb.toString();
    }
}
