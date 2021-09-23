package com.example.quizrysy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Intent intent = getIntent();

        String text = intent.getStringExtra("message");
        TextView textView = (TextView) findViewById(R.id.question);
        textView.setText(text);
    }
}