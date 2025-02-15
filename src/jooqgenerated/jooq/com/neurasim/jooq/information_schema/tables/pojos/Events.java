/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import com.neurasim.jooq.information_schema.enums.EventsIntervalField;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Events implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String eventCatalog;
    private final String eventSchema;
    private final String eventName;
    private final String definer;
    private final String timeZone;
    private final String eventBody;
    private final String eventDefinition;
    private final String eventType;
    private final LocalDateTime executeAt;
    private final String intervalValue;
    private final EventsIntervalField intervalField;
    private final String sqlMode;
    private final LocalDateTime starts;
    private final LocalDateTime ends;
    private final String status;
    private final String onCompletion;
    private final LocalDateTime created;
    private final LocalDateTime lastAltered;
    private final LocalDateTime lastExecuted;
    private final String eventComment;
    private final UInteger originator;
    private final String characterSetClient;
    private final String collationConnection;
    private final String databaseCollation;

    public Events(Events value) {
        this.eventCatalog = value.eventCatalog;
        this.eventSchema = value.eventSchema;
        this.eventName = value.eventName;
        this.definer = value.definer;
        this.timeZone = value.timeZone;
        this.eventBody = value.eventBody;
        this.eventDefinition = value.eventDefinition;
        this.eventType = value.eventType;
        this.executeAt = value.executeAt;
        this.intervalValue = value.intervalValue;
        this.intervalField = value.intervalField;
        this.sqlMode = value.sqlMode;
        this.starts = value.starts;
        this.ends = value.ends;
        this.status = value.status;
        this.onCompletion = value.onCompletion;
        this.created = value.created;
        this.lastAltered = value.lastAltered;
        this.lastExecuted = value.lastExecuted;
        this.eventComment = value.eventComment;
        this.originator = value.originator;
        this.characterSetClient = value.characterSetClient;
        this.collationConnection = value.collationConnection;
        this.databaseCollation = value.databaseCollation;
    }

    public Events(
        String eventCatalog,
        String eventSchema,
        String eventName,
        String definer,
        String timeZone,
        String eventBody,
        String eventDefinition,
        String eventType,
        LocalDateTime executeAt,
        String intervalValue,
        EventsIntervalField intervalField,
        String sqlMode,
        LocalDateTime starts,
        LocalDateTime ends,
        String status,
        String onCompletion,
        LocalDateTime created,
        LocalDateTime lastAltered,
        LocalDateTime lastExecuted,
        String eventComment,
        UInteger originator,
        String characterSetClient,
        String collationConnection,
        String databaseCollation
    ) {
        this.eventCatalog = eventCatalog;
        this.eventSchema = eventSchema;
        this.eventName = eventName;
        this.definer = definer;
        this.timeZone = timeZone;
        this.eventBody = eventBody;
        this.eventDefinition = eventDefinition;
        this.eventType = eventType;
        this.executeAt = executeAt;
        this.intervalValue = intervalValue;
        this.intervalField = intervalField;
        this.sqlMode = sqlMode;
        this.starts = starts;
        this.ends = ends;
        this.status = status;
        this.onCompletion = onCompletion;
        this.created = created;
        this.lastAltered = lastAltered;
        this.lastExecuted = lastExecuted;
        this.eventComment = eventComment;
        this.originator = originator;
        this.characterSetClient = characterSetClient;
        this.collationConnection = collationConnection;
        this.databaseCollation = databaseCollation;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_CATALOG</code>.
     */
    public String getEventCatalog() {
        return this.eventCatalog;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_SCHEMA</code>.
     */
    public String getEventSchema() {
        return this.eventSchema;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_NAME</code>.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Getter for <code>information_schema.EVENTS.DEFINER</code>.
     */
    public String getDefiner() {
        return this.definer;
    }

    /**
     * Getter for <code>information_schema.EVENTS.TIME_ZONE</code>.
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_BODY</code>.
     */
    public String getEventBody() {
        return this.eventBody;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_DEFINITION</code>.
     */
    public String getEventDefinition() {
        return this.eventDefinition;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_TYPE</code>.
     */
    public String getEventType() {
        return this.eventType;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EXECUTE_AT</code>.
     */
    public LocalDateTime getExecuteAt() {
        return this.executeAt;
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_VALUE</code>.
     */
    public String getIntervalValue() {
        return this.intervalValue;
    }

    /**
     * Getter for <code>information_schema.EVENTS.INTERVAL_FIELD</code>.
     */
    public EventsIntervalField getIntervalField() {
        return this.intervalField;
    }

    /**
     * Getter for <code>information_schema.EVENTS.SQL_MODE</code>.
     */
    public String getSqlMode() {
        return this.sqlMode;
    }

    /**
     * Getter for <code>information_schema.EVENTS.STARTS</code>.
     */
    public LocalDateTime getStarts() {
        return this.starts;
    }

    /**
     * Getter for <code>information_schema.EVENTS.ENDS</code>.
     */
    public LocalDateTime getEnds() {
        return this.ends;
    }

    /**
     * Getter for <code>information_schema.EVENTS.STATUS</code>.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Getter for <code>information_schema.EVENTS.ON_COMPLETION</code>.
     */
    public String getOnCompletion() {
        return this.onCompletion;
    }

    /**
     * Getter for <code>information_schema.EVENTS.CREATED</code>.
     */
    public LocalDateTime getCreated() {
        return this.created;
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_ALTERED</code>.
     */
    public LocalDateTime getLastAltered() {
        return this.lastAltered;
    }

    /**
     * Getter for <code>information_schema.EVENTS.LAST_EXECUTED</code>.
     */
    public LocalDateTime getLastExecuted() {
        return this.lastExecuted;
    }

    /**
     * Getter for <code>information_schema.EVENTS.EVENT_COMMENT</code>.
     */
    public String getEventComment() {
        return this.eventComment;
    }

    /**
     * Getter for <code>information_schema.EVENTS.ORIGINATOR</code>.
     */
    public UInteger getOriginator() {
        return this.originator;
    }

    /**
     * Getter for <code>information_schema.EVENTS.CHARACTER_SET_CLIENT</code>.
     */
    public String getCharacterSetClient() {
        return this.characterSetClient;
    }

    /**
     * Getter for <code>information_schema.EVENTS.COLLATION_CONNECTION</code>.
     */
    public String getCollationConnection() {
        return this.collationConnection;
    }

    /**
     * Getter for <code>information_schema.EVENTS.DATABASE_COLLATION</code>.
     */
    public String getDatabaseCollation() {
        return this.databaseCollation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Events other = (Events) obj;
        if (this.eventCatalog == null) {
            if (other.eventCatalog != null)
                return false;
        }
        else if (!this.eventCatalog.equals(other.eventCatalog))
            return false;
        if (this.eventSchema == null) {
            if (other.eventSchema != null)
                return false;
        }
        else if (!this.eventSchema.equals(other.eventSchema))
            return false;
        if (this.eventName == null) {
            if (other.eventName != null)
                return false;
        }
        else if (!this.eventName.equals(other.eventName))
            return false;
        if (this.definer == null) {
            if (other.definer != null)
                return false;
        }
        else if (!this.definer.equals(other.definer))
            return false;
        if (this.timeZone == null) {
            if (other.timeZone != null)
                return false;
        }
        else if (!this.timeZone.equals(other.timeZone))
            return false;
        if (this.eventBody == null) {
            if (other.eventBody != null)
                return false;
        }
        else if (!this.eventBody.equals(other.eventBody))
            return false;
        if (this.eventDefinition == null) {
            if (other.eventDefinition != null)
                return false;
        }
        else if (!this.eventDefinition.equals(other.eventDefinition))
            return false;
        if (this.eventType == null) {
            if (other.eventType != null)
                return false;
        }
        else if (!this.eventType.equals(other.eventType))
            return false;
        if (this.executeAt == null) {
            if (other.executeAt != null)
                return false;
        }
        else if (!this.executeAt.equals(other.executeAt))
            return false;
        if (this.intervalValue == null) {
            if (other.intervalValue != null)
                return false;
        }
        else if (!this.intervalValue.equals(other.intervalValue))
            return false;
        if (this.intervalField == null) {
            if (other.intervalField != null)
                return false;
        }
        else if (!this.intervalField.equals(other.intervalField))
            return false;
        if (this.sqlMode == null) {
            if (other.sqlMode != null)
                return false;
        }
        else if (!this.sqlMode.equals(other.sqlMode))
            return false;
        if (this.starts == null) {
            if (other.starts != null)
                return false;
        }
        else if (!this.starts.equals(other.starts))
            return false;
        if (this.ends == null) {
            if (other.ends != null)
                return false;
        }
        else if (!this.ends.equals(other.ends))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.onCompletion == null) {
            if (other.onCompletion != null)
                return false;
        }
        else if (!this.onCompletion.equals(other.onCompletion))
            return false;
        if (this.created == null) {
            if (other.created != null)
                return false;
        }
        else if (!this.created.equals(other.created))
            return false;
        if (this.lastAltered == null) {
            if (other.lastAltered != null)
                return false;
        }
        else if (!this.lastAltered.equals(other.lastAltered))
            return false;
        if (this.lastExecuted == null) {
            if (other.lastExecuted != null)
                return false;
        }
        else if (!this.lastExecuted.equals(other.lastExecuted))
            return false;
        if (this.eventComment == null) {
            if (other.eventComment != null)
                return false;
        }
        else if (!this.eventComment.equals(other.eventComment))
            return false;
        if (this.originator == null) {
            if (other.originator != null)
                return false;
        }
        else if (!this.originator.equals(other.originator))
            return false;
        if (this.characterSetClient == null) {
            if (other.characterSetClient != null)
                return false;
        }
        else if (!this.characterSetClient.equals(other.characterSetClient))
            return false;
        if (this.collationConnection == null) {
            if (other.collationConnection != null)
                return false;
        }
        else if (!this.collationConnection.equals(other.collationConnection))
            return false;
        if (this.databaseCollation == null) {
            if (other.databaseCollation != null)
                return false;
        }
        else if (!this.databaseCollation.equals(other.databaseCollation))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.eventCatalog == null) ? 0 : this.eventCatalog.hashCode());
        result = prime * result + ((this.eventSchema == null) ? 0 : this.eventSchema.hashCode());
        result = prime * result + ((this.eventName == null) ? 0 : this.eventName.hashCode());
        result = prime * result + ((this.definer == null) ? 0 : this.definer.hashCode());
        result = prime * result + ((this.timeZone == null) ? 0 : this.timeZone.hashCode());
        result = prime * result + ((this.eventBody == null) ? 0 : this.eventBody.hashCode());
        result = prime * result + ((this.eventDefinition == null) ? 0 : this.eventDefinition.hashCode());
        result = prime * result + ((this.eventType == null) ? 0 : this.eventType.hashCode());
        result = prime * result + ((this.executeAt == null) ? 0 : this.executeAt.hashCode());
        result = prime * result + ((this.intervalValue == null) ? 0 : this.intervalValue.hashCode());
        result = prime * result + ((this.intervalField == null) ? 0 : this.intervalField.hashCode());
        result = prime * result + ((this.sqlMode == null) ? 0 : this.sqlMode.hashCode());
        result = prime * result + ((this.starts == null) ? 0 : this.starts.hashCode());
        result = prime * result + ((this.ends == null) ? 0 : this.ends.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.onCompletion == null) ? 0 : this.onCompletion.hashCode());
        result = prime * result + ((this.created == null) ? 0 : this.created.hashCode());
        result = prime * result + ((this.lastAltered == null) ? 0 : this.lastAltered.hashCode());
        result = prime * result + ((this.lastExecuted == null) ? 0 : this.lastExecuted.hashCode());
        result = prime * result + ((this.eventComment == null) ? 0 : this.eventComment.hashCode());
        result = prime * result + ((this.originator == null) ? 0 : this.originator.hashCode());
        result = prime * result + ((this.characterSetClient == null) ? 0 : this.characterSetClient.hashCode());
        result = prime * result + ((this.collationConnection == null) ? 0 : this.collationConnection.hashCode());
        result = prime * result + ((this.databaseCollation == null) ? 0 : this.databaseCollation.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Events (");

        sb.append(eventCatalog);
        sb.append(", ").append(eventSchema);
        sb.append(", ").append(eventName);
        sb.append(", ").append(definer);
        sb.append(", ").append(timeZone);
        sb.append(", ").append(eventBody);
        sb.append(", ").append(eventDefinition);
        sb.append(", ").append(eventType);
        sb.append(", ").append(executeAt);
        sb.append(", ").append(intervalValue);
        sb.append(", ").append(intervalField);
        sb.append(", ").append(sqlMode);
        sb.append(", ").append(starts);
        sb.append(", ").append(ends);
        sb.append(", ").append(status);
        sb.append(", ").append(onCompletion);
        sb.append(", ").append(created);
        sb.append(", ").append(lastAltered);
        sb.append(", ").append(lastExecuted);
        sb.append(", ").append(eventComment);
        sb.append(", ").append(originator);
        sb.append(", ").append(characterSetClient);
        sb.append(", ").append(collationConnection);
        sb.append(", ").append(databaseCollation);

        sb.append(")");
        return sb.toString();
    }
}
