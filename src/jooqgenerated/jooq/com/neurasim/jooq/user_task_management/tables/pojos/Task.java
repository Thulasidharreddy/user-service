/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.user_task_management.tables.pojos;


import com.neurasim.jooq.user_task_management.enums.TaskStatus;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long id;
    private final String title;
    private final String description;
    private final TaskStatus status;
    private final Long userId;
    private final LocalDateTime createdAt;

    public Task(Task value) {
        this.id = value.id;
        this.title = value.title;
        this.description = value.description;
        this.status = value.status;
        this.userId = value.userId;
        this.createdAt = value.createdAt;
    }

    public Task(
        Long id,
        String title,
        String description,
        TaskStatus status,
        Long userId,
        LocalDateTime createdAt
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    /**
     * Getter for <code>user_task_management.Task.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for <code>user_task_management.Task.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Getter for <code>user_task_management.Task.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Getter for <code>user_task_management.Task.status</code>.
     */
    public TaskStatus getStatus() {
        return this.status;
    }

    /**
     * Getter for <code>user_task_management.Task.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>user_task_management.Task.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Task other = (Task) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        if (this.description == null) {
            if (other.description != null)
                return false;
        }
        else if (!this.description.equals(other.description))
            return false;
        if (this.status == null) {
            if (other.status != null)
                return false;
        }
        else if (!this.status.equals(other.status))
            return false;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!this.userId.equals(other.userId))
            return false;
        if (this.createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!this.createdAt.equals(other.createdAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.status == null) ? 0 : this.status.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Task (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(status);
        sb.append(", ").append(userId);
        sb.append(", ").append(createdAt);

        sb.append(")");
        return sb.toString();
    }
}
