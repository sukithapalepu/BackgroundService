package com.example.backgroundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = findViewById(R.id.text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().equals("Started")) {
                    textView.setText("Stoped");
                    stopService(new Intent(MainActivity.this,service.class));
                } else {
                    textView.setText("Started");
                    startService(new Intent(MainActivity.this, service.class));
                }
            }
        });
    }
}
