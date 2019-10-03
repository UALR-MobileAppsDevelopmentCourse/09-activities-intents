package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_PERSON = "PersonData";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        Intent intent = new Intent(this, TargetActivity.class);
        // TODO 06. We create a new instance of the defined class
        Person p = new Person("Ivan Rodriguez-Conde", 34);
        // TODO 07. We add the object as extras to the intent
        intent.putExtra(EXTRA_PERSON, p);
        startActivity(intent);
    }
}
