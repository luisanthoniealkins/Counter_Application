package com.laacompany.counterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewPassenger;
    private TextView mTextViewStaff;

    private Button mButtonIncPassenger;
    private Button mButtonDecPassenger;
    private Button mButtonIncStaff;
    private Button mButtonDecStaff;
    private Button mButtonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewPassenger = findViewById(R.id.id_tv_passenger);
        mTextViewStaff = findViewById(R.id.id_tv_staff);

        mButtonIncPassenger = findViewById(R.id.id_btn_passenger_inc);
        mButtonIncPassenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.valueOf(mTextViewPassenger.getText().toString());
                count += 1;
                mTextViewPassenger.setText(String.valueOf(count));
            }
        });
        mButtonDecPassenger = findViewById(R.id.id_btn_passenger_dec);
        mButtonDecPassenger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.valueOf(mTextViewPassenger.getText().toString());
                count -= 1;
                if (count < 0) {
                    mTextViewPassenger.setText("0");
                } else {
                    mTextViewPassenger.setText(String.valueOf(count));
                }
            }
        });

        mButtonIncStaff = findViewById(R.id.id_btn_staff_inc);
        mButtonIncStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.valueOf(mTextViewStaff.getText().toString());
                count+=1;
                mTextViewStaff.setText(String.valueOf(count));
            }
        });

        mButtonDecStaff = findViewById(R.id.id_btn_staff_dec);
        mButtonDecStaff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.valueOf(mTextViewStaff.getText().toString());
                count -= 1;
                if (count < 0) {
                    mTextViewStaff.setText("0");
                } else {
                    mTextViewStaff.setText(String.valueOf(count));
                }
            }
        });

        mButtonReset = findViewById(R.id.id_btn_reset);
        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTextViewPassenger.setText("0");
                mTextViewStaff.setText("0");
            }
        });
    }
}
