package com.akay4gmail.mehmetcan.forwardertomovie.Manager;

import android.content.Context;

import com.akay4gmail.mehmetcan.forwardertomovie.base.BaseManager;
import com.akay4gmail.mehmetcan.forwardertomovie.restApi.models.Movies;

import retrofit2.Call;

/**
 * Created by mehme on 2.08.2016.
 */
public class MovieManager extends BaseManager{
    private static Context mContext;

    private static MovieManager ourInstance= new MovieManager();

    private MovieManager(){}

    public static synchronized MovieManager getInstance(Context context)
    {
        mContext=context;
        return ourInstance;
    }
    //Call Retrofitten gelen bir fonk burda bilgi çekme işlemi oluyor sonra main de kullanılıyor.
    public Call<Movies> getMoviesStatus(String name){
        Call<Movies> call=getRestApiClient(mContext).getMovie(name);
        return call;
    }
}
