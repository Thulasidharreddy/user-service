/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables;


import com.neurasim.jooq.information_schema.InformationSchema;
import com.neurasim.jooq.information_schema.tables.records.InnodbCachedIndexesRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbCachedIndexes extends TableImpl<InnodbCachedIndexesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.INNODB_CACHED_INDEXES</code>
     */
    public static final InnodbCachedIndexes INNODB_CACHED_INDEXES = new InnodbCachedIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbCachedIndexesRecord> getRecordType() {
        return InnodbCachedIndexesRecord.class;
    }

    /**
     * The column
     * <code>information_schema.INNODB_CACHED_INDEXES.SPACE_ID</code>.
     */
    public final TableField<InnodbCachedIndexesRecord, UInteger> SPACE_ID = createField(DSL.name("SPACE_ID"), SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CACHED_INDEXES.INDEX_ID</code>.
     */
    public final TableField<InnodbCachedIndexesRecord, ULong> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.INNODB_CACHED_INDEXES.N_CACHED_PAGES</code>.
     */
    public final TableField<InnodbCachedIndexesRecord, ULong> N_CACHED_PAGES = createField(DSL.name("N_CACHED_PAGES"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.inline("", SQLDataType.BIGINTUNSIGNED)), this, "");

    private InnodbCachedIndexes(Name alias, Table<InnodbCachedIndexesRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbCachedIndexes(Name alias, Table<InnodbCachedIndexesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CACHED_INDEXES</code>
     * table reference
     */
    public InnodbCachedIndexes(String alias) {
        this(DSL.name(alias), INNODB_CACHED_INDEXES);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_CACHED_INDEXES</code>
     * table reference
     */
    public InnodbCachedIndexes(Name alias) {
        this(alias, INNODB_CACHED_INDEXES);
    }

    /**
     * Create a <code>information_schema.INNODB_CACHED_INDEXES</code> table
     * reference
     */
    public InnodbCachedIndexes() {
        this(DSL.name("INNODB_CACHED_INDEXES"), null);
    }

    public <O extends Record> InnodbCachedIndexes(Table<O> child, ForeignKey<O, InnodbCachedIndexesRecord> key) {
        super(child, key, INNODB_CACHED_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public InnodbCachedIndexes as(String alias) {
        return new InnodbCachedIndexes(DSL.name(alias), this);
    }

    @Override
    public InnodbCachedIndexes as(Name alias) {
        return new InnodbCachedIndexes(alias, this);
    }

    @Override
    public InnodbCachedIndexes as(Table<?> alias) {
        return new InnodbCachedIndexes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCachedIndexes rename(String name) {
        return new InnodbCachedIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCachedIndexes rename(Name name) {
        return new InnodbCachedIndexes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbCachedIndexes rename(Table<?> name) {
        return new InnodbCachedIndexes(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UInteger, ULong, ULong> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super UInteger, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super UInteger, ? super ULong, ? super ULong, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
