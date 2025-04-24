package com.example.my_small_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LevelTwoActivity extends AppCompatActivity {
    EditText q1input, q2input, q3input,q4input,q5input;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_level_two);
        q1input = findViewById(R.id.q1input);
        q2input = findViewById(R.id.q2input);
        q3input = findViewById(R.id.q3input);
        q4input=findViewById(R.id.q4input);
        q5input=findViewById(R.id.q5input);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1 = q1input.getText().toString().trim();
                String ans2 = q2input.getText().toString().trim();
                String ans3 = q3input.getText().toString().trim();
                String ans4=  q4input.getText().toString().trim();
                String answ5=  q5input.getText().toString().trim();

                boolean allCorrect = true;

                if (!ans1.equalsIgnoreCase("for(int i=0;i<5;i++)")) {
                    Toast.makeText(LevelTwoActivity.this, "Q1 is incorrect", Toast.LENGTH_SHORT).show();
                    allCorrect = false;
                }

                if (!ans2.equalsIgnoreCase("if(a>b)")) {
                    Toast.makeText(LevelTwoActivity.this, "Q3 is incorrect", Toast.LENGTH_SHORT).show();
                    allCorrect = false;
                }

                if (!ans3.equalsIgnoreCase("int[] arr = new int[5];")) {
                    Toast.makeText(LevelTwoActivity.this, "Q3 is incorrect", Toast.LENGTH_SHORT).show();
                    allCorrect = false;
                }
                String expectedAns1 = "if(number%2==0){System.out.println(\"Even\");}else{System.out.println(\"Odd\");}";
                String expectedAns2 = "for(inti=1;i<=5;i++){System.out.println(i);}";

                allCorrect = true;

                // Q4Check
                String actualAns1 = ans1.replaceAll("\\s", "");
                String correctAns1 = expectedAns1.replaceAll("\\s", "");
                if (!actualAns1.equalsIgnoreCase(correctAns1)) {
                    Toast.makeText(LevelTwoActivity.this, "Q1 is incorrect", Toast.LENGTH_SHORT).show();
                    allCorrect = false;
                }

                // Q5 Check
                String actualAns2 = ans2.replaceAll("\\s", "");
                String correctAns2 = expectedAns2.replaceAll("\\s", "");
                if (!actualAns2.equalsIgnoreCase(correctAns2)) {
                    Toast.makeText(LevelTwoActivity.this, "Q2 is incorrect", Toast.LENGTH_SHORT).show();
                    allCorrect = false;
                }

                if (ans1.isEmpty() || ans2.isEmpty()) {
                    Toast.makeText(LevelTwoActivity.this, "Please fill all answers", Toast.LENGTH_SHORT).show();
                    return;
                }



                if (allCorrect) {
                    Toast.makeText(LevelTwoActivity.this, "All answers are  correct ! well done", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LevelTwoActivity.this, javaPractice.class);
                    startActivity(intent);
                    finish();
                }

        }

    });
}
}

