/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.performance_schema.tables.pojos;


import com.neurasim.jooq.performance_schema.enums.ProcesslistExecutionEngine;

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
    private final Long time;
    private final String state;
    private final String info;
    private final ProcesslistExecutionEngine executionEngine;

    public Processlist(Processlist value) {
        this.id = value.id;
        this.user = value.user;
        this.host = value.host;
        this.db = value.db;
        this.command = value.command;
        this.time = value.time;
        this.state = value.state;
        this.info = value.info;
        this.executionEngine = value.executionEngine;
    }

    public Processlist(
        ULong id,
        String user,
        String host,
        String db,
        String command,
        Long time,
        String state,
        String info,
        ProcesslistExecutionEngine executionEngine
    ) {
        this.id = id;
        this.user = user;
        this.host = host;
        this.db = db;
        this.command = command;
        this.time = time;
        this.state = state;
        this.info = info;
        this.executionEngine = executionEngine;
    }

    /**
     * Getter for <code>performance_schema.processlist.ID</code>.
     */
    public ULong getId() {
        return this.id;
    }

    /**
     * Getter for <code>performance_schema.processlist.USER</code>.
     */
    public String getUser() {
        return this.user;
    }

    /**
     * Getter for <code>performance_schema.processlist.HOST</code>.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Getter for <code>performance_schema.processlist.DB</code>.
     */
    public String getDb() {
        return this.db;
    }

    /**
     * Getter for <code>performance_schema.processlist.COMMAND</code>.
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * Getter for <code>performance_schema.processlist.TIME</code>.
     */
    public Long getTime() {
        return this.time;
    }

    /**
     * Getter for <code>performance_schema.processlist.STATE</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Getter for <code>performance_schema.processlist.INFO</code>.
     */
    public String getInfo() {
        return this.info;
    }

    /**
     * Getter for <code>performance_schema.processlist.EXECUTION_ENGINE</code>.
     */
    public ProcesslistExecutionEngine getExecutionEngine() {
        return this.executionEngine;
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
        if (this.executionEngine == null) {
            if (other.executionEngine != null)
                return false;
        }
        else if (!this.executionEngine.equals(other.executionEngine))
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
        result = prime * result + ((this.executionEngine == null) ? 0 : this.executionEngine.hashCode());
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
        sb.append(", ").append(executionEngine);

        sb.append(")");
        return sb.toString();
    }
}
