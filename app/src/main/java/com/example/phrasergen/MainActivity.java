package com.example.phrasergen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ButtonClick(View view) {
        String text = Phraser.PhraserGen();
        TextView textView = findViewById(R.id.textView);
        textView.setText(Phraser.PhraserGen());
    }
}