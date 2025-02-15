/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.tables.SessionAccountConnectAttrs;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionAccountConnectAttrsRecord extends UpdatableRecordImpl<SessionAccountConnectAttrsRecord> implements Record4<ULong, String, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>performance_schema.session_account_connect_attrs.PROCESSLIST_ID</code>.
     */
    public SessionAccountConnectAttrsRecord setProcesslistId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.session_account_connect_attrs.PROCESSLIST_ID</code>.
     */
    public ULong getProcesslistId() {
        return (ULong) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.session_account_connect_attrs.ATTR_NAME</code>.
     */
    public SessionAccountConnectAttrsRecord setAttrName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.session_account_connect_attrs.ATTR_NAME</code>.
     */
    public String getAttrName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>performance_schema.session_account_connect_attrs.ATTR_VALUE</code>.
     */
    public SessionAccountConnectAttrsRecord setAttrValue(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.session_account_connect_attrs.ATTR_VALUE</code>.
     */
    public String getAttrValue() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>performance_schema.session_account_connect_attrs.ORDINAL_POSITION</code>.
     */
    public SessionAccountConnectAttrsRecord setOrdinalPosition(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.session_account_connect_attrs.ORDINAL_POSITION</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<ULong, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<ULong, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<ULong, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS.PROCESSLIST_ID;
    }

    @Override
    public Field<String> field2() {
        return SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS.ATTR_NAME;
    }

    @Override
    public Field<String> field3() {
        return SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS.ATTR_VALUE;
    }

    @Override
    public Field<Integer> field4() {
        return SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS.ORDINAL_POSITION;
    }

    @Override
    public ULong component1() {
        return getProcesslistId();
    }

    @Override
    public String component2() {
        return getAttrName();
    }

    @Override
    public String component3() {
        return getAttrValue();
    }

    @Override
    public Integer component4() {
        return getOrdinalPosition();
    }

    @Override
    public ULong value1() {
        return getProcesslistId();
    }

    @Override
    public String value2() {
        return getAttrName();
    }

    @Override
    public String value3() {
        return getAttrValue();
    }

    @Override
    public Integer value4() {
        return getOrdinalPosition();
    }

    @Override
    public SessionAccountConnectAttrsRecord value1(ULong value) {
        setProcesslistId(value);
        return this;
    }

    @Override
    public SessionAccountConnectAttrsRecord value2(String value) {
        setAttrName(value);
        return this;
    }

    @Override
    public SessionAccountConnectAttrsRecord value3(String value) {
        setAttrValue(value);
        return this;
    }

    @Override
    public SessionAccountConnectAttrsRecord value4(Integer value) {
        setOrdinalPosition(value);
        return this;
    }

    @Override
    public SessionAccountConnectAttrsRecord values(ULong value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SessionAccountConnectAttrsRecord
     */
    public SessionAccountConnectAttrsRecord() {
        super(SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS);
    }

    /**
     * Create a detached, initialised SessionAccountConnectAttrsRecord
     */
    public SessionAccountConnectAttrsRecord(ULong processlistId, String attrName, String attrValue, Integer ordinalPosition) {
        super(SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS);

        setProcesslistId(processlistId);
        setAttrName(attrName);
        setAttrValue(attrValue);
        setOrdinalPosition(ordinalPosition);
    }

    /**
     * Create a detached, initialised SessionAccountConnectAttrsRecord
     */
    public SessionAccountConnectAttrsRecord(com.neurasim.jooq.performance_schema.tables.pojos.SessionAccountConnectAttrs value) {
        super(SessionAccountConnectAttrs.SESSION_ACCOUNT_CONNECT_ATTRS);

        if (value != null) {
            setProcesslistId(value.getProcesslistId());
            setAttrName(value.getAttrName());
            setAttrValue(value.getAttrValue());
            setOrdinalPosition(value.getOrdinalPosition());
        }
    }
}
