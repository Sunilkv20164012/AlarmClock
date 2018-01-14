/**
 * Created by kapoo on 08-01-2018.
 */
package com.example.sunil.alarmclock;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import  android.support.v4.app.FragmentActivity;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

import za.co.neilson.alarm.R;


//import com.example.sunil.alarmclock.R;

public class NotificationActivity extends AppCompatActivity {



        public static final String TAG = NotificationActivity.class.getSimpleName();
        private static final String KEY_FACT = "KEY_FACT";
        private static final String KEY_COLOR = "KEY_COLOR";
        private FactBook mFactBook = new FactBook();
        private ColorWheel mColorWheel = new ColorWheel();

        private TextView mFactTextView;
        private Button mShowFactButton;
        private RelativeLayout mRelativeLayout;

        private TextView mFactLabel;

        private String mFact = mFactBook.mFacts[0];
        private int mColor = Color.parseColor(mColorWheel.mColors[8]);



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fun_science_facts);

            mFactLabel = (TextView) findViewById(R.id.factTextView);
            mFactTextView = (TextView) findViewById(R.id.factTextView);
            mShowFactButton = (Button) findViewById(R.id.showFactButton);
            mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mFact = mFactBook.getFact();
                    mColor = mColorWheel.getColor();

                    mFactTextView.setText(mFact);
                    mRelativeLayout.setBackgroundColor(mColor);
                    mShowFactButton.setTextColor(mColor);


                    mFact = mFactBook.getFact();
                    mFactLabel.setText(mFact);

                    mColor = mColorWheel.getColor();
                    mRelativeLayout.setBackgroundColor(mColor);

                }
            };
            mShowFactButton.setOnClickListener(listener);

            Log.d(TAG, "Logging from the onCreate() method");
        }

        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);

            outState.putString(KEY_FACT, mFact);
            outState.putInt(KEY_COLOR, mColor);
        }

        @Override
        protected void onRestoreInstanceState(Bundle savedInstanceState) {
            super.onRestoreInstanceState(savedInstanceState);

            mFact = savedInstanceState.getString(KEY_FACT);
            mFactLabel.setText(mFact);

            mColor = savedInstanceState.getInt(KEY_COLOR);
            mRelativeLayout.setBackgroundColor(mColor);
            mShowFactButton.setTextColor(mColor);
        }


}
