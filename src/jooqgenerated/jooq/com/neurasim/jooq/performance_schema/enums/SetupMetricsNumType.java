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
public enum SetupMetricsNumType implements EnumType {

    INTEGER("INTEGER"),

    DOUBLE("DOUBLE");

    private final String literal;

    private SetupMetricsNumType(String literal) {
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
        return "setup_metrics_NUM_TYPE";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static SetupMetricsNumType lookupLiteral(String literal) {
        return EnumType.lookupLiteral(SetupMetricsNumType.class, literal);
    }
}
