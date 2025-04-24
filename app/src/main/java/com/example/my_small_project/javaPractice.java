package com.example.my_small_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class javaPractice extends AppCompatActivity {
Button btnlevel1,btnlevel2,btnlevel3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_practice);

        btnlevel1 = findViewById(R.id.btnlevel1);
        btnlevel2 = findViewById(R.id.btnlevel2);
        btnlevel3 = findViewById(R.id.btnlevel3);
        btnlevel1.setOnClickListener(v -> {
            Toast.makeText(this, "choosen level1", Toast.LENGTH_SHORT).show();

            Intent resultIntent = new Intent(javaPractice.this, LevelOneActivity.class);
            startActivity(resultIntent);

   });
        btnlevel2.setOnClickListener(v -> {
            Toast.makeText(this, "choosen level2", Toast.LENGTH_SHORT).show();

            Intent resultIntent = new Intent(javaPractice.this, LevelTwoActivity.class);
            startActivity(resultIntent);

        });
        btnlevel3.setOnClickListener(v -> {
            Toast.makeText(this, "choosen level3", Toast.LENGTH_SHORT).show();

            Intent resultIntent = new Intent(javaPractice.this, LevelThreeActivity.class);
            startActivity(resultIntent);

        });
}
}