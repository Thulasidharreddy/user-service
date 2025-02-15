/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.tables.records.TimeZoneTransitionRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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


/**
 * Time zone transitions
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransition extends TableImpl<TimeZoneTransitionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.time_zone_transition</code>
     */
    public static final TimeZoneTransition TIME_ZONE_TRANSITION = new TimeZoneTransition();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimeZoneTransitionRecord> getRecordType() {
        return TimeZoneTransitionRecord.class;
    }

    /**
     * The column <code>mysql.time_zone_transition.Time_zone_id</code>.
     */
    public final TableField<TimeZoneTransitionRecord, UInteger> TIME_ZONE_ID = createField(DSL.name("Time_zone_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>mysql.time_zone_transition.Transition_time</code>.
     */
    public final TableField<TimeZoneTransitionRecord, Long> TRANSITION_TIME = createField(DSL.name("Transition_time"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>mysql.time_zone_transition.Transition_type_id</code>.
     */
    public final TableField<TimeZoneTransitionRecord, UInteger> TRANSITION_TYPE_ID = createField(DSL.name("Transition_type_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private TimeZoneTransition(Name alias, Table<TimeZoneTransitionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimeZoneTransition(Name alias, Table<TimeZoneTransitionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Time zone transitions"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.time_zone_transition</code> table reference
     */
    public TimeZoneTransition(String alias) {
        this(DSL.name(alias), TIME_ZONE_TRANSITION);
    }

    /**
     * Create an aliased <code>mysql.time_zone_transition</code> table reference
     */
    public TimeZoneTransition(Name alias) {
        this(alias, TIME_ZONE_TRANSITION);
    }

    /**
     * Create a <code>mysql.time_zone_transition</code> table reference
     */
    public TimeZoneTransition() {
        this(DSL.name("time_zone_transition"), null);
    }

    public <O extends Record> TimeZoneTransition(Table<O> child, ForeignKey<O, TimeZoneTransitionRecord> key) {
        super(child, key, TIME_ZONE_TRANSITION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<TimeZoneTransitionRecord> getPrimaryKey() {
        return Keys.KEY_TIME_ZONE_TRANSITION_PRIMARY;
    }

    @Override
    public TimeZoneTransition as(String alias) {
        return new TimeZoneTransition(DSL.name(alias), this);
    }

    @Override
    public TimeZoneTransition as(Name alias) {
        return new TimeZoneTransition(alias, this);
    }

    @Override
    public TimeZoneTransition as(Table<?> alias) {
        return new TimeZoneTransition(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeZoneTransition rename(String name) {
        return new TimeZoneTransition(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeZoneTransition rename(Name name) {
        return new TimeZoneTransition(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeZoneTransition rename(Table<?> name) {
        return new TimeZoneTransition(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, Long, UInteger> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super UInteger, ? super Long, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super UInteger, ? super Long, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
