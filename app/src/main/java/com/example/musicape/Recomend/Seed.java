
package com.example.musicape.Recomend;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Seed {

    @SerializedName("initialPoolSize")
    @Expose
    private Integer initialPoolSize;
    @SerializedName("afterFilteringSize")
    @Expose
    private Integer afterFilteringSize;
    @SerializedName("afterRelinkingSize")
    @Expose
    private Integer afterRelinkingSize;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("href")
    @Expose
    private Object href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Seed() {
    }

    /**
     * 
     * @param id
     * @param href
     * @param type
     * @param initialPoolSize
     * @param afterRelinkingSize
     * @param afterFilteringSize
     */
    public Seed(Integer initialPoolSize, Integer afterFilteringSize, Integer afterRelinkingSize, String id, String type, Object href) {
        super();
        this.initialPoolSize = initialPoolSize;
        this.afterFilteringSize = afterFilteringSize;
        this.afterRelinkingSize = afterRelinkingSize;
        this.id = id;
        this.type = type;
        this.href = href;
    }

    public Integer getInitialPoolSize() {
        return initialPoolSize;
    }

    public void setInitialPoolSize(Integer initialPoolSize) {
        this.initialPoolSize = initialPoolSize;
    }

    public Seed withInitialPoolSize(Integer initialPoolSize) {
        this.initialPoolSize = initialPoolSize;
        return this;
    }

    public Integer getAfterFilteringSize() {
        return afterFilteringSize;
    }

    public void setAfterFilteringSize(Integer afterFilteringSize) {
        this.afterFilteringSize = afterFilteringSize;
    }

    public Seed withAfterFilteringSize(Integer afterFilteringSize) {
        this.afterFilteringSize = afterFilteringSize;
        return this;
    }

    public Integer getAfterRelinkingSize() {
        return afterRelinkingSize;
    }

    public void setAfterRelinkingSize(Integer afterRelinkingSize) {
        this.afterRelinkingSize = afterRelinkingSize;
    }

    public Seed withAfterRelinkingSize(Integer afterRelinkingSize) {
        this.afterRelinkingSize = afterRelinkingSize;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Seed withId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Seed withType(String type) {
        this.type = type;
        return this;
    }

    public Object getHref() {
        return href;
    }

    public void setHref(Object href) {
        this.href = href;
    }

    public Seed withHref(Object href) {
        this.href = href;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("initialPoolSize", initialPoolSize).append("afterFilteringSize", afterFilteringSize).append("afterRelinkingSize", afterRelinkingSize).append("id", id).append("type", type).append("href", href).toString();
    }

}
