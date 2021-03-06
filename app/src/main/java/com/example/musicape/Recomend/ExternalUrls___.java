
package com.example.musicape.Recomend;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ExternalUrls___ {

    @SerializedName("spotify")
    @Expose
    private String spotify;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalUrls___() {
    }

    /**
     * 
     * @param spotify
     */
    public ExternalUrls___(String spotify) {
        super();
        this.spotify = spotify;
    }

    public String getSpotify() {
        return spotify;
    }

    public void setSpotify(String spotify) {
        this.spotify = spotify;
    }

    public ExternalUrls___ withSpotify(String spotify) {
        this.spotify = spotify;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spotify", spotify).toString();
    }

}
