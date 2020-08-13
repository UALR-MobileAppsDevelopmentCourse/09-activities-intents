package com.ualr.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int CONTACT_REQUEST_CODE = 111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        String contactsData = "content://contacts/people/";
        Intent intent = new Intent(Intent.ACTION_PICK, Uri.parse(contactsData));
        // TODO 01. Start the contacts app to select a contact
        startActivityForResult(intent, CONTACT_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CONTACT_REQUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                String returnedData = data.getDataString();
                // TODO 02. Once a contact has been selected, we get the returned data and put it in the bundle
                // of other intent to get the information of the corresponding contact
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(returnedData));
                startActivity(intent);
            } else {
                Toast.makeText(this, "No contact was selected", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
