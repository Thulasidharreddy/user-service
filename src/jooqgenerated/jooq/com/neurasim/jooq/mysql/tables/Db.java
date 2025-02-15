/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Indexes;
import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.enums.DbAlterPriv;
import com.neurasim.jooq.mysql.enums.DbAlterRoutinePriv;
import com.neurasim.jooq.mysql.enums.DbCreatePriv;
import com.neurasim.jooq.mysql.enums.DbCreateRoutinePriv;
import com.neurasim.jooq.mysql.enums.DbCreateTmpTablePriv;
import com.neurasim.jooq.mysql.enums.DbCreateViewPriv;
import com.neurasim.jooq.mysql.enums.DbDeletePriv;
import com.neurasim.jooq.mysql.enums.DbDropPriv;
import com.neurasim.jooq.mysql.enums.DbEventPriv;
import com.neurasim.jooq.mysql.enums.DbExecutePriv;
import com.neurasim.jooq.mysql.enums.DbGrantPriv;
import com.neurasim.jooq.mysql.enums.DbIndexPriv;
import com.neurasim.jooq.mysql.enums.DbInsertPriv;
import com.neurasim.jooq.mysql.enums.DbLockTablesPriv;
import com.neurasim.jooq.mysql.enums.DbReferencesPriv;
import com.neurasim.jooq.mysql.enums.DbSelectPriv;
import com.neurasim.jooq.mysql.enums.DbShowViewPriv;
import com.neurasim.jooq.mysql.enums.DbTriggerPriv;
import com.neurasim.jooq.mysql.enums.DbUpdatePriv;
import com.neurasim.jooq.mysql.tables.records.DbRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function22;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row22;
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
 * Database privileges
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Db extends TableImpl<DbRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql.db</code>
     */
    public static final Db DB = new Db();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DbRecord> getRecordType() {
        return DbRecord.class;
    }

    /**
     * The column <code>mysql.db.Host</code>.
     */
    public final TableField<DbRecord, String> HOST = createField(DSL.name("Host"), SQLDataType.CHAR(255).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.Db</code>.
     */
    public final TableField<DbRecord, String> DB_ = createField(DSL.name("Db"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.User</code>.
     */
    public final TableField<DbRecord, String> USER = createField(DSL.name("User"), SQLDataType.CHAR(32).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "");

    /**
     * The column <code>mysql.db.Select_priv</code>.
     */
    public final TableField<DbRecord, DbSelectPriv> SELECT_PRIV = createField(DSL.name("Select_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbSelectPriv.class), this, "");

    /**
     * The column <code>mysql.db.Insert_priv</code>.
     */
    public final TableField<DbRecord, DbInsertPriv> INSERT_PRIV = createField(DSL.name("Insert_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbInsertPriv.class), this, "");

    /**
     * The column <code>mysql.db.Update_priv</code>.
     */
    public final TableField<DbRecord, DbUpdatePriv> UPDATE_PRIV = createField(DSL.name("Update_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbUpdatePriv.class), this, "");

    /**
     * The column <code>mysql.db.Delete_priv</code>.
     */
    public final TableField<DbRecord, DbDeletePriv> DELETE_PRIV = createField(DSL.name("Delete_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbDeletePriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_priv</code>.
     */
    public final TableField<DbRecord, DbCreatePriv> CREATE_PRIV = createField(DSL.name("Create_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbCreatePriv.class), this, "");

    /**
     * The column <code>mysql.db.Drop_priv</code>.
     */
    public final TableField<DbRecord, DbDropPriv> DROP_PRIV = createField(DSL.name("Drop_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbDropPriv.class), this, "");

    /**
     * The column <code>mysql.db.Grant_priv</code>.
     */
    public final TableField<DbRecord, DbGrantPriv> GRANT_PRIV = createField(DSL.name("Grant_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbGrantPriv.class), this, "");

    /**
     * The column <code>mysql.db.References_priv</code>.
     */
    public final TableField<DbRecord, DbReferencesPriv> REFERENCES_PRIV = createField(DSL.name("References_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbReferencesPriv.class), this, "");

    /**
     * The column <code>mysql.db.Index_priv</code>.
     */
    public final TableField<DbRecord, DbIndexPriv> INDEX_PRIV = createField(DSL.name("Index_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbIndexPriv.class), this, "");

    /**
     * The column <code>mysql.db.Alter_priv</code>.
     */
    public final TableField<DbRecord, DbAlterPriv> ALTER_PRIV = createField(DSL.name("Alter_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbAlterPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_tmp_table_priv</code>.
     */
    public final TableField<DbRecord, DbCreateTmpTablePriv> CREATE_TMP_TABLE_PRIV = createField(DSL.name("Create_tmp_table_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbCreateTmpTablePriv.class), this, "");

    /**
     * The column <code>mysql.db.Lock_tables_priv</code>.
     */
    public final TableField<DbRecord, DbLockTablesPriv> LOCK_TABLES_PRIV = createField(DSL.name("Lock_tables_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbLockTablesPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_view_priv</code>.
     */
    public final TableField<DbRecord, DbCreateViewPriv> CREATE_VIEW_PRIV = createField(DSL.name("Create_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbCreateViewPriv.class), this, "");

    /**
     * The column <code>mysql.db.Show_view_priv</code>.
     */
    public final TableField<DbRecord, DbShowViewPriv> SHOW_VIEW_PRIV = createField(DSL.name("Show_view_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbShowViewPriv.class), this, "");

    /**
     * The column <code>mysql.db.Create_routine_priv</code>.
     */
    public final TableField<DbRecord, DbCreateRoutinePriv> CREATE_ROUTINE_PRIV = createField(DSL.name("Create_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbCreateRoutinePriv.class), this, "");

    /**
     * The column <code>mysql.db.Alter_routine_priv</code>.
     */
    public final TableField<DbRecord, DbAlterRoutinePriv> ALTER_ROUTINE_PRIV = createField(DSL.name("Alter_routine_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbAlterRoutinePriv.class), this, "");

    /**
     * The column <code>mysql.db.Execute_priv</code>.
     */
    public final TableField<DbRecord, DbExecutePriv> EXECUTE_PRIV = createField(DSL.name("Execute_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbExecutePriv.class), this, "");

    /**
     * The column <code>mysql.db.Event_priv</code>.
     */
    public final TableField<DbRecord, DbEventPriv> EVENT_PRIV = createField(DSL.name("Event_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbEventPriv.class), this, "");

    /**
     * The column <code>mysql.db.Trigger_priv</code>.
     */
    public final TableField<DbRecord, DbTriggerPriv> TRIGGER_PRIV = createField(DSL.name("Trigger_priv"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.inline("N", SQLDataType.VARCHAR)).asEnumDataType(com.neurasim.jooq.mysql.enums.DbTriggerPriv.class), this, "");

    private Db(Name alias, Table<DbRecord> aliased) {
        this(alias, aliased, null);
    }

    private Db(Name alias, Table<DbRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Database privileges"), TableOptions.table());
    }

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    public Db(String alias) {
        this(DSL.name(alias), DB);
    }

    /**
     * Create an aliased <code>mysql.db</code> table reference
     */
    public Db(Name alias) {
        this(alias, DB);
    }

    /**
     * Create a <code>mysql.db</code> table reference
     */
    public Db() {
        this(DSL.name("db"), null);
    }

    public <O extends Record> Db(Table<O> child, ForeignKey<O, DbRecord> key) {
        super(child, key, DB);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.DB_USER);
    }

    @Override
    public UniqueKey<DbRecord> getPrimaryKey() {
        return Keys.KEY_DB_PRIMARY;
    }

    @Override
    public Db as(String alias) {
        return new Db(DSL.name(alias), this);
    }

    @Override
    public Db as(Name alias) {
        return new Db(alias, this);
    }

    @Override
    public Db as(Table<?> alias) {
        return new Db(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(String name) {
        return new Db(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(Name name) {
        return new Db(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Db rename(Table<?> name) {
        return new Db(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row22<String, String, String, DbSelectPriv, DbInsertPriv, DbUpdatePriv, DbDeletePriv, DbCreatePriv, DbDropPriv, DbGrantPriv, DbReferencesPriv, DbIndexPriv, DbAlterPriv, DbCreateTmpTablePriv, DbLockTablesPriv, DbCreateViewPriv, DbShowViewPriv, DbCreateRoutinePriv, DbAlterRoutinePriv, DbExecutePriv, DbEventPriv, DbTriggerPriv> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function22<? super String, ? super String, ? super String, ? super DbSelectPriv, ? super DbInsertPriv, ? super DbUpdatePriv, ? super DbDeletePriv, ? super DbCreatePriv, ? super DbDropPriv, ? super DbGrantPriv, ? super DbReferencesPriv, ? super DbIndexPriv, ? super DbAlterPriv, ? super DbCreateTmpTablePriv, ? super DbLockTablesPriv, ? super DbCreateViewPriv, ? super DbShowViewPriv, ? super DbCreateRoutinePriv, ? super DbAlterRoutinePriv, ? super DbExecutePriv, ? super DbEventPriv, ? super DbTriggerPriv, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function22<? super String, ? super String, ? super String, ? super DbSelectPriv, ? super DbInsertPriv, ? super DbUpdatePriv, ? super DbDeletePriv, ? super DbCreatePriv, ? super DbDropPriv, ? super DbGrantPriv, ? super DbReferencesPriv, ? super DbIndexPriv, ? super DbAlterPriv, ? super DbCreateTmpTablePriv, ? super DbLockTablesPriv, ? super DbCreateViewPriv, ? super DbShowViewPriv, ? super DbCreateRoutinePriv, ? super DbAlterRoutinePriv, ? super DbExecutePriv, ? super DbEventPriv, ? super DbTriggerPriv, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
