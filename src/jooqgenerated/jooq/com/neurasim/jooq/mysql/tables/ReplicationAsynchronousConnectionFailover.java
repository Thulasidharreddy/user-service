/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables;


import com.neurasim.jooq.mysql.Indexes;
import com.neurasim.jooq.mysql.Keys;
import com.neurasim.jooq.mysql.Mysql;
import com.neurasim.jooq.mysql.tables.records.ReplicationAsynchronousConnectionFailoverRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * The source configuration details
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ReplicationAsynchronousConnectionFailover extends TableImpl<ReplicationAsynchronousConnectionFailoverRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>mysql.replication_asynchronous_connection_failover</code>
     */
    public static final ReplicationAsynchronousConnectionFailover REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER = new ReplicationAsynchronousConnectionFailover();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplicationAsynchronousConnectionFailoverRecord> getRecordType() {
        return ReplicationAsynchronousConnectionFailoverRecord.class;
    }

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Channel_name</code>.
     * The replication channel name that connects source and replica.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverRecord, String> CHANNEL_NAME = createField(DSL.name("Channel_name"), SQLDataType.CHAR(64).nullable(false), this, "The replication channel name that connects source and replica.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Host</code>. The
     * source hostname that the replica will attempt to switch over the
     * replication connection to in case of a failure.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverRecord, String> HOST = createField(DSL.name("Host"), SQLDataType.CHAR(255).nullable(false), this, "The source hostname that the replica will attempt to switch over the replication connection to in case of a failure.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Port</code>. The
     * source port that the replica will attempt to switch over the replication
     * connection to in case of a failure.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverRecord, UInteger> PORT = createField(DSL.name("Port"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "The source port that the replica will attempt to switch over the replication connection to in case of a failure.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Network_namespace</code>.
     * The source network namespace that the replica will attempt to switch over
     * the replication connection to in case of a failure. If its value is
     * empty, connections use the default (global) namespace.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverRecord, String> NETWORK_NAMESPACE = createField(DSL.name("Network_namespace"), SQLDataType.CHAR(64).nullable(false), this, "The source network namespace that the replica will attempt to switch over the replication connection to in case of a failure. If its value is empty, connections use the default (global) namespace.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Weight</code>.
     * The order in which the replica shall try to switch the connection over to
     * when there are failures. Weight can be set to a number between 1 and 100,
     * where 100 is the highest weight and 1 the lowest.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverRecord, UByte> WEIGHT = createField(DSL.name("Weight"), SQLDataType.TINYINTUNSIGNED.nullable(false), this, "The order in which the replica shall try to switch the connection over to when there are failures. Weight can be set to a number between 1 and 100, where 100 is the highest weight and 1 the lowest.");

    /**
     * The column
     * <code>mysql.replication_asynchronous_connection_failover.Managed_name</code>.
     * The name of the group which this server belongs to.
     */
    public final TableField<ReplicationAsynchronousConnectionFailoverRecord, String> MANAGED_NAME = createField(DSL.name("Managed_name"), SQLDataType.CHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.CHAR)), this, "The name of the group which this server belongs to.");

    private ReplicationAsynchronousConnectionFailover(Name alias, Table<ReplicationAsynchronousConnectionFailoverRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReplicationAsynchronousConnectionFailover(Name alias, Table<ReplicationAsynchronousConnectionFailoverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("The source configuration details"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>mysql.replication_asynchronous_connection_failover</code> table
     * reference
     */
    public ReplicationAsynchronousConnectionFailover(String alias) {
        this(DSL.name(alias), REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER);
    }

    /**
     * Create an aliased
     * <code>mysql.replication_asynchronous_connection_failover</code> table
     * reference
     */
    public ReplicationAsynchronousConnectionFailover(Name alias) {
        this(alias, REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER);
    }

    /**
     * Create a <code>mysql.replication_asynchronous_connection_failover</code>
     * table reference
     */
    public ReplicationAsynchronousConnectionFailover() {
        this(DSL.name("replication_asynchronous_connection_failover"), null);
    }

    public <O extends Record> ReplicationAsynchronousConnectionFailover(Table<O> child, ForeignKey<O, ReplicationAsynchronousConnectionFailoverRecord> key) {
        super(child, key, REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Mysql.MYSQL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_CHANNEL_NAME);
    }

    @Override
    public UniqueKey<ReplicationAsynchronousConnectionFailoverRecord> getPrimaryKey() {
        return Keys.KEY_REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_PRIMARY;
    }

    @Override
    public ReplicationAsynchronousConnectionFailover as(String alias) {
        return new ReplicationAsynchronousConnectionFailover(DSL.name(alias), this);
    }

    @Override
    public ReplicationAsynchronousConnectionFailover as(Name alias) {
        return new ReplicationAsynchronousConnectionFailover(alias, this);
    }

    @Override
    public ReplicationAsynchronousConnectionFailover as(Table<?> alias) {
        return new ReplicationAsynchronousConnectionFailover(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailover rename(String name) {
        return new ReplicationAsynchronousConnectionFailover(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailover rename(Name name) {
        return new ReplicationAsynchronousConnectionFailover(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReplicationAsynchronousConnectionFailover rename(Table<?> name) {
        return new ReplicationAsynchronousConnectionFailover(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, UInteger, String, UByte, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super String, ? super String, ? super UInteger, ? super String, ? super UByte, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super String, ? super String, ? super UInteger, ? super String, ? super UByte, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
