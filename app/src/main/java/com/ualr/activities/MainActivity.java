package com.ualr.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final int QR_CODE_REQUEST = 1;
    static final String QR_CODE_KEY = "QRCode";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        // TODO 01. We must launch new activity using startActivityForResult.
        //  Important: we must specify a request code
    }
    
    // TODO 05. Get data sent from the second activity: override onActivityResult method

}
