/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.EventsErrorsSummaryGlobalByError;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsErrorsSummaryGlobalByErrorRecord extends TableRecordImpl<EventsErrorsSummaryGlobalByErrorRecord> implements Record7<Integer, String, String, ULong, ULong, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.events_errors_summary_global_by_error.ERROR_NUMBER</code>.
     */
    public EventsErrorsSummaryGlobalByErrorRecord setErrorNumber(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.ERROR_NUMBER</code>.
     */
    public Integer getErrorNumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.events_errors_summary_global_by_error.ERROR_NAME</code>.
     */
    public EventsErrorsSummaryGlobalByErrorRecord setErrorName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.ERROR_NAME</code>.
     */
    public String getErrorName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.events_errors_summary_global_by_error.SQL_STATE</code>.
     */
    public EventsErrorsSummaryGlobalByErrorRecord setSqlState(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.SQL_STATE</code>.
     */
    public String getSqlState() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.events_errors_summary_global_by_error.SUM_ERROR_RAISED</code>.
     */
    public EventsErrorsSummaryGlobalByErrorRecord setSumErrorRaised(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.SUM_ERROR_RAISED</code>.
     */
    public ULong getSumErrorRaised() {
        return (ULong) get(3);
    }

    /**
     * Setter for
     * <code>performance_schema.events_errors_summary_global_by_error.SUM_ERROR_HANDLED</code>.
     */
    public EventsErrorsSummaryGlobalByErrorRecord setSumErrorHandled(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.SUM_ERROR_HANDLED</code>.
     */
    public ULong getSumErrorHandled() {
        return (ULong) get(4);
    }

    /**
     * Setter for
     * <code>performance_schema.events_errors_summary_global_by_error.FIRST_SEEN</code>.
     */
    public EventsErrorsSummaryGlobalByErrorRecord setFirstSeen(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.FIRST_SEEN</code>.
     */
    public LocalDateTime getFirstSeen() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for
     * <code>performance_schema.events_errors_summary_global_by_error.LAST_SEEN</code>.
     */
    public EventsErrorsSummaryGlobalByErrorRecord setLastSeen(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.events_errors_summary_global_by_error.LAST_SEEN</code>.
     */
    public LocalDateTime getLastSeen() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, String, ULong, ULong, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, String, String, ULong, ULong, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR.ERROR_NUMBER;
    }

    @Override
    public Field<String> field2() {
        return EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR.ERROR_NAME;
    }

    @Override
    public Field<String> field3() {
        return EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR.SQL_STATE;
    }

    @Override
    public Field<ULong> field4() {
        return EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR.SUM_ERROR_RAISED;
    }

    @Override
    public Field<ULong> field5() {
        return EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR.SUM_ERROR_HANDLED;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR.FIRST_SEEN;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR.LAST_SEEN;
    }

    @Override
    public Integer component1() {
        return getErrorNumber();
    }

    @Override
    public String component2() {
        return getErrorName();
    }

    @Override
    public String component3() {
        return getSqlState();
    }

    @Override
    public ULong component4() {
        return getSumErrorRaised();
    }

    @Override
    public ULong component5() {
        return getSumErrorHandled();
    }

    @Override
    public LocalDateTime component6() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime component7() {
        return getLastSeen();
    }

    @Override
    public Integer value1() {
        return getErrorNumber();
    }

    @Override
    public String value2() {
        return getErrorName();
    }

    @Override
    public String value3() {
        return getSqlState();
    }

    @Override
    public ULong value4() {
        return getSumErrorRaised();
    }

    @Override
    public ULong value5() {
        return getSumErrorHandled();
    }

    @Override
    public LocalDateTime value6() {
        return getFirstSeen();
    }

    @Override
    public LocalDateTime value7() {
        return getLastSeen();
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord value1(Integer value) {
        setErrorNumber(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord value2(String value) {
        setErrorName(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord value3(String value) {
        setSqlState(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord value4(ULong value) {
        setSumErrorRaised(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord value5(ULong value) {
        setSumErrorHandled(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord value6(LocalDateTime value) {
        setFirstSeen(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord value7(LocalDateTime value) {
        setLastSeen(value);
        return this;
    }

    @Override
    public EventsErrorsSummaryGlobalByErrorRecord values(Integer value1, String value2, String value3, ULong value4, ULong value5, LocalDateTime value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EventsErrorsSummaryGlobalByErrorRecord
     */
    public EventsErrorsSummaryGlobalByErrorRecord() {
        super(EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR);
    }

    /**
     * Create a detached, initialised EventsErrorsSummaryGlobalByErrorRecord
     */
    public EventsErrorsSummaryGlobalByErrorRecord(Integer errorNumber, String errorName, String sqlState, ULong sumErrorRaised, ULong sumErrorHandled, LocalDateTime firstSeen, LocalDateTime lastSeen) {
        super(EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR);

        setErrorNumber(errorNumber);
        setErrorName(errorName);
        setSqlState(sqlState);
        setSumErrorRaised(sumErrorRaised);
        setSumErrorHandled(sumErrorHandled);
        setFirstSeen(firstSeen);
        setLastSeen(lastSeen);
    }

    /**
     * Create a detached, initialised EventsErrorsSummaryGlobalByErrorRecord
     */
    public EventsErrorsSummaryGlobalByErrorRecord(com.neurasim.jooq.performance_schema.tables.pojos.EventsErrorsSummaryGlobalByError value) {
        super(EventsErrorsSummaryGlobalByError.EVENTS_ERRORS_SUMMARY_GLOBAL_BY_ERROR);

        if (value != null) {
            setErrorNumber(value.getErrorNumber());
            setErrorName(value.getErrorName());
            setSqlState(value.getSqlState());
            setSumErrorRaised(value.getSumErrorRaised());
            setSumErrorHandled(value.getSumErrorHandled());
            setFirstSeen(value.getFirstSeen());
            setLastSeen(value.getLastSeen());
        }
    }
}
