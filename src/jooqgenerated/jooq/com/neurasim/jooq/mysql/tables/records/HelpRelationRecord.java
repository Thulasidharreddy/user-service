/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.records;


import com.neurasim.jooq.mysql.tables.HelpRelation;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * keyword-topic relation
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpRelationRecord extends UpdatableRecordImpl<HelpRelationRecord> implements Record2<UInteger, UInteger> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>mysql.help_relation.help_topic_id</code>.
     */
    public HelpRelationRecord setHelpTopicId(UInteger value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>mysql.help_relation.help_topic_id</code>.
     */
    public UInteger getHelpTopicId() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>mysql.help_relation.help_keyword_id</code>.
     */
    public HelpRelationRecord setHelpKeywordId(UInteger value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>mysql.help_relation.help_keyword_id</code>.
     */
    public UInteger getHelpKeywordId() {
        return (UInteger) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<UInteger, UInteger> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<UInteger, UInteger> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<UInteger, UInteger> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<UInteger> field1() {
        return HelpRelation.HELP_RELATION.HELP_TOPIC_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return HelpRelation.HELP_RELATION.HELP_KEYWORD_ID;
    }

    @Override
    public UInteger component1() {
        return getHelpTopicId();
    }

    @Override
    public UInteger component2() {
        return getHelpKeywordId();
    }

    @Override
    public UInteger value1() {
        return getHelpTopicId();
    }

    @Override
    public UInteger value2() {
        return getHelpKeywordId();
    }

    @Override
    public HelpRelationRecord value1(UInteger value) {
        setHelpTopicId(value);
        return this;
    }

    @Override
    public HelpRelationRecord value2(UInteger value) {
        setHelpKeywordId(value);
        return this;
    }

    @Override
    public HelpRelationRecord values(UInteger value1, UInteger value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HelpRelationRecord
     */
    public HelpRelationRecord() {
        super(HelpRelation.HELP_RELATION);
    }

    /**
     * Create a detached, initialised HelpRelationRecord
     */
    public HelpRelationRecord(UInteger helpTopicId, UInteger helpKeywordId) {
        super(HelpRelation.HELP_RELATION);

        setHelpTopicId(helpTopicId);
        setHelpKeywordId(helpKeywordId);
    }

    /**
     * Create a detached, initialised HelpRelationRecord
     */
    public HelpRelationRecord(com.neurasim.jooq.mysql.tables.pojos.HelpRelation value) {
        super(HelpRelation.HELP_RELATION);

        if (value != null) {
            setHelpTopicId(value.getHelpTopicId());
            setHelpKeywordId(value.getHelpKeywordId());
        }
    }
}
