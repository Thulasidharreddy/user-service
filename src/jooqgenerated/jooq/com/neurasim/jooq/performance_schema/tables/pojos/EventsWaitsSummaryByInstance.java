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
public class EventsWaitsSummaryByInstance implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String eventName;
    private final ULong objectInstanceBegin;
    private final ULong countStar;
    private final ULong sumTimerWait;
    private final ULong minTimerWait;
    private final ULong avgTimerWait;
    private final ULong maxTimerWait;

    public EventsWaitsSummaryByInstance(EventsWaitsSummaryByInstance value) {
        this.eventName = value.eventName;
        this.objectInstanceBegin = value.objectInstanceBegin;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
    }

    public EventsWaitsSummaryByInstance(
        String eventName,
        ULong objectInstanceBegin,
        ULong countStar,
        ULong sumTimerWait,
        ULong minTimerWait,
        ULong avgTimerWait,
        ULong maxTimerWait
    ) {
        this.eventName = eventName;
        this.objectInstanceBegin = objectInstanceBegin;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_instance.EVENT_NAME</code>.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_instance.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return this.objectInstanceBegin;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_instance.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return this.countStar;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_instance.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return this.sumTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_instance.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return this.minTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_instance.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return this.avgTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.events_waits_summary_by_instance.MAX_TIMER_WAIT</code>.
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
        final EventsWaitsSummaryByInstance other = (EventsWaitsSummaryByInstance) obj;
        if (this.eventName == null) {
            if (other.eventName != null)
                return false;
        }
        else if (!this.eventName.equals(other.eventName))
            return false;
        if (this.objectInstanceBegin == null) {
            if (other.objectInstanceBegin != null)
                return false;
        }
        else if (!this.objectInstanceBegin.equals(other.objectInstanceBegin))
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
        result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
        result = prime * result + ((this.objectInstanceBegin == null) ? 0 : this.objectInstanceBegin.hashCode());
        result = prime * result + ((this.countStar == null) ? 0 : this.countStar.hashCode());
        result = prime * result + ((this.sumTimerWait == null) ? 0 : this.sumTimerWait.hashCode());
        result = prime * result + ((this.minTimerWait == null) ? 0 : this.minTimerWait.hashCode());
        result = prime * result + ((this.avgTimerWait == null) ? 0 : this.avgTimerWait.hashCode());
        result = prime * result + ((this.maxTimerWait == null) ? 0 : this.maxTimerWait.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EventsWaitsSummaryByInstance (");

        sb.append(eventName);
        sb.append(", ").append(objectInstanceBegin);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);

        sb.append(")");
        return sb.toString();
    }
}
