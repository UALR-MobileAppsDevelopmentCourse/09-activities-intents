package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ualr.activities.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_PERSON = "PersonData";
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(this, TargetActivity.class);
        // TODO 06. We create a new instance of the defined class
        // TODO 07. We add the object as extras to the intent
        startActivity(intent);
    }
}
