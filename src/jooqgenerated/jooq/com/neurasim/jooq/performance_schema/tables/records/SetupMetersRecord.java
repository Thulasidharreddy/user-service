/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.records;


import com.neurasim.jooq.performance_schema.enums.SetupMetersEnabled;
import com.neurasim.jooq.performance_schema.tables.SetupMeters;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetupMetersRecord extends UpdatableRecordImpl<SetupMetersRecord> implements Record4<String, UInteger, SetupMetersEnabled, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>performance_schema.setup_meters.NAME</code>.
     */
    public SetupMetersRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.NAME</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>performance_schema.setup_meters.FREQUENCY</code>.
     */
    public SetupMetersRecord setFrequency(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.FREQUENCY</code>.
     */
    public UInteger getFrequency() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>performance_schema.setup_meters.ENABLED</code>.
     */
    public SetupMetersRecord setEnabled(SetupMetersEnabled value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.ENABLED</code>.
     */
    public SetupMetersEnabled getEnabled() {
        return (SetupMetersEnabled) get(2);
    }

    /**
     * Setter for <code>performance_schema.setup_meters.DESCRIPTION</code>.
     */
    public SetupMetersRecord setDescription(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, UInteger, SetupMetersEnabled, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, UInteger, SetupMetersEnabled, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SetupMeters.SETUP_METERS.NAME;
    }

    @Override
    public Field<UInteger> field2() {
        return SetupMeters.SETUP_METERS.FREQUENCY;
    }

    @Override
    public Field<SetupMetersEnabled> field3() {
        return SetupMeters.SETUP_METERS.ENABLED;
    }

    @Override
    public Field<String> field4() {
        return SetupMeters.SETUP_METERS.DESCRIPTION;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public UInteger component2() {
        return getFrequency();
    }

    @Override
    public SetupMetersEnabled component3() {
        return getEnabled();
    }

    @Override
    public String component4() {
        return getDescription();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public UInteger value2() {
        return getFrequency();
    }

    @Override
    public SetupMetersEnabled value3() {
        return getEnabled();
    }

    @Override
    public String value4() {
        return getDescription();
    }

    @Override
    public SetupMetersRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public SetupMetersRecord value2(UInteger value) {
        setFrequency(value);
        return this;
    }

    @Override
    public SetupMetersRecord value3(SetupMetersEnabled value) {
        setEnabled(value);
        return this;
    }

    @Override
    public SetupMetersRecord value4(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public SetupMetersRecord values(String value1, UInteger value2, SetupMetersEnabled value3, String value4) {
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
     * Create a detached SetupMetersRecord
     */
    public SetupMetersRecord() {
        super(SetupMeters.SETUP_METERS);
    }

    /**
     * Create a detached, initialised SetupMetersRecord
     */
    public SetupMetersRecord(String name, UInteger frequency, SetupMetersEnabled enabled, String description) {
        super(SetupMeters.SETUP_METERS);

        setName(name);
        setFrequency(frequency);
        setEnabled(enabled);
        setDescription(description);
    }

    /**
     * Create a detached, initialised SetupMetersRecord
     */
    public SetupMetersRecord(com.neurasim.jooq.performance_schema.tables.pojos.SetupMeters value) {
        super(SetupMeters.SETUP_METERS);

        if (value != null) {
            setName(value.getName());
            setFrequency(value.getFrequency());
            setEnabled(value.getEnabled());
            setDescription(value.getDescription());
        }
    }
}
