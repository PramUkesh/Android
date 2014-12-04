package edu.uml.cs.isense.motion.dialogs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;

import edu.uml.cs.isense.motion.R;

public class Presets extends ActionBarActivity {
    public static final String PROJECT = "project";
    public static final String LENGTH = "length";
    public static final String RATE = "rate";
    RadioButton accel;
    RadioButton gps;
    public static final String FIELD = "field";

    public static final String ACCEL_PROJECT= "570";
    public static final int ACCEL_PROJECT_RATE= 50;
    public static final int ACCEL_PROJECT_LENGTH= 10;
    public static final int ACCEL_CAROUSEL_POSITION = 0;

    public static final String GPS_PROJECT= "13";
    public static final int GPS_PROJECT_RATE = 1000;
    public static final int GPS_PROJECT_LENGTH = -1; //-1 is push to stop
    public static final int GPS_CAROUSEL_POSITION = 1;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presets);

        accel = (RadioButton) findViewById(R.id.accel);
        gps = (RadioButton) findViewById(R.id.gps);

        Button ok = (Button) findViewById(R.id.okButton);
        Button cancel = (Button) findViewById(R.id.cancelButton);

        ok.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (accel.isChecked()) {
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra(RATE, ACCEL_PROJECT_RATE);
                    resultIntent.putExtra(LENGTH, ACCEL_PROJECT_LENGTH);
                    resultIntent.putExtra(PROJECT, ACCEL_PROJECT);
                    resultIntent.putExtra(FIELD, ACCEL_CAROUSEL_POSITION);
                    setResult(Activity.RESULT_OK, resultIntent);
                    finish();
                } else if (gps.isChecked()) {
                    Intent resultIntent = new Intent();
                    resultIntent.putExtra(RATE, GPS_PROJECT_RATE);
                    resultIntent.putExtra(LENGTH, GPS_PROJECT_LENGTH);
                    resultIntent.putExtra(PROJECT, GPS_PROJECT);
                    resultIntent.putExtra(FIELD, GPS_CAROUSEL_POSITION);
                    setResult(Activity.RESULT_OK, resultIntent);
                    finish();
                }
            }
        });

            cancel.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent resultIntent = new Intent();
                    setResult(Activity.RESULT_CANCELED, resultIntent);
                    finish();
                }

            });
        }
    }