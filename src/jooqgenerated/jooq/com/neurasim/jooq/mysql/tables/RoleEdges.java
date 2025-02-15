/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.enums.RoleEdgesWithAdminOption;
import com.neurasim.jooq.mysql.tables.records.RoleEdgesRecord;

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


/**
 * Role hierarchy and role grants
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleEdges extends TableImpl<RoleEdgesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.role_edges</code>
     */
    public static final RoleEdges ROLE_EDGES = new RoleEdges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleEdgesRecord> getRecordType() {
        return RoleEdgesRecord.class;
    }

    /**
     * The column <code>mysql.role_edges.FROM_HOST</code>.
     */
    public final TableField<RoleEdgesRecord, String> FROM_HOST = createField(DSL.name("FROM_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.FROM_USER</code>.
     */
    public final TableField<RoleEdgesRecord, String> FROM_USER = createField(DSL.name("FROM_USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.TO_HOST</code>.
     */
    public final TableField<RoleEdgesRecord, String> TO_HOST = createField(DSL.name("TO_HOST"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.TO_USER</code>.
     */
    public final TableField<RoleEdgesRecord, String> TO_USER = createField(DSL.name("TO_USER"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.role_edges.WITH_ADMIN_OPTION</code>.
     */
    public final TableField<RoleEdgesRecord, RoleEdgesWithAdminOption> WITH_ADMIN_OPTION = createField(DSL.name("WITH_ADMIN_OPTION"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.RoleEdgesWithAdminOption.class), this, "");

    private RoleEdges(Name alias, Table<RoleEdgesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleEdges(Name alias, Table<RoleEdgesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Role hierarchy and role grants"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.role_edges</code> table reference
     */
    public RoleEdges(String alias) {
        this(DSL.name(alias), ROLE_EDGES);
    }

    /**
     * Create an aliased <code>mysql.role_edges</code> table reference
     */
    public RoleEdges(Name alias) {
        this(alias, ROLE_EDGES);
    }

    /**
     * Create a <code>mysql.role_edges</code> table reference
     */
    public RoleEdges() {
        this(DSL.name("role_edges"), null);
    }

    public <O extends Record> RoleEdges(Table<O> child, ForeignKey<O, RoleEdgesRecord> key) {
        super(child, key, ROLE_EDGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public UniqueKey<RoleEdgesRecord> getPrimaryKey() {
        return Keys.KEY_ROLE_EDGES_PRIMARY;
    }

    @Override
    public RoleEdges as(String alias) {
        return new RoleEdges(DSL.name(alias), this);
    }

    @Override
    public RoleEdges as(Name alias) {
        return new RoleEdges(alias, this);
    }

    @Override
    public RoleEdges as(Table<?> alias) {
        return new RoleEdges(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleEdges rename(String name) {
        return new RoleEdges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleEdges rename(Name name) {
        return new RoleEdges(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleEdges rename(Table<?> name) {
        return new RoleEdges(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, RoleEdgesWithAdminOption> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super String, ? super RoleEdgesWithAdminOption, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super String, ? super RoleEdgesWithAdminOption, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
