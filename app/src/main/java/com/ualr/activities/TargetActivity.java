package com.ualr.activities;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * Created by irconde on 2019-10-02.
 */
public class TargetActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
    }
}
