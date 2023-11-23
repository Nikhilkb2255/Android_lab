package com.example.myapplication_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.myapplication_2.databinding.ActivityMain3Binding;

import android.widget.Button;
import android.widget.EditText;

public class MainActivity_2 extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain3Binding binding;

    Button add;

    EditText usrname;

    EditText paswd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add = findViewById(R.id.addbutt);
        usrname = findViewById(R.id.uname);
        paswd = findViewById(R.id.pwd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity_2.class);
                i.putExtra("keyname", usrname.getText().toString());
                i.putExtra("keypassword", paswd.getText().toString());
                startActivity(i);
            }
        });
    }
}