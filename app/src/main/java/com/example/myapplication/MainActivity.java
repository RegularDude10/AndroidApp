package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("clicked");
    }

    public void ChangeColour(View view) {
        TextView text = (TextView) findViewById(R.id.textView);
        text.setTextColor(Color.RED);
    }
}