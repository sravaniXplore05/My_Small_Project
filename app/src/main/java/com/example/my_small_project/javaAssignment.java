// JavaAssignment.java (Final Screen of the Project)

package com.example.my_small_project;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class javaAssignment extends AppCompatActivity {

    EditText answerInput;
    Button submitBtn, downloadBtn, restartBtn;
    TextView quoteView;
    ImageView certificateImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_assignment);

        answerInput = findViewById(R.id.answerInput);
        submitBtn = findViewById(R.id.submitBtn);
        downloadBtn = findViewById(R.id.downloadBtn);
        restartBtn = findViewById(R.id.restartBtn);
        quoteView = findViewById(R.id.quoteView);
        certificateImage = findViewById(R.id.certificateImage);
        downloadBtn.setEnabled(false);

        quoteView.setText("\"Code is like humor. When you have to explain it, it’s bad.\" - Cory House");

        submitBtn.setOnClickListener(v -> {
            String userAnswer = answerInput.getText().toString().replaceAll("\\s", "");
            String correctAnswer = " class ReverseEx(){public static void main(Strings argv[]){StringBuilder sb=new StringBuilder(s);System.out.println(sb.reverse().toString());}}"; // "hello world" reversed

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                new AlertDialog.Builder(this)
                        .setTitle("Well done!")
                        .setMessage("Yes! That’s the correct reversed string!")
                        .setPositiveButton("OK", null)
                        .show();
                downloadBtn.setEnabled(true);
                downloadBtn.setAlpha(1f);
            } else {
                Toast.makeText(this, "Oops! That's not correct. Try again.", Toast.LENGTH_SHORT).show();
            }
        });

        downloadBtn.setOnClickListener(v -> {
            certificateImage.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Certificate displayed!", Toast.LENGTH_SHORT).show();
        });

        restartBtn.setOnClickListener(v -> {
            Intent intent = new Intent(javaAssignment
                    .this, javaPractice.class);
            startActivity(intent);
            finish();
        });
    }
}
