package com.example.sunil.alarmclock;
/**
 * Created by kapoo on 11-01-2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import za.co.neilson.alarm.R;

//import com.example.sunil.alarmclock.R;

public class SplashScreen extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);
            Thread myThread = new Thread(){
                @Override
                public void run() {
                    try {
                        sleep(3000);
                        Intent intent = new Intent(getApplicationContext(),AlarmActivity.class);
                        startActivity(intent);
                        finish();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            myThread.start();
        }
    }
