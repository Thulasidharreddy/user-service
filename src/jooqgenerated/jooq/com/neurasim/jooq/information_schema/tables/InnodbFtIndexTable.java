/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.InnodbFtIndexTableRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
public class InnodbFtIndexTable extends TableImpl<InnodbFtIndexTableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_FT_INDEX_TABLE</code>
     */
    public static final InnodbFtIndexTable INNODB_FT_INDEX_TABLE = new InnodbFtIndexTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbFtIndexTableRecord> getRecordType() {
        return InnodbFtIndexTableRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_TABLE.WORD</code>.
     */
    public final TableField<InnodbFtIndexTableRecord, String> WORD = createField(DSL.name("WORD"), SQLDataType.VARCHAR(112).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.FIRST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexTableRecord, ULong> FIRST_DOC_ID = createField(DSL.name("FIRST_DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.LAST_DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexTableRecord, ULong> LAST_DOC_ID = createField(DSL.name("LAST_DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_COUNT</code>.
     */
    public final TableField<InnodbFtIndexTableRecord, ULong> DOC_COUNT = createField(DSL.name("DOC_COUNT"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_FT_INDEX_TABLE.DOC_ID</code>.
     */
    public final TableField<InnodbFtIndexTableRecord, ULong> DOC_ID = createField(DSL.name("DOC_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_FT_INDEX_TABLE.POSITION</code>.
     */
    public final TableField<InnodbFtIndexTableRecord, ULong> POSITION = createField(DSL.name("POSITION"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbFtIndexTable(Name alias, Table<InnodbFtIndexTableRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbFtIndexTable(Name alias, Table<InnodbFtIndexTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_TABLE</code>
     * table reference
     */
    public InnodbFtIndexTable(String alias) {
        this(DSL.name(alias), INNODB_FT_INDEX_TABLE);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_FT_INDEX_TABLE</code>
     * table reference
     */
    public InnodbFtIndexTable(Name alias) {
        this(alias, INNODB_FT_INDEX_TABLE);
    }

    /**
     * Create a <code>information_schema.INNODB_FT_INDEX_TABLE</code> table
     * reference
     */
    public InnodbFtIndexTable() {
        this(DSL.name("INNODB_FT_INDEX_TABLE"), null);
    }

    public <O extends Record> InnodbFtIndexTable(Table<O> child, ForeignKey<O, InnodbFtIndexTableRecord> key) {
        super(child, key, INNODB_FT_INDEX_TABLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbFtIndexTable as(String alias) {
        return new InnodbFtIndexTable(DSL.name(alias), this);
    }

    @Override
    public InnodbFtIndexTable as(Name alias) {
        return new InnodbFtIndexTable(alias, this);
    }

    @Override
    public InnodbFtIndexTable as(Table<?> alias) {
        return new InnodbFtIndexTable(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtIndexTable rename(String name) {
        return new InnodbFtIndexTable(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtIndexTable rename(Name name) {
        return new InnodbFtIndexTable(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbFtIndexTable rename(Table<?> name) {
        return new InnodbFtIndexTable(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, ULong, ULong, ULong, ULong, ULong> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
