
package com.example.musicape.Recomend;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Recom {

    @SerializedName("tracks")
    @Expose
    private List<Track> tracks = null;
    @SerializedName("seeds")
    @Expose
    private List<Seed> seeds = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Recom() {
    }

    /**
     * 
     * @param seeds
     * @param tracks
     */
    public Recom(List<Track> tracks, List<Seed> seeds) {
        super();
        this.tracks = tracks;
        this.seeds = seeds;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public Recom withTracks(List<Track> tracks) {
        this.tracks = tracks;
        return this;
    }

    public List<Seed> getSeeds() {
        return seeds;
    }

    public void setSeeds(List<Seed> seeds) {
        this.seeds = seeds;
    }

    public Recom withSeeds(List<Seed> seeds) {
        this.seeds = seeds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tracks", tracks).append("seeds", seeds).toString();
    }

}
