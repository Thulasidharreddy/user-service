/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.enums.SetupLoggersLevel;
import com.neurasim.jooq.performance_schema.tables.SetupLoggers;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetupLoggersRecord extends TableRecordImpl<SetupLoggersRecord> implements Record3<String, SetupLoggersLevel, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.setup_loggers.NAME</code>.
     */
    public SetupLoggersRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.setup_loggers.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.setup_loggers.LEVEL</code>.
     */
    public SetupLoggersRecord setLevel(SetupLoggersLevel value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.setup_loggers.LEVEL</code>.
     */
    public SetupLoggersLevel getLevel() {
        return (SetupLoggersLevel) get(1);
    }

    /**
     * Setter for <code>performance_schema.setup_loggers.DESCRIPTION</code>.
     */
    public SetupLoggersRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.setup_loggers.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, SetupLoggersLevel, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, SetupLoggersLevel, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SetupLoggers.SETUP_LOGGERS.NAME;
    }

    @Override
    public Field<SetupLoggersLevel> field2() {
        return SetupLoggers.SETUP_LOGGERS.LEVEL;
    }

    @Override
    public Field<String> field3() {
        return SetupLoggers.SETUP_LOGGERS.DESCRIPTION;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public SetupLoggersLevel component2() {
        return getLevel();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public SetupLoggersLevel value2() {
        return getLevel();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public SetupLoggersRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public SetupLoggersRecord value2(SetupLoggersLevel value) {
        setLevel(value);
        return this;
    }

    @Override
    public SetupLoggersRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public SetupLoggersRecord values(String value1, SetupLoggersLevel value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SetupLoggersRecord
     */
    public SetupLoggersRecord() {
        super(SetupLoggers.SETUP_LOGGERS);
    }

    /**
     * Create a detached, initialised SetupLoggersRecord
     */
    public SetupLoggersRecord(String name, SetupLoggersLevel level, String description) {
        super(SetupLoggers.SETUP_LOGGERS);

        setName(name);
        setLevel(level);
        setDescription(description);
    }

    /**
     * Create a detached, initialised SetupLoggersRecord
     */
    public SetupLoggersRecord(com.neurasim.jooq.performance_schema.tables.pojos.SetupLoggers value) {
        super(SetupLoggers.SETUP_LOGGERS);

        if (value != null) {
            setName(value.getName());
            setLevel(value.getLevel());
            setDescription(value.getDescription());
        }
    }
}
