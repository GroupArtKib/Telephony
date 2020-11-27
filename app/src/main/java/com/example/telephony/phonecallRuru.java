package com.example.telephony;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class phonecallRuru extends AppCompatActivity {
    Button btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonecall_ruru);
        btnCall=(Button)findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:09499423099"));
                if (ActivityCompat.checkSelfPermission(phonecallRuru.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                    ;
                {
                    startActivity(callIntent);
                }
                return;
            }
        });
    }
}

