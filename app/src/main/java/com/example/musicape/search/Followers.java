
package com.example.musicape.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Followers {

    @SerializedName("href")
    @Expose
    private Object href;
    @SerializedName("total")
    @Expose
    private Integer total;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Followers() {
    }

    /**
     * 
     * @param total
     * @param href
     */
    public Followers(Object href, Integer total) {
        super();
        this.href = href;
        this.total = total;
    }

    public Object getHref() {
        return href;
    }

    public void setHref(Object href) {
        this.href = href;
    }

    public Followers withHref(Object href) {
        this.href = href;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Followers withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("href", href).append("total", total).toString();
    }

}
