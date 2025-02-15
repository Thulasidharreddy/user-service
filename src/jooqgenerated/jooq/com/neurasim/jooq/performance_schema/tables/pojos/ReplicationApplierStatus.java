/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.ReplicationApplierStatusServiceState;

import java.io.Serializable;

import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationApplierStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String channelName;
    private final ReplicationApplierStatusServiceState serviceState;
    private final UInteger remainingDelay;
    private final ULong countTransactionsRetries;

    public ReplicationApplierStatus(ReplicationApplierStatus value) {
        this.channelName = value.channelName;
        this.serviceState = value.serviceState;
        this.remainingDelay = value.remainingDelay;
        this.countTransactionsRetries = value.countTransactionsRetries;
    }

    public ReplicationApplierStatus(
        String channelName,
        ReplicationApplierStatusServiceState serviceState,
        UInteger remainingDelay,
        ULong countTransactionsRetries
    ) {
        this.channelName = channelName;
        this.serviceState = serviceState;
        this.remainingDelay = remainingDelay;
        this.countTransactionsRetries = countTransactionsRetries;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status.CHANNEL_NAME</code>.
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status.SERVICE_STATE</code>.
     */
    public ReplicationApplierStatusServiceState getServiceState() {
        return this.serviceState;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status.REMAINING_DELAY</code>.
     */
    public UInteger getRemainingDelay() {
        return this.remainingDelay;
    }

    /**
     * Getter for
     * <code>performance_schema.replication_applier_status.COUNT_TRANSACTIONS_RETRIES</code>.
     */
    public ULong getCountTransactionsRetries() {
        return this.countTransactionsRetries;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ReplicationApplierStatus other = (ReplicationApplierStatus) obj;
        if (this.channelName == null) {
            if (other.channelName != null)
                return false;
        }
        else if (!this.channelName.equals(other.channelName))
            return false;
        if (this.serviceState == null) {
            if (other.serviceState != null)
                return false;
        }
        else if (!this.serviceState.equals(other.serviceState))
            return false;
        if (this.remainingDelay == null) {
            if (other.remainingDelay != null)
                return false;
        }
        else if (!this.remainingDelay.equals(other.remainingDelay))
            return false;
        if (this.countTransactionsRetries == null) {
            if (other.countTransactionsRetries != null)
                return false;
        }
        else if (!this.countTransactionsRetries.equals(other.countTransactionsRetries))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.channelName == null) ? 0 : this.channelName.hashCode());
        result = prime * result + ((this.serviceState == null) ? 0 : this.serviceState.hashCode());
        result = prime * result + ((this.remainingDelay == null) ? 0 : this.remainingDelay.hashCode());
        result = prime * result + ((this.countTransactionsRetries == null) ? 0 : this.countTransactionsRetries.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ReplicationApplierStatus (");

        sb.append(channelName);
        sb.append(", ").append(serviceState);
        sb.append(", ").append(remainingDelay);
        sb.append(", ").append(countTransactionsRetries);

        sb.append(")");
        return sb.toString();
    }
}
