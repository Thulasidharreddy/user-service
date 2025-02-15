/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.OptimizerTrace;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OptimizerTraceRecord extends TableRecordImpl<OptimizerTraceRecord> implements Record4<String, String, Integer, Byte> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.OPTIMIZER_TRACE.QUERY</code>.
     */
    public OptimizerTraceRecord setQuery(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.OPTIMIZER_TRACE.QUERY</code>.
     */
    public String getQuery() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.OPTIMIZER_TRACE.TRACE</code>.
     */
    public OptimizerTraceRecord setTrace(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.OPTIMIZER_TRACE.TRACE</code>.
     */
    public String getTrace() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE</code>.
     */
    public OptimizerTraceRecord setMissingBytesBeyondMaxMemSize(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE</code>.
     */
    public Integer getMissingBytesBeyondMaxMemSize() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES</code>.
     */
    public OptimizerTraceRecord setInsufficientPrivileges(Byte value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES</code>.
     */
    public Byte getInsufficientPrivileges() {
        return (Byte) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Integer, Byte> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Integer, Byte> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return OptimizerTrace.OPTIMIZER_TRACE.QUERY;
    }

    @Override
    public Field<String> field2() {
        return OptimizerTrace.OPTIMIZER_TRACE.TRACE;
    }

    @Override
    public Field<Integer> field3() {
        return OptimizerTrace.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE;
    }

    @Override
    public Field<Byte> field4() {
        return OptimizerTrace.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES;
    }

    @Override
    public String component1() {
        return getQuery();
    }

    @Override
    public String component2() {
        return getTrace();
    }

    @Override
    public Integer component3() {
        return getMissingBytesBeyondMaxMemSize();
    }

    @Override
    public Byte component4() {
        return getInsufficientPrivileges();
    }

    @Override
    public String value1() {
        return getQuery();
    }

    @Override
    public String value2() {
        return getTrace();
    }

    @Override
    public Integer value3() {
        return getMissingBytesBeyondMaxMemSize();
    }

    @Override
    public Byte value4() {
        return getInsufficientPrivileges();
    }

    @Override
    public OptimizerTraceRecord value1(String value) {
        setQuery(value);
        return this;
    }

    @Override
    public OptimizerTraceRecord value2(String value) {
        setTrace(value);
        return this;
    }

    @Override
    public OptimizerTraceRecord value3(Integer value) {
        setMissingBytesBeyondMaxMemSize(value);
        return this;
    }

    @Override
    public OptimizerTraceRecord value4(Byte value) {
        setInsufficientPrivileges(value);
        return this;
    }

    @Override
    public OptimizerTraceRecord values(String value1, String value2, Integer value3, Byte value4) {
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
     * Create a detached OptimizerTraceRecord
     */
    public OptimizerTraceRecord() {
        super(OptimizerTrace.OPTIMIZER_TRACE);
    }

    /**
     * Create a detached, initialised OptimizerTraceRecord
     */
    public OptimizerTraceRecord(String query, String trace, Integer missingBytesBeyondMaxMemSize, Byte insufficientPrivileges) {
        super(OptimizerTrace.OPTIMIZER_TRACE);

        setQuery(query);
        setTrace(trace);
        setMissingBytesBeyondMaxMemSize(missingBytesBeyondMaxMemSize);
        setInsufficientPrivileges(insufficientPrivileges);
    }

    /**
     * Create a detached, initialised OptimizerTraceRecord
     */
    public OptimizerTraceRecord(com.neurasim.jooq.information_schema.tables.pojos.OptimizerTrace value) {
        super(OptimizerTrace.OPTIMIZER_TRACE);

        if (value != null) {
            setQuery(value.getQuery());
            setTrace(value.getTrace());
            setMissingBytesBeyondMaxMemSize(value.getMissingBytesBeyondMaxMemSize());
            setInsufficientPrivileges(value.getInsufficientPrivileges());
        }
    }
}
