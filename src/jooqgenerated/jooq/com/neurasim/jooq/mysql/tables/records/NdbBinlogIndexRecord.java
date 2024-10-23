/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.NdbBinlogIndex;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Record3;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NdbBinlogIndexRecord extends UpdatableRecordImpl<NdbBinlogIndexRecord> implements Record12<ULong, String, ULong, UInteger, UInteger, UInteger, UInteger, UInteger, ULong, UInteger, ULong, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.ndb_binlog_index.Position</code>.
     */
    public NdbBinlogIndexRecord setPosition(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.Position</code>.
     */
    public ULong getPosition() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.File</code>.
     */
    public NdbBinlogIndexRecord setFile(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.File</code>.
     */
    public String getFile() {
        return (String) get(1);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.epoch</code>.
     */
    public NdbBinlogIndexRecord setEpoch(ULong value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.epoch</code>.
     */
    public ULong getEpoch() {
        return (ULong) get(2);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.inserts</code>.
     */
    public NdbBinlogIndexRecord setInserts(UInteger value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.inserts</code>.
     */
    public UInteger getInserts() {
        return (UInteger) get(3);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.updates</code>.
     */
    public NdbBinlogIndexRecord setUpdates(UInteger value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.updates</code>.
     */
    public UInteger getUpdates() {
        return (UInteger) get(4);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.deletes</code>.
     */
    public NdbBinlogIndexRecord setDeletes(UInteger value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.deletes</code>.
     */
    public UInteger getDeletes() {
        return (UInteger) get(5);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.schemaops</code>.
     */
    public NdbBinlogIndexRecord setSchemaops(UInteger value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.schemaops</code>.
     */
    public UInteger getSchemaops() {
        return (UInteger) get(6);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.orig_server_id</code>.
     */
    public NdbBinlogIndexRecord setOrigServerId(UInteger value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.orig_server_id</code>.
     */
    public UInteger getOrigServerId() {
        return (UInteger) get(7);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.orig_epoch</code>.
     */
    public NdbBinlogIndexRecord setOrigEpoch(ULong value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.orig_epoch</code>.
     */
    public ULong getOrigEpoch() {
        return (ULong) get(8);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.gci</code>.
     */
    public NdbBinlogIndexRecord setGci(UInteger value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.gci</code>.
     */
    public UInteger getGci() {
        return (UInteger) get(9);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.next_position</code>.
     */
    public NdbBinlogIndexRecord setNextPosition(ULong value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.next_position</code>.
     */
    public ULong getNextPosition() {
        return (ULong) get(10);
    }

    /**
     * Setter for <code>mysql.ndb_binlog_index.next_file</code>.
     */
    public NdbBinlogIndexRecord setNextFile(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>mysql.ndb_binlog_index.next_file</code>.
     */
    public String getNextFile() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record3<ULong, UInteger, ULong> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<ULong, String, ULong, UInteger, UInteger, UInteger, UInteger, UInteger, ULong, UInteger, ULong, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<ULong, String, ULong, UInteger, UInteger, UInteger, UInteger, UInteger, ULong, UInteger, ULong, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.POSITION;
    }

    @Override
    public Field<String> field2() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.FILE;
    }

    @Override
    public Field<ULong> field3() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.EPOCH;
    }

    @Override
    public Field<UInteger> field4() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.INSERTS;
    }

    @Override
    public Field<UInteger> field5() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.UPDATES;
    }

    @Override
    public Field<UInteger> field6() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.DELETES;
    }

    @Override
    public Field<UInteger> field7() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.SCHEMAOPS;
    }

    @Override
    public Field<UInteger> field8() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_SERVER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.ORIG_EPOCH;
    }

    @Override
    public Field<UInteger> field10() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.GCI;
    }

    @Override
    public Field<ULong> field11() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.NEXT_POSITION;
    }

    @Override
    public Field<String> field12() {
        return NdbBinlogIndex.NDB_BINLOG_INDEX.NEXT_FILE;
    }

    @Override
    public ULong component1() {
        return getPosition();
    }

    @Override
    public String component2() {
        return getFile();
    }

    @Override
    public ULong component3() {
        return getEpoch();
    }

    @Override
    public UInteger component4() {
        return getInserts();
    }

    @Override
    public UInteger component5() {
        return getUpdates();
    }

    @Override
    public UInteger component6() {
        return getDeletes();
    }

    @Override
    public UInteger component7() {
        return getSchemaops();
    }

    @Override
    public UInteger component8() {
        return getOrigServerId();
    }

    @Override
    public ULong component9() {
        return getOrigEpoch();
    }

    @Override
    public UInteger component10() {
        return getGci();
    }

    @Override
    public ULong component11() {
        return getNextPosition();
    }

    @Override
    public String component12() {
        return getNextFile();
    }

    @Override
    public ULong value1() {
        return getPosition();
    }

    @Override
    public String value2() {
        return getFile();
    }

    @Override
    public ULong value3() {
        return getEpoch();
    }

    @Override
    public UInteger value4() {
        return getInserts();
    }

    @Override
    public UInteger value5() {
        return getUpdates();
    }

    @Override
    public UInteger value6() {
        return getDeletes();
    }

    @Override
    public UInteger value7() {
        return getSchemaops();
    }

    @Override
    public UInteger value8() {
        return getOrigServerId();
    }

    @Override
    public ULong value9() {
        return getOrigEpoch();
    }

    @Override
    public UInteger value10() {
        return getGci();
    }

    @Override
    public ULong value11() {
        return getNextPosition();
    }

    @Override
    public String value12() {
        return getNextFile();
    }

    @Override
    public NdbBinlogIndexRecord value1(ULong value) {
        setPosition(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value2(String value) {
        setFile(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value3(ULong value) {
        setEpoch(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value4(UInteger value) {
        setInserts(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value5(UInteger value) {
        setUpdates(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value6(UInteger value) {
        setDeletes(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value7(UInteger value) {
        setSchemaops(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value8(UInteger value) {
        setOrigServerId(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value9(ULong value) {
        setOrigEpoch(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value10(UInteger value) {
        setGci(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value11(ULong value) {
        setNextPosition(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord value12(String value) {
        setNextFile(value);
        return this;
    }

    @Override
    public NdbBinlogIndexRecord values(ULong value1, String value2, ULong value3, UInteger value4, UInteger value5, UInteger value6, UInteger value7, UInteger value8, ULong value9, UInteger value10, ULong value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NdbBinlogIndexRecord
     */
    public NdbBinlogIndexRecord() {
        super(NdbBinlogIndex.NDB_BINLOG_INDEX);
    }

    /**
     * Create a detached, initialised NdbBinlogIndexRecord
     */
    public NdbBinlogIndexRecord(ULong position, String file, ULong epoch, UInteger inserts, UInteger updates, UInteger deletes, UInteger schemaops, UInteger origServerId, ULong origEpoch, UInteger gci, ULong nextPosition, String nextFile) {
        super(NdbBinlogIndex.NDB_BINLOG_INDEX);

        setPosition(position);
        setFile(file);
        setEpoch(epoch);
        setInserts(inserts);
        setUpdates(updates);
        setDeletes(deletes);
        setSchemaops(schemaops);
        setOrigServerId(origServerId);
        setOrigEpoch(origEpoch);
        setGci(gci);
        setNextPosition(nextPosition);
        setNextFile(nextFile);
    }

    /**
     * Create a detached, initialised NdbBinlogIndexRecord
     */
    public NdbBinlogIndexRecord(com.neurasim.jooq.mysql.tables.pojos.NdbBinlogIndex value) {
        super(NdbBinlogIndex.NDB_BINLOG_INDEX);

        if (value != null) {
            setPosition(value.getPosition());
            setFile(value.getFile());
            setEpoch(value.getEpoch());
            setInserts(value.getInserts());
            setUpdates(value.getUpdates());
            setDeletes(value.getDeletes());
            setSchemaops(value.getSchemaops());
            setOrigServerId(value.getOrigServerId());
            setOrigEpoch(value.getOrigEpoch());
            setGci(value.getGci());
            setNextPosition(value.getNextPosition());
            setNextFile(value.getNextFile());
        }
    }
}
