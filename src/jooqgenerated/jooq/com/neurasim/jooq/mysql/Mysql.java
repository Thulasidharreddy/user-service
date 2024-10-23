/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.mysql;


import com.neurasim.jooq.DefaultCatalog;
import com.neurasim.jooq.mysql.tables.ColumnsPriv;
import com.neurasim.jooq.mysql.tables.Component;
import com.neurasim.jooq.mysql.tables.Db;
import com.neurasim.jooq.mysql.tables.DefaultRoles;
import com.neurasim.jooq.mysql.tables.EngineCost;
import com.neurasim.jooq.mysql.tables.Func;
import com.neurasim.jooq.mysql.tables.GeneralLog;
import com.neurasim.jooq.mysql.tables.GlobalGrants;
import com.neurasim.jooq.mysql.tables.GtidExecuted;
import com.neurasim.jooq.mysql.tables.HelpCategory;
import com.neurasim.jooq.mysql.tables.HelpKeyword;
import com.neurasim.jooq.mysql.tables.HelpRelation;
import com.neurasim.jooq.mysql.tables.HelpTopic;
import com.neurasim.jooq.mysql.tables.InnodbIndexStats;
import com.neurasim.jooq.mysql.tables.InnodbTableStats;
import com.neurasim.jooq.mysql.tables.NdbBinlogIndex;
import com.neurasim.jooq.mysql.tables.PasswordHistory;
import com.neurasim.jooq.mysql.tables.Plugin;
import com.neurasim.jooq.mysql.tables.ProcsPriv;
import com.neurasim.jooq.mysql.tables.ProxiesPriv;
import com.neurasim.jooq.mysql.tables.ReplicationAsynchronousConnectionFailover;
import com.neurasim.jooq.mysql.tables.ReplicationAsynchronousConnectionFailoverManaged;
import com.neurasim.jooq.mysql.tables.ReplicationGroupConfigurationVersion;
import com.neurasim.jooq.mysql.tables.ReplicationGroupMemberActions;
import com.neurasim.jooq.mysql.tables.RoleEdges;
import com.neurasim.jooq.mysql.tables.ServerCost;
import com.neurasim.jooq.mysql.tables.Servers;
import com.neurasim.jooq.mysql.tables.SlaveMasterInfo;
import com.neurasim.jooq.mysql.tables.SlaveRelayLogInfo;
import com.neurasim.jooq.mysql.tables.SlaveWorkerInfo;
import com.neurasim.jooq.mysql.tables.SlowLog;
import com.neurasim.jooq.mysql.tables.TablesPriv;
import com.neurasim.jooq.mysql.tables.TimeZone;
import com.neurasim.jooq.mysql.tables.TimeZoneLeapSecond;
import com.neurasim.jooq.mysql.tables.TimeZoneName;
import com.neurasim.jooq.mysql.tables.TimeZoneTransition;
import com.neurasim.jooq.mysql.tables.TimeZoneTransitionType;
import com.neurasim.jooq.mysql.tables.User;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Mysql extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>mysql</code>
     */
    public static final Mysql MYSQL = new Mysql();

    /**
     * Column privileges
     */
    public final ColumnsPriv COLUMNS_PRIV = ColumnsPriv.COLUMNS_PRIV;

    /**
     * Components
     */
    public final Component COMPONENT = Component.COMPONENT;

    /**
     * Database privileges
     */
    public final Db DB = Db.DB;

    /**
     * Default roles
     */
    public final DefaultRoles DEFAULT_ROLES = DefaultRoles.DEFAULT_ROLES;

    /**
     * The table <code>mysql.engine_cost</code>.
     */
    public final EngineCost ENGINE_COST = EngineCost.ENGINE_COST;

    /**
     * User defined functions
     */
    public final Func FUNC = Func.FUNC;

    /**
     * General log
     */
    public final GeneralLog GENERAL_LOG = GeneralLog.GENERAL_LOG;

    /**
     * Extended global grants
     */
    public final GlobalGrants GLOBAL_GRANTS = GlobalGrants.GLOBAL_GRANTS;

    /**
     * The table <code>mysql.gtid_executed</code>.
     */
    public final GtidExecuted GTID_EXECUTED = GtidExecuted.GTID_EXECUTED;

    /**
     * help categories
     */
    public final HelpCategory HELP_CATEGORY = HelpCategory.HELP_CATEGORY;

    /**
     * help keywords
     */
    public final HelpKeyword HELP_KEYWORD = HelpKeyword.HELP_KEYWORD;

    /**
     * keyword-topic relation
     */
    public final HelpRelation HELP_RELATION = HelpRelation.HELP_RELATION;

    /**
     * help topics
     */
    public final HelpTopic HELP_TOPIC = HelpTopic.HELP_TOPIC;

    /**
     * The table <code>mysql.innodb_index_stats</code>.
     */
    public final InnodbIndexStats INNODB_INDEX_STATS = InnodbIndexStats.INNODB_INDEX_STATS;

    /**
     * The table <code>mysql.innodb_table_stats</code>.
     */
    public final InnodbTableStats INNODB_TABLE_STATS = InnodbTableStats.INNODB_TABLE_STATS;

    /**
     * The table <code>mysql.ndb_binlog_index</code>.
     */
    public final NdbBinlogIndex NDB_BINLOG_INDEX = NdbBinlogIndex.NDB_BINLOG_INDEX;

    /**
     * Password history for user accounts
     */
    public final PasswordHistory PASSWORD_HISTORY = PasswordHistory.PASSWORD_HISTORY;

    /**
     * MySQL plugins
     */
    public final Plugin PLUGIN = Plugin.PLUGIN;

    /**
     * Procedure privileges
     */
    public final ProcsPriv PROCS_PRIV = ProcsPriv.PROCS_PRIV;

    /**
     * User proxy privileges
     */
    public final ProxiesPriv PROXIES_PRIV = ProxiesPriv.PROXIES_PRIV;

    /**
     * The source configuration details
     */
    public final ReplicationAsynchronousConnectionFailover REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER = ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER;

    /**
     * The managed source configuration details
     */
    public final ReplicationAsynchronousConnectionFailoverManaged REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED = ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED;

    /**
     * The group configuration version.
     */
    public final ReplicationGroupConfigurationVersion REPLICATION_GROUP_CONFIGURATION_VERSION = ReplicationGroupConfigurationVersion.REPLICATION_GROUP_CONFIGURATION_VERSION;

    /**
     * The member actions configuration.
     */
    public final ReplicationGroupMemberActions REPLICATION_GROUP_MEMBER_ACTIONS = ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS;

    /**
     * Role hierarchy and role grants
     */
    public final RoleEdges ROLE_EDGES = RoleEdges.ROLE_EDGES;

    /**
     * The table <code>mysql.server_cost</code>.
     */
    public final ServerCost SERVER_COST = ServerCost.SERVER_COST;

    /**
     * MySQL Foreign Servers table
     */
    public final Servers SERVERS = Servers.SERVERS;

    /**
     * Master Information
     */
    public final SlaveMasterInfo SLAVE_MASTER_INFO = SlaveMasterInfo.SLAVE_MASTER_INFO;

    /**
     * Relay Log Information
     */
    public final SlaveRelayLogInfo SLAVE_RELAY_LOG_INFO = SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO;

    /**
     * Worker Information
     */
    public final SlaveWorkerInfo SLAVE_WORKER_INFO = SlaveWorkerInfo.SLAVE_WORKER_INFO;

    /**
     * Slow log
     */
    public final SlowLog SLOW_LOG = SlowLog.SLOW_LOG;

    /**
     * Table privileges
     */
    public final TablesPriv TABLES_PRIV = TablesPriv.TABLES_PRIV;

    /**
     * Time zones
     */
    public final TimeZone TIME_ZONE = TimeZone.TIME_ZONE;

    /**
     * Leap seconds information for time zones
     */
    public final TimeZoneLeapSecond TIME_ZONE_LEAP_SECOND = TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND;

    /**
     * Time zone names
     */
    public final TimeZoneName TIME_ZONE_NAME = TimeZoneName.TIME_ZONE_NAME;

    /**
     * Time zone transitions
     */
    public final TimeZoneTransition TIME_ZONE_TRANSITION = TimeZoneTransition.TIME_ZONE_TRANSITION;

    /**
     * Time zone transition types
     */
    public final TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE;

    /**
     * Users and global privileges
     */
    public final User USER = User.USER;

    /**
     * No further instances allowed
     */
    private Mysql() {
        super("mysql", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            ColumnsPriv.COLUMNS_PRIV,
            Component.COMPONENT,
            Db.DB,
            DefaultRoles.DEFAULT_ROLES,
            EngineCost.ENGINE_COST,
            Func.FUNC,
            GeneralLog.GENERAL_LOG,
            GlobalGrants.GLOBAL_GRANTS,
            GtidExecuted.GTID_EXECUTED,
            HelpCategory.HELP_CATEGORY,
            HelpKeyword.HELP_KEYWORD,
            HelpRelation.HELP_RELATION,
            HelpTopic.HELP_TOPIC,
            InnodbIndexStats.INNODB_INDEX_STATS,
            InnodbTableStats.INNODB_TABLE_STATS,
            NdbBinlogIndex.NDB_BINLOG_INDEX,
            PasswordHistory.PASSWORD_HISTORY,
            Plugin.PLUGIN,
            ProcsPriv.PROCS_PRIV,
            ProxiesPriv.PROXIES_PRIV,
            ReplicationAsynchronousConnectionFailover.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER,
            ReplicationAsynchronousConnectionFailoverManaged.REPLICATION_ASYNCHRONOUS_CONNECTION_FAILOVER_MANAGED,
            ReplicationGroupConfigurationVersion.REPLICATION_GROUP_CONFIGURATION_VERSION,
            ReplicationGroupMemberActions.REPLICATION_GROUP_MEMBER_ACTIONS,
            RoleEdges.ROLE_EDGES,
            ServerCost.SERVER_COST,
            Servers.SERVERS,
            SlaveMasterInfo.SLAVE_MASTER_INFO,
            SlaveRelayLogInfo.SLAVE_RELAY_LOG_INFO,
            SlaveWorkerInfo.SLAVE_WORKER_INFO,
            SlowLog.SLOW_LOG,
            TablesPriv.TABLES_PRIV,
            TimeZone.TIME_ZONE,
            TimeZoneLeapSecond.TIME_ZONE_LEAP_SECOND,
            TimeZoneName.TIME_ZONE_NAME,
            TimeZoneTransition.TIME_ZONE_TRANSITION,
            TimeZoneTransitionType.TIME_ZONE_TRANSITION_TYPE,
            User.USER
        );
    }
}
