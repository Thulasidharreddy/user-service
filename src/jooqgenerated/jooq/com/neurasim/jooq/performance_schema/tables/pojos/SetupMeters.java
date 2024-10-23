/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.SetupMetersEnabled;

import java.io.Serializable;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SetupMeters implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final UInteger frequency;
    private final SetupMetersEnabled enabled;
    private final String description;

    public SetupMeters(SetupMeters value) {
        this.name = value.name;
        this.frequency = value.frequency;
        this.enabled = value.enabled;
        this.description = value.description;
    }

    public SetupMeters(
        String name,
        UInteger frequency,
        SetupMetersEnabled enabled,
        String description
    ) {
        this.name = name;
        this.frequency = frequency;
        this.enabled = enabled;
        this.description = description;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.FREQUENCY</code>.
     */
    public UInteger getFrequency() {
        return this.frequency;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.ENABLED</code>.
     */
    public SetupMetersEnabled getEnabled() {
        return this.enabled;
    }

    /**
     * Getter for <code>performance_schema.setup_meters.DESCRIPTION</code>.
     */
    public String getDescription() {
        return this.description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final SetupMeters other = (SetupMeters) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.frequency == null) {
            if (other.frequency != null)
                return false;
        }
        else if (!this.frequency.equals(other.frequency))
            return false;
        if (this.enabled == null) {
            if (other.enabled != null)
                return false;
        }
        else if (!this.enabled.equals(other.enabled))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.frequency == null) ? 0 : this.frequency.hashCode());
        result = prime * result + ((this.enabled == null) ? 0 : this.enabled.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SetupMeters (");

        sb.append(name);
        sb.append(", ").append(frequency);
        sb.append(", ").append(enabled);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}
