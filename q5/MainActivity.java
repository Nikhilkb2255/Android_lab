package com.example.myapplication_2;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

TextView tname;
TextView tpswd;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tname = findViewById(R.id.textView1);
        tpswd = findViewById(R.id.textView2);

        tname.setText(getIntent().getStringExtra("keyname"));
        tpswd.setText(getIntent().getStringExtra("keypassword"));
    }
}
