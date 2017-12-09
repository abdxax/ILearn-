package com.example.abdulrahman.ilearn;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
Intent intent=new Intent(getApplicationContext(),Login.class);
startActivity(intent);
finish();
            }
        };
        Handler handler=new Handler();
        handler.postDelayed(runnable,5000);

    }
}
