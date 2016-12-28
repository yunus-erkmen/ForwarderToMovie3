package com.akay4gmail.mehmetcan.forwardertomovie.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.akay4gmail.mehmetcan.forwardertomovie.R;
import com.akay4gmail.mehmetcan.forwardertomovie.base.BaseActivity;

public class ActivityMain extends BaseActivity {

    //WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_screen);


        TextView textView1 = (TextView) findViewById(R.id.title1);
        TextView textView2 = (TextView) findViewById(R.id.type1);
        TextView textView3 = (TextView) findViewById(R.id.year1);
        TextView textView4 = (TextView) findViewById(R.id.description1);
        final Button button1 = (Button) findViewById(R.id.button1);


     //   WebView webView = (WebView) findViewById(R.id.webView);
        // webView.getSettings().setJavaScriptEnabled(true);

/*     Bundle Intentdata = getIntent().getExtras();
        CharSequence FilmName = Intentdata.getCharSequence("anahtar");
        Call<Search> call = MovieManager.getInstance(this).getMoviesStatus(button1.toString());
        call.enqueue(new Callback<Search>() {
            @Override
            public void onResponse(Call<Search> call, Response<Search> response) {
                final Search deneme = response.body();

                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    if(view.getId()==R.id.button1)
                    {

                     //   webView.loadUrl("http://www.imdb.com/title/" + deneme.imdbID);
                    }
                    }
                });

            }

            @Override
            public void onFailure(Call<Search> call, Throwable t) {

            }


        });

*/
    }
}
