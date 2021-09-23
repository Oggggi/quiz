package com.example.quizrysy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView questions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        questions=findViewById(R.id.question);
    }

    public void check(View view) {
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
        int chosen = radiogroup.getCheckedRadioButtonId();
        if (chosen == R.id.radioButton3){
            Toast.makeText(this, R.string.win, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, R.string.loss, Toast.LENGTH_SHORT).show();
        }
    }

    public void help(View view) {
        String text = questions.getText().toString();
        Intent intent = new Intent(this, HelpActivity.class);
        intent.putExtra("message", text);
        startActivity(intent);
    }
}