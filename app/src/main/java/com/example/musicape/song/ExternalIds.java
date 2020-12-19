
package com.example.musicape.song;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ExternalIds {

    @SerializedName("isrc")
    @Expose
    private String isrc;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExternalIds() {
    }

    /**
     * 
     * @param isrc
     */
    public ExternalIds(String isrc) {
        super();
        this.isrc = isrc;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public ExternalIds withIsrc(String isrc) {
        this.isrc = isrc;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isrc", isrc).toString();
    }

}
