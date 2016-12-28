package com.akay4gmail.mehmetcan.forwardertomovie.restApi.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movies {

    @SerializedName("Search")
    @Expose
    public ArrayList<Search> search = new ArrayList<Search>();
    @SerializedName("totalResults")
    @Expose
    public String totalResults;
    @SerializedName("Response")
    @Expose
    public String response;

    public List<Search> getSearch() {
        return search;
    }
    public void setSearch(ArrayList<Search> search) {
        this.search = search;
    }
    public String getTotalResults() {
        return totalResults;
    }
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }


}




