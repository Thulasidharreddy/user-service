/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.SessionConnectAttrsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
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
public class SessionConnectAttrs extends TableImpl<SessionConnectAttrsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.session_connect_attrs</code>
     */
    public static final SessionConnectAttrs SESSION_CONNECT_ATTRS = new SessionConnectAttrs();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionConnectAttrsRecord> getRecordType() {
        return SessionConnectAttrsRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.PROCESSLIST_ID</code>.
     */
    public final TableField<SessionConnectAttrsRecord, ULong> PROCESSLIST_ID = createField(DSL.name("PROCESSLIST_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.ATTR_NAME</code>.
     */
    public final TableField<SessionConnectAttrsRecord, String> ATTR_NAME = createField(DSL.name("ATTR_NAME"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.ATTR_VALUE</code>.
     */
    public final TableField<SessionConnectAttrsRecord, String> ATTR_VALUE = createField(DSL.name("ATTR_VALUE"), SQLDataType.VARCHAR(1024), this, "");

    /**
     * The column
     * <code>performance_schema.session_connect_attrs.ORDINAL_POSITION</code>.
     */
    public final TableField<SessionConnectAttrsRecord, Integer> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGER, this, "");

    private SessionConnectAttrs(Name alias, Table<SessionConnectAttrsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SessionConnectAttrs(Name alias, Table<SessionConnectAttrsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.session_connect_attrs</code>
     * table reference
     */
    public SessionConnectAttrs(String alias) {
        this(DSL.name(alias), SESSION_CONNECT_ATTRS);
    }

    /**
     * Create an aliased <code>performance_schema.session_connect_attrs</code>
     * table reference
     */
    public SessionConnectAttrs(Name alias) {
        this(alias, SESSION_CONNECT_ATTRS);
    }

    /**
     * Create a <code>performance_schema.session_connect_attrs</code> table
     * reference
     */
    public SessionConnectAttrs() {
        this(DSL.name("session_connect_attrs"), null);
    }

    public <O extends Record> SessionConnectAttrs(Table<O> child, ForeignKey<O, SessionConnectAttrsRecord> key) {
        super(child, key, SESSION_CONNECT_ATTRS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public UniqueKey<SessionConnectAttrsRecord> getPrimaryKey() {
        return Keys.KEY_SESSION_CONNECT_ATTRS_PRIMARY;
    }

    @Override
    public SessionConnectAttrs as(String alias) {
        return new SessionConnectAttrs(DSL.name(alias), this);
    }

    @Override
    public SessionConnectAttrs as(Name alias) {
        return new SessionConnectAttrs(alias, this);
    }

    @Override
    public SessionConnectAttrs as(Table<?> alias) {
        return new SessionConnectAttrs(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionConnectAttrs rename(String name) {
        return new SessionConnectAttrs(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionConnectAttrs rename(Name name) {
        return new SessionConnectAttrs(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SessionConnectAttrs rename(Table<?> name) {
        return new SessionConnectAttrs(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<ULong, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super ULong, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super ULong, ? super String, ? super String, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
