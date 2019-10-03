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
        // TODO 08. We get the object from the intent
        Person p = getIntent().getParcelableExtra(MainActivity.EXTRA_PERSON);

        TextView resultTV = findViewById(R.id.result);
        resultTV.setText(String.format("%s is %d years old", p.getName(), p.getAge()));
    }
}
