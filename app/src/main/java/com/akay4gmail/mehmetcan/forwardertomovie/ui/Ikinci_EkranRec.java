package com.akay4gmail.mehmetcan.forwardertomovie.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.akay4gmail.mehmetcan.forwardertomovie.Constant;
import com.akay4gmail.mehmetcan.forwardertomovie.Manager.MovieManager;
import com.akay4gmail.mehmetcan.forwardertomovie.R;
import com.akay4gmail.mehmetcan.forwardertomovie.restApi.RestApiClient;
import com.akay4gmail.mehmetcan.forwardertomovie.restApi.models.Movies;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by mehme on 6.08.2016.
 */
public class Ikinci_EkranRec extends Activity implements ContactsAdapter.OnItemClickListener {

    private RecyclerView recyclerView;
    private ContactsAdapter adapter;
    private Context mcontext;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);

        initView();

    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.rvContacts);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        adapter.SetOnItemClickListener(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        loadJson();

    }

    private void loadJson() {
        RestApiClient restApiClient = new RestApiClient(Constant.SERVICE_URL);
        restApiClient.getmRestApi();

        Bundle Intentdata = getIntent().getExtras();
        CharSequence FilmName = Intentdata.getCharSequence("anahtar");
        Call<Movies> moviesCall = MovieManager.getInstance(getApplicationContext()).getMoviesStatus(FilmName.toString());
        moviesCall.enqueue(new Callback<Movies>() {
            @Override
            public void onResponse(Call<Movies> call, Response<Movies> response) {
                Movies movies = response.body();
                adapter = new ContactsAdapter(movies.search, getApplicationContext());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Movies> call, Throwable t) {

            }
        });

    }

    @Override
    public void onItemClick(View view, int position) {
                 CharSequence charSequence = "";
                Intent intent = new Intent(this, ActivityMain.class);
                intent.putExtra("Key", charSequence);
                startActivity(intent);
    }
}



