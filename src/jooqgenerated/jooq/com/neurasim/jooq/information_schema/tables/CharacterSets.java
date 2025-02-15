/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.CharacterSetsRecord;

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
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CharacterSets extends TableImpl<CharacterSetsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.CHARACTER_SETS</code>
     */
    public static final CharacterSets CHARACTER_SETS = new CharacterSets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CharacterSetsRecord> getRecordType() {
        return CharacterSetsRecord.class;
    }

    /**
     * The column
     * <code>information_schema.CHARACTER_SETS.CHARACTER_SET_NAME</code>.
     */
    public final TableField<CharacterSetsRecord, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column
     * <code>information_schema.CHARACTER_SETS.DEFAULT_COLLATE_NAME</code>.
     */
    public final TableField<CharacterSetsRecord, String> DEFAULT_COLLATE_NAME = createField(DSL.name("DEFAULT_COLLATE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.DESCRIPTION</code>.
     */
    public final TableField<CharacterSetsRecord, String> DESCRIPTION = createField(DSL.name("DESCRIPTION"), SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>information_schema.CHARACTER_SETS.MAXLEN</code>.
     */
    public final TableField<CharacterSetsRecord, UInteger> MAXLEN = createField(DSL.name("MAXLEN"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CharacterSets(Name alias, Table<CharacterSetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.CHARACTER_SETS</code> table
     * reference
     */
    public CharacterSets(String alias) {
        this(DSL.name(alias), CHARACTER_SETS);
    }

    /**
     * Create an aliased <code>information_schema.CHARACTER_SETS</code> table
     * reference
     */
    public CharacterSets(Name alias) {
        this(alias, CHARACTER_SETS);
    }

    /**
     * Create a <code>information_schema.CHARACTER_SETS</code> table reference
     */
    public CharacterSets() {
        this(DSL.name("CHARACTER_SETS"), null);
    }

    public <O extends Record> CharacterSets(Table<O> child, ForeignKey<O, CharacterSetsRecord> key) {
        super(child, key, CHARACTER_SETS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public CharacterSets as(String alias) {
        return new CharacterSets(DSL.name(alias), this);
    }

    @Override
    public CharacterSets as(Name alias) {
        return new CharacterSets(alias, this);
    }

    @Override
    public CharacterSets as(Table<?> alias) {
        return new CharacterSets(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(String name) {
        return new CharacterSets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(Name name) {
        return new CharacterSets(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CharacterSets rename(Table<?> name) {
        return new CharacterSets(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, UInteger> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super String, ? super UInteger, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super String, ? super UInteger, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
