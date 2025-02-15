/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.enums.EventsStatementsSummaryByProgramObjectType;
import com.neurasim.jooq.performance_schema.tables.records.EventsStatementsSummaryByProgramRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
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
public class EventsStatementsSummaryByProgram extends TableImpl<EventsStatementsSummaryByProgramRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.events_statements_summary_by_program</code>
     */
    public static final EventsStatementsSummaryByProgram EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM = new EventsStatementsSummaryByProgram();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStatementsSummaryByProgramRecord> getRecordType() {
        return EventsStatementsSummaryByProgramRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.OBJECT_TYPE</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, EventsStatementsSummaryByProgramObjectType> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(9).nullable(false).asEnumDataType(com.neurasim.jooq.performance_schema.enums.EventsStatementsSummaryByProgramObjectType.class), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.OBJECT_NAME</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.COUNT_STAR</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> COUNT_STAR = createField(DSL.name("COUNT_STAR"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_TIMER_WAIT = createField(DSL.name("SUM_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.MIN_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> MIN_TIMER_WAIT = createField(DSL.name("MIN_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.AVG_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> AVG_TIMER_WAIT = createField(DSL.name("AVG_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.MAX_TIMER_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> MAX_TIMER_WAIT = createField(DSL.name("MAX_TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.COUNT_STATEMENTS</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> COUNT_STATEMENTS = createField(DSL.name("COUNT_STATEMENTS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_STATEMENTS_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_STATEMENTS_WAIT = createField(DSL.name("SUM_STATEMENTS_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.MIN_STATEMENTS_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> MIN_STATEMENTS_WAIT = createField(DSL.name("MIN_STATEMENTS_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.AVG_STATEMENTS_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> AVG_STATEMENTS_WAIT = createField(DSL.name("AVG_STATEMENTS_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.MAX_STATEMENTS_WAIT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> MAX_STATEMENTS_WAIT = createField(DSL.name("MAX_STATEMENTS_WAIT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_LOCK_TIME</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_LOCK_TIME = createField(DSL.name("SUM_LOCK_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_ERRORS</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_ERRORS = createField(DSL.name("SUM_ERRORS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_WARNINGS</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_WARNINGS = createField(DSL.name("SUM_WARNINGS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_AFFECTED</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_ROWS_AFFECTED = createField(DSL.name("SUM_ROWS_AFFECTED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_SENT</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_ROWS_SENT = createField(DSL.name("SUM_ROWS_SENT"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_ROWS_EXAMINED</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_ROWS_EXAMINED = createField(DSL.name("SUM_ROWS_EXAMINED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_CREATED_TMP_DISK_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_CREATED_TMP_DISK_TABLES = createField(DSL.name("SUM_CREATED_TMP_DISK_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_CREATED_TMP_TABLES</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_CREATED_TMP_TABLES = createField(DSL.name("SUM_CREATED_TMP_TABLES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_FULL_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SELECT_FULL_JOIN = createField(DSL.name("SUM_SELECT_FULL_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_FULL_RANGE_JOIN</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SELECT_FULL_RANGE_JOIN = createField(DSL.name("SUM_SELECT_FULL_RANGE_JOIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SELECT_RANGE = createField(DSL.name("SUM_SELECT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_RANGE_CHECK</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SELECT_RANGE_CHECK = createField(DSL.name("SUM_SELECT_RANGE_CHECK"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SELECT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SELECT_SCAN = createField(DSL.name("SUM_SELECT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SORT_MERGE_PASSES</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SORT_MERGE_PASSES = createField(DSL.name("SUM_SORT_MERGE_PASSES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SORT_RANGE</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SORT_RANGE = createField(DSL.name("SUM_SORT_RANGE"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SORT_ROWS</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SORT_ROWS = createField(DSL.name("SUM_SORT_ROWS"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_SORT_SCAN</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_SORT_SCAN = createField(DSL.name("SUM_SORT_SCAN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_NO_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_NO_INDEX_USED = createField(DSL.name("SUM_NO_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_NO_GOOD_INDEX_USED</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_NO_GOOD_INDEX_USED = createField(DSL.name("SUM_NO_GOOD_INDEX_USED"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.SUM_CPU_TIME</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> SUM_CPU_TIME = createField(DSL.name("SUM_CPU_TIME"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.MAX_CONTROLLED_MEMORY</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> MAX_CONTROLLED_MEMORY = createField(DSL.name("MAX_CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.MAX_TOTAL_MEMORY</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> MAX_TOTAL_MEMORY = createField(DSL.name("MAX_TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_statements_summary_by_program.COUNT_SECONDARY</code>.
     */
    public final TableField<EventsStatementsSummaryByProgramRecord, ULong> COUNT_SECONDARY = createField(DSL.name("COUNT_SECONDARY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private EventsStatementsSummaryByProgram(Name alias, Table<EventsStatementsSummaryByProgramRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStatementsSummaryByProgram(Name alias, Table<EventsStatementsSummaryByProgramRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_summary_by_program</code>
     * table reference
     */
    public EventsStatementsSummaryByProgram(String alias) {
        this(DSL.name(alias), EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM);
    }

    /**
     * Create an aliased
     * <code>performance_schema.events_statements_summary_by_program</code>
     * table reference
     */
    public EventsStatementsSummaryByProgram(Name alias) {
        this(alias, EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM);
    }

    /**
     * Create a
     * <code>performance_schema.events_statements_summary_by_program</code>
     * table reference
     */
    public EventsStatementsSummaryByProgram() {
        this(DSL.name("events_statements_summary_by_program"), null);
    }

    public <O extends Record> EventsStatementsSummaryByProgram(Table<O> child, ForeignKey<O, EventsStatementsSummaryByProgramRecord> key) {
        super(child, key, EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<EventsStatementsSummaryByProgramRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_STATEMENTS_SUMMARY_BY_PROGRAM_PRIMARY;
    }

    @Override
    public EventsStatementsSummaryByProgram as(String alias) {
        return new EventsStatementsSummaryByProgram(DSL.name(alias), this);
    }

    @Override
    public EventsStatementsSummaryByProgram as(Name alias) {
        return new EventsStatementsSummaryByProgram(alias, this);
    }

    @Override
    public EventsStatementsSummaryByProgram as(Table<?> alias) {
        return new EventsStatementsSummaryByProgram(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryByProgram rename(String name) {
        return new EventsStatementsSummaryByProgram(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryByProgram rename(Name name) {
        return new EventsStatementsSummaryByProgram(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStatementsSummaryByProgram rename(Table<?> name) {
        return new EventsStatementsSummaryByProgram(name.getQualifiedName(), null);
    }
}
