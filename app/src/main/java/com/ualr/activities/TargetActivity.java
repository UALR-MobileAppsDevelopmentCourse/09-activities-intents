package com.ualr.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * Created by irconde on 2019-10-02.
 */
public class TargetActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        // TODO 02. Get extras from the bundle
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);
        int age = intent.getIntExtra(MainActivity.EXTRA_AGE, -1);
    }
}
