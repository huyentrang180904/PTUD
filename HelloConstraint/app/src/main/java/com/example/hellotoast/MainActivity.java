package com.example.hellotoast;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button zero;
    private Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zero = findViewById(R.id.button_zero);
        countButton = findViewById(R.id.button_count);
        zero.setBackgroundColor(Color.DKGRAY);

    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        mCount++;
        mShowCount.setText(String.valueOf(mCount));

        if(mCount % 2 == 0){
            zero.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
            countButton.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }else{
            zero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
            countButton.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        }
    }
    public void resetCount(View view) {
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));
        // dat lai mau xam cho nut zero khi reset
        zero.setBackgroundColor(Color.DKGRAY);
        //dat lai mau mac dinh cho nut count
        countButton.setBackgroundColor(getResources().getColor(com.google.android.material.R.color.design_default_color_primary));
    }
}