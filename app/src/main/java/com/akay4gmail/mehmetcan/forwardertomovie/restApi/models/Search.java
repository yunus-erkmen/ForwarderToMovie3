package com.akay4gmail.mehmetcan.forwardertomovie.restApi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehme on 6.08.2016.
 */
public class Search {

    public Search(String title,String year,String imdbID ,String type, String poster)
    {
        this.setImdbID(imdbID);
        this.setYear(year);
        this.setType(type);
        this.setPoster(poster);
        this.setTitle(title);
    }

    @SerializedName("Title")
    @Expose
    public String title;
    @SerializedName("Year")
    @Expose
    public String year;
    @SerializedName("Poster")
    @Expose
    public String poster;
    @SerializedName("imdbID")
    @Expose
    public String imdbID;
    @SerializedName("Type")
    @Expose
    public String type;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getImdbID() {
        return imdbID;
    }
    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPoster() {
        return poster;
    }
    public void setPoster(String poster) {
        this.poster = poster;
    }



}