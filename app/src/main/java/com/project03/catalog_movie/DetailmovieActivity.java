package com.project03.catalog_movie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailmovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailmovie);

        getSupportActionBar().setTitle("Detail movie");
    }
}
