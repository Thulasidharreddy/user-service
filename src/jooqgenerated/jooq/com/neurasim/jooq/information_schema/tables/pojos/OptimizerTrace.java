/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OptimizerTrace implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String query;
    private final String trace;
    private final Integer missingBytesBeyondMaxMemSize;
    private final Byte insufficientPrivileges;

    public OptimizerTrace(OptimizerTrace value) {
        this.query = value.query;
        this.trace = value.trace;
        this.missingBytesBeyondMaxMemSize = value.missingBytesBeyondMaxMemSize;
        this.insufficientPrivileges = value.insufficientPrivileges;
    }

    public OptimizerTrace(
        String query,
        String trace,
        Integer missingBytesBeyondMaxMemSize,
        Byte insufficientPrivileges
    ) {
        this.query = query;
        this.trace = trace;
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
        this.insufficientPrivileges = insufficientPrivileges;
    }

    /**
     * Getter for <code>information_schema.OPTIMIZER_TRACE.QUERY</code>.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Getter for <code>information_schema.OPTIMIZER_TRACE.TRACE</code>.
     */
    public String getTrace() {
        return this.trace;
    }

    /**
     * Getter for
     * <code>information_schema.OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE</code>.
     */
    public Integer getMissingBytesBeyondMaxMemSize() {
        return this.missingBytesBeyondMaxMemSize;
    }

    /**
     * Getter for
     * <code>information_schema.OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES</code>.
     */
    public Byte getInsufficientPrivileges() {
        return this.insufficientPrivileges;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final OptimizerTrace other = (OptimizerTrace) obj;
        if (this.query == null) {
            if (other.query != null)
                return false;
        }
        else if (!this.query.equals(other.query))
            return false;
        if (this.trace == null) {
            if (other.trace != null)
                return false;
        }
        else if (!this.trace.equals(other.trace))
            return false;
        if (this.missingBytesBeyondMaxMemSize == null) {
            if (other.missingBytesBeyondMaxMemSize != null)
                return false;
        }
        else if (!this.missingBytesBeyondMaxMemSize.equals(other.missingBytesBeyondMaxMemSize))
            return false;
        if (this.insufficientPrivileges == null) {
            if (other.insufficientPrivileges != null)
                return false;
        }
        else if (!this.insufficientPrivileges.equals(other.insufficientPrivileges))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.query == null) ? 0 : this.query.hashCode());
        result = prime * result + ((this.trace == null) ? 0 : this.trace.hashCode());
        result = prime * result + ((this.missingBytesBeyondMaxMemSize == null) ? 0 : this.missingBytesBeyondMaxMemSize.hashCode());
        result = prime * result + ((this.insufficientPrivileges == null) ? 0 : this.insufficientPrivileges.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OptimizerTrace (");

        sb.append(query);
        sb.append(", ").append(trace);
        sb.append(", ").append(missingBytesBeyondMaxMemSize);
        sb.append(", ").append(insufficientPrivileges);

        sb.append(")");
        return sb.toString();
    }
}
