package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        String emailSubject = "Department Meeting";
        String emailText = "We will discuss new curriculum "
                + "on Tue. at 9:00am @ room BU340";  String emailReceiverList[] = {"vmchau@ualr.edu"};
        Intent intent = new Intent(Intent.ACTION_SEND);  intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, emailReceiverList);
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        intent.putExtra(Intent.EXTRA_TEXT, emailText);
        startActivity(Intent.createChooser(intent, "To complete action choose:"));
    }

}
