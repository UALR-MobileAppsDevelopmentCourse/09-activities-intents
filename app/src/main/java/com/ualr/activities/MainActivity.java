package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        // TODO 03. Create an Intent instance
        Intent intent = new Intent(this, TargetActivity.class);
        // TODO 04. Invoke the startActivity method
        startActivity(intent);
    }
}
