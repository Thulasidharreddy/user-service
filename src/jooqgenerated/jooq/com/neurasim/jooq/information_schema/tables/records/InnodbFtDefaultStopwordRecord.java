/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.records;


import com.neurasim.jooq.information_schema.tables.InnodbFtDefaultStopword;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbFtDefaultStopwordRecord extends TableRecordImpl<InnodbFtDefaultStopwordRecord> implements Record1<String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.INNODB_FT_DEFAULT_STOPWORD.value</code>.
     */
    public InnodbFtDefaultStopwordRecord setValue(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>information_schema.INNODB_FT_DEFAULT_STOPWORD.value</code>.
     */
    public String getValue() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD.VALUE;
    }

    @Override
    public String component1() {
        return getValue();
    }

    @Override
    public String value1() {
        return getValue();
    }

    @Override
    public InnodbFtDefaultStopwordRecord value1(String value) {
        setValue(value);
        return this;
    }

    @Override
    public InnodbFtDefaultStopwordRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbFtDefaultStopwordRecord
     */
    public InnodbFtDefaultStopwordRecord() {
        super(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD);
    }

    /**
     * Create a detached, initialised InnodbFtDefaultStopwordRecord
     */
    public InnodbFtDefaultStopwordRecord(String value) {
        super(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD);

        setValue(value);
    }

    /**
     * Create a detached, initialised InnodbFtDefaultStopwordRecord
     */
    public InnodbFtDefaultStopwordRecord(com.neurasim.jooq.information_schema.tables.pojos.InnodbFtDefaultStopword value) {
        super(InnodbFtDefaultStopword.INNODB_FT_DEFAULT_STOPWORD);

        if (value != null) {
            setValue(value.getValue());
        }
    }
}
