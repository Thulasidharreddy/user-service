/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Indexes;
import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.enums.ErrorLogPrio;
import com.neurasim.jooq.performance_schema.tables.records.ErrorLogRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ErrorLog extends TableImpl<ErrorLogRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.error_log</code>
     */
    public static final ErrorLog ERROR_LOG = new ErrorLog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ErrorLogRecord> getRecordType() {
        return ErrorLogRecord.class;
    }

    /**
     * The column <code>performance_schema.error_log.LOGGED</code>.
     */
    public final TableField<ErrorLogRecord, LocalDateTime> LOGGED = createField(DSL.name("LOGGED"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "");

    /**
     * The column <code>performance_schema.error_log.THREAD_ID</code>.
     */
    public final TableField<ErrorLogRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.error_log.PRIO</code>.
     */
    public final TableField<ErrorLogRecord, ErrorLogPrio> PRIO = createField(DSL.name("PRIO"), SQLDataType.VARCHAR(7).nullable(false).asEnumDataType(com.neurasim.jooq.performance_schema.enums.ErrorLogPrio.class), this, "");

    /**
     * The column <code>performance_schema.error_log.ERROR_CODE</code>.
     */
    public final TableField<ErrorLogRecord, String> ERROR_CODE = createField(DSL.name("ERROR_CODE"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>performance_schema.error_log.SUBSYSTEM</code>.
     */
    public final TableField<ErrorLogRecord, String> SUBSYSTEM = createField(DSL.name("SUBSYSTEM"), SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>performance_schema.error_log.DATA</code>.
     */
    public final TableField<ErrorLogRecord, String> DATA = createField(DSL.name("DATA"), SQLDataType.CLOB.nullable(false), this, "");

    private ErrorLog(Name alias, Table<ErrorLogRecord> aliased) {
        this(alias, aliased, null);
    }

    private ErrorLog(Name alias, Table<ErrorLogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.error_log</code> table
     * reference
     */
    public ErrorLog(String alias) {
        this(DSL.name(alias), ERROR_LOG);
    }

    /**
     * Create an aliased <code>performance_schema.error_log</code> table
     * reference
     */
    public ErrorLog(Name alias) {
        this(alias, ERROR_LOG);
    }

    /**
     * Create a <code>performance_schema.error_log</code> table reference
     */
    public ErrorLog() {
        this(DSL.name("error_log"), null);
    }

    public <O extends Record> ErrorLog(Table<O> child, ForeignKey<O, ErrorLogRecord> key) {
        super(child, key, ERROR_LOG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ERROR_LOG_ERROR_CODE, Indexes.ERROR_LOG_PRIO, Indexes.ERROR_LOG_SUBSYSTEM, Indexes.ERROR_LOG_THREAD_ID);
    }

    @Override
    public UniqueKey<ErrorLogRecord> getPrimaryKey() {
        return Keys.KEY_ERROR_LOG_PRIMARY;
    }

    @Override
    public ErrorLog as(String alias) {
        return new ErrorLog(DSL.name(alias), this);
    }

    @Override
    public ErrorLog as(Name alias) {
        return new ErrorLog(alias, this);
    }

    @Override
    public ErrorLog as(Table<?> alias) {
        return new ErrorLog(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ErrorLog rename(String name) {
        return new ErrorLog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ErrorLog rename(Name name) {
        return new ErrorLog(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ErrorLog rename(Table<?> name) {
        return new ErrorLog(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<LocalDateTime, ULong, ErrorLogPrio, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super LocalDateTime, ? super ULong, ? super ErrorLogPrio, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super LocalDateTime, ? super ULong, ? super ErrorLogPrio, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
