package com.ualr.activities;

import android.app.Activity;
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
       // TODO 03. Get extras from the bundle
        TextView resultTV = findViewById(R.id.result);
        // TODO 04. Uncomment the following line
        //resultTV.setText(String.format("%s is %d years old", name, age));
    }
}
