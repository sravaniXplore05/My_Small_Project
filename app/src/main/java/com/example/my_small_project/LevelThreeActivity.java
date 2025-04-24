package com.example.my_small_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LevelThreeActivity extends AppCompatActivity {

    EditText[] answerInputs = new EditText[5];
    TextView[] correctAnswers = new TextView[5];

    String[] javaAnswers = {
            "int num = 4;\nif(num % 2 == 0){\n    System.out.println(\"Even\");\n} else {\n    System.out.println(\"Odd\");\n}",

            "int sum = 0;\nfor(int i = 1; i <= 5; i++){\n    sum += i;\n}\nSystem.out.println(sum);",

            "String str = \"racecar\";\nString rev = new StringBuilder(str).reverse().toString();\nif(str.equals(rev)){\n    System.out.println(\"Palindrome\");\n}",

            "int fact = 1;\nfor(int i = 1; i <= 5; i++){\n    fact *= i;\n}\nSystem.out.println(fact);",

            "String str = \"Apple\";\nint count = 0;\nfor(char ch : str.toLowerCase().toCharArray()){\n    if(\"aeiou\".indexOf(ch) != -1){\n        count++;\n    }\n}\nSystem.out.println(count);"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_three);

        // Manually bind EditText and TextView
        answerInputs[0] = findViewById(R.id.ans1);
        answerInputs[1] = findViewById(R.id.ans2);
        answerInputs[2] = findViewById(R.id.ans3);
        answerInputs[3] = findViewById(R.id.ans4);
        answerInputs[4] = findViewById(R.id.ans5);

        correctAnswers[0] = findViewById(R.id.correctAns1);
        correctAnswers[1] = findViewById(R.id.correctAns2);
        correctAnswers[2] = findViewById(R.id.correctAns3);
        correctAnswers[3] = findViewById(R.id.correctAns4);
        correctAnswers[4] = findViewById(R.id.correctAns5);

        Button submitBtn = findViewById(R.id.submitLevelThree);

        submitBtn.setOnClickListener(v -> {
            for (int i = 0; i < 5; i++) {
                correctAnswers[i].setText("Correct Code:\n" + javaAnswers[i]);
            }
        });
    }
}