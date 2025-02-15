/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.ColumnsExtensions;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ColumnsExtensionsRecord extends TableRecordImpl<ColumnsExtensionsRecord> implements Record6<String, String, String, String, JSON, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.COLUMNS_EXTENSIONS.TABLE_CATALOG</code>.
     */
    public ColumnsExtensionsRecord setTableCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.COLUMNS_EXTENSIONS.TABLE_SCHEMA</code>.
     */
    public ColumnsExtensionsRecord setTableSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.COLUMNS_EXTENSIONS.TABLE_NAME</code>.
     */
    public ColumnsExtensionsRecord setTableName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.COLUMNS_EXTENSIONS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.COLUMNS_EXTENSIONS.COLUMN_NAME</code>.
     */
    public ColumnsExtensionsRecord setColumnName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.COLUMNS_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public ColumnsExtensionsRecord setEngineAttribute(JSON value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.ENGINE_ATTRIBUTE</code>.
     */
    public JSON getEngineAttribute() {
        return (JSON) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.COLUMNS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public ColumnsExtensionsRecord setSecondaryEngineAttribute(JSON value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.COLUMNS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE</code>.
     */
    public JSON getSecondaryEngineAttribute() {
        return (JSON) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, JSON, JSON> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, JSON, JSON> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ColumnsExtensions.COLUMNS_EXTENSIONS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ColumnsExtensions.COLUMNS_EXTENSIONS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ColumnsExtensions.COLUMNS_EXTENSIONS.TABLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return ColumnsExtensions.COLUMNS_EXTENSIONS.COLUMN_NAME;
    }

    @Override
    public Field<JSON> field5() {
        return ColumnsExtensions.COLUMNS_EXTENSIONS.ENGINE_ATTRIBUTE;
    }

    @Override
    public Field<JSON> field6() {
        return ColumnsExtensions.COLUMNS_EXTENSIONS.SECONDARY_ENGINE_ATTRIBUTE;
    }

    @Override
    public String component1() {
        return getTableCatalog();
    }

    @Override
    public String component2() {
        return getTableSchema();
    }

    @Override
    public String component3() {
        return getTableName();
    }

    @Override
    public String component4() {
        return getColumnName();
    }

    @Override
    public JSON component5() {
        return getEngineAttribute();
    }

    @Override
    public JSON component6() {
        return getSecondaryEngineAttribute();
    }

    @Override
    public String value1() {
        return getTableCatalog();
    }

    @Override
    public String value2() {
        return getTableSchema();
    }

    @Override
    public String value3() {
        return getTableName();
    }

    @Override
    public String value4() {
        return getColumnName();
    }

    @Override
    public JSON value5() {
        return getEngineAttribute();
    }

    @Override
    public JSON value6() {
        return getSecondaryEngineAttribute();
    }

    @Override
    public ColumnsExtensionsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ColumnsExtensionsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ColumnsExtensionsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ColumnsExtensionsRecord value4(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public ColumnsExtensionsRecord value5(JSON value) {
        setEngineAttribute(value);
        return this;
    }

    @Override
    public ColumnsExtensionsRecord value6(JSON value) {
        setSecondaryEngineAttribute(value);
        return this;
    }

    @Override
    public ColumnsExtensionsRecord values(String value1, String value2, String value3, String value4, JSON value5, JSON value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ColumnsExtensionsRecord
     */
    public ColumnsExtensionsRecord() {
        super(ColumnsExtensions.COLUMNS_EXTENSIONS);
    }

    /**
     * Create a detached, initialised ColumnsExtensionsRecord
     */
    public ColumnsExtensionsRecord(String tableCatalog, String tableSchema, String tableName, String columnName, JSON engineAttribute, JSON secondaryEngineAttribute) {
        super(ColumnsExtensions.COLUMNS_EXTENSIONS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setColumnName(columnName);
        setEngineAttribute(engineAttribute);
        setSecondaryEngineAttribute(secondaryEngineAttribute);
    }

    /**
     * Create a detached, initialised ColumnsExtensionsRecord
     */
    public ColumnsExtensionsRecord(com.neurasim.jooq.information_schema.tables.pojos.ColumnsExtensions value) {
        super(ColumnsExtensions.COLUMNS_EXTENSIONS);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setColumnName(value.getColumnName());
            setEngineAttribute(value.getEngineAttribute());
            setSecondaryEngineAttribute(value.getSecondaryEngineAttribute());
        }
    }
}
