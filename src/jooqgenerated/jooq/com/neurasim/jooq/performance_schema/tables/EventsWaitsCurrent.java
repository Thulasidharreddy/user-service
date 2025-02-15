/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.enums.EventsWaitsCurrentNestingEventType;
import com.neurasim.jooq.performance_schema.tables.records.EventsWaitsCurrentRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function19;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EventsWaitsCurrent extends TableImpl<EventsWaitsCurrentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.events_waits_current</code>
     */
    public static final EventsWaitsCurrent EVENTS_WAITS_CURRENT = new EventsWaitsCurrent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EventsWaitsCurrentRecord> getRecordType() {
        return EventsWaitsCurrentRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.events_waits_current.THREAD_ID</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> THREAD_ID = createField(DSL.name("THREAD_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_current.EVENT_ID</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> EVENT_ID = createField(DSL.name("EVENT_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.END_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> END_EVENT_ID = createField(DSL.name("END_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.EVENT_NAME</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, String> EVENT_NAME = createField(DSL.name("EVENT_NAME"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>performance_schema.events_waits_current.SOURCE</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, String> SOURCE = createField(DSL.name("SOURCE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.TIMER_START</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> TIMER_START = createField(DSL.name("TIMER_START"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.TIMER_END</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> TIMER_END = createField(DSL.name("TIMER_END"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.TIMER_WAIT</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> TIMER_WAIT = createField(DSL.name("TIMER_WAIT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>performance_schema.events_waits_current.SPINS</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, UInteger> SPINS = createField(DSL.name("SPINS"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_SCHEMA</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, String> OBJECT_SCHEMA = createField(DSL.name("OBJECT_SCHEMA"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_NAME</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, String> OBJECT_NAME = createField(DSL.name("OBJECT_NAME"), SQLDataType.VARCHAR(512), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.INDEX_NAME</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_TYPE</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, String> OBJECT_TYPE = createField(DSL.name("OBJECT_TYPE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.OBJECT_INSTANCE_BEGIN</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> OBJECT_INSTANCE_BEGIN = createField(DSL.name("OBJECT_INSTANCE_BEGIN"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.NESTING_EVENT_ID</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, ULong> NESTING_EVENT_ID = createField(DSL.name("NESTING_EVENT_ID"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.NESTING_EVENT_TYPE</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, EventsWaitsCurrentNestingEventType> NESTING_EVENT_TYPE = createField(DSL.name("NESTING_EVENT_TYPE"), SQLDataType.VARCHAR(11).asEnumDataType(com.neurasim.jooq.performance_schema.enums.EventsWaitsCurrentNestingEventType.class), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.OPERATION</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, String> OPERATION = createField(DSL.name("OPERATION"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.events_waits_current.NUMBER_OF_BYTES</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, Long> NUMBER_OF_BYTES = createField(DSL.name("NUMBER_OF_BYTES"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>performance_schema.events_waits_current.FLAGS</code>.
     */
    public final TableField<EventsWaitsCurrentRecord, UInteger> FLAGS = createField(DSL.name("FLAGS"), SQLDataType.INTEGERUNSIGNED, this, "");

    private EventsWaitsCurrent(Name alias, Table<EventsWaitsCurrentRecord> aliased) {
        this(alias, aliased, null);
    }

    private EventsWaitsCurrent(Name alias, Table<EventsWaitsCurrentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_current</code>
     * table reference
     */
    public EventsWaitsCurrent(String alias) {
        this(DSL.name(alias), EVENTS_WAITS_CURRENT);
    }

    /**
     * Create an aliased <code>performance_schema.events_waits_current</code>
     * table reference
     */
    public EventsWaitsCurrent(Name alias) {
        this(alias, EVENTS_WAITS_CURRENT);
    }

    /**
     * Create a <code>performance_schema.events_waits_current</code> table
     * reference
     */
    public EventsWaitsCurrent() {
        this(DSL.name("events_waits_current"), null);
    }

    public <O extends Record> EventsWaitsCurrent(Table<O> child, ForeignKey<O, EventsWaitsCurrentRecord> key) {
        super(child, key, EVENTS_WAITS_CURRENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<EventsWaitsCurrentRecord> getPrimaryKey() {
        return Keys.KEY_EVENTS_WAITS_CURRENT_PRIMARY;
    }

    @Override
    public EventsWaitsCurrent as(String alias) {
        return new EventsWaitsCurrent(DSL.name(alias), this);
    }

    @Override
    public EventsWaitsCurrent as(Name alias) {
        return new EventsWaitsCurrent(alias, this);
    }

    @Override
    public EventsWaitsCurrent as(Table<?> alias) {
        return new EventsWaitsCurrent(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsCurrent rename(String name) {
        return new EventsWaitsCurrent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsCurrent rename(Name name) {
        return new EventsWaitsCurrent(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public EventsWaitsCurrent rename(Table<?> name) {
        return new EventsWaitsCurrent(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<ULong, ULong, ULong, String, String, ULong, ULong, ULong, UInteger, String, String, String, String, ULong, ULong, EventsWaitsCurrentNestingEventType, String, Long, UInteger> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super UInteger, ? super String, ? super String, ? super String, ? super String, ? super ULong, ? super ULong, ? super EventsWaitsCurrentNestingEventType, ? super String, ? super Long, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super ULong, ? super ULong, ? super ULong, ? super String, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super UInteger, ? super String, ? super String, ? super String, ? super String, ? super ULong, ? super ULong, ? super EventsWaitsCurrentNestingEventType, ? super String, ? super Long, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
