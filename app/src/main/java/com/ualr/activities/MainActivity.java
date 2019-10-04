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
        String startPoint = "42.322591, -7.865459";
        String endPoint= "42.344961, -7.856006";
        String routeUri = String.format("http://maps.google.com/maps?saddr=%s&daddr=%s", startPoint, endPoint);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(routeUri));
        startActivity(intent);
    }

}
