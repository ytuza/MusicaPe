
package com.example.musicape.song;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SearchArtist {

    @SerializedName("tracks")
    @Expose
    private Tracks tracks;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchArtist() {
    }

    /**
     * 
     * @param tracks
     */
    public SearchArtist(Tracks tracks) {
        super();
        this.tracks = tracks;
    }

    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public SearchArtist withTracks(Tracks tracks) {
        this.tracks = tracks;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tracks", tracks).toString();
    }

}
