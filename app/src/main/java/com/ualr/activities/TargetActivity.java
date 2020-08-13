package com.ualr.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * Created by irconde on 2019-10-02.
 */
public class TargetActivity extends Activity {

    private final static String QR_CODE = "59012341234567";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
    }

    public void onButtonClick(View view) {
        // TODO 02. We put in the intent's bundle the data we want to return to the
        //  first activity
        // TODO 03. We invoke setResult method to send data back to the first activity
        // TODO 04. We finish the activity
    }
}
