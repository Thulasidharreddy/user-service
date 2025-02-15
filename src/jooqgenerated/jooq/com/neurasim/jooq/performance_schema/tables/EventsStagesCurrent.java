/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.enums.EventsStagesCurrentNestingEventType;
import com.neurasim.jooq.performance_schema.tables.records.EventsStagesCurrentRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
public class EventsStagesCurrent extends TableImpl<EventsStagesCurrentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.events_stages_current</code>
     */
    public static final EventsStagesCurrent EVENTS_STAGES_CURRENT = new EventsStagesCurrent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsStagesCurrentRecord> getRecordType() {
        return EventsStagesCurrentRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.events_stages_current.THREAD_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.EVENT_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.END_EVENT_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.EVENT_NAME</code>.
     */
    public final TableField<EventsStagesCurrentRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_stages_current.SOURCE</code>.
     */
    public final TableField<EventsStagesCurrentRecord, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.TIMER_START</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> TIMER_START = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.TIMER_END</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> TIMER_END = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.TIMER_WAIT</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.WORK_COMPLETED</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> WORK_COMPLETED = createField(DSL.name("WORK_COMPLETED"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.WORK_ESTIMATED</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> WORK_ESTIMATED = createField(DSL.name("WORK_ESTIMATED"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsStagesCurrentRecord, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_stages_current.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsStagesCurrentRecord, EventsStagesCurrentNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(com.neurasim.jooq.performance_schema.enums.EventsStagesCurrentNestingEventType.class), this, "");

    private EventsStagesCurrent(Name alias, Table<EventsStagesCurrentRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsStagesCurrent(Name alias, Table<EventsStagesCurrentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_current</code>
     * table reference
     */
    public EventsStagesCurrent(String alias) {
        this(DSL.name(alias), EVENTS_STAGES_CURRENT);
    }

    /**
     * Create an aliased <code>performance_schema.events_stages_current</code>
     * table reference
     */
    public EventsStagesCurrent(Name alias) {
        this(alias, EVENTS_STAGES_CURRENT);
    }

    /**
     * Create a <code>performance_schema.events_stages_current</code> table
     * reference
     */
    public EventsStagesCurrent() {
        this(DSL.name("events_stages_current"), null);
    }

    public <O extends Record> EventsStagesCurrent(Table<O> child, ForeignKey<O, EventsStagesCurrentRecord> key) {
        super(child, key, EVENTS_STAGES_CURRENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<EventsStagesCurrentRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_STAGES_CURRENT_PRIMARY;
    }

    @Override
    public EventsStagesCurrent as(String alias) {
        return new EventsStagesCurrent(DSL.name(alias), this);
    }

    @Override
    public EventsStagesCurrent as(Name alias) {
        return new EventsStagesCurrent(alias, this);
    }

    @Override
    public EventsStagesCurrent as(Table<?> alias) {
        return new EventsStagesCurrent(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesCurrent rename(String name) {
        return new EventsStagesCurrent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesCurrent rename(Name name) {
        return new EventsStagesCurrent(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsStagesCurrent rename(Table<?> name) {
        return new EventsStagesCurrent(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<ULong, ULong, ULong, String, String, ULong, ULong, ULong, ULong, ULong, ULong, EventsStagesCurrentNestingEventType> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super EventsStagesCurrentNestingEventType, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super EventsStagesCurrentNestingEventType, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
