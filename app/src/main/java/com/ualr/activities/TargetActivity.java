package com.ualr.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * Created by irconde on 2019-10-02.
 */
public class TargetActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        Intent intent = getIntent();
        // TODO 03. Get extras from the bundle
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        int age = intent.getIntExtra(MainActivity.EXTRA_AGE, -1);

        TextView resultTV = findViewById(R.id.result);
        resultTV.setText(String.format("%s is %d years old", name, age));
    }
}
