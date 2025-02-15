/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import java.io.Serializable;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MutexInstances implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final ULong objectInstanceBegin;
    private final ULong lockedByThreadId;

    public MutexInstances(MutexInstances value) {
        this.name = value.name;
        this.objectInstanceBegin = value.objectInstanceBegin;
        this.lockedByThreadId = value.lockedByThreadId;
    }

    public MutexInstances(
        String name,
        ULong objectInstanceBegin,
        ULong lockedByThreadId
    ) {
        this.name = name;
        this.objectInstanceBegin = objectInstanceBegin;
        this.lockedByThreadId = lockedByThreadId;
    }

    /**
     * Getter for <code>performance_schema.mutex_instances.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for
     * <code>performance_schema.mutex_instances.OBJECT_INSTANCE_BEGIN</code>.
     */
    public ULong getObjectInstanceBegin() {
        return this.objectInstanceBegin;
    }

    /**
     * Getter for
     * <code>performance_schema.mutex_instances.LOCKED_BY_THREAD_ID</code>.
     */
    public ULong getLockedByThreadId() {
        return this.lockedByThreadId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final MutexInstances other = (MutexInstances) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.objectInstanceBegin == null) {
            if (other.objectInstanceBegin != null)
                return false;
        }
        else if (!this.objectInstanceBegin.equals(other.objectInstanceBegin))
            return false;
        if (this.lockedByThreadId == null) {
            if (other.lockedByThreadId != null)
                return false;
        }
        else if (!this.lockedByThreadId.equals(other.lockedByThreadId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.objectInstanceBegin == null) ? 0 : this.objectInstanceBegin.hashCode());
        result = prime * result + ((this.lockedByThreadId == null) ? 0 : this.lockedByThreadId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MutexInstances (");

        sb.append(name);
        sb.append(", ").append(objectInstanceBegin);
        sb.append(", ").append(lockedByThreadId);

        sb.append(")");
        return sb.toString();
    }
}
