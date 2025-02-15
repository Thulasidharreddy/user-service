/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.enums.EventsTransactionsHistoryLongAccessMode;
import com.neurasim.jooq.performance_schema.enums.EventsTransactionsHistoryLongAutocommit;
import com.neurasim.jooq.performance_schema.enums.EventsTransactionsHistoryLongNestingEventType;
import com.neurasim.jooq.performance_schema.enums.EventsTransactionsHistoryLongState;
import com.neurasim.jooq.performance_schema.tables.EventsTransactionsHistoryLong;

import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsTransactionsHistoryLongRecord extends TableRecordImpl<EventsTransactionsHistoryLongRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.THREAD_ID</code>.
     */
    public EventsTransactionsHistoryLongRecord setThreadId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.EVENT_ID</code>.
     */
    public EventsTransactionsHistoryLongRecord setEventId(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.EVENT_ID</code>.
     */
    public ULong getEventId() {
        return (ULong) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.END_EVENT_ID</code>.
     */
    public EventsTransactionsHistoryLongRecord setEndEventId(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.END_EVENT_ID</code>.
     */
    public ULong getEndEventId() {
        return (ULong) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.EVENT_NAME</code>.
     */
    public EventsTransactionsHistoryLongRecord setEventName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.STATE</code>.
     */
    public EventsTransactionsHistoryLongRecord setState(EventsTransactionsHistoryLongState value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.STATE</code>.
     */
    public EventsTransactionsHistoryLongState getState() {
        return (EventsTransactionsHistoryLongState) get(4);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.TRX_ID</code>.
     */
    public EventsTransactionsHistoryLongRecord setTrxId(ULong value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.TRX_ID</code>.
     */
    public ULong getTrxId() {
        return (ULong) get(5);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.GTID</code>.
     */
    public EventsTransactionsHistoryLongRecord setGtid(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.GTID</code>.
     */
    public String getGtid() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.XID_FORMAT_ID</code>.
     */
    public EventsTransactionsHistoryLongRecord setXidFormatId(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.XID_FORMAT_ID</code>.
     */
    public Integer getXidFormatId() {
        return (Integer) get(7);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.XID_GTRID</code>.
     */
    public EventsTransactionsHistoryLongRecord setXidGtrid(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.XID_GTRID</code>.
     */
    public String getXidGtrid() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.XID_BQUAL</code>.
     */
    public EventsTransactionsHistoryLongRecord setXidBqual(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.XID_BQUAL</code>.
     */
    public String getXidBqual() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.XA_STATE</code>.
     */
    public EventsTransactionsHistoryLongRecord setXaState(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.XA_STATE</code>.
     */
    public String getXaState() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.SOURCE</code>.
     */
    public EventsTransactionsHistoryLongRecord setSource(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.SOURCE</code>.
     */
    public String getSource() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.TIMER_START</code>.
     */
    public EventsTransactionsHistoryLongRecord setTimerStart(ULong value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.TIMER_START</code>.
     */
    public ULong getTimerStart() {
        return (ULong) get(12);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.TIMER_END</code>.
     */
    public EventsTransactionsHistoryLongRecord setTimerEnd(ULong value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.TIMER_END</code>.
     */
    public ULong getTimerEnd() {
        return (ULong) get(13);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.TIMER_WAIT</code>.
     */
    public EventsTransactionsHistoryLongRecord setTimerWait(ULong value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.TIMER_WAIT</code>.
     */
    public ULong getTimerWait() {
        return (ULong) get(14);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.ACCESS_MODE</code>.
     */
    public EventsTransactionsHistoryLongRecord setAccessMode(EventsTransactionsHistoryLongAccessMode value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.ACCESS_MODE</code>.
     */
    public EventsTransactionsHistoryLongAccessMode getAccessMode() {
        return (EventsTransactionsHistoryLongAccessMode) get(15);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.ISOLATION_LEVEL</code>.
     */
    public EventsTransactionsHistoryLongRecord setIsolationLevel(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.ISOLATION_LEVEL</code>.
     */
    public String getIsolationLevel() {
        return (String) get(16);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.AUTOCOMMIT</code>.
     */
    public EventsTransactionsHistoryLongRecord setAutocommit(EventsTransactionsHistoryLongAutocommit value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.AUTOCOMMIT</code>.
     */
    public EventsTransactionsHistoryLongAutocommit getAutocommit() {
        return (EventsTransactionsHistoryLongAutocommit) get(17);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_SAVEPOINTS</code>.
     */
    public EventsTransactionsHistoryLongRecord setNumberOfSavepoints(ULong value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_SAVEPOINTS</code>.
     */
    public ULong getNumberOfSavepoints() {
        return (ULong) get(18);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public EventsTransactionsHistoryLongRecord setNumberOfRollbackToSavepoint(ULong value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_ROLLBACK_TO_SAVEPOINT</code>.
     */
    public ULong getNumberOfRollbackToSavepoint() {
        return (ULong) get(19);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public EventsTransactionsHistoryLongRecord setNumberOfReleaseSavepoint(ULong value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.NUMBER_OF_RELEASE_SAVEPOINT</code>.
     */
    public ULong getNumberOfReleaseSavepoint() {
        return (ULong) get(20);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public EventsTransactionsHistoryLongRecord setObjectInstanceBegin(ULong value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(21);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.NESTING_EVENT_ID</code>.
     */
    public EventsTransactionsHistoryLongRecord setNestingEventId(ULong value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.NESTING_EVENT_ID</code>.
     */
    public ULong getNestingEventId() {
        return (ULong) get(22);
    }

    /**
     * Setter for
     * <code>performance_schema.events_transactions_history_long.NESTING_EVENT_TYPE</code>.
     */
    public EventsTransactionsHistoryLongRecord setNestingEventType(EventsTransactionsHistoryLongNestingEventType value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_transactions_history_long.NESTING_EVENT_TYPE</code>.
     */
    public EventsTransactionsHistoryLongNestingEventType getNestingEventType() {
        return (EventsTransactionsHistoryLongNestingEventType) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsTransactionsHistoryLongRecord
     */
    public EventsTransactionsHistoryLongRecord() {
        super(EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG);
    }

    /**
     * Create a detached, initialised EventsTransactionsHistoryLongRecord
     */
    public EventsTransactionsHistoryLongRecord(ULong threadId, ULong eventId, ULong endEventId, String eventName, EventsTransactionsHistoryLongState state, ULong trxId, String gtid, Integer xidFormatId, String xidGtrid, String xidBqual, String xaState, String source, ULong timerStart, ULong timerEnd, ULong timerWait, EventsTransactionsHistoryLongAccessMode accessMode, String isolationLevel, EventsTransactionsHistoryLongAutocommit autocommit, ULong numberOfSavepoints, ULong numberOfRollbackToSavepoint, ULong numberOfReleaseSavepoint, ULong objectInstanceBegin, ULong nestingEventId, EventsTransactionsHistoryLongNestingEventType nestingEventType) {
        super(EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG);

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
     * Create a detached, initialised EventsTransactionsHistoryLongRecord
     */
    public EventsTransactionsHistoryLongRecord(com.neurasim.jooq.performance_schema.tables.pojos.EventsTransactionsHistoryLong value) {
        super(EventsTransactionsHistoryLong.EVENTS_TRANSACTIONS_HISTORY_LONG);

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
