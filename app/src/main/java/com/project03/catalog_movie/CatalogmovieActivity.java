package com.project03.catalog_movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CatalogmovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogmovie);


        ImageView showRide = (ImageView) findViewById(R.id.img_1);

        showRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(CatalogmovieActivity.this,DetailmovieActivity.class);
//                Intent intent1 = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(intent);
            }
        });


        ImageView showRide2 = (ImageView) findViewById(R.id.img_2);

        showRide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatalogmovieActivity.this,Detailmovie2Activity.class);
//                Intent intent1 = new Intent(Settings.ACTION_LOCALE_SETTINGS);

                startActivity(intent);
            }
        });

        ImageView showRide3 = (ImageView) findViewById(R.id.img_3);

        showRide3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatalogmovieActivity.this,Detailmovie3Activity.class);
//                Intent intent1 = new Intent(Settings.ACTION_LOCALE_SETTINGS);

                startActivity(intent);
            }
        });

        ImageView showRide4 = (ImageView) findViewById(R.id.img_4);

        showRide4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CatalogmovieActivity.this,Detailmovie4Activity.class);
//                Intent intent1 = new Intent(Settings.ACTION_LOCALE_SETTINGS);

                startActivity(intent);
            }
        });
    }
}
