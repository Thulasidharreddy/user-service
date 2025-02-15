/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String viewCatalog;
    private final String viewSchema;
    private final String viewName;
    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;

    public ViewTableUsage(ViewTableUsage value) {
        this.viewCatalog = value.viewCatalog;
        this.viewSchema = value.viewSchema;
        this.viewName = value.viewName;
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
    }

    public ViewTableUsage(
        String viewCatalog,
        String viewSchema,
        String viewName,
        String tableCatalog,
        String tableSchema,
        String tableName
    ) {
        this.viewCatalog = viewCatalog;
        this.viewSchema = viewSchema;
        this.viewName = viewName;
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
    }

    /**
     * Getter for <code>information_schema.VIEW_TABLE_USAGE.VIEW_CATALOG</code>.
     */
    public String getViewCatalog() {
        return this.viewCatalog;
    }

    /**
     * Getter for <code>information_schema.VIEW_TABLE_USAGE.VIEW_SCHEMA</code>.
     */
    public String getViewSchema() {
        return this.viewSchema;
    }

    /**
     * Getter for <code>information_schema.VIEW_TABLE_USAGE.VIEW_NAME</code>.
     */
    public String getViewName() {
        return this.viewName;
    }

    /**
     * Getter for
     * <code>information_schema.VIEW_TABLE_USAGE.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for <code>information_schema.VIEW_TABLE_USAGE.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>information_schema.VIEW_TABLE_USAGE.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ViewTableUsage other = (ViewTableUsage) obj;
        if (this.viewCatalog == null) {
            if (other.viewCatalog != null)
                return false;
        }
        else if (!this.viewCatalog.equals(other.viewCatalog))
            return false;
        if (this.viewSchema == null) {
            if (other.viewSchema != null)
                return false;
        }
        else if (!this.viewSchema.equals(other.viewSchema))
            return false;
        if (this.viewName == null) {
            if (other.viewName != null)
                return false;
        }
        else if (!this.viewName.equals(other.viewName))
            return false;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.viewCatalog == null) ? 0 : this.viewCatalog.hashCode());
        result = prime * result + ((this.viewSchema == null) ? 0 : this.viewSchema.hashCode());
        result = prime * result + ((this.viewName == null) ? 0 : this.viewName.hashCode());
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ViewTableUsage (");

        sb.append(viewCatalog);
        sb.append(", ").append(viewSchema);
        sb.append(", ").append(viewName);
        sb.append(", ").append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);

        sb.append(")");
        return sb.toString();
    }
}
