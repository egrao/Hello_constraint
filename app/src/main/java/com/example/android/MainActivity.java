package com.example.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mToastButton;
    private Button mCountButton;
    private TextView mCountTextView;
    private Integer mCurrentCountNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCountTextView = (TextView) findViewById(R.id.show_count);

        mToastButton = (Button) findViewById(R.id.button_toast);
        mToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkCount();
            }
        });

        mCountButton = (Button) findViewById(R.id.button_count);
        mCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentCountNumber = (mCurrentCountNumber + 1);
                updateCount(mCurrentCountNumber);
            }
        });


    }
    private void updateCount(Integer mCurrentCountNumber) {
        mCountTextView.setText(mCurrentCountNumber.toString());
    }

    private void checkCount() {
        Toast.makeText(this,mCountTextView.getText(), Toast.LENGTH_SHORT).show();
    }
}