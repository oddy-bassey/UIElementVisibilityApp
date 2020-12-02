package com.example.uielementvisibilityapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    boolean isTextVisible = true;

    public void showTextView(View view){
        if(isTextVisible) {
            Toast.makeText(this, "Text is visible already", Toast.LENGTH_SHORT).show();
        }else{
            isTextVisible = true;
            textView.setVisibility(View.VISIBLE);
        }
    }

    public void hideTextView(View view){
        if(isTextVisible) {
            isTextVisible = false;
            textView.setVisibility(View.INVISIBLE);
        }else{
            Toast.makeText(this, "Text is not visible", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }
}
