/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.Processlist;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProcesslistRecord extends TableRecordImpl<ProcesslistRecord> implements Record8<ULong, String, String, String, String, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.PROCESSLIST.ID</code>.
     */
    public ProcesslistRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.ID</code>.
     */
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>information_schema.PROCESSLIST.USER</code>.
     */
    public ProcesslistRecord setUser(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.USER</code>.
     */
    public String getUser() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.PROCESSLIST.HOST</code>.
     */
    public ProcesslistRecord setHost(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.HOST</code>.
     */
    public String getHost() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.PROCESSLIST.DB</code>.
     */
    public ProcesslistRecord setDb(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.DB</code>.
     */
    public String getDb() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.PROCESSLIST.COMMAND</code>.
     */
    public ProcesslistRecord setCommand(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.COMMAND</code>.
     */
    public String getCommand() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.PROCESSLIST.TIME</code>.
     */
    public ProcesslistRecord setTime(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.TIME</code>.
     */
    public Integer getTime() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>information_schema.PROCESSLIST.STATE</code>.
     */
    public ProcesslistRecord setState(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.STATE</code>.
     */
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.PROCESSLIST.INFO</code>.
     */
    public ProcesslistRecord setInfo(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.INFO</code>.
     */
    public String getInfo() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<ULong, String, String, String, String, Integer, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<ULong, String, String, String, String, Integer, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Processlist.PROCESSLIST.ID;
    }

    @Override
    public Field<String> field2() {
        return Processlist.PROCESSLIST.USER;
    }

    @Override
    public Field<String> field3() {
        return Processlist.PROCESSLIST.HOST;
    }

    @Override
    public Field<String> field4() {
        return Processlist.PROCESSLIST.DB;
    }

    @Override
    public Field<String> field5() {
        return Processlist.PROCESSLIST.COMMAND;
    }

    @Override
    public Field<Integer> field6() {
        return Processlist.PROCESSLIST.TIME;
    }

    @Override
    public Field<String> field7() {
        return Processlist.PROCESSLIST.STATE;
    }

    @Override
    public Field<String> field8() {
        return Processlist.PROCESSLIST.INFO;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUser();
    }

    @Override
    public String component3() {
        return getHost();
    }

    @Override
    public String component4() {
        return getDb();
    }

    @Override
    public String component5() {
        return getCommand();
    }

    @Override
    public Integer component6() {
        return getTime();
    }

    @Override
    public String component7() {
        return getState();
    }

    @Override
    public String component8() {
        return getInfo();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUser();
    }

    @Override
    public String value3() {
        return getHost();
    }

    @Override
    public String value4() {
        return getDb();
    }

    @Override
    public String value5() {
        return getCommand();
    }

    @Override
    public Integer value6() {
        return getTime();
    }

    @Override
    public String value7() {
        return getState();
    }

    @Override
    public String value8() {
        return getInfo();
    }

    @Override
    public ProcesslistRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public ProcesslistRecord value2(String value) {
        setUser(value);
        return this;
    }

    @Override
    public ProcesslistRecord value3(String value) {
        setHost(value);
        return this;
    }

    @Override
    public ProcesslistRecord value4(String value) {
        setDb(value);
        return this;
    }

    @Override
    public ProcesslistRecord value5(String value) {
        setCommand(value);
        return this;
    }

    @Override
    public ProcesslistRecord value6(Integer value) {
        setTime(value);
        return this;
    }

    @Override
    public ProcesslistRecord value7(String value) {
        setState(value);
        return this;
    }

    @Override
    public ProcesslistRecord value8(String value) {
        setInfo(value);
        return this;
    }

    @Override
    public ProcesslistRecord values(ULong value1, String value2, String value3, String value4, String value5, Integer value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProcesslistRecord
     */
    public ProcesslistRecord() {
        super(Processlist.PROCESSLIST);
    }

    /**
     * Create a detached, initialised ProcesslistRecord
     */
    public ProcesslistRecord(ULong id, String user, String host, String db, String command, Integer time, String state, String info) {
        super(Processlist.PROCESSLIST);

        setId(id);
        setUser(user);
        setHost(host);
        setDb(db);
        setCommand(command);
        setTime(time);
        setState(state);
        setInfo(info);
    }

    /**
     * Create a detached, initialised ProcesslistRecord
     */
    public ProcesslistRecord(com.neurasim.jooq.information_schema.tables.pojos.Processlist value) {
        super(Processlist.PROCESSLIST);

        if (value != null) {
            setId(value.getId());
            setUser(value.getUser());
            setHost(value.getHost());
            setDb(value.getDb());
            setCommand(value.getCommand());
            setTime(value.getTime());
            setState(value.getState());
            setInfo(value.getInfo());
        }
    }
}
