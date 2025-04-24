package com.example.my_small_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText RedNo, NmaeEdt;
    ImageView learnimage;
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        NmaeEdt = findViewById(R.id.NameTxt2);
        RedNo = findViewById(R.id.RedNoTxt1);
        learnimage = findViewById(R.id.imageView);
        LoginButton = findViewById(R.id.LoginBtn);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initRegister();
            }

        });
    }

    private void initRegister() {
        String name = NmaeEdt.getText().toString().trim();
        String regNo = RedNo.getText().toString().trim();

        if (name.isEmpty() && regNo.isEmpty()) {
            Toast.makeText(this, "Please enter Name and Reg No", Toast.LENGTH_SHORT).show();
            return;
        } else if (name.isEmpty()) {
            Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
            return;
        } else if (regNo.isEmpty()) {
            Toast.makeText(this, "Please enter your registration number", Toast.LENGTH_SHORT).show();
            return;
        }

        // If both are entered, go to the next activity
        Intent intent = new Intent(MainActivity.this, List_Of_Tasks.class);
        startActivity(intent);
    }
}