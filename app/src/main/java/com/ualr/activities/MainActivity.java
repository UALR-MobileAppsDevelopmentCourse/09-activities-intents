package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        String smsUri = "smsto:501-432-4129";
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(smsUri));
        intent.putExtra("sms_body", "Have you done last week's homework?");
        startActivity(intent);
    }

}
