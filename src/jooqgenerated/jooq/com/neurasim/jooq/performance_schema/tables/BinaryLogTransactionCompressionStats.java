/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables;


import com.neurasim.jooq.performance_schema.PerformanceSchema;
import com.neurasim.jooq.performance_schema.enums.BinaryLogTransactionCompressionStatsLogType;
import com.neurasim.jooq.performance_schema.tables.records.BinaryLogTransactionCompressionStatsRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function14;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BinaryLogTransactionCompressionStats extends TableImpl<BinaryLogTransactionCompressionStatsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>performance_schema.binary_log_transaction_compression_stats</code>
     */
    public static final BinaryLogTransactionCompressionStats BINARY_LOG_TRANSACTION_COMPRESSION_STATS = new BinaryLogTransactionCompressionStats();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BinaryLogTransactionCompressionStatsRecord> getRecordType() {
        return BinaryLogTransactionCompressionStatsRecord.class;
    }

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LOG_TYPE</code>.
     * The log type to which the transactions were written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, BinaryLogTransactionCompressionStatsLogType> LOG_TYPE = createField(DSL.name("LOG_TYPE"), SQLDataType.VARCHAR(6).nullable(false).asEnumDataType(com.neurasim.jooq.performance_schema.enums.BinaryLogTransactionCompressionStatsLogType.class), this, "The log type to which the transactions were written.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_TYPE</code>.
     * The transaction compression algorithm used.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, String> COMPRESSION_TYPE = createField(DSL.name("COMPRESSION_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "The transaction compression algorithm used.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.TRANSACTION_COUNTER</code>.
     * Number of transactions written to the log
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> TRANSACTION_COUNTER = createField(DSL.name("TRANSACTION_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Number of transactions written to the log");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSED_BYTES_COUNTER</code>.
     * The total number of bytes compressed.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> COMPRESSED_BYTES_COUNTER = createField(DSL.name("COMPRESSED_BYTES_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The total number of bytes compressed.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.UNCOMPRESSED_BYTES_COUNTER</code>.
     * The total number of bytes uncompressed.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> UNCOMPRESSED_BYTES_COUNTER = createField(DSL.name("UNCOMPRESSED_BYTES_COUNTER"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "The total number of bytes uncompressed.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.COMPRESSION_PERCENTAGE</code>.
     * The compression ratio as a percentage.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, Short> COMPRESSION_PERCENTAGE = createField(DSL.name("COMPRESSION_PERCENTAGE"), SQLDataType.SMALLINT.nullable(false), this, "The compression ratio as a percentage.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_ID</code>.
     * The first transaction written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, String> FIRST_TRANSACTION_ID = createField(DSL.name("FIRST_TRANSACTION_ID"), SQLDataType.CLOB, this, "The first transaction written.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_COMPRESSED_BYTES</code>.
     * First transaction written compressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> FIRST_TRANSACTION_COMPRESSED_BYTES = createField(DSL.name("FIRST_TRANSACTION_COMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "First transaction written compressed bytes.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_UNCOMPRESSED_BYTES</code>.
     * First transaction written uncompressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> FIRST_TRANSACTION_UNCOMPRESSED_BYTES = createField(DSL.name("FIRST_TRANSACTION_UNCOMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "First transaction written uncompressed bytes.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.FIRST_TRANSACTION_TIMESTAMP</code>.
     * When the first transaction was written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, LocalDateTime> FIRST_TRANSACTION_TIMESTAMP = createField(DSL.name("FIRST_TRANSACTION_TIMESTAMP"), SQLDataType.LOCALDATETIME(6), this, "When the first transaction was written.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_ID</code>.
     * The last transaction written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, String> LAST_TRANSACTION_ID = createField(DSL.name("LAST_TRANSACTION_ID"), SQLDataType.CLOB, this, "The last transaction written.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_COMPRESSED_BYTES</code>.
     * Last transaction written compressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> LAST_TRANSACTION_COMPRESSED_BYTES = createField(DSL.name("LAST_TRANSACTION_COMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Last transaction written compressed bytes.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_UNCOMPRESSED_BYTES</code>.
     * Last transaction written uncompressed bytes.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, ULong> LAST_TRANSACTION_UNCOMPRESSED_BYTES = createField(DSL.name("LAST_TRANSACTION_UNCOMPRESSED_BYTES"), SQLDataType.BIGINTUNSIGNED.nullable(false), this, "Last transaction written uncompressed bytes.");

    /**
     * The column
     * <code>performance_schema.binary_log_transaction_compression_stats.LAST_TRANSACTION_TIMESTAMP</code>.
     * When the last transaction was written.
     */
    public final TableField<BinaryLogTransactionCompressionStatsRecord, LocalDateTime> LAST_TRANSACTION_TIMESTAMP = createField(DSL.name("LAST_TRANSACTION_TIMESTAMP"), SQLDataType.LOCALDATETIME(6), this, "When the last transaction was written.");

    private BinaryLogTransactionCompressionStats(Name alias, Table<BinaryLogTransactionCompressionStatsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BinaryLogTransactionCompressionStats(Name alias, Table<BinaryLogTransactionCompressionStatsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>performance_schema.binary_log_transaction_compression_stats</code>
     * table reference
     */
    public BinaryLogTransactionCompressionStats(String alias) {
        this(DSL.name(alias), BINARY_LOG_TRANSACTION_COMPRESSION_STATS);
    }

    /**
     * Create an aliased
     * <code>performance_schema.binary_log_transaction_compression_stats</code>
     * table reference
     */
    public BinaryLogTransactionCompressionStats(Name alias) {
        this(alias, BINARY_LOG_TRANSACTION_COMPRESSION_STATS);
    }

    /**
     * Create a
     * <code>performance_schema.binary_log_transaction_compression_stats</code>
     * table reference
     */
    public BinaryLogTransactionCompressionStats() {
        this(DSL.name("binary_log_transaction_compression_stats"), null);
    }

    public <O extends Record> BinaryLogTransactionCompressionStats(Table<O> child, ForeignKey<O, BinaryLogTransactionCompressionStatsRecord> key) {
        super(child, key, BINARY_LOG_TRANSACTION_COMPRESSION_STATS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PerformanceSchema.PERFORMANCE_SCHEMA;
    }

    @Override
    public BinaryLogTransactionCompressionStats as(String alias) {
        return new BinaryLogTransactionCompressionStats(DSL.name(alias), this);
    }

    @Override
    public BinaryLogTransactionCompressionStats as(Name alias) {
        return new BinaryLogTransactionCompressionStats(alias, this);
    }

    @Override
    public BinaryLogTransactionCompressionStats as(Table<?> alias) {
        return new BinaryLogTransactionCompressionStats(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public BinaryLogTransactionCompressionStats rename(String name) {
        return new BinaryLogTransactionCompressionStats(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BinaryLogTransactionCompressionStats rename(Name name) {
        return new BinaryLogTransactionCompressionStats(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public BinaryLogTransactionCompressionStats rename(Table<?> name) {
        return new BinaryLogTransactionCompressionStats(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<BinaryLogTransactionCompressionStatsLogType, String, ULong, ULong, ULong, Short, String, ULong, ULong, LocalDateTime, String, ULong, ULong, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super BinaryLogTransactionCompressionStatsLogType, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super Short, ? super String, ? super ULong, ? super ULong, ? super LocalDateTime, ? super String, ? super ULong, ? super ULong, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function14<? super BinaryLogTransactionCompressionStatsLogType, ? super String, ? super ULong, ? super ULong, ? super ULong, ? super Short, ? super String, ? super ULong, ? super ULong, ? super LocalDateTime, ? super String, ? super ULong, ? super ULong, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
