/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.KeyringComponentStatusRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeyringComponentStatus extends TableImpl<KeyringComponentStatusRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.keyring_component_status</code>
     */
    public static final KeyringComponentStatus KEYRING_COMPONENT_STATUS = new KeyringComponentStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KeyringComponentStatusRecord> getRecordType() {
        return KeyringComponentStatusRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.keyring_component_status.STATUS_KEY</code>.
     */
    public final TableField<KeyringComponentStatusRecord, String> STATUS_KEY = createField(DSL.name("STATUS_KEY"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.keyring_component_status.STATUS_VALUE</code>.
     */
    public final TableField<KeyringComponentStatusRecord, String> STATUS_VALUE = createField(DSL.name("STATUS_VALUE"), SQLDataType.VARCHAR(1024).nullable(false), this, "");

    private KeyringComponentStatus(Name alias, Table<KeyringComponentStatusRecord> aliased) {
        this(alias, aliased, null);
    }

    private KeyringComponentStatus(Name alias, Table<KeyringComponentStatusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.keyring_component_status</code> table reference
     */
    public KeyringComponentStatus(String alias) {
        this(DSL.name(alias), KEYRING_COMPONENT_STATUS);
    }

    /**
     * Create an aliased
     * <code>performance_schema.keyring_component_status</code> table reference
     */
    public KeyringComponentStatus(Name alias) {
        this(alias, KEYRING_COMPONENT_STATUS);
    }

    /**
     * Create a <code>performance_schema.keyring_component_status</code> table
     * reference
     */
    public KeyringComponentStatus() {
        this(DSL.name("keyring_component_status"), null);
    }

    public <O extends Record> KeyringComponentStatus(Table<O> child, ForeignKey<O, KeyringComponentStatusRecord> key) {
        super(child, key, KEYRING_COMPONENT_STATUS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public KeyringComponentStatus as(String alias) {
        return new KeyringComponentStatus(DSL.name(alias), this);
    }

    @Override
    public KeyringComponentStatus as(Name alias) {
        return new KeyringComponentStatus(alias, this);
    }

    @Override
    public KeyringComponentStatus as(Table<?> alias) {
        return new KeyringComponentStatus(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyringComponentStatus rename(String name) {
        return new KeyringComponentStatus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyringComponentStatus rename(Name name) {
        return new KeyringComponentStatus(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public KeyringComponentStatus rename(Table<?> name) {
        return new KeyringComponentStatus(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
