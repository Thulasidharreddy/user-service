/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.user_task_management.tables.records;


import com.neurasim.jooq.user_task_management.enums.TaskStatus;
import com.neurasim.jooq.user_task_management.tables.Task;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskRecord extends UpdatableRecordImpl<TaskRecord> implements Record6<Long, String, String, TaskStatus, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>user_task_management.Task.id</code>.
     */
    public TaskRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>user_task_management.Task.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>user_task_management.Task.title</code>.
     */
    public TaskRecord setTitle(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>user_task_management.Task.title</code>.
     */
    public String getTitle() {
        return (String) get(1);
    }

    /**
     * Setter for <code>user_task_management.Task.description</code>.
     */
    public TaskRecord setDescription(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>user_task_management.Task.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>user_task_management.Task.status</code>.
     */
    public TaskRecord setStatus(TaskStatus value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>user_task_management.Task.status</code>.
     */
    public TaskStatus getStatus() {
        return (TaskStatus) get(3);
    }

    /**
     * Setter for <code>user_task_management.Task.user_id</code>.
     */
    public TaskRecord setUserId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>user_task_management.Task.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>user_task_management.Task.created_at</code>.
     */
    public TaskRecord setCreatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>user_task_management.Task.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, TaskStatus, Long, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, TaskStatus, Long, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Task.TASK.ID;
    }

    @Override
    public Field<String> field2() {
        return Task.TASK.TITLE;
    }

    @Override
    public Field<String> field3() {
        return Task.TASK.DESCRIPTION;
    }

    @Override
    public Field<TaskStatus> field4() {
        return Task.TASK.STATUS;
    }

    @Override
    public Field<Long> field5() {
        return Task.TASK.USER_ID;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Task.TASK.CREATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTitle();
    }

    @Override
    public String component3() {
        return getDescription();
    }

    @Override
    public TaskStatus component4() {
        return getStatus();
    }

    @Override
    public Long component5() {
        return getUserId();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTitle();
    }

    @Override
    public String value3() {
        return getDescription();
    }

    @Override
    public TaskStatus value4() {
        return getStatus();
    }

    @Override
    public Long value5() {
        return getUserId();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedAt();
    }

    @Override
    public TaskRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TaskRecord value2(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public TaskRecord value3(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TaskRecord value4(TaskStatus value) {
        setStatus(value);
        return this;
    }

    @Override
    public TaskRecord value5(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public TaskRecord value6(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public TaskRecord values(Long value1, String value2, String value3, TaskStatus value4, Long value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskRecord
     */
    public TaskRecord() {
        super(Task.TASK);
    }

    /**
     * Create a detached, initialised TaskRecord
     */
    public TaskRecord(Long id, String title, String description, TaskStatus status, Long userId, LocalDateTime createdAt) {
        super(Task.TASK);

        setId(id);
        setTitle(title);
        setDescription(description);
        setStatus(status);
        setUserId(userId);
        setCreatedAt(createdAt);
    }

    /**
     * Create a detached, initialised TaskRecord
     */
    public TaskRecord(com.neurasim.jooq.user_task_management.tables.pojos.Task value) {
        super(Task.TASK);

        if (value != null) {
            setId(value.getId());
            setTitle(value.getTitle());
            setDescription(value.getDescription());
            setStatus(value.getStatus());
            setUserId(value.getUserId());
            setCreatedAt(value.getCreatedAt());
        }
    }
}
