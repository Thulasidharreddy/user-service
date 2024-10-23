/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRoutineGrants implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String grantor;
    private final String grantorHost;
    private final String grantee;
    private final String granteeHost;
    private final String specificCatalog;
    private final String specificSchema;
    private final String specificName;
    private final String routineCatalog;
    private final String routineSchema;
    private final String routineName;
    private final String privilegeType;
    private final String isGrantable;

    public RoleRoutineGrants(RoleRoutineGrants value) {
        this.grantor = value.grantor;
        this.grantorHost = value.grantorHost;
        this.grantee = value.grantee;
        this.granteeHost = value.granteeHost;
        this.specificCatalog = value.specificCatalog;
        this.specificSchema = value.specificSchema;
        this.specificName = value.specificName;
        this.routineCatalog = value.routineCatalog;
        this.routineSchema = value.routineSchema;
        this.routineName = value.routineName;
        this.privilegeType = value.privilegeType;
        this.isGrantable = value.isGrantable;
    }

    public RoleRoutineGrants(
        String grantor,
        String grantorHost,
        String grantee,
        String granteeHost,
        String specificCatalog,
        String specificSchema,
        String specificName,
        String routineCatalog,
        String routineSchema,
        String routineName,
        String privilegeType,
        String isGrantable
    ) {
        this.grantor = grantor;
        this.grantorHost = grantorHost;
        this.grantee = grantee;
        this.granteeHost = granteeHost;
        this.specificCatalog = specificCatalog;
        this.specificSchema = specificSchema;
        this.specificName = specificName;
        this.routineCatalog = routineCatalog;
        this.routineSchema = routineSchema;
        this.routineName = routineName;
        this.privilegeType = privilegeType;
        this.isGrantable = isGrantable;
    }

    /**
     * Getter for <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR</code>.
     */
    public String getGrantor() {
        return this.grantor;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTOR_HOST</code>.
     */
    public String getGrantorHost() {
        return this.grantorHost;
    }

    /**
     * Getter for <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE</code>.
     */
    public String getGrantee() {
        return this.grantee;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.GRANTEE_HOST</code>.
     */
    public String getGranteeHost() {
        return this.granteeHost;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_CATALOG</code>.
     */
    public String getSpecificCatalog() {
        return this.specificCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_SCHEMA</code>.
     */
    public String getSpecificSchema() {
        return this.specificSchema;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return this.specificName;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_CATALOG</code>.
     */
    public String getRoutineCatalog() {
        return this.routineCatalog;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_SCHEMA</code>.
     */
    public String getRoutineSchema() {
        return this.routineSchema;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.ROUTINE_NAME</code>.
     */
    public String getRoutineName() {
        return this.routineName;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.PRIVILEGE_TYPE</code>.
     */
    public String getPrivilegeType() {
        return this.privilegeType;
    }

    /**
     * Getter for
     * <code>information_schema.ROLE_ROUTINE_GRANTS.IS_GRANTABLE</code>.
     */
    public String getIsGrantable() {
        return this.isGrantable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RoleRoutineGrants other = (RoleRoutineGrants) obj;
        if (this.grantor == null) {
            if (other.grantor != null)
                return false;
        }
        else if (!this.grantor.equals(other.grantor))
            return false;
        if (this.grantorHost == null) {
            if (other.grantorHost != null)
                return false;
        }
        else if (!this.grantorHost.equals(other.grantorHost))
            return false;
        if (this.grantee == null) {
            if (other.grantee != null)
                return false;
        }
        else if (!this.grantee.equals(other.grantee))
            return false;
        if (this.granteeHost == null) {
            if (other.granteeHost != null)
                return false;
        }
        else if (!this.granteeHost.equals(other.granteeHost))
            return false;
        if (this.specificCatalog == null) {
            if (other.specificCatalog != null)
                return false;
        }
        else if (!this.specificCatalog.equals(other.specificCatalog))
            return false;
        if (this.specificSchema == null) {
            if (other.specificSchema != null)
                return false;
        }
        else if (!this.specificSchema.equals(other.specificSchema))
            return false;
        if (this.specificName == null) {
            if (other.specificName != null)
                return false;
        }
        else if (!this.specificName.equals(other.specificName))
            return false;
        if (this.routineCatalog == null) {
            if (other.routineCatalog != null)
                return false;
        }
        else if (!this.routineCatalog.equals(other.routineCatalog))
            return false;
        if (this.routineSchema == null) {
            if (other.routineSchema != null)
                return false;
        }
        else if (!this.routineSchema.equals(other.routineSchema))
            return false;
        if (this.routineName == null) {
            if (other.routineName != null)
                return false;
        }
        else if (!this.routineName.equals(other.routineName))
            return false;
        if (this.privilegeType == null) {
            if (other.privilegeType != null)
                return false;
        }
        else if (!this.privilegeType.equals(other.privilegeType))
            return false;
        if (this.isGrantable == null) {
            if (other.isGrantable != null)
                return false;
        }
        else if (!this.isGrantable.equals(other.isGrantable))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.grantor == null) ? 0 : this.grantor.hashCode());
        result = prime * result + ((this.grantorHost == null) ? 0 : this.grantorHost.hashCode());
        result = prime * result + ((this.grantee == null) ? 0 : this.grantee.hashCode());
        result = prime * result + ((this.granteeHost == null) ? 0 : this.granteeHost.hashCode());
        result = prime * result + ((this.specificCatalog == null) ? 0 : this.specificCatalog.hashCode());
        result = prime * result + ((this.specificSchema == null) ? 0 : this.specificSchema.hashCode());
        result = prime * result + ((this.specificName == null) ? 0 : this.specificName.hashCode());
        result = prime * result + ((this.routineCatalog == null) ? 0 : this.routineCatalog.hashCode());
        result = prime * result + ((this.routineSchema == null) ? 0 : this.routineSchema.hashCode());
        result = prime * result + ((this.routineName == null) ? 0 : this.routineName.hashCode());
        result = prime * result + ((this.privilegeType == null) ? 0 : this.privilegeType.hashCode());
        result = prime * result + ((this.isGrantable == null) ? 0 : this.isGrantable.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RoleRoutineGrants (");

        sb.append(grantor);
        sb.append(", ").append(grantorHost);
        sb.append(", ").append(grantee);
        sb.append(", ").append(granteeHost);
        sb.append(", ").append(specificCatalog);
        sb.append(", ").append(specificSchema);
        sb.append(", ").append(specificName);
        sb.append(", ").append(routineCatalog);
        sb.append(", ").append(routineSchema);
        sb.append(", ").append(routineName);
        sb.append(", ").append(privilegeType);
        sb.append(", ").append(isGrantable);

        sb.append(")");
        return sb.toString();
    }
}
