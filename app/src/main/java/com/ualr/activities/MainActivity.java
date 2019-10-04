package com.ualr.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        String contactsData = ContactsContract.Contacts.CONTENT_URI + "/" + "3";
        Intent intent = new Intent(Intent.ACTION_EDIT, Uri.parse(contactsData));
        startActivity(intent);
    }

}
