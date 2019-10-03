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

    // TODO 01. We must launch new activity using startActivityForResult
    public void onButtonClick(View view) {
        Intent intent = new Intent(this, TargetActivity.class);
        startActivityForResult(intent, QR_CODE_REQUEST);
    }

    // TODO 05. Get data sent from the second activity
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == QR_CODE_REQUEST && resultCode == RESULT_OK) {
            String qrCode = data.getStringExtra(QR_CODE_KEY);
            TextView codeText = findViewById(R.id.codeText);
            codeText.setText(qrCode);
        }
    }
}
