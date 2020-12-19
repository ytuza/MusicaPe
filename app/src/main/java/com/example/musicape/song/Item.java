
package com.example.musicape.song;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Item {

    @SerializedName("album")
    @Expose
    private Album album;
    @SerializedName("artists")
    @Expose
    private List<Artist_> artists = null;
    @SerializedName("available_markets")
    @Expose
    private List<String> availableMarkets = null;
    @SerializedName("disc_number")
    @Expose
    private Integer discNumber;
    @SerializedName("duration_ms")
    @Expose
    private Integer durationMs;
    @SerializedName("explicit")
    @Expose
    private Boolean explicit;
    @SerializedName("external_ids")
    @Expose
    private ExternalIds externalIds;
    @SerializedName("external_urls")
    @Expose
    private ExternalUrls___ externalUrls;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("is_local")
    @Expose
    private Boolean isLocal;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("popularity")
    @Expose
    private Integer popularity;
    @SerializedName("preview_url")
    @Expose
    private String previewUrl;
    @SerializedName("track_number")
    @Expose
    private Integer trackNumber;
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
     * @param previewUrl
     * @param trackNumber
     * @param album
     * @param externalIds
     * @param externalUrls
     * @param type
     * @param uri
     * @param isLocal
     * @param explicit
     * @param discNumber
     * @param artists
     * @param availableMarkets
     * @param popularity
     * @param name
     * @param href
     * @param id
     * @param durationMs
     */
    public Item(Album album, List<Artist_> artists, List<String> availableMarkets, Integer discNumber, Integer durationMs, Boolean explicit, ExternalIds externalIds, ExternalUrls___ externalUrls, String href, String id, Boolean isLocal, String name, Integer popularity, String previewUrl, Integer trackNumber, String type, String uri) {
        super();
        this.album = album;
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalIds = externalIds;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.isLocal = isLocal;
        this.name = name;
        this.popularity = popularity;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Item withAlbum(Album album) {
        this.album = album;
        return this;
    }

    public List<Artist_> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist_> artists) {
        this.artists = artists;
    }

    public Item withArtists(List<Artist_> artists) {
        this.artists = artists;
        return this;
    }

    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public Item withAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
        return this;
    }

    public Integer getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
    }

    public Item withDiscNumber(Integer discNumber) {
        this.discNumber = discNumber;
        return this;
    }

    public Integer getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
    }

    public Item withDurationMs(Integer durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }

    public Item withExplicit(Boolean explicit) {
        this.explicit = explicit;
        return this;
    }

    public ExternalIds getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    public Item withExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
        return this;
    }

    public ExternalUrls___ getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(ExternalUrls___ externalUrls) {
        this.externalUrls = externalUrls;
    }

    public Item withExternalUrls(ExternalUrls___ externalUrls) {
        this.externalUrls = externalUrls;
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

    public Boolean getIsLocal() {
        return isLocal;
    }

    public void setIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
    }

    public Item withIsLocal(Boolean isLocal) {
        this.isLocal = isLocal;
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

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public Item withPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Item withTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
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
        return new ToStringBuilder(this).append("album", album).append("artists", artists).append("availableMarkets", availableMarkets).append("discNumber", discNumber).append("durationMs", durationMs).append("explicit", explicit).append("externalIds", externalIds).append("externalUrls", externalUrls).append("href", href).append("id", id).append("isLocal", isLocal).append("name", name).append("popularity", popularity).append("previewUrl", previewUrl).append("trackNumber", trackNumber).append("type", type).append("uri", uri).toString();
    }

}
