package com.example.my_small_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LevelOneActivity extends AppCompatActivity {
    EditText q1_input, q2_input, q3_input, q4_input;
    Button submitBtn;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_level_one);

                q1_input = findViewById(R.id.q1_input);
                q2_input = findViewById(R.id.q2_input);
                q3_input = findViewById(R.id.q3_input);
                q4_input = findViewById(R.id.q4_input);
                submitBtn = findViewById(R.id.submitBtn);

                submitBtn.setOnClickListener(v -> {
                    String ans1 = q1_input.getText().toString().trim();
                    String ans2 = q2_input.getText().toString().trim();
                    String ans3 = q3_input.getText().toString().trim();
                    String ans4 = q4_input.getText().toString().trim();

                    boolean allCorrect = true;

                    if (!ans1.equalsIgnoreCase("System.out.println(\"Hello World\");")) {
                        Toast.makeText(this, "Q1 is incorrect", Toast.LENGTH_SHORT).show();
                        allCorrect = false;
                    }

                    if (!ans2.equalsIgnoreCase("int x;")) {
                        Toast.makeText(this, "Q2 is incorrect", Toast.LENGTH_SHORT).show();
                        allCorrect = false;
                    }

                    if (!ans3.equalsIgnoreCase("a + b")) {
                        Toast.makeText(this, "Q3 is incorrect", Toast.LENGTH_SHORT).show();
                        allCorrect = false;
                    }

                    String expectedAns4 = "class Addition {\n" +
                            "    public static void main(String[] args) {\n" +
                            "        int a = 10, b = 20;\n" +
                            "        int sum = a + b;\n" +
                            "        System.out.println(\"Sum:\" + sum);\n" +
                            "    }\n" +
                            "}";
                    String actualAns4=ans4.replaceAll("\\s","");
                    String correctAnswer4=expectedAns4.replaceAll("\\s","");

                    if (!actualAns4.equalsIgnoreCase(correctAnswer4)) {
                        Toast.makeText(this, "Q4 is incorrect", Toast.LENGTH_SHORT).show();
                        allCorrect = false;
                    }

                    if (allCorrect) {
                        Toast.makeText(this, "All answers are correct! Well done!", Toast.LENGTH_LONG).show();
                    }
                    Intent intent=new Intent(LevelOneActivity.this, javaPractice.class);
                    startActivity(intent);
                    finish();

                });
            }

}