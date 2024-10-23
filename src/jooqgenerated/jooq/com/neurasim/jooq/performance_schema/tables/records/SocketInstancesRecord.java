/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.enums.SocketInstancesState;
import com.neurasim.jooq.performance_schema.tables.SocketInstances;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SocketInstancesRecord extends UpdatableRecordImpl<SocketInstancesRecord> implements Record7<String, ULong, ULong, Integer, String, Integer, SocketInstancesState> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.socket_instances.EVENT_NAME</code>.
     */
    public SocketInstancesRecord setEventName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.socket_instances.EVENT_NAME</code>.
     */
    public String getEventName() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>performance_schema.socket_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public SocketInstancesRecord setObjectInstanceBegin(ULong value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>performance_schema.socket_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>performance_schema.socket_instances.THREAD_ID</code>.
     */
    public SocketInstancesRecord setThreadId(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.socket_instances.THREAD_ID</code>.
     */
    public ULong getThreadId() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>performance_schema.socket_instances.SOCKET_ID</code>.
     */
    public SocketInstancesRecord setSocketId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.socket_instances.SOCKET_ID</code>.
     */
    public Integer getSocketId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>performance_schema.socket_instances.IP</code>.
     */
    public SocketInstancesRecord setIp(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.socket_instances.IP</code>.
     */
    public String getIp() {
        return (String) get(4);
    }

    /**
     * Setter for <code>performance_schema.socket_instances.PORT</code>.
     */
    public SocketInstancesRecord setPort(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.socket_instances.PORT</code>.
     */
    public Integer getPort() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>performance_schema.socket_instances.STATE</code>.
     */
    public SocketInstancesRecord setState(SocketInstancesState value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.socket_instances.STATE</code>.
     */
    public SocketInstancesState getState() {
        return (SocketInstancesState) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, ULong, ULong, Integer, String, Integer, SocketInstancesState> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, ULong, ULong, Integer, String, Integer, SocketInstancesState> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SocketInstances.SOCKET_INSTANCES.EVENT_NAME;
    }

    @Override
    public Field<ULong> field2() {
        return SocketInstances.SOCKET_INSTANCES.OBJECT_INSTANCE_BEGIN;
    }

    @Override
    public Field<ULong> field3() {
        return SocketInstances.SOCKET_INSTANCES.THREAD_ID;
    }

    @Override
    public Field<Integer> field4() {
        return SocketInstances.SOCKET_INSTANCES.SOCKET_ID;
    }

    @Override
    public Field<String> field5() {
        return SocketInstances.SOCKET_INSTANCES.IP;
    }

    @Override
    public Field<Integer> field6() {
        return SocketInstances.SOCKET_INSTANCES.PORT;
    }

    @Override
    public Field<SocketInstancesState> field7() {
        return SocketInstances.SOCKET_INSTANCES.STATE;
    }

    @Override
    public String component1() {
        return getEventName();
    }

    @Override
    public ULong component2() {
        return getObjectInstanceBegin();
    }

    @Override
    public ULong component3() {
        return getThreadId();
    }

    @Override
    public Integer component4() {
        return getSocketId();
    }

    @Override
    public String component5() {
        return getIp();
    }

    @Override
    public Integer component6() {
        return getPort();
    }

    @Override
    public SocketInstancesState component7() {
        return getState();
    }

    @Override
    public String value1() {
        return getEventName();
    }

    @Override
    public ULong value2() {
        return getObjectInstanceBegin();
    }

    @Override
    public ULong value3() {
        return getThreadId();
    }

    @Override
    public Integer value4() {
        return getSocketId();
    }

    @Override
    public String value5() {
        return getIp();
    }

    @Override
    public Integer value6() {
        return getPort();
    }

    @Override
    public SocketInstancesState value7() {
        return getState();
    }

    @Override
    public SocketInstancesRecord value1(String value) {
        setEventName(value);
        return this;
    }

    @Override
    public SocketInstancesRecord value2(ULong value) {
        setObjectInstanceBegin(value);
        return this;
    }

    @Override
    public SocketInstancesRecord value3(ULong value) {
        setThreadId(value);
        return this;
    }

    @Override
    public SocketInstancesRecord value4(Integer value) {
        setSocketId(value);
        return this;
    }

    @Override
    public SocketInstancesRecord value5(String value) {
        setIp(value);
        return this;
    }

    @Override
    public SocketInstancesRecord value6(Integer value) {
        setPort(value);
        return this;
    }

    @Override
    public SocketInstancesRecord value7(SocketInstancesState value) {
        setState(value);
        return this;
    }

    @Override
    public SocketInstancesRecord values(String value1, ULong value2, ULong value3, Integer value4, String value5, Integer value6, SocketInstancesState value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SocketInstancesRecord
     */
    public SocketInstancesRecord() {
        super(SocketInstances.SOCKET_INSTANCES);
    }

    /**
     * Create a detached, initialised SocketInstancesRecord
     */
    public SocketInstancesRecord(String eventName, ULong objectInstanceBegin, ULong threadId, Integer socketId, String ip, Integer port, SocketInstancesState state) {
        super(SocketInstances.SOCKET_INSTANCES);

        setEventName(eventName);
        setObjectInstanceBegin(objectInstanceBegin);
        setThreadId(threadId);
        setSocketId(socketId);
        setIp(ip);
        setPort(port);
        setState(state);
    }

    /**
     * Create a detached, initialised SocketInstancesRecord
     */
    public SocketInstancesRecord(com.neurasim.jooq.performance_schema.tables.pojos.SocketInstances value) {
        super(SocketInstances.SOCKET_INSTANCES);

        if (value != null) {
            setEventName(value.getEventName());
            setObjectInstanceBegin(value.getObjectInstanceBegin());
            setThreadId(value.getThreadId());
            setSocketId(value.getSocketId());
            setIp(value.getIp());
            setPort(value.getPort());
            setState(value.getState());
        }
    }
}
