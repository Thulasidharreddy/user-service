/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.enums.ReferentialConstraintsDeleteRule;
import com.neurasim.jooq.information_schema.enums.ReferentialConstraintsMatchOption;
import com.neurasim.jooq.information_schema.enums.ReferentialConstraintsUpdateRule;
import com.neurasim.jooq.information_schema.tables.ReferentialConstraints;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReferentialConstraintsRecord extends TableRecordImpl<ReferentialConstraintsRecord> implements Record11<String, String, String, String, String, String, ReferentialConstraintsMatchOption, ReferentialConstraintsUpdateRule, ReferentialConstraintsDeleteRule, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public ReferentialConstraintsRecord setConstraintCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public ReferentialConstraintsRecord setConstraintSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public ReferentialConstraintsRecord setConstraintName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
     */
    public ReferentialConstraintsRecord setUniqueConstraintCatalog(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
     */
    public String getUniqueConstraintCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
     */
    public ReferentialConstraintsRecord setUniqueConstraintSchema(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
     */
    public String getUniqueConstraintSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
     */
    public ReferentialConstraintsRecord setUniqueConstraintName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
     */
    public String getUniqueConstraintName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
     */
    public ReferentialConstraintsRecord setMatchOption(ReferentialConstraintsMatchOption value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
     */
    public ReferentialConstraintsMatchOption getMatchOption() {
        return (ReferentialConstraintsMatchOption) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
     */
    public ReferentialConstraintsRecord setUpdateRule(ReferentialConstraintsUpdateRule value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
     */
    public ReferentialConstraintsUpdateRule getUpdateRule() {
        return (ReferentialConstraintsUpdateRule) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
     */
    public ReferentialConstraintsRecord setDeleteRule(ReferentialConstraintsDeleteRule value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
     */
    public ReferentialConstraintsDeleteRule getDeleteRule() {
        return (ReferentialConstraintsDeleteRule) get(8);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>.
     */
    public ReferentialConstraintsRecord setTableName(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>.
     */
    public ReferentialConstraintsRecord setReferencedTableName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>.
     */
    public String getReferencedTableName() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, String, String, String, String, ReferentialConstraintsMatchOption, ReferentialConstraintsUpdateRule, ReferentialConstraintsDeleteRule, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<String, String, String, String, String, String, ReferentialConstraintsMatchOption, ReferentialConstraintsUpdateRule, ReferentialConstraintsDeleteRule, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME;
    }

    @Override
    public Field<String> field4() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME;
    }

    @Override
    public Field<ReferentialConstraintsMatchOption> field7() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.MATCH_OPTION;
    }

    @Override
    public Field<ReferentialConstraintsUpdateRule> field8() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UPDATE_RULE;
    }

    @Override
    public Field<ReferentialConstraintsDeleteRule> field9() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.DELETE_RULE;
    }

    @Override
    public Field<String> field10() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.TABLE_NAME;
    }

    @Override
    public Field<String> field11() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME;
    }

    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    public String component3() {
        return getConstraintName();
    }

    @Override
    public String component4() {
        return getUniqueConstraintCatalog();
    }

    @Override
    public String component5() {
        return getUniqueConstraintSchema();
    }

    @Override
    public String component6() {
        return getUniqueConstraintName();
    }

    @Override
    public ReferentialConstraintsMatchOption component7() {
        return getMatchOption();
    }

    @Override
    public ReferentialConstraintsUpdateRule component8() {
        return getUpdateRule();
    }

    @Override
    public ReferentialConstraintsDeleteRule component9() {
        return getDeleteRule();
    }

    @Override
    public String component10() {
        return getTableName();
    }

    @Override
    public String component11() {
        return getReferencedTableName();
    }

    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    public String value3() {
        return getConstraintName();
    }

    @Override
    public String value4() {
        return getUniqueConstraintCatalog();
    }

    @Override
    public String value5() {
        return getUniqueConstraintSchema();
    }

    @Override
    public String value6() {
        return getUniqueConstraintName();
    }

    @Override
    public ReferentialConstraintsMatchOption value7() {
        return getMatchOption();
    }

    @Override
    public ReferentialConstraintsUpdateRule value8() {
        return getUpdateRule();
    }

    @Override
    public ReferentialConstraintsDeleteRule value9() {
        return getDeleteRule();
    }

    @Override
    public String value10() {
        return getTableName();
    }

    @Override
    public String value11() {
        return getReferencedTableName();
    }

    @Override
    public ReferentialConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value4(String value) {
        setUniqueConstraintCatalog(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value5(String value) {
        setUniqueConstraintSchema(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value6(String value) {
        setUniqueConstraintName(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value7(ReferentialConstraintsMatchOption value) {
        setMatchOption(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value8(ReferentialConstraintsUpdateRule value) {
        setUpdateRule(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value9(ReferentialConstraintsDeleteRule value) {
        setDeleteRule(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value10(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord value11(String value) {
        setReferencedTableName(value);
        return this;
    }

    @Override
    public ReferentialConstraintsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, ReferentialConstraintsMatchOption value7, ReferentialConstraintsUpdateRule value8, ReferentialConstraintsDeleteRule value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord() {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String uniqueConstraintCatalog, String uniqueConstraintSchema, String uniqueConstraintName, ReferentialConstraintsMatchOption matchOption, ReferentialConstraintsUpdateRule updateRule, ReferentialConstraintsDeleteRule deleteRule, String tableName, String referencedTableName) {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setUniqueConstraintCatalog(uniqueConstraintCatalog);
        setUniqueConstraintSchema(uniqueConstraintSchema);
        setUniqueConstraintName(uniqueConstraintName);
        setMatchOption(matchOption);
        setUpdateRule(updateRule);
        setDeleteRule(deleteRule);
        setTableName(tableName);
        setReferencedTableName(referencedTableName);
    }

    /**
     * Create a detached, initialised ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord(com.neurasim.jooq.information_schema.tables.pojos.ReferentialConstraints value) {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);

        if (value != null) {
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            setUniqueConstraintCatalog(value.getUniqueConstraintCatalog());
            setUniqueConstraintSchema(value.getUniqueConstraintSchema());
            setUniqueConstraintName(value.getUniqueConstraintName());
            setMatchOption(value.getMatchOption());
            setUpdateRule(value.getUpdateRule());
            setDeleteRule(value.getDeleteRule());
            setTableName(value.getTableName());
            setReferencedTableName(value.getReferencedTableName());
        }
    }
}
