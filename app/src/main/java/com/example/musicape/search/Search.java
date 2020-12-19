
package com.example.musicape.search;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Search {

    @SerializedName("artists")
    @Expose
    private Artists artists;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Search() {
    }

    /**
     * 
     * @param artists
     */
    public Search(Artists artists) {
        super();
        this.artists = artists;
    }

    public Artists getArtists() {
        return artists;
    }

    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    public Search withArtists(Artists artists) {
        this.artists = artists;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("artists", artists).toString();
    }

}
