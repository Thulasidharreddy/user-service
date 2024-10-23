/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.SlaveWorkerInfo;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Record2;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * Worker Information
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SlaveWorkerInfoRecord extends UpdatableRecordImpl<SlaveWorkerInfoRecord> implements Record13<UInteger, String, ULong, String, ULong, String, ULong, String, ULong, UInteger, UInteger, byte[], String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.slave_worker_info.Id</code>.
     */
    public SlaveWorkerInfoRecord setId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Id</code>.
     */
    public UInteger getId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Relay_log_name</code>.
     */
    public SlaveWorkerInfoRecord setRelayLogName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Relay_log_name</code>.
     */
    public String getRelayLogName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Relay_log_pos</code>.
     */
    public SlaveWorkerInfoRecord setRelayLogPos(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Relay_log_pos</code>.
     */
    public ULong getRelayLogPos() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Master_log_name</code>.
     */
    public SlaveWorkerInfoRecord setMasterLogName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Master_log_name</code>.
     */
    public String getMasterLogName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Master_log_pos</code>.
     */
    public SlaveWorkerInfoRecord setMasterLogPos(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Master_log_pos</code>.
     */
    public ULong getMasterLogPos() {
        return (ULong) get(4);
    }

    /**
     * Setter for
     * <code>mysql.slave_worker_info.Checkpoint_relay_log_name</code>.
     */
    public SlaveWorkerInfoRecord setCheckpointRelayLogName(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for
     * <code>mysql.slave_worker_info.Checkpoint_relay_log_name</code>.
     */
    public String getCheckpointRelayLogName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Checkpoint_relay_log_pos</code>.
     */
    public SlaveWorkerInfoRecord setCheckpointRelayLogPos(ULong value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Checkpoint_relay_log_pos</code>.
     */
    public ULong getCheckpointRelayLogPos() {
        return (ULong) get(6);
    }

    /**
     * Setter for
     * <code>mysql.slave_worker_info.Checkpoint_master_log_name</code>.
     */
    public SlaveWorkerInfoRecord setCheckpointMasterLogName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for
     * <code>mysql.slave_worker_info.Checkpoint_master_log_name</code>.
     */
    public String getCheckpointMasterLogName() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>mysql.slave_worker_info.Checkpoint_master_log_pos</code>.
     */
    public SlaveWorkerInfoRecord setCheckpointMasterLogPos(ULong value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for
     * <code>mysql.slave_worker_info.Checkpoint_master_log_pos</code>.
     */
    public ULong getCheckpointMasterLogPos() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Checkpoint_seqno</code>.
     */
    public SlaveWorkerInfoRecord setCheckpointSeqno(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Checkpoint_seqno</code>.
     */
    public UInteger getCheckpointSeqno() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Checkpoint_group_size</code>.
     */
    public SlaveWorkerInfoRecord setCheckpointGroupSize(UInteger value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Checkpoint_group_size</code>.
     */
    public UInteger getCheckpointGroupSize() {
        return (UInteger) get(10);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Checkpoint_group_bitmap</code>.
     */
    public SlaveWorkerInfoRecord setCheckpointGroupBitmap(byte[] value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Checkpoint_group_bitmap</code>.
     */
    public byte[] getCheckpointGroupBitmap() {
        return (byte[]) get(11);
    }

    /**
     * Setter for <code>mysql.slave_worker_info.Channel_name</code>. The channel
     * on which the replica is connected to a source. Used in Multisource
     * Replication
     */
    public SlaveWorkerInfoRecord setChannelName(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>mysql.slave_worker_info.Channel_name</code>. The channel
     * on which the replica is connected to a source. Used in Multisource
     * Replication
     */
    public String getChannelName() {
        return (String) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, UInteger> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<UInteger, String, ULong, String, ULong, String, ULong, String, ULong, UInteger, UInteger, byte[], String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<UInteger, String, ULong, String, ULong, String, ULong, String, ULong, UInteger, UInteger, byte[], String> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.ID;
    }

    @Override
    public Field<String> field2() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.RELAY_LOG_NAME;
    }

    @Override
    public Field<ULong> field3() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.RELAY_LOG_POS;
    }

    @Override
    public Field<String> field4() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.MASTER_LOG_NAME;
    }

    @Override
    public Field<ULong> field5() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.MASTER_LOG_POS;
    }

    @Override
    public Field<String> field6() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHECKPOINT_RELAY_LOG_NAME;
    }

    @Override
    public Field<ULong> field7() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHECKPOINT_RELAY_LOG_POS;
    }

    @Override
    public Field<String> field8() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHECKPOINT_MASTER_LOG_NAME;
    }

    @Override
    public Field<ULong> field9() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHECKPOINT_MASTER_LOG_POS;
    }

    @Override
    public Field<UInteger> field10() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHECKPOINT_SEQNO;
    }

    @Override
    public Field<UInteger> field11() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHECKPOINT_GROUP_SIZE;
    }

    @Override
    public Field<byte[]> field12() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHECKPOINT_GROUP_BITMAP;
    }

    @Override
    public Field<String> field13() {
        return SlaveWorkerInfo.SLAVE_WORKER_INFO.CHANNEL_NAME;
    }

    @Override
    public UInteger component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getRelayLogName();
    }

    @Override
    public ULong component3() {
        return getRelayLogPos();
    }

    @Override
    public String component4() {
        return getMasterLogName();
    }

    @Override
    public ULong component5() {
        return getMasterLogPos();
    }

    @Override
    public String component6() {
        return getCheckpointRelayLogName();
    }

    @Override
    public ULong component7() {
        return getCheckpointRelayLogPos();
    }

    @Override
    public String component8() {
        return getCheckpointMasterLogName();
    }

    @Override
    public ULong component9() {
        return getCheckpointMasterLogPos();
    }

    @Override
    public UInteger component10() {
        return getCheckpointSeqno();
    }

    @Override
    public UInteger component11() {
        return getCheckpointGroupSize();
    }

    @Override
    public byte[] component12() {
        return getCheckpointGroupBitmap();
    }

    @Override
    public String component13() {
        return getChannelName();
    }

    @Override
    public UInteger value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getRelayLogName();
    }

    @Override
    public ULong value3() {
        return getRelayLogPos();
    }

    @Override
    public String value4() {
        return getMasterLogName();
    }

    @Override
    public ULong value5() {
        return getMasterLogPos();
    }

    @Override
    public String value6() {
        return getCheckpointRelayLogName();
    }

    @Override
    public ULong value7() {
        return getCheckpointRelayLogPos();
    }

    @Override
    public String value8() {
        return getCheckpointMasterLogName();
    }

    @Override
    public ULong value9() {
        return getCheckpointMasterLogPos();
    }

    @Override
    public UInteger value10() {
        return getCheckpointSeqno();
    }

    @Override
    public UInteger value11() {
        return getCheckpointGroupSize();
    }

    @Override
    public byte[] value12() {
        return getCheckpointGroupBitmap();
    }

    @Override
    public String value13() {
        return getChannelName();
    }

    @Override
    public SlaveWorkerInfoRecord value1(UInteger value) {
        setId(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value2(String value) {
        setRelayLogName(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value3(ULong value) {
        setRelayLogPos(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value4(String value) {
        setMasterLogName(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value5(ULong value) {
        setMasterLogPos(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value6(String value) {
        setCheckpointRelayLogName(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value7(ULong value) {
        setCheckpointRelayLogPos(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value8(String value) {
        setCheckpointMasterLogName(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value9(ULong value) {
        setCheckpointMasterLogPos(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value10(UInteger value) {
        setCheckpointSeqno(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value11(UInteger value) {
        setCheckpointGroupSize(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value12(byte[] value) {
        setCheckpointGroupBitmap(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord value13(String value) {
        setChannelName(value);
        return this;
    }

    @Override
    public SlaveWorkerInfoRecord values(UInteger value1, String value2, ULong value3, String value4, ULong value5, String value6, ULong value7, String value8, ULong value9, UInteger value10, UInteger value11, byte[] value12, String value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SlaveWorkerInfoRecord
     */
    public SlaveWorkerInfoRecord() {
        super(SlaveWorkerInfo.SLAVE_WORKER_INFO);
    }

    /**
     * Create a detached, initialised SlaveWorkerInfoRecord
     */
    public SlaveWorkerInfoRecord(UInteger id, String relayLogName, ULong relayLogPos, String masterLogName, ULong masterLogPos, String checkpointRelayLogName, ULong checkpointRelayLogPos, String checkpointMasterLogName, ULong checkpointMasterLogPos, UInteger checkpointSeqno, UInteger checkpointGroupSize, byte[] checkpointGroupBitmap, String channelName) {
        super(SlaveWorkerInfo.SLAVE_WORKER_INFO);

        setId(id);
        setRelayLogName(relayLogName);
        setRelayLogPos(relayLogPos);
        setMasterLogName(masterLogName);
        setMasterLogPos(masterLogPos);
        setCheckpointRelayLogName(checkpointRelayLogName);
        setCheckpointRelayLogPos(checkpointRelayLogPos);
        setCheckpointMasterLogName(checkpointMasterLogName);
        setCheckpointMasterLogPos(checkpointMasterLogPos);
        setCheckpointSeqno(checkpointSeqno);
        setCheckpointGroupSize(checkpointGroupSize);
        setCheckpointGroupBitmap(checkpointGroupBitmap);
        setChannelName(channelName);
    }

    /**
     * Create a detached, initialised SlaveWorkerInfoRecord
     */
    public SlaveWorkerInfoRecord(com.neurasim.jooq.mysql.tables.pojos.SlaveWorkerInfo value) {
        super(SlaveWorkerInfo.SLAVE_WORKER_INFO);

        if (value != null) {
            setId(value.getId());
            setRelayLogName(value.getRelayLogName());
            setRelayLogPos(value.getRelayLogPos());
            setMasterLogName(value.getMasterLogName());
            setMasterLogPos(value.getMasterLogPos());
            setCheckpointRelayLogName(value.getCheckpointRelayLogName());
            setCheckpointRelayLogPos(value.getCheckpointRelayLogPos());
            setCheckpointMasterLogName(value.getCheckpointMasterLogName());
            setCheckpointMasterLogPos(value.getCheckpointMasterLogPos());
            setCheckpointSeqno(value.getCheckpointSeqno());
            setCheckpointGroupSize(value.getCheckpointGroupSize());
            setCheckpointGroupBitmap(value.getCheckpointGroupBitmap());
            setChannelName(value.getChannelName());
        }
    }
}
