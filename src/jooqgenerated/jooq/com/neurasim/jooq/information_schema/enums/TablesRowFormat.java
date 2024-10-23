/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TablesRowFormat implements EnumType {

    Fixed("Fixed"),

    Dynamic("Dynamic"),

    Compressed("Compressed"),

    Redundant("Redundant"),

    Compact("Compact"),

    Paged("Paged");

    private final String literal;

    private TablesRowFormat(String literal) {
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
        return "TABLES_ROW_FORMAT";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static TablesRowFormat lookupLiteral(String literal) {
        return EnumType.lookupLiteral(TablesRowFormat.class, literal);
    }
}
