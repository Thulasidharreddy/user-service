/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.enums.SetupConsumersEnabled;
import com.neurasim.jooq.performance_schema.tables.records.SetupConsumersRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetupConsumers extends TableImpl<SetupConsumersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.setup_consumers</code>
     */
    public static final SetupConsumers SETUP_CONSUMERS = new SetupConsumers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SetupConsumersRecord> getRecordType() {
        return SetupConsumersRecord.class;
    }

    /**
     * The column <code>performance_schema.setup_consumers.NAME</code>.
     */
    public final TableField<SetupConsumersRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>performance_schema.setup_consumers.ENABLED</code>.
     */
    public final TableField<SetupConsumersRecord, SetupConsumersEnabled> ENABLED = createField(DSL.name("ENABLED"), SQLDataType.VARCHAR(3).nullable(false).asEnumDataType(com.neurasim.jooq.performance_schema.enums.SetupConsumersEnabled.class), this, "");

    private SetupConsumers(Name alias, Table<SetupConsumersRecord> aliased) {
        this(alias, aliased, null);
    }

    private SetupConsumers(Name alias, Table<SetupConsumersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.setup_consumers</code> table
     * reference
     */
    public SetupConsumers(String alias) {
        this(DSL.name(alias), SETUP_CONSUMERS);
    }

    /**
     * Create an aliased <code>performance_schema.setup_consumers</code> table
     * reference
     */
    public SetupConsumers(Name alias) {
        this(alias, SETUP_CONSUMERS);
    }

    /**
     * Create a <code>performance_schema.setup_consumers</code> table reference
     */
    public SetupConsumers() {
        this(DSL.name("setup_consumers"), null);
    }

    public <O extends Record> SetupConsumers(Table<O> child, ForeignKey<O, SetupConsumersRecord> key) {
        super(child, key, SETUP_CONSUMERS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<SetupConsumersRecord> getPrimaryKey() {
        return Keys.KEY_SETUP_CONSUMERS_PRIMARY;
    }

    @Override
    public SetupConsumers as(String alias) {
        return new SetupConsumers(DSL.name(alias), this);
    }

    @Override
    public SetupConsumers as(Name alias) {
        return new SetupConsumers(alias, this);
    }

    @Override
    public SetupConsumers as(Table<?> alias) {
        return new SetupConsumers(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupConsumers rename(String name) {
        return new SetupConsumers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupConsumers rename(Name name) {
        return new SetupConsumers(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SetupConsumers rename(Table<?> name) {
        return new SetupConsumers(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, SetupConsumersEnabled> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super SetupConsumersEnabled, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super SetupConsumersEnabled, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
