package com.akay4gmail.mehmetcan.forwardertomovie.restApi;


import com.akay4gmail.mehmetcan.forwardertomovie.restApi.models.Movies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/*
* Created by mehme on 2.08.2016.
*/
public interface RestApi {

    @GET("/")
    Call<Movies> getMovie(@Query("s") String movieName); // movie name e karşılık geliyor.


}
