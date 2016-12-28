package com.akay4gmail.mehmetcan.forwardertomovie.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.akay4gmail.mehmetcan.forwardertomovie.R;

/**
 * Created by mehme on 3.08.2016.
 */
public class Ilk_Ekran extends Activity {
    EditText et;
    Button button1;
    View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);
        et = (EditText) findViewById(R.id.editText);

    }


    public void Tiklandi(View v) {
        if (v.getId() == R.id.button1) {
            CharSequence charsequence = et.getText();

            //2.ekrana geçme işlemi
            //getapp bulunduğu class context i
            Intent intent = new Intent(this, Ikinci_EkranRec.class);
            intent.putExtra("anahtar", charsequence);//anahtar kelimesiyle variable text yazıyı alıyoruz.
            startActivity(intent);
        }


    }
}
