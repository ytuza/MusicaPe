
package com.example.musicape.Recomend;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Image {

    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("width")
    @Expose
    private Integer width;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Image() {
    }

    /**
     * 
     * @param width
     * @param url
     * @param height
     */
    public Image(Integer height, String url, Integer width) {
        super();
        this.height = height;
        this.url = url;
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Image withHeight(Integer height) {
        this.height = height;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Image withUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Image withWidth(Integer width) {
        this.width = width;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("height", height).append("url", url).append("width", width).toString();
    }

}
