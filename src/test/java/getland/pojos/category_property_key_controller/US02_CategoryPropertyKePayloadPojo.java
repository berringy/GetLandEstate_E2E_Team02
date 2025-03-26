package getland.pojos.category_property_key_controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class US02_CategoryPropertyKePayloadPojo implements Serializable {

    private String name;
    private String keyType;
    private String prefix;
    private String suffix;

    public US02_CategoryPropertyKePayloadPojo() {
    }

    public US02_CategoryPropertyKePayloadPojo(String name, String keyType, String prefix, String suffix) {
        this.name = name;
        this.keyType = keyType;
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public US02_CategoryPropertyKePayloadPojo(int id, String name, String keyType, String prefix, String suffix) {
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

    @Override
    public String toString() {
        return "US02_CategoryPropertyKePayloadPojo{" +
                "name='" + name + '\'' +
                ", keyType='" + keyType + '\'' +
                ", prefix='" + prefix + '\'' +
                ", suffix='" + suffix + '\'' +
                '}';
    }
}
