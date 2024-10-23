/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.InnodbForeignRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbForeign extends TableImpl<InnodbForeignRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.INNODB_FOREIGN</code>
     */
    public static final InnodbForeign INNODB_FOREIGN = new InnodbForeign();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbForeignRecord> getRecordType() {
        return InnodbForeignRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FOREIGN.ID</code>.
     */
    public final TableField<InnodbForeignRecord, String> ID = createField(DSL.name("ID"), SQLDataType.VARCHAR(129), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.FOR_NAME</code>.
     */
    public final TableField<InnodbForeignRecord, String> FOR_NAME = createField(DSL.name("FOR_NAME"), SQLDataType.VARCHAR(129), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.REF_NAME</code>.
     */
    public final TableField<InnodbForeignRecord, String> REF_NAME = createField(DSL.name("REF_NAME"), SQLDataType.VARCHAR(129), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.N_COLS</code>.
     */
    public final TableField<InnodbForeignRecord, Long> N_COLS = createField(DSL.name("N_COLS"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>information_schema.INNODB_FOREIGN.TYPE</code>.
     */
    public final TableField<InnodbForeignRecord, ULong> TYPE = createField(DSL.name("TYPE"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbForeign(Name alias, Table<InnodbForeignRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbForeign(Name alias, Table<InnodbForeignRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN</code> table
     * reference
     */
    public InnodbForeign(String alias) {
        this(DSL.name(alias), INNODB_FOREIGN);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FOREIGN</code> table
     * reference
     */
    public InnodbForeign(Name alias) {
        this(alias, INNODB_FOREIGN);
    }

    /**
     * Create a <code>information_schema.INNODB_FOREIGN</code> table reference
     */
    public InnodbForeign() {
        this(DSL.name("INNODB_FOREIGN"), null);
    }

    public <O extends Record> InnodbForeign(Table<O> child, ForeignKey<O, InnodbForeignRecord> key) {
        super(child, key, INNODB_FOREIGN);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbForeign as(String alias) {
        return new InnodbForeign(DSL.name(alias), this);
    }

    @Override
    public InnodbForeign as(Name alias) {
        return new InnodbForeign(alias, this);
    }

    @Override
    public InnodbForeign as(Table<?> alias) {
        return new InnodbForeign(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeign rename(String name) {
        return new InnodbForeign(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeign rename(Name name) {
        return new InnodbForeign(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbForeign rename(Table<?> name) {
        return new InnodbForeign(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, Long, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function5<? super String, ? super String, ? super String, ? super Long, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function5<? super String, ? super String, ? super String, ? super Long, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
