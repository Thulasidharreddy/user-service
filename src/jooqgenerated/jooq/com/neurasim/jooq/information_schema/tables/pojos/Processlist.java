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
public class Processlist implements Serializable {

    private static final long serialVersionUID = 1L;

    private final ULong id;
    private final String user;
    private final String host;
    private final String db;
    private final String command;
    private final Integer time;
    private final String state;
    private final String info;

    public Processlist(Processlist value) {
        this.id = value.id;
        this.user = value.user;
        this.host = value.host;
        this.db = value.db;
        this.command = value.command;
        this.time = value.time;
        this.state = value.state;
        this.info = value.info;
    }

    public Processlist(
        ULong id,
        String user,
        String host,
        String db,
        String command,
        Integer time,
        String state,
        String info
    ) {
        this.id = id;
        this.user = user;
        this.host = host;
        this.db = db;
        this.command = command;
        this.time = time;
        this.state = state;
        this.info = info;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.ID</code>.
     */
    public ULong getId() {
        return this.id;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.USER</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.HOST</code>.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.DB</code>.
     */
    public String getDb() {
        return this.db;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.COMMAND</code>.
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.TIME</code>.
     */
    public Integer getTime() {
        return this.time;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.STATE</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Getter for <code>information_schema.PROCESSLIST.INFO</code>.
     */
    public String getInfo() {
        return this.info;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Processlist other = (Processlist) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.user == null) {
            if (other.user != null)
                return false;
        }
        else if (!this.user.equals(other.user))
            return false;
        if (this.host == null) {
            if (other.host != null)
                return false;
        }
        else if (!this.host.equals(other.host))
            return false;
        if (this.db == null) {
            if (other.db != null)
                return false;
        }
        else if (!this.db.equals(other.db))
            return false;
        if (this.command == null) {
            if (other.command != null)
                return false;
        }
        else if (!this.command.equals(other.command))
            return false;
        if (this.time == null) {
            if (other.time != null)
                return false;
        }
        else if (!this.time.equals(other.time))
            return false;
        if (this.state == null) {
            if (other.state != null)
                return false;
        }
        else if (!this.state.equals(other.state))
            return false;
        if (this.info == null) {
            if (other.info != null)
                return false;
        }
        else if (!this.info.equals(other.info))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.user == null) ? 0 : this.user.hashCode());
        result = prime * result + ((this.host == null) ? 0 : this.host.hashCode());
        result = prime * result + ((this.db == null) ? 0 : this.db.hashCode());
        result = prime * result + ((this.command == null) ? 0 : this.command.hashCode());
        result = prime * result + ((this.time == null) ? 0 : this.time.hashCode());
        result = prime * result + ((this.state == null) ? 0 : this.state.hashCode());
        result = prime * result + ((this.info == null) ? 0 : this.info.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Processlist (");

        sb.append(id);
        sb.append(", ").append(user);
        sb.append(", ").append(host);
        sb.append(", ").append(db);
        sb.append(", ").append(command);
        sb.append(", ").append(time);
        sb.append(", ").append(state);
        sb.append(", ").append(info);

        sb.append(")");
        return sb.toString();
    }
}
