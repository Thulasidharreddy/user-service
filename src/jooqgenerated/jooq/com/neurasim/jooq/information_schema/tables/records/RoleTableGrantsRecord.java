/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.RoleTableGrants;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleTableGrantsRecord extends TableRecordImpl<RoleTableGrantsRecord> implements Record9<String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR</code>.
     */
    public RoleTableGrantsRecord setGrantor(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR</code>.
     */
    public String getGrantor() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR_HOST</code>.
     */
    public RoleTableGrantsRecord setGrantorHost(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTOR_HOST</code>.
     */
    public String getGrantorHost() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE</code>.
     */
    public RoleTableGrantsRecord setGrantee(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE</code>.
     */
    public String getGrantee() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE_HOST</code>.
     */
    public RoleTableGrantsRecord setGranteeHost(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_TABLE_GRANTS.GRANTEE_HOST</code>.
     */
    public String getGranteeHost() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_CATALOG</code>.
     */
    public RoleTableGrantsRecord setTableCatalog(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_SCHEMA</code>.
     */
    public RoleTableGrantsRecord setTableSchema(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_TABLE_GRANTS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.ROLE_TABLE_GRANTS.TABLE_NAME</code>.
     */
    public RoleTableGrantsRecord setTableName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.ROLE_TABLE_GRANTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_TABLE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public RoleTableGrantsRecord setPrivilegeType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_TABLE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>information_schema.ROLE_TABLE_GRANTS.IS_GRANTABLE</code>.
     */
    public RoleTableGrantsRecord setIsGrantable(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_TABLE_GRANTS.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.GRANTOR;
    }

    @Override
    public Field<String> field2() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.GRANTOR_HOST;
    }

    @Override
    public Field<String> field3() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.GRANTEE;
    }

    @Override
    public Field<String> field4() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.GRANTEE_HOST;
    }

    @Override
    public Field<String> field5() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_CATALOG;
    }

    @Override
    public Field<String> field6() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field7() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.TABLE_NAME;
    }

    @Override
    public Field<String> field8() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.PRIVILEGE_TYPE;
    }

    @Override
    public Field<String> field9() {
        return RoleTableGrants.ROLE_TABLE_GRANTS.IS_GRANTABLE;
    }

    @Override
    public String component1() {
        return getGrantor();
    }

    @Override
    public String component2() {
        return getGrantorHost();
    }

    @Override
    public String component3() {
        return getGrantee();
    }

    @Override
    public String component4() {
        return getGranteeHost();
    }

    @Override
    public String component5() {
        return getTableCatalog();
    }

    @Override
    public String component6() {
        return getTableSchema();
    }

    @Override
    public String component7() {
        return getTableName();
    }

    @Override
    public String component8() {
        return getPrivilegeType();
    }

    @Override
    public String component9() {
        return getIsGrantable();
    }

    @Override
    public String value1() {
        return getGrantor();
    }

    @Override
    public String value2() {
        return getGrantorHost();
    }

    @Override
    public String value3() {
        return getGrantee();
    }

    @Override
    public String value4() {
        return getGranteeHost();
    }

    @Override
    public String value5() {
        return getTableCatalog();
    }

    @Override
    public String value6() {
        return getTableSchema();
    }

    @Override
    public String value7() {
        return getTableName();
    }

    @Override
    public String value8() {
        return getPrivilegeType();
    }

    @Override
    public String value9() {
        return getIsGrantable();
    }

    @Override
    public RoleTableGrantsRecord value1(String value) {
        setGrantor(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value2(String value) {
        setGrantorHost(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value3(String value) {
        setGrantee(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value4(String value) {
        setGranteeHost(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value5(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value6(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value7(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value8(String value) {
        setPrivilegeType(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord value9(String value) {
        setIsGrantable(value);
        return this;
    }

    @Override
    public RoleTableGrantsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RoleTableGrantsRecord
     */
    public RoleTableGrantsRecord() {
        super(RoleTableGrants.ROLE_TABLE_GRANTS);
    }

    /**
     * Create a detached, initialised RoleTableGrantsRecord
     */
    public RoleTableGrantsRecord(String grantor, String grantorHost, String grantee, String granteeHost, String tableCatalog, String tableSchema, String tableName, String privilegeType, String isGrantable) {
        super(RoleTableGrants.ROLE_TABLE_GRANTS);

        setGrantor(grantor);
        setGrantorHost(grantorHost);
        setGrantee(grantee);
        setGranteeHost(granteeHost);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
        setPrivilegeType(privilegeType);
        setIsGrantable(isGrantable);
    }

    /**
     * Create a detached, initialised RoleTableGrantsRecord
     */
    public RoleTableGrantsRecord(com.neurasim.jooq.information_schema.tables.pojos.RoleTableGrants value) {
        super(RoleTableGrants.ROLE_TABLE_GRANTS);

        if (value != null) {
            setGrantor(value.getGrantor());
            setGrantorHost(value.getGrantorHost());
            setGrantee(value.getGrantee());
            setGranteeHost(value.getGranteeHost());
            setTableCatalog(value.getTableCatalog());
            setTableSchema(value.getTableSchema());
            setTableName(value.getTableName());
            setPrivilegeType(value.getPrivilegeType());
            setIsGrantable(value.getIsGrantable());
        }
    }
}
