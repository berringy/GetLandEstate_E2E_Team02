package getland.pojos.category_property_key_controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class US02_CategoryPropertyKeyResponsePojo implements Serializable {

    public static int id;
    private String name;
    private String keyType;
    private String prefix;
    private String suffix;
    private boolean buildIn;

    public US02_CategoryPropertyKeyResponsePojo() {
    }

    public US02_CategoryPropertyKeyResponsePojo(int id, String name, String keyType, String prefix, String suffix, boolean buildIn) {
        this.id = id;
        this.name = name;
        this.keyType = keyType;
        this.prefix = prefix;
        this.suffix = suffix;
        this.buildIn = buildIn;
    }

    public static int id() {
        return id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public boolean isBuildIn() {
        return buildIn;
    }

    public void setBuildIn(boolean buildIn) {
        this.buildIn = buildIn;
    }

    @Override
    public String toString() {
        return "US02_CategoryPropertyKeyResponsePojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", keyType='" + keyType + '\'' +
                ", prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                ", buildIn=" + buildIn +
                '}';
    }
}
