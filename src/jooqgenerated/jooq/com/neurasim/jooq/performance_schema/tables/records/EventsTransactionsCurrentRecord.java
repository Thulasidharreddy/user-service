/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.enums.EventsTransactionsCurrentAccessMode;
import com.neurasim.jooq.performance_schema.enums.EventsTransactionsCurrentAutocommit;
import com.neurasim.jooq.performance_schema.enums.EventsTransactionsCurrentNestingEventType;
import com.neurasim.jooq.performance_schema.enums.EventsTransactionsCurrentState;
import com.neurasim.jooq.performance_schema.tables.EventsTransactionsCurrent;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsTransactionsCurrentRecord extends UpdatableRecordImpl<EventsTransactionsCurrentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.THREAD_ID</code>.
     */
    public EventsTransactionsCurrentRecord setThreadId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.EVENT_ID</code>.
     */
    public EventsTransactionsCurrentRecord setEventId(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.EVENT_ID</code>.
     */
    public ULong getEventId() {
        return (ULong) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.END_EVENT_ID</code>.
     */
    public EventsTransactionsCurrentRecord setEndEventId(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.END_EVENT_ID</code>.
     */
    public ULong getEndEventId() {
        return (ULong) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.EVENT_NAME</code>.
     */
    public EventsTransactionsCurrentRecord setEventName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.STATE</code>.
     */
    public EventsTransactionsCurrentRecord setState(EventsTransactionsCurrentState value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.STATE</code>.
     */
    public EventsTransactionsCurrentState getState() {
        return (EventsTransactionsCurrentState) get(4);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.TRX_ID</code>.
     */
    public EventsTransactionsCurrentRecord setTrxId(ULong value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.TRX_ID</code>.
     */
    public ULong getTrxId() {
        return (ULong) get(5);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.GTID</code>.
     */
    public EventsTransactionsCurrentRecord setGtid(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.GTID</code>.
     */
    public String getGtid() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.XID_FORMAT_ID</code>.
     */
    public EventsTransactionsCurrentRecord setXidFormatId(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.XID_FORMAT_ID</code>.
     */
    public Integer getXidFormatId() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.XID_GTRID</code>.
     */
    public EventsTransactionsCurrentRecord setXidGtrid(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.XID_GTRID</code>.
     */
    public String getXidGtrid() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.XID_BQUAL</code>.
     */
    public EventsTransactionsCurrentRecord setXidBqual(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.XID_BQUAL</code>.
     */
    public String getXidBqual() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.XA_STATE</code>.
     */
    public EventsTransactionsCurrentRecord setXaState(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.XA_STATE</code>.
     */
    public String getXaState() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.SOURCE</code>.
     */
    public EventsTransactionsCurrentRecord setSource(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.SOURCE</code>.
     */
    public String getSource() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.TIMER_START</code>.
     */
    public EventsTransactionsCurrentRecord setTimerStart(ULong value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.TIMER_START</code>.
     */
    public ULong getTimerStart() {
        return (ULong) get(12);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.TIMER_END</code>.
     */
    public EventsTransactionsCurrentRecord setTimerEnd(ULong value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.TIMER_END</code>.
     */
    public ULong getTimerEnd() {
        return (ULong) get(13);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.TIMER_WAIT</code>.
     */
    public EventsTransactionsCurrentRecord setTimerWait(ULong value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.TIMER_WAIT</code>.
     */
    public ULong getTimerWait() {
        return (ULong) get(14);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.ACCESS_MODE</code>.
     */
    public EventsTransactionsCurrentRecord setAccessMode(EventsTransactionsCurrentAccessMode value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.ACCESS_MODE</code>.
     */
    public EventsTransactionsCurrentAccessMode getAccessMode() {
        return (EventsTransactionsCurrentAccessMode) get(15);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.ISOLATION_LEVEL</code>.
     */
    public EventsTransactionsCurrentRecord setIsolationLevel(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.ISOLATION_LEVEL</code>.
     */
    public String getIsolationLevel() {
        return (String) get(16);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.AUTOCOMMIT</code>.
     */
    public EventsTransactionsCurrentRecord setAutocommit(EventsTransactionsCurrentAutocommit value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.AUTOCOMMIT</code>.
     */
    public EventsTransactionsCurrentAutocommit getAutocommit() {
        return (EventsTransactionsCurrentAutocommit) get(17);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.NUMBER_OF_SAVEPOINTS</code>.
     */
    public EventsTransactionsCurrentRecord setNumberOfSavepoints(ULong value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.NUMBER_OF_SAVEPOINTS</code>.
     */
    public ULong getNumberOfSavepoints() {
        return (ULong) get(18);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public EventsTransactionsCurrentRecord setNumberOfRollbackToSavepoint(ULong value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public ULong getNumberOfRollbackToSavepoint() {
        return (ULong) get(19);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public EventsTransactionsCurrentRecord setNumberOfReleaseSavepoint(ULong value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public ULong getNumberOfReleaseSavepoint() {
        return (ULong) get(20);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public EventsTransactionsCurrentRecord setObjectInstanceBegin(ULong value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(21);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.NESTING_EVENT_ID</code>.
     */
    public EventsTransactionsCurrentRecord setNestingEventId(ULong value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.NESTING_EVENT_ID</code>.
     */
    public ULong getNestingEventId() {
        return (ULong) get(22);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_current.NESTING_EVENT_TYPE</code>.
     */
    public EventsTransactionsCurrentRecord setNestingEventType(EventsTransactionsCurrentNestingEventType value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_current.NESTING_EVENT_TYPE</code>.
     */
    public EventsTransactionsCurrentNestingEventType getNestingEventType() {
        return (EventsTransactionsCurrentNestingEventType) get(23);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<ULong, ULong> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsTransactionsCurrentRecord
     */
    public EventsTransactionsCurrentRecord() {
        super(EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT);
    }

    /**
     * Create a detached, initialised EventsTransactionsCurrentRecord
     */
    public EventsTransactionsCurrentRecord(ULong threadId, ULong eventId, ULong endEventId, String eventName, EventsTransactionsCurrentState state, ULong trxId, String gtid, Integer xidFormatId, String xidGtrid, String xidBqual, String xaState, String source, ULong timerStart, ULong timerEnd, ULong timerWait, EventsTransactionsCurrentAccessMode accessMode, String isolationLevel, EventsTransactionsCurrentAutocommit autocommit, ULong numberOfSavepoints, ULong numberOfRollbackToSavepoint, ULong numberOfReleaseSavepoint, ULong objectInstanceBegin, ULong nestingEventId, EventsTransactionsCurrentNestingEventType nestingEventType) {
        super(EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT);

        setThreadId(threadId);
        setEventId(eventId);
        setEndEventId(endEventId);
        setEventName(eventName);
        setState(state);
        setTrxId(trxId);
        setGtid(gtid);
        setXidFormatId(xidFormatId);
        setXidGtrid(xidGtrid);
        setXidBqual(xidBqual);
        setXaState(xaState);
        setSource(source);
        setTimerStart(timerStart);
        setTimerEnd(timerEnd);
        setTimerWait(timerWait);
        setAccessMode(accessMode);
        setIsolationLevel(isolationLevel);
        setAutocommit(autocommit);
        setNumberOfSavepoints(numberOfSavepoints);
        setNumberOfRollbackToSavepoint(numberOfRollbackToSavepoint);
        setNumberOfReleaseSavepoint(numberOfReleaseSavepoint);
        setObjectInstanceBegin(objectInstanceBegin);
        setNestingEventId(nestingEventId);
        setNestingEventType(nestingEventType);
    }

    /**
     * Create a detached, initialised EventsTransactionsCurrentRecord
     */
    public EventsTransactionsCurrentRecord(com.neurasim.jooq.performance_schema.tables.pojos.EventsTransactionsCurrent value) {
        super(EventsTransactionsCurrent.EVENTS_TRANSACTIONS_CURRENT);

        if (value != null) {
            setThreadId(value.getThreadId());
            setEventId(value.getEventId());
            setEndEventId(value.getEndEventId());
            setEventName(value.getEventName());
            setState(value.getState());
            setTrxId(value.getTrxId());
            setGtid(value.getGtid());
            setXidFormatId(value.getXidFormatId());
            setXidGtrid(value.getXidGtrid());
            setXidBqual(value.getXidBqual());
            setXaState(value.getXaState());
            setSource(value.getSource());
            setTimerStart(value.getTimerStart());
            setTimerEnd(value.getTimerEnd());
            setTimerWait(value.getTimerWait());
            setAccessMode(value.getAccessMode());
            setIsolationLevel(value.getIsolationLevel());
            setAutocommit(value.getAutocommit());
            setNumberOfSavepoints(value.getNumberOfSavepoints());
            setNumberOfRollbackToSavepoint(value.getNumberOfRollbackToSavepoint());
            setNumberOfReleaseSavepoint(value.getNumberOfReleaseSavepoint());
            setObjectInstanceBegin(value.getObjectInstanceBegin());
            setNestingEventId(value.getNestingEventId());
            setNestingEventType(value.getNestingEventType());
        }
    }
}
