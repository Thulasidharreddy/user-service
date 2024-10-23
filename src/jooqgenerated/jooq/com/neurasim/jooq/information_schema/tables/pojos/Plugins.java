/*
 * This file is generated by jOOQ.
 */
package com.neurasim.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Plugins implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String pluginName;
    private final String pluginVersion;
    private final String pluginStatus;
    private final String pluginType;
    private final String pluginTypeVersion;
    private final String pluginLibrary;
    private final String pluginLibraryVersion;
    private final String pluginAuthor;
    private final String pluginDescription;
    private final String pluginLicense;
    private final String loadOption;

    public Plugins(Plugins value) {
        this.pluginName = value.pluginName;
        this.pluginVersion = value.pluginVersion;
        this.pluginStatus = value.pluginStatus;
        this.pluginType = value.pluginType;
        this.pluginTypeVersion = value.pluginTypeVersion;
        this.pluginLibrary = value.pluginLibrary;
        this.pluginLibraryVersion = value.pluginLibraryVersion;
        this.pluginAuthor = value.pluginAuthor;
        this.pluginDescription = value.pluginDescription;
        this.pluginLicense = value.pluginLicense;
        this.loadOption = value.loadOption;
    }

    public Plugins(
        String pluginName,
        String pluginVersion,
        String pluginStatus,
        String pluginType,
        String pluginTypeVersion,
        String pluginLibrary,
        String pluginLibraryVersion,
        String pluginAuthor,
        String pluginDescription,
        String pluginLicense,
        String loadOption
    ) {
        this.pluginName = pluginName;
        this.pluginVersion = pluginVersion;
        this.pluginStatus = pluginStatus;
        this.pluginType = pluginType;
        this.pluginTypeVersion = pluginTypeVersion;
        this.pluginLibrary = pluginLibrary;
        this.pluginLibraryVersion = pluginLibraryVersion;
        this.pluginAuthor = pluginAuthor;
        this.pluginDescription = pluginDescription;
        this.pluginLicense = pluginLicense;
        this.loadOption = loadOption;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_NAME</code>.
     */
    public String getPluginName() {
        return this.pluginName;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_VERSION</code>.
     */
    public String getPluginVersion() {
        return this.pluginVersion;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_STATUS</code>.
     */
    public String getPluginStatus() {
        return this.pluginStatus;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_TYPE</code>.
     */
    public String getPluginType() {
        return this.pluginType;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_TYPE_VERSION</code>.
     */
    public String getPluginTypeVersion() {
        return this.pluginTypeVersion;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_LIBRARY</code>.
     */
    public String getPluginLibrary() {
        return this.pluginLibrary;
    }

    /**
     * Getter for
     * <code>information_schema.PLUGINS.PLUGIN_LIBRARY_VERSION</code>.
     */
    public String getPluginLibraryVersion() {
        return this.pluginLibraryVersion;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_AUTHOR</code>.
     */
    public String getPluginAuthor() {
        return this.pluginAuthor;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_DESCRIPTION</code>.
     */
    public String getPluginDescription() {
        return this.pluginDescription;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.PLUGIN_LICENSE</code>.
     */
    public String getPluginLicense() {
        return this.pluginLicense;
    }

    /**
     * Getter for <code>information_schema.PLUGINS.LOAD_OPTION</code>.
     */
    public String getLoadOption() {
        return this.loadOption;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Plugins other = (Plugins) obj;
        if (this.pluginName == null) {
            if (other.pluginName != null)
                return false;
        }
        else if (!this.pluginName.equals(other.pluginName))
            return false;
        if (this.pluginVersion == null) {
            if (other.pluginVersion != null)
                return false;
        }
        else if (!this.pluginVersion.equals(other.pluginVersion))
            return false;
        if (this.pluginStatus == null) {
            if (other.pluginStatus != null)
                return false;
        }
        else if (!this.pluginStatus.equals(other.pluginStatus))
            return false;
        if (this.pluginType == null) {
            if (other.pluginType != null)
                return false;
        }
        else if (!this.pluginType.equals(other.pluginType))
            return false;
        if (this.pluginTypeVersion == null) {
            if (other.pluginTypeVersion != null)
                return false;
        }
        else if (!this.pluginTypeVersion.equals(other.pluginTypeVersion))
            return false;
        if (this.pluginLibrary == null) {
            if (other.pluginLibrary != null)
                return false;
        }
        else if (!this.pluginLibrary.equals(other.pluginLibrary))
            return false;
        if (this.pluginLibraryVersion == null) {
            if (other.pluginLibraryVersion != null)
                return false;
        }
        else if (!this.pluginLibraryVersion.equals(other.pluginLibraryVersion))
            return false;
        if (this.pluginAuthor == null) {
            if (other.pluginAuthor != null)
                return false;
        }
        else if (!this.pluginAuthor.equals(other.pluginAuthor))
            return false;
        if (this.pluginDescription == null) {
            if (other.pluginDescription != null)
                return false;
        }
        else if (!this.pluginDescription.equals(other.pluginDescription))
            return false;
        if (this.pluginLicense == null) {
            if (other.pluginLicense != null)
                return false;
        }
        else if (!this.pluginLicense.equals(other.pluginLicense))
            return false;
        if (this.loadOption == null) {
            if (other.loadOption != null)
                return false;
        }
        else if (!this.loadOption.equals(other.loadOption))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.pluginName == null) ? 0 : this.pluginName.hashCode());
        result = prime * result + ((this.pluginVersion == null) ? 0 : this.pluginVersion.hashCode());
        result = prime * result + ((this.pluginStatus == null) ? 0 : this.pluginStatus.hashCode());
        result = prime * result + ((this.pluginType == null) ? 0 : this.pluginType.hashCode());
        result = prime * result + ((this.pluginTypeVersion == null) ? 0 : this.pluginTypeVersion.hashCode());
        result = prime * result + ((this.pluginLibrary == null) ? 0 : this.pluginLibrary.hashCode());
        result = prime * result + ((this.pluginLibraryVersion == null) ? 0 : this.pluginLibraryVersion.hashCode());
        result = prime * result + ((this.pluginAuthor == null) ? 0 : this.pluginAuthor.hashCode());
        result = prime * result + ((this.pluginDescription == null) ? 0 : this.pluginDescription.hashCode());
        result = prime * result + ((this.pluginLicense == null) ? 0 : this.pluginLicense.hashCode());
        result = prime * result + ((this.loadOption == null) ? 0 : this.loadOption.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Plugins (");

        sb.append(pluginName);
        sb.append(", ").append(pluginVersion);
        sb.append(", ").append(pluginStatus);
        sb.append(", ").append(pluginType);
        sb.append(", ").append(pluginTypeVersion);
        sb.append(", ").append(pluginLibrary);
        sb.append(", ").append(pluginLibraryVersion);
        sb.append(", ").append(pluginAuthor);
        sb.append(", ").append(pluginDescription);
        sb.append(", ").append(pluginLicense);
        sb.append(", ").append(loadOption);

        sb.append(")");
        return sb.toString();
    }
}
