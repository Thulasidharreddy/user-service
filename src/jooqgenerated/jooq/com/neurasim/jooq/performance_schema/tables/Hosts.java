/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.Keys;
import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.tables.records.HostsRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function5;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row5;
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
public class Hosts extends TableImpl<HostsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>performance_schema.hosts</code>
     */
    public static final Hosts HOSTS = new Hosts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostsRecord> getRecordType() {
        return HostsRecord.class;
    }

    /**
     * The column <code>performance_schema.hosts.HOST</code>.
     */
    public final TableField<HostsRecord, String> HOST = createField(DSL.name("HOST"), SQLDataType.CHAR(255), this, "");

    /**
     * The column <code>performance_schema.hosts.CURRENT_CONNECTIONS</code>.
     */
    public final TableField<HostsRecord, Long> CURRENT_CONNECTIONS = createField(DSL.name("CURRENT_CONNECTIONS"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>performance_schema.hosts.TOTAL_CONNECTIONS</code>.
     */
    public final TableField<HostsRecord, Long> TOTAL_CONNECTIONS = createField(DSL.name("TOTAL_CONNECTIONS"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.hosts.MAX_SESSION_CONTROLLED_MEMORY</code>.
     */
    public final TableField<HostsRecord, ULong> MAX_SESSION_CONTROLLED_MEMORY = createField(DSL.name("MAX_SESSION_CONTROLLED_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    /**
     * The column
     * <code>performance_schema.hosts.MAX_SESSION_TOTAL_MEMORY</code>.
     */
    public final TableField<HostsRecord, ULong> MAX_SESSION_TOTAL_MEMORY = createField(DSL.name("MAX_SESSION_TOTAL_MEMORY"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

    private Hosts(Name alias, Table<HostsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Hosts(Name alias, Table<HostsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>performance_schema.hosts</code> table reference
     */
    public Hosts(String alias) {
        this(DSL.name(alias), HOSTS);
    }

    /**
     * Create an aliased <code>performance_schema.hosts</code> table reference
     */
    public Hosts(Name alias) {
        this(alias, HOSTS);
    }

    /**
     * Create a <code>performance_schema.hosts</code> table reference
     */
    public Hosts() {
        this(DSL.name("hosts"), null);
    }

    public <O extends Record> Hosts(Table<O> child, ForeignKey<O, HostsRecord> key) {
        super(child, key, HOSTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public List<UniqueKey<HostsRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_HOSTS_HOST);
    }

    @Override
    public Hosts as(String alias) {
        return new Hosts(DSL.name(alias), this);
    }

    @Override
    public Hosts as(Name alias) {
        return new Hosts(alias, this);
    }

    @Override
    public Hosts as(Table<?> alias) {
        return new Hosts(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Hosts rename(String name) {
        return new Hosts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hosts rename(Name name) {
        return new Hosts(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Hosts rename(Table<?> name) {
        return new Hosts(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, Long, Long, ULong, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super Long, ? super Long, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super Long, ? super Long, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
