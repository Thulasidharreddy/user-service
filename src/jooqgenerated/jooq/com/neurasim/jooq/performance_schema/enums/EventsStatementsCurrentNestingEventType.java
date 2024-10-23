/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum EventsStatementsCurrentNestingEventType implements EnumType {

    TRANSACTION("TRANSACTION"),

    STATEMENT("STATEMENT"),

    STAGE("STAGE"),

    WAIT("WAIT");

    private final String literal;

    private EventsStatementsCurrentNestingEventType(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return "events_statements_current_NESTING_EVENT_TYPE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static EventsStatementsCurrentNestingEventType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(EventsStatementsCurrentNestingEventType.class, literal);
    }
}
