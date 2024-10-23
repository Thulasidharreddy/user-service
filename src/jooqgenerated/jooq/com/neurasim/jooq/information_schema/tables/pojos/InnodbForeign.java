/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbForeign implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String id;
    private final String forName;
    private final String refName;
    private final Long nCols;
    private final ULong type;

    public InnodbForeign(InnodbForeign value) {
        this.id = value.id;
        this.forName = value.forName;
        this.refName = value.refName;
        this.nCols = value.nCols;
        this.type = value.type;
    }

    public InnodbForeign(
        String id,
        String forName,
        String refName,
        Long nCols,
        ULong type
    ) {
        this.id = id;
        this.forName = forName;
        this.refName = refName;
        this.nCols = nCols;
        this.type = type;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.ID</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.FOR_NAME</code>.
     */
    public String getForName() {
        return this.forName;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.REF_NAME</code>.
     */
    public String getRefName() {
        return this.refName;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.N_COLS</code>.
     */
    public Long getNCols() {
        return this.nCols;
    }

    /**
     * Getter for <code>information_schema.INNODB_FOREIGN.TYPE</code>.
     */
    public ULong getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InnodbForeign other = (InnodbForeign) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.forName == null) {
            if (other.forName != null)
                return false;
        }
        else if (!this.forName.equals(other.forName))
            return false;
        if (this.refName == null) {
            if (other.refName != null)
                return false;
        }
        else if (!this.refName.equals(other.refName))
            return false;
        if (this.nCols == null) {
            if (other.nCols != null)
                return false;
        }
        else if (!this.nCols.equals(other.nCols))
            return false;
        if (this.type == null) {
            if (other.type != null)
                return false;
        }
        else if (!this.type.equals(other.type))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.forName == null) ? 0 : this.forName.hashCode());
        result = prime * result + ((this.refName == null) ? 0 : this.refName.hashCode());
        result = prime * result + ((this.nCols == null) ? 0 : this.nCols.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InnodbForeign (");

        sb.append(id);
        sb.append(", ").append(forName);
        sb.append(", ").append(refName);
        sb.append(", ").append(nCols);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
