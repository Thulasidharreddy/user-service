/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.GtidExecuted;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GtidExecutedRecord extends UpdatableRecordImpl<GtidExecutedRecord> implements Record4<String, Long, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.gtid_executed.source_uuid</code>. uuid of the
     * source where the transaction was originally executed.
     */
    public GtidExecutedRecord setSourceUuid(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.gtid_executed.source_uuid</code>. uuid of the
     * source where the transaction was originally executed.
     */
    public String getSourceUuid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>mysql.gtid_executed.interval_start</code>. First number
     * of interval.
     */
    public GtidExecutedRecord setIntervalStart(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.gtid_executed.interval_start</code>. First number
     * of interval.
     */
    public Long getIntervalStart() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>mysql.gtid_executed.interval_end</code>. Last number of
     * interval.
     */
    public GtidExecutedRecord setIntervalEnd(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.gtid_executed.interval_end</code>. Last number of
     * interval.
     */
    public Long getIntervalEnd() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>mysql.gtid_executed.gtid_tag</code>. GTID Tag.
     */
    public GtidExecutedRecord setGtidTag(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.gtid_executed.gtid_tag</code>. GTID Tag.
     */
    public String getGtidTag() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<String, String, Long> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Long, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, Long, Long, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GtidExecuted.GTID_EXECUTED.SOURCE_UUID;
    }

    @Override
    public Field<Long> field2() {
        return GtidExecuted.GTID_EXECUTED.INTERVAL_START;
    }

    @Override
    public Field<Long> field3() {
        return GtidExecuted.GTID_EXECUTED.INTERVAL_END;
    }

    @Override
    public Field<String> field4() {
        return GtidExecuted.GTID_EXECUTED.GTID_TAG;
    }

    @Override
    public String component1() {
        return getSourceUuid();
    }

    @Override
    public Long component2() {
        return getIntervalStart();
    }

    @Override
    public Long component3() {
        return getIntervalEnd();
    }

    @Override
    public String component4() {
        return getGtidTag();
    }

    @Override
    public String value1() {
        return getSourceUuid();
    }

    @Override
    public Long value2() {
        return getIntervalStart();
    }

    @Override
    public Long value3() {
        return getIntervalEnd();
    }

    @Override
    public String value4() {
        return getGtidTag();
    }

    @Override
    public GtidExecutedRecord value1(String value) {
        setSourceUuid(value);
        return this;
    }

    @Override
    public GtidExecutedRecord value2(Long value) {
        setIntervalStart(value);
        return this;
    }

    @Override
    public GtidExecutedRecord value3(Long value) {
        setIntervalEnd(value);
        return this;
    }

    @Override
    public GtidExecutedRecord value4(String value) {
        setGtidTag(value);
        return this;
    }

    @Override
    public GtidExecutedRecord values(String value1, Long value2, Long value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GtidExecutedRecord
     */
    public GtidExecutedRecord() {
        super(GtidExecuted.GTID_EXECUTED);
    }

    /**
     * Create a detached, initialised GtidExecutedRecord
     */
    public GtidExecutedRecord(String sourceUuid, Long intervalStart, Long intervalEnd, String gtidTag) {
        super(GtidExecuted.GTID_EXECUTED);

        setSourceUuid(sourceUuid);
        setIntervalStart(intervalStart);
        setIntervalEnd(intervalEnd);
        setGtidTag(gtidTag);
    }

    /**
     * Create a detached, initialised GtidExecutedRecord
     */
    public GtidExecutedRecord(com.neurasim.jooq.mysql.tables.pojos.GtidExecuted value) {
        super(GtidExecuted.GTID_EXECUTED);

        if (value != null) {
            setSourceUuid(value.getSourceUuid());
            setIntervalStart(value.getIntervalStart());
            setIntervalEnd(value.getIntervalEnd());
            setGtidTag(value.getGtidTag());
        }
    }
}
