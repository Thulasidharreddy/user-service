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
public class FileSummaryByEventName implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String eventName;
    private final ULong countStar;
    private final ULong sumTimerWait;
    private final ULong minTimerWait;
    private final ULong avgTimerWait;
    private final ULong maxTimerWait;
    private final ULong countRead;
    private final ULong sumTimerRead;
    private final ULong minTimerRead;
    private final ULong avgTimerRead;
    private final ULong maxTimerRead;
    private final Long sumNumberOfBytesRead;
    private final ULong countWrite;
    private final ULong sumTimerWrite;
    private final ULong minTimerWrite;
    private final ULong avgTimerWrite;
    private final ULong maxTimerWrite;
    private final Long sumNumberOfBytesWrite;
    private final ULong countMisc;
    private final ULong sumTimerMisc;
    private final ULong minTimerMisc;
    private final ULong avgTimerMisc;
    private final ULong maxTimerMisc;

    public FileSummaryByEventName(FileSummaryByEventName value) {
        this.eventName = value.eventName;
        this.countStar = value.countStar;
        this.sumTimerWait = value.sumTimerWait;
        this.minTimerWait = value.minTimerWait;
        this.avgTimerWait = value.avgTimerWait;
        this.maxTimerWait = value.maxTimerWait;
        this.countRead = value.countRead;
        this.sumTimerRead = value.sumTimerRead;
        this.minTimerRead = value.minTimerRead;
        this.avgTimerRead = value.avgTimerRead;
        this.maxTimerRead = value.maxTimerRead;
        this.sumNumberOfBytesRead = value.sumNumberOfBytesRead;
        this.countWrite = value.countWrite;
        this.sumTimerWrite = value.sumTimerWrite;
        this.minTimerWrite = value.minTimerWrite;
        this.avgTimerWrite = value.avgTimerWrite;
        this.maxTimerWrite = value.maxTimerWrite;
        this.sumNumberOfBytesWrite = value.sumNumberOfBytesWrite;
        this.countMisc = value.countMisc;
        this.sumTimerMisc = value.sumTimerMisc;
        this.minTimerMisc = value.minTimerMisc;
        this.avgTimerMisc = value.avgTimerMisc;
        this.maxTimerMisc = value.maxTimerMisc;
    }

    public FileSummaryByEventName(
        String eventName,
        ULong countStar,
        ULong sumTimerWait,
        ULong minTimerWait,
        ULong avgTimerWait,
        ULong maxTimerWait,
        ULong countRead,
        ULong sumTimerRead,
        ULong minTimerRead,
        ULong avgTimerRead,
        ULong maxTimerRead,
        Long sumNumberOfBytesRead,
        ULong countWrite,
        ULong sumTimerWrite,
        ULong minTimerWrite,
        ULong avgTimerWrite,
        ULong maxTimerWrite,
        Long sumNumberOfBytesWrite,
        ULong countMisc,
        ULong sumTimerMisc,
        ULong minTimerMisc,
        ULong avgTimerMisc,
        ULong maxTimerMisc
    ) {
        this.eventName = eventName;
        this.countStar = countStar;
        this.sumTimerWait = sumTimerWait;
        this.minTimerWait = minTimerWait;
        this.avgTimerWait = avgTimerWait;
        this.maxTimerWait = maxTimerWait;
        this.countRead = countRead;
        this.sumTimerRead = sumTimerRead;
        this.minTimerRead = minTimerRead;
        this.avgTimerRead = avgTimerRead;
        this.maxTimerRead = maxTimerRead;
        this.sumNumberOfBytesRead = sumNumberOfBytesRead;
        this.countWrite = countWrite;
        this.sumTimerWrite = sumTimerWrite;
        this.minTimerWrite = minTimerWrite;
        this.avgTimerWrite = avgTimerWrite;
        this.maxTimerWrite = maxTimerWrite;
        this.sumNumberOfBytesWrite = sumNumberOfBytesWrite;
        this.countMisc = countMisc;
        this.sumTimerMisc = sumTimerMisc;
        this.minTimerMisc = minTimerMisc;
        this.avgTimerMisc = avgTimerMisc;
        this.maxTimerMisc = maxTimerMisc;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.EVENT_NAME</code>.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.COUNT_STAR</code>.
     */
    public ULong getCountStar() {
        return this.countStar;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.SUM_TIMER_WAIT</code>.
     */
    public ULong getSumTimerWait() {
        return this.sumTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MIN_TIMER_WAIT</code>.
     */
    public ULong getMinTimerWait() {
        return this.minTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.AVG_TIMER_WAIT</code>.
     */
    public ULong getAvgTimerWait() {
        return this.avgTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MAX_TIMER_WAIT</code>.
     */
    public ULong getMaxTimerWait() {
        return this.maxTimerWait;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.COUNT_READ</code>.
     */
    public ULong getCountRead() {
        return this.countRead;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.SUM_TIMER_READ</code>.
     */
    public ULong getSumTimerRead() {
        return this.sumTimerRead;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MIN_TIMER_READ</code>.
     */
    public ULong getMinTimerRead() {
        return this.minTimerRead;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.AVG_TIMER_READ</code>.
     */
    public ULong getAvgTimerRead() {
        return this.avgTimerRead;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MAX_TIMER_READ</code>.
     */
    public ULong getMaxTimerRead() {
        return this.maxTimerRead;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_READ</code>.
     */
    public Long getSumNumberOfBytesRead() {
        return this.sumNumberOfBytesRead;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.COUNT_WRITE</code>.
     */
    public ULong getCountWrite() {
        return this.countWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.SUM_TIMER_WRITE</code>.
     */
    public ULong getSumTimerWrite() {
        return this.sumTimerWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MIN_TIMER_WRITE</code>.
     */
    public ULong getMinTimerWrite() {
        return this.minTimerWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.AVG_TIMER_WRITE</code>.
     */
    public ULong getAvgTimerWrite() {
        return this.avgTimerWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MAX_TIMER_WRITE</code>.
     */
    public ULong getMaxTimerWrite() {
        return this.maxTimerWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.SUM_NUMBER_OF_BYTES_WRITE</code>.
     */
    public Long getSumNumberOfBytesWrite() {
        return this.sumNumberOfBytesWrite;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.COUNT_MISC</code>.
     */
    public ULong getCountMisc() {
        return this.countMisc;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.SUM_TIMER_MISC</code>.
     */
    public ULong getSumTimerMisc() {
        return this.sumTimerMisc;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MIN_TIMER_MISC</code>.
     */
    public ULong getMinTimerMisc() {
        return this.minTimerMisc;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.AVG_TIMER_MISC</code>.
     */
    public ULong getAvgTimerMisc() {
        return this.avgTimerMisc;
    }

    /**
     * Getter for
     * <code>performance_schema.file_summary_by_event_name.MAX_TIMER_MISC</code>.
     */
    public ULong getMaxTimerMisc() {
        return this.maxTimerMisc;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final FileSummaryByEventName other = (FileSummaryByEventName) obj;
        if (this.eventName == null) {
            if (other.eventName != null)
                return false;
        }
        else if (!this.eventName.equals(other.eventName))
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
        if (this.countRead == null) {
            if (other.countRead != null)
                return false;
        }
        else if (!this.countRead.equals(other.countRead))
            return false;
        if (this.sumTimerRead == null) {
            if (other.sumTimerRead != null)
                return false;
        }
        else if (!this.sumTimerRead.equals(other.sumTimerRead))
            return false;
        if (this.minTimerRead == null) {
            if (other.minTimerRead != null)
                return false;
        }
        else if (!this.minTimerRead.equals(other.minTimerRead))
            return false;
        if (this.avgTimerRead == null) {
            if (other.avgTimerRead != null)
                return false;
        }
        else if (!this.avgTimerRead.equals(other.avgTimerRead))
            return false;
        if (this.maxTimerRead == null) {
            if (other.maxTimerRead != null)
                return false;
        }
        else if (!this.maxTimerRead.equals(other.maxTimerRead))
            return false;
        if (this.sumNumberOfBytesRead == null) {
            if (other.sumNumberOfBytesRead != null)
                return false;
        }
        else if (!this.sumNumberOfBytesRead.equals(other.sumNumberOfBytesRead))
            return false;
        if (this.countWrite == null) {
            if (other.countWrite != null)
                return false;
        }
        else if (!this.countWrite.equals(other.countWrite))
            return false;
        if (this.sumTimerWrite == null) {
            if (other.sumTimerWrite != null)
                return false;
        }
        else if (!this.sumTimerWrite.equals(other.sumTimerWrite))
            return false;
        if (this.minTimerWrite == null) {
            if (other.minTimerWrite != null)
                return false;
        }
        else if (!this.minTimerWrite.equals(other.minTimerWrite))
            return false;
        if (this.avgTimerWrite == null) {
            if (other.avgTimerWrite != null)
                return false;
        }
        else if (!this.avgTimerWrite.equals(other.avgTimerWrite))
            return false;
        if (this.maxTimerWrite == null) {
            if (other.maxTimerWrite != null)
                return false;
        }
        else if (!this.maxTimerWrite.equals(other.maxTimerWrite))
            return false;
        if (this.sumNumberOfBytesWrite == null) {
            if (other.sumNumberOfBytesWrite != null)
                return false;
        }
        else if (!this.sumNumberOfBytesWrite.equals(other.sumNumberOfBytesWrite))
            return false;
        if (this.countMisc == null) {
            if (other.countMisc != null)
                return false;
        }
        else if (!this.countMisc.equals(other.countMisc))
            return false;
        if (this.sumTimerMisc == null) {
            if (other.sumTimerMisc != null)
                return false;
        }
        else if (!this.sumTimerMisc.equals(other.sumTimerMisc))
            return false;
        if (this.minTimerMisc == null) {
            if (other.minTimerMisc != null)
                return false;
        }
        else if (!this.minTimerMisc.equals(other.minTimerMisc))
            return false;
        if (this.avgTimerMisc == null) {
            if (other.avgTimerMisc != null)
                return false;
        }
        else if (!this.avgTimerMisc.equals(other.avgTimerMisc))
            return false;
        if (this.maxTimerMisc == null) {
            if (other.maxTimerMisc != null)
                return false;
        }
        else if (!this.maxTimerMisc.equals(other.maxTimerMisc))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
        result = prime * result + ((this.countStar == null) ? 0 : this.countStar.hashCode());
        result = prime * result + ((this.sumTimerWait == null) ? 0 : this.sumTimerWait.hashCode());
        result = prime * result + ((this.minTimerWait == null) ? 0 : this.minTimerWait.hashCode());
        result = prime * result + ((this.avgTimerWait == null) ? 0 : this.avgTimerWait.hashCode());
        result = prime * result + ((this.maxTimerWait == null) ? 0 : this.maxTimerWait.hashCode());
        result = prime * result + ((this.countRead == null) ? 0 : this.countRead.hashCode());
        result = prime * result + ((this.sumTimerRead == null) ? 0 : this.sumTimerRead.hashCode());
        result = prime * result + ((this.minTimerRead == null) ? 0 : this.minTimerRead.hashCode());
        result = prime * result + ((this.avgTimerRead == null) ? 0 : this.avgTimerRead.hashCode());
        result = prime * result + ((this.maxTimerRead == null) ? 0 : this.maxTimerRead.hashCode());
        result = prime * result + ((this.sumNumberOfBytesRead == null) ? 0 : this.sumNumberOfBytesRead.hashCode());
        result = prime * result + ((this.countWrite == null) ? 0 : this.countWrite.hashCode());
        result = prime * result + ((this.sumTimerWrite == null) ? 0 : this.sumTimerWrite.hashCode());
        result = prime * result + ((this.minTimerWrite == null) ? 0 : this.minTimerWrite.hashCode());
        result = prime * result + ((this.avgTimerWrite == null) ? 0 : this.avgTimerWrite.hashCode());
        result = prime * result + ((this.maxTimerWrite == null) ? 0 : this.maxTimerWrite.hashCode());
        result = prime * result + ((this.sumNumberOfBytesWrite == null) ? 0 : this.sumNumberOfBytesWrite.hashCode());
        result = prime * result + ((this.countMisc == null) ? 0 : this.countMisc.hashCode());
        result = prime * result + ((this.sumTimerMisc == null) ? 0 : this.sumTimerMisc.hashCode());
        result = prime * result + ((this.minTimerMisc == null) ? 0 : this.minTimerMisc.hashCode());
        result = prime * result + ((this.avgTimerMisc == null) ? 0 : this.avgTimerMisc.hashCode());
        result = prime * result + ((this.maxTimerMisc == null) ? 0 : this.maxTimerMisc.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FileSummaryByEventName (");

        sb.append(eventName);
        sb.append(", ").append(countStar);
        sb.append(", ").append(sumTimerWait);
        sb.append(", ").append(minTimerWait);
        sb.append(", ").append(avgTimerWait);
        sb.append(", ").append(maxTimerWait);
        sb.append(", ").append(countRead);
        sb.append(", ").append(sumTimerRead);
        sb.append(", ").append(minTimerRead);
        sb.append(", ").append(avgTimerRead);
        sb.append(", ").append(maxTimerRead);
        sb.append(", ").append(sumNumberOfBytesRead);
        sb.append(", ").append(countWrite);
        sb.append(", ").append(sumTimerWrite);
        sb.append(", ").append(minTimerWrite);
        sb.append(", ").append(avgTimerWrite);
        sb.append(", ").append(maxTimerWrite);
        sb.append(", ").append(sumNumberOfBytesWrite);
        sb.append(", ").append(countMisc);
        sb.append(", ").append(sumTimerMisc);
        sb.append(", ").append(minTimerMisc);
        sb.append(", ").append(avgTimerMisc);
        sb.append(", ").append(maxTimerMisc);

        sb.append(")");
        return sb.toString();
    }
}
