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
public enum SchemataDefaultEncryption implements EnumType {

    NO("NO"),

    YES("YES");

    private final String literal;

    private SchemataDefaultEncryption(String literal) {
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
        return "SCHEMATA_DEFAULT_ENCRYPTION";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static SchemataDefaultEncryption lookupLiteral(String literal) {
        return EnumType.lookupLiteral(SchemataDefaultEncryption.class, literal);
    }
}
