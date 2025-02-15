/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.user_task_management;


import com.neurasim.jooq.user_task_management.tables.Task;
import com.neurasim.jooq.user_task_management.tables.User;
import com.neurasim.jooq.user_task_management.tables.records.TaskRecord;
import com.neurasim.jooq.user_task_management.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * user_task_management.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TaskRecord> KEY_TASK_PRIMARY = Internal.createUniqueKey(Task.TASK, DSL.name("KEY_Task_PRIMARY"), new TableField[] { Task.TASK.ID }, true);
    public static final UniqueKey<UserRecord> KEY_USER_EMAIL = Internal.createUniqueKey(User.USER, DSL.name("KEY_User_email"), new TableField[] { User.USER.EMAIL }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(User.USER, DSL.name("KEY_User_PRIMARY"), new TableField[] { User.USER.ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<TaskRecord, UserRecord> TASK_IBFK_1 = Internal.createForeignKey(Task.TASK, DSL.name("task_ibfk_1"), new TableField[] { Task.TASK.USER_ID }, Keys.KEY_USER_PRIMARY, new TableField[] { User.USER.ID }, true);
}
