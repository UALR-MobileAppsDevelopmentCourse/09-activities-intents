package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ualr.activities.databinding.ActivityMainBinding;

// TODO 01. Create the target activity

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }

    public void onButtonClick(View view) {
        // TODO 04. Create an Intent instance
        Intent intent = new Intent(this, TargetActivity.class);
        // TODO 05. Invoke the startActivity method
        startActivity(intent);
    }
}
