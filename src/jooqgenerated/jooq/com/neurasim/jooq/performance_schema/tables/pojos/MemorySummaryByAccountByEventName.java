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
public class MemorySummaryByAccountByEventName implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String user;
    private final String host;
    private final String eventName;
    private final ULong countAlloc;
    private final ULong countFree;
    private final ULong sumNumberOfBytesAlloc;
    private final ULong sumNumberOfBytesFree;
    private final Long lowCountUsed;
    private final Long currentCountUsed;
    private final Long highCountUsed;
    private final Long lowNumberOfBytesUsed;
    private final Long currentNumberOfBytesUsed;
    private final Long highNumberOfBytesUsed;

    public MemorySummaryByAccountByEventName(MemorySummaryByAccountByEventName value) {
        this.user = value.user;
        this.host = value.host;
        this.eventName = value.eventName;
        this.countAlloc = value.countAlloc;
        this.countFree = value.countFree;
        this.sumNumberOfBytesAlloc = value.sumNumberOfBytesAlloc;
        this.sumNumberOfBytesFree = value.sumNumberOfBytesFree;
        this.lowCountUsed = value.lowCountUsed;
        this.currentCountUsed = value.currentCountUsed;
        this.highCountUsed = value.highCountUsed;
        this.lowNumberOfBytesUsed = value.lowNumberOfBytesUsed;
        this.currentNumberOfBytesUsed = value.currentNumberOfBytesUsed;
        this.highNumberOfBytesUsed = value.highNumberOfBytesUsed;
    }

    public MemorySummaryByAccountByEventName(
        String user,
        String host,
        String eventName,
        ULong countAlloc,
        ULong countFree,
        ULong sumNumberOfBytesAlloc,
        ULong sumNumberOfBytesFree,
        Long lowCountUsed,
        Long currentCountUsed,
        Long highCountUsed,
        Long lowNumberOfBytesUsed,
        Long currentNumberOfBytesUsed,
        Long highNumberOfBytesUsed
    ) {
        this.user = user;
        this.host = host;
        this.eventName = eventName;
        this.countAlloc = countAlloc;
        this.countFree = countFree;
        this.sumNumberOfBytesAlloc = sumNumberOfBytesAlloc;
        this.sumNumberOfBytesFree = sumNumberOfBytesFree;
        this.lowCountUsed = lowCountUsed;
        this.currentCountUsed = currentCountUsed;
        this.highCountUsed = highCountUsed;
        this.lowNumberOfBytesUsed = lowNumberOfBytesUsed;
        this.currentNumberOfBytesUsed = currentNumberOfBytesUsed;
        this.highNumberOfBytesUsed = highNumberOfBytesUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.USER</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.HOST</code>.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.COUNT_ALLOC</code>.
     */
    public ULong getCountAlloc() {
        return this.countAlloc;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.COUNT_FREE</code>.
     */
    public ULong getCountFree() {
        return this.countFree;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.SUM_NUMBER_OF_BYTES_ALLOC</code>.
     */
    public ULong getSumNumberOfBytesAlloc() {
        return this.sumNumberOfBytesAlloc;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.SUM_NUMBER_OF_BYTES_FREE</code>.
     */
    public ULong getSumNumberOfBytesFree() {
        return this.sumNumberOfBytesFree;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.LOW_COUNT_USED</code>.
     */
    public Long getLowCountUsed() {
        return this.lowCountUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.CURRENT_COUNT_USED</code>.
     */
    public Long getCurrentCountUsed() {
        return this.currentCountUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.HIGH_COUNT_USED</code>.
     */
    public Long getHighCountUsed() {
        return this.highCountUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.LOW_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getLowNumberOfBytesUsed() {
        return this.lowNumberOfBytesUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.CURRENT_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getCurrentNumberOfBytesUsed() {
        return this.currentNumberOfBytesUsed;
    }

    /**
     * Getter for
     * <code>performance_schema.memory_summary_by_account_by_event_name.HIGH_NUMBER_OF_BYTES_USED</code>.
     */
    public Long getHighNumberOfBytesUsed() {
        return this.highNumberOfBytesUsed;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final MemorySummaryByAccountByEventName other = (MemorySummaryByAccountByEventName) obj;
        if (this.user == null) {
            if (other.user != null)
                return false;
        }
        else if (!this.user.equals(other.user))
            return false;
        if (this.host == null) {
            if (other.host != null)
                return false;
        }
        else if (!this.host.equals(other.host))
            return false;
        if (this.eventName == null) {
            if (other.eventName != null)
                return false;
        }
        else if (!this.eventName.equals(other.eventName))
            return false;
        if (this.countAlloc == null) {
            if (other.countAlloc != null)
                return false;
        }
        else if (!this.countAlloc.equals(other.countAlloc))
            return false;
        if (this.countFree == null) {
            if (other.countFree != null)
                return false;
        }
        else if (!this.countFree.equals(other.countFree))
            return false;
        if (this.sumNumberOfBytesAlloc == null) {
            if (other.sumNumberOfBytesAlloc != null)
                return false;
        }
        else if (!this.sumNumberOfBytesAlloc.equals(other.sumNumberOfBytesAlloc))
            return false;
        if (this.sumNumberOfBytesFree == null) {
            if (other.sumNumberOfBytesFree != null)
                return false;
        }
        else if (!this.sumNumberOfBytesFree.equals(other.sumNumberOfBytesFree))
            return false;
        if (this.lowCountUsed == null) {
            if (other.lowCountUsed != null)
                return false;
        }
        else if (!this.lowCountUsed.equals(other.lowCountUsed))
            return false;
        if (this.currentCountUsed == null) {
            if (other.currentCountUsed != null)
                return false;
        }
        else if (!this.currentCountUsed.equals(other.currentCountUsed))
            return false;
        if (this.highCountUsed == null) {
            if (other.highCountUsed != null)
                return false;
        }
        else if (!this.highCountUsed.equals(other.highCountUsed))
            return false;
        if (this.lowNumberOfBytesUsed == null) {
            if (other.lowNumberOfBytesUsed != null)
                return false;
        }
        else if (!this.lowNumberOfBytesUsed.equals(other.lowNumberOfBytesUsed))
            return false;
        if (this.currentNumberOfBytesUsed == null) {
            if (other.currentNumberOfBytesUsed != null)
                return false;
        }
        else if (!this.currentNumberOfBytesUsed.equals(other.currentNumberOfBytesUsed))
            return false;
        if (this.highNumberOfBytesUsed == null) {
            if (other.highNumberOfBytesUsed != null)
                return false;
        }
        else if (!this.highNumberOfBytesUsed.equals(other.highNumberOfBytesUsed))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.user == null) ? 0 : this.user.hashCode());
        result = prime * result + ((this.host == null) ? 0 : this.host.hashCode());
        result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
        result = prime * result + ((this.countAlloc == null) ? 0 : this.countAlloc.hashCode());
        result = prime * result + ((this.countFree == null) ? 0 : this.countFree.hashCode());
        result = prime * result + ((this.sumNumberOfBytesAlloc == null) ? 0 : this.sumNumberOfBytesAlloc.hashCode());
        result = prime * result + ((this.sumNumberOfBytesFree == null) ? 0 : this.sumNumberOfBytesFree.hashCode());
        result = prime * result + ((this.lowCountUsed == null) ? 0 : this.lowCountUsed.hashCode());
        result = prime * result + ((this.currentCountUsed == null) ? 0 : this.currentCountUsed.hashCode());
        result = prime * result + ((this.highCountUsed == null) ? 0 : this.highCountUsed.hashCode());
        result = prime * result + ((this.lowNumberOfBytesUsed == null) ? 0 : this.lowNumberOfBytesUsed.hashCode());
        result = prime * result + ((this.currentNumberOfBytesUsed == null) ? 0 : this.currentNumberOfBytesUsed.hashCode());
        result = prime * result + ((this.highNumberOfBytesUsed == null) ? 0 : this.highNumberOfBytesUsed.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MemorySummaryByAccountByEventName (");

        sb.append(user);
        sb.append(", ").append(host);
        sb.append(", ").append(eventName);
        sb.append(", ").append(countAlloc);
        sb.append(", ").append(countFree);
        sb.append(", ").append(sumNumberOfBytesAlloc);
        sb.append(", ").append(sumNumberOfBytesFree);
        sb.append(", ").append(lowCountUsed);
        sb.append(", ").append(currentCountUsed);
        sb.append(", ").append(highCountUsed);
        sb.append(", ").append(lowNumberOfBytesUsed);
        sb.append(", ").append(currentNumberOfBytesUsed);
        sb.append(", ").append(highNumberOfBytesUsed);

        sb.append(")");
        return sb.toString();
    }
}
