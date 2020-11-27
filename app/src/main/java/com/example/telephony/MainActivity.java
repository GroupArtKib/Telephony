package com.example.telephony;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    Button messagePapa,messageMama,callPapa,callMama,messageRuru,callRuru,messageJun,callJun,messageTom,callTom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#205072"));
        actionBar.setBackgroundDrawable(colorDrawable);
        messageMama=(Button)findViewById(R.id.messageButtonMama);
        messagePapa=(Button)findViewById(R.id.messageButtonPapa);
        messageRuru=(Button)findViewById(R.id.messageButtonRuru);
        messageJun=(Button)findViewById(R.id.messageButtonJun);
        messageTom=(Button)findViewById(R.id.messageButtonTom);
        callMama=(Button)findViewById(R.id.callButtonMama);
        callPapa=(Button)findViewById(R.id.callButtonPapa);
        callRuru=(Button)findViewById(R.id.callButtonRuru);
        callJun=(Button)findViewById(R.id.callButtonJun);
        callTom=(Button)findViewById(R.id.callButtonTom);
        //sms
        messagePapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,Papa.class);
                startActivity(intent1);
            }
        });
        messageMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,Mama.class);
                startActivity(intent2);
            }
        });
        messageRuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,Ruru.class);
                startActivity(intent3);
            }
        });
        messageJun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,Jun.class);
                startActivity(intent4);
            }
        });
        messageTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,Tom.class);
                startActivity(intent5);
            }
        });
        //phonecall
        callMama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(MainActivity.this,phonecallM.class);
                startActivity(intent1);
            }
        });
        callPapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(MainActivity.this,phonecallP.class);
                startActivity(intent2);
            }
        });
        callRuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(MainActivity.this,phonecallRuru.class);
                startActivity(intent3);
            }
        });
        callTom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(MainActivity.this,phonecallTom.class);
                startActivity(intent4);
            }
        });
        callJun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5=new Intent(MainActivity.this,phonecallJun.class);
                startActivity(intent5);
            }
        });




    }
}
