/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Indexes;
import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.tables.records.ProxiesPrivRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
 * User proxy privileges
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProxiesPriv extends TableImpl<ProxiesPrivRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.proxies_priv</code>
     */
    public static final ProxiesPriv PROXIES_PRIV = new ProxiesPriv();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProxiesPrivRecord> getRecordType() {
        return ProxiesPrivRecord.class;
    }

    /**
     * The column <code>mysql.proxies_priv.Host</code>.
     */
    public final TableField<ProxiesPrivRecord, String> HOST = createField(DSL.name("Host"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.User</code>.
     */
    public final TableField<ProxiesPrivRecord, String> USER = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Proxied_host</code>.
     */
    public final TableField<ProxiesPrivRecord, String> PROXIED_HOST = createField(DSL.name("Proxied_host"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Proxied_user</code>.
     */
    public final TableField<ProxiesPrivRecord, String> PROXIED_USER = createField(DSL.name("Proxied_user"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.With_grant</code>.
     */
    public final TableField<ProxiesPrivRecord, Byte> WITH_GRANT = createField(DSL.name("With_grant"), SQLDataType.TINYINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Grantor</code>.
     */
    public final TableField<ProxiesPrivRecord, String> GRANTOR = createField(DSL.name("Grantor"), SQLDataType.VARCHAR(288).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>mysql.proxies_priv.Timestamp</code>.
     */
    public final TableField<ProxiesPrivRecord, LocalDateTime> TIMESTAMP = createField(DSL.name("Timestamp"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private ProxiesPriv(Name alias, Table<ProxiesPrivRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProxiesPriv(Name alias, Table<ProxiesPrivRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("User proxy privileges"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.proxies_priv</code> table reference
     */
    public ProxiesPriv(String alias) {
        this(DSL.name(alias), PROXIES_PRIV);
    }

    /**
     * Create an aliased <code>mysql.proxies_priv</code> table reference
     */
    public ProxiesPriv(Name alias) {
        this(alias, PROXIES_PRIV);
    }

    /**
     * Create a <code>mysql.proxies_priv</code> table reference
     */
    public ProxiesPriv() {
        this(DSL.name("proxies_priv"), null);
    }

    public <O extends Record> ProxiesPriv(Table<O> child, ForeignKey<O, ProxiesPrivRecord> key) {
        super(child, key, PROXIES_PRIV);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PROXIES_PRIV_GRANTOR);
    }

    @Override
    public UniqueKey<ProxiesPrivRecord> getPrimaryKey() {
        return Keys.KEY_PROXIES_PRIV_PRIMARY;
    }

    @Override
    public ProxiesPriv as(String alias) {
        return new ProxiesPriv(DSL.name(alias), this);
    }

    @Override
    public ProxiesPriv as(Name alias) {
        return new ProxiesPriv(alias, this);
    }

    @Override
    public ProxiesPriv as(Table<?> alias) {
        return new ProxiesPriv(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProxiesPriv rename(String name) {
        return new ProxiesPriv(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProxiesPriv rename(Name name) {
        return new ProxiesPriv(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProxiesPriv rename(Table<?> name) {
        return new ProxiesPriv(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, Byte, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super String, ? super String, ? super String, ? super String, ? super Byte, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super String, ? super String, ? super String, ? super String, ? super Byte, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
