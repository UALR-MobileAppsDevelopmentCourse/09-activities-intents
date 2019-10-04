package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        String geoCode = "geo:42.336408, -7.863180?z=16";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoCode));
        startActivity(intent);
    }

}
