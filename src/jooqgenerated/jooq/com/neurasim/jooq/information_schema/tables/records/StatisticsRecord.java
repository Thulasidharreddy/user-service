/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.Statistics;

import org.jooq.Field;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatisticsRecord extends TableRecordImpl<StatisticsRecord> implements Record18<String, String, String, Integer, String, String, UInteger, String, String, Long, Long, byte[], String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public StatisticsRecord setTableCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public StatisticsRecord setTableSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public StatisticsRecord setTableName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public StatisticsRecord setNonUnique(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public Integer getNonUnique() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public StatisticsRecord setIndexSchema(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public String getIndexSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public StatisticsRecord setIndexName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public StatisticsRecord setSeqInIndex(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public UInteger getSeqInIndex() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public StatisticsRecord setColumnName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public StatisticsRecord setCollation(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public String getCollation() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public StatisticsRecord setCardinality(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public Long getCardinality() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public StatisticsRecord setSubPart(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public Long getSubPart() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.PACKED</code>.
     */
    public StatisticsRecord setPacked(byte[] value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.PACKED</code>.
     */
    public byte[] getPacked() {
        return (byte[]) get(11);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public StatisticsRecord setNullable(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public String getNullable() {
        return (String) get(12);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public StatisticsRecord setIndexType(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public String getIndexType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public StatisticsRecord setComment(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public String getComment() {
        return (String) get(14);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public StatisticsRecord setIndexComment(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public String getIndexComment() {
        return (String) get(15);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.IS_VISIBLE</code>.
     */
    public StatisticsRecord setIsVisible(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.IS_VISIBLE</code>.
     */
    public String getIsVisible() {
        return (String) get(16);
    }

    /**
     * Setter for <code>information_schema.STATISTICS.EXPRESSION</code>.
     */
    public StatisticsRecord setExpression(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.STATISTICS.EXPRESSION</code>.
     */
    public String getExpression() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, Integer, String, String, UInteger, String, String, Long, Long, byte[], String, String, String, String, String, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, Integer, String, String, UInteger, String, String, Long, Long, byte[], String, String, String, String, String, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Statistics.STATISTICS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return Statistics.STATISTICS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return Statistics.STATISTICS.TABLE_NAME;
    }

    @Override
    public Field<Integer> field4() {
        return Statistics.STATISTICS.NON_UNIQUE;
    }

    @Override
    public Field<String> field5() {
        return Statistics.STATISTICS.INDEX_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return Statistics.STATISTICS.INDEX_NAME;
    }

    @Override
    public Field<UInteger> field7() {
        return Statistics.STATISTICS.SEQ_IN_INDEX;
    }

    @Override
    public Field<String> field8() {
        return Statistics.STATISTICS.COLUMN_NAME;
    }

    @Override
    public Field<String> field9() {
        return Statistics.STATISTICS.COLLATION;
    }

    @Override
    public Field<Long> field10() {
        return Statistics.STATISTICS.CARDINALITY;
    }

    @Override
    public Field<Long> field11() {
        return Statistics.STATISTICS.SUB_PART;
    }

    @Override
    public Field<byte[]> field12() {
        return Statistics.STATISTICS.PACKED;
    }

    @Override
    public Field<String> field13() {
        return Statistics.STATISTICS.NULLABLE;
    }

    @Override
    public Field<String> field14() {
        return Statistics.STATISTICS.INDEX_TYPE;
    }

    @Override
    public Field<String> field15() {
        return Statistics.STATISTICS.COMMENT;
    }

    @Override
    public Field<String> field16() {
        return Statistics.STATISTICS.INDEX_COMMENT;
    }

    @Override
    public Field<String> field17() {
        return Statistics.STATISTICS.IS_VISIBLE;
    }

    @Override
    public Field<String> field18() {
        return Statistics.STATISTICS.EXPRESSION;
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
    public Integer component4() {
        return getNonUnique();
    }

    @Override
    public String component5() {
        return getIndexSchema();
    }

    @Override
    public String component6() {
        return getIndexName();
    }

    @Override
    public UInteger component7() {
        return getSeqInIndex();
    }

    @Override
    public String component8() {
        return getColumnName();
    }

    @Override
    public String component9() {
        return getCollation();
    }

    @Override
    public Long component10() {
        return getCardinality();
    }

    @Override
    public Long component11() {
        return getSubPart();
    }

    @Override
    public byte[] component12() {
        return getPacked();
    }

    @Override
    public String component13() {
        return getNullable();
    }

    @Override
    public String component14() {
        return getIndexType();
    }

    @Override
    public String component15() {
        return getComment();
    }

    @Override
    public String component16() {
        return getIndexComment();
    }

    @Override
    public String component17() {
        return getIsVisible();
    }

    @Override
    public String component18() {
        return getExpression();
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
    public Integer value4() {
        return getNonUnique();
    }

    @Override
    public String value5() {
        return getIndexSchema();
    }

    @Override
    public String value6() {
        return getIndexName();
    }

    @Override
    public UInteger value7() {
        return getSeqInIndex();
    }

    @Override
    public String value8() {
        return getColumnName();
    }

    @Override
    public String value9() {
        return getCollation();
    }

    @Override
    public Long value10() {
        return getCardinality();
    }

    @Override
    public Long value11() {
        return getSubPart();
    }

    @Override
    public byte[] value12() {
        return getPacked();
    }

    @Override
    public String value13() {
        return getNullable();
    }

    @Override
    public String value14() {
        return getIndexType();
    }

    @Override
    public String value15() {
        return getComment();
    }

    @Override
    public String value16() {
        return getIndexComment();
    }

    @Override
    public String value17() {
        return getIsVisible();
    }

    @Override
    public String value18() {
        return getExpression();
    }

    @Override
    public StatisticsRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public StatisticsRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public StatisticsRecord value3(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public StatisticsRecord value4(Integer value) {
        setNonUnique(value);
        return this;
    }

    @Override
    public StatisticsRecord value5(String value) {
        setIndexSchema(value);
        return this;
    }

    @Override
    public StatisticsRecord value6(String value) {
        setIndexName(value);
        return this;
    }

    @Override
    public StatisticsRecord value7(UInteger value) {
        setSeqInIndex(value);
        return this;
    }

    @Override
    public StatisticsRecord value8(String value) {
        setColumnName(value);
        return this;
    }

    @Override
    public StatisticsRecord value9(String value) {
        setCollation(value);
        return this;
    }

    @Override
    public StatisticsRecord value10(Long value) {
        setCardinality(value);
        return this;
    }

    @Override
    public StatisticsRecord value11(Long value) {
        setSubPart(value);
        return this;
    }

    @Override
    public StatisticsRecord value12(byte[] value) {
        setPacked(value);
        return this;
    }

    @Override
    public StatisticsRecord value13(String value) {
        setNullable(value);
        return this;
    }

    @Override
    public StatisticsRecord value14(String value) {
        setIndexType(value);
        return this;
    }

    @Override
    public StatisticsRecord value15(String value) {
        setComment(value);
        return this;
    }

    @Override
    public StatisticsRecord value16(String value) {
        setIndexComment(value);
        return this;
    }

    @Override
    public StatisticsRecord value17(String value) {
        setIsVisible(value);
        return this;
    }

    @Override
    public StatisticsRecord value18(String value) {
        setExpression(value);
        return this;
    }

    @Override
    public StatisticsRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, UInteger value7, String value8, String value9, Long value10, Long value11, byte[] value12, String value13, String value14, String value15, String value16, String value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StatisticsRecord
     */
    public StatisticsRecord() {
        super(Statistics.STATISTICS);
    }

    /**
     * Create a detached, initialised StatisticsRecord
     */
    public StatisticsRecord(String tableCatalog, String tableSchema, String tableName, Integer nonUnique, String indexSchema, String indexName, UInteger seqInIndex, String columnName, String collation, Long cardinality, Long subPart, byte[] packed, String nullable, String indexType, String comment, String indexComment, String isVisible, String expression) {
        super(Statistics.STATISTICS);

        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setNonUnique(nonUnique);
        setIndexSchema(indexSchema);
        setIndexName(indexName);
        setSeqInIndex(seqInIndex);
        setColumnName(columnName);
        setCollation(collation);
        setCardinality(cardinality);
        setSubPart(subPart);
        setPacked(packed);
        setNullable(nullable);
        setIndexType(indexType);
        setComment(comment);
        setIndexComment(indexComment);
        setIsVisible(isVisible);
        setExpression(expression);
    }

    /**
     * Create a detached, initialised StatisticsRecord
     */
    public StatisticsRecord(com.neurasim.jooq.information_schema.tables.pojos.Statistics value) {
        super(Statistics.STATISTICS);

        if (value != null) {
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setNonUnique(value.getNonUnique());
            setIndexSchema(value.getIndexSchema());
            setIndexName(value.getIndexName());
            setSeqInIndex(value.getSeqInIndex());
            setColumnName(value.getColumnName());
            setCollation(value.getCollation());
            setCardinality(value.getCardinality());
            setSubPart(value.getSubPart());
            setPacked(value.getPacked());
            setNullable(value.getNullable());
            setIndexType(value.getIndexType());
            setComment(value.getComment());
            setIndexComment(value.getIndexComment());
            setIsVisible(value.getIsVisible());
            setExpression(value.getExpression());
        }
    }
}
