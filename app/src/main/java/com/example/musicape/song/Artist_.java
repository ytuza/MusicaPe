
package com.example.musicape.song;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Artist_ {

    @SerializedName("external_urls")
    @Expose
    private ExternalUrls__ externalUrls;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("uri")
    @Expose
    private String uri;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Artist_() {
    }

    /**
     * 
     * @param name
     * @param externalUrls
     * @param href
     * @param id
     * @param type
     * @param uri
     */
    public Artist_(ExternalUrls__ externalUrls, String href, String id, String name, String type, String uri) {
        super();
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.type = type;
        this.uri = uri;
    }

    public ExternalUrls__ getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrls__ externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Artist_ withExternalUrls(ExternalUrls__ externalUrls) {
        this.externalUrls = externalUrls;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Artist_ withHref(String href) {
        this.href = href;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Artist_ withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist_ withName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Artist_ withType(String type) {
        this.type = type;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Artist_ withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("externalUrls", externalUrls).append("href", href).append("id", id).append("name", name).append("type", type).append("uri", uri).toString();
    }

}
