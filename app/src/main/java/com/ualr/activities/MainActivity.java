package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // TODO 01: Define key values for the intent's extras
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_AGE = "age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(this, TargetActivity.class);
        // TODO 02: put extras in the bundle
        intent.putExtra(EXTRA_NAME, "Ivan");
        intent.putExtra(EXTRA_AGE, 34);
        startActivity(intent);
    }
}
