/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql.tables.pojos;


import com.neurasim.jooq.mysql.enums.FuncType;

import java.io.Serializable;


/**
 * User defined functions
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Func implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String name;
    private final Byte ret;
    private final String dl;
    private final FuncType type;

    public Func(Func value) {
        this.name = value.name;
        this.ret = value.ret;
        this.dl = value.dl;
        this.type = value.type;
    }

    public Func(
        String name,
        Byte ret,
        String dl,
        FuncType type
    ) {
        this.name = name;
        this.ret = ret;
        this.dl = dl;
        this.type = type;
    }

    /**
     * Getter for <code>mysql.func.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>mysql.func.ret</code>.
     */
    public Byte getRet() {
        return this.ret;
    }

    /**
     * Getter for <code>mysql.func.dl</code>.
     */
    public String getDl() {
        return this.dl;
    }

    /**
     * Getter for <code>mysql.func.type</code>.
     */
    public FuncType getType() {
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
        final Func other = (Func) obj;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.ret == null) {
            if (other.ret != null)
                return false;
        }
        else if (!this.ret.equals(other.ret))
            return false;
        if (this.dl == null) {
            if (other.dl != null)
                return false;
        }
        else if (!this.dl.equals(other.dl))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.ret == null) ? 0 : this.ret.hashCode());
        result = prime * result + ((this.dl == null) ? 0 : this.dl.hashCode());
        result = prime * result + ((this.type == null) ? 0 : this.type.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Func (");

        sb.append(name);
        sb.append(", ").append(ret);
        sb.append(", ").append(dl);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}
