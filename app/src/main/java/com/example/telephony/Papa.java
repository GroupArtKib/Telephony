package com.example.telephony;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Papa extends AppCompatActivity {
    EditText sendMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papa);
        sendMsg=(EditText)findViewById(R.id.msg);
    }
    public void btnSend(View view){
        int permissionCheck= ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            sendMessage();
        }else{
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},0);
        }
    }
    public void sendMessage(){
        String msg;
        msg=sendMsg.getText().toString().trim();
        SmsManager smsManager=SmsManager.getDefault();
        smsManager.sendTextMessage("",null,msg,null,null);
        Toast.makeText(this, "Message Sent",Toast.LENGTH_SHORT).show();
    }
}
