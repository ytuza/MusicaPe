
package com.example.musicape.song;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ExternalUrls_ {

    @SerializedName("spotify")
    @Expose
    private String spotify;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalUrls_() {
    }

    /**
     * 
     * @param spotify
     */
    public ExternalUrls_(String spotify) {
        super();
        this.spotify = spotify;
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    public ExternalUrls_ withSpotify(String spotify) {
        this.spotify = spotify;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spotify", spotify).toString();
    }

}
