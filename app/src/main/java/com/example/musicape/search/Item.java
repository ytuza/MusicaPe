
package com.example.musicape.search;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {

    @SerializedName("external_urls")
    @Expose
    private ExternalUrls externalUrls;
    @SerializedName("followers")
    @Expose
    private Followers followers;
    @SerializedName("genres")
    @Expose
    private List<String> genres = null;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
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
    public Item() {
    }

    /**
     * 
     * @param images
     * @param followers
     * @param genres
     * @param popularity
     * @param name
     * @param externalUrls
     * @param href
     * @param id
     * @param type
     * @param uri
     */
    public Item(ExternalUrls externalUrls, Followers followers, List<String> genres, String href, String id, List<Image> images, String name, Integer popularity, String type, String uri) {
        super();
        this.externalUrls = externalUrls;
        this.followers = followers;
        this.genres = genres;
        this.href = href;
        this.id = id;
        this.images = images;
        this.name = name;
        this.popularity = popularity;
        this.type = type;
        this.uri = uri;
    }

    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Item withExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
        return this;
    }

    public Followers getFollowers() {
        return followers;
    }

    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    public Item withFollowers(Followers followers) {
        this.followers = followers;
        return this;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Item withGenres(List<String> genres) {
        this.genres = genres;
        return this;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Item withHref(String href) {
        this.href = href;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item withId(String id) {
        this.id = id;
        return this;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Item withImages(List<Image> images) {
        this.images = images;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPopularity() {
        return popularity;
    }

    public void setPopularity(Integer popularity) {
        this.popularity = popularity;
    }

    public Item withPopularity(Integer popularity) {
        this.popularity = popularity;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Item withType(String type) {
        this.type = type;
        return this;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Item withUri(String uri) {
        this.uri = uri;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("externalUrls", externalUrls).append("followers", followers).append("genres", genres).append("href", href).append("id", id).append("images", images).append("name", name).append("popularity", popularity).append("type", type).append("uri", uri).toString();
    }

}
