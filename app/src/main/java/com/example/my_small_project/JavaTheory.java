package com.example.my_small_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class JavaTheory extends AppCompatActivity {

    Button btnSubmitTheory,btnBasics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_theory);
        TextView javaTheoryTextView = findViewById(R.id.txtJavaTheory);

        String theory = "                                 JAVA THEORY \n\n"

                + "1. Class & Object:\n"
                + " - Class: A blueprint for objects.\n"
                + " - Object: An instance of a class.\n\n"

                + "2. Inheritance:\n"
                + " - Reusability of code using 'extends'.\n"
                + " - Types: Single, Multilevel, Hierarchical.\n\n"

                + "3. Polymorphism:\n"
                + " - Compile-time (Method Overloading)\n"
                + " - Run-time (Method Overriding)\n\n"

                + "4. Abstraction:\n"
                + " - Hiding details using abstract classes & interfaces.\n\n"

                + "5. Encapsulation:\n"
                + " - Binding data & methods.\n"
                + " - Use private variables & public methods.\n\n"

                + "6. Interfaces:\n"
                + " - Used to achieve full abstraction.\n"
                + " - All methods are abstract by default.\n\n"

                + "7. Exception Handling:\n"
                + " - Handles runtime errors.\n"
                + " - Keywords: try, catch, finally, throw, throws.\n\n"

                + "8. Multithreading:\n"
                + " - Multiple tasks run simultaneously.\n"
                + " - Classes: Thread, Runnable.\n\n"

                + "9. Collections:\n"
                + " - Framework to store and manipulate data.\n"
                + " - Interfaces: List, Set, Queue, Map.\n\n"

                + "10. File Handling:\n"
                + " - Reading/Writing using File, FileReader, BufferedReader.\n\n"

                + "11. JDBC:\n"
                + " - Java Database Connectivity.\n"
                + " - Connect Java apps to DB (like MySQL).\n\n"

                + "12. Lambda Expressions:\n"
                + " - Introduced in Java 8 for functional programming.\n\n"

                + "13. Streams API:\n"
                + " - Process collections in a functional way.\n\n"

                + "14. Wrapper Classes:\n"
                + " - Convert primitives to objects (e.g., int to Integer).\n\n"

                + "15. Access Modifiers:\n"
                + " - private, public, protected, default.\n\n"

                + "16. Static Keyword:\n"
                + " - Belongs to the class, not objects.\n\n"

                + "17. Final Keyword:\n"
                + " - Used with variables, methods, and classes.\n\n"

                + "18. Inner Classes:\n"
                + " - Class inside another class.\n\n"

                + "19. Packages:\n"
                + " - Grouping related classes.\n"
                + " - Use 'import' to use them.\n\n"

                + "20. Garbage Collection:\n"
                + " - Java automatically deletes unused objects.\n\n";

        javaTheoryTextView.setText(theory);
        btnBasics=findViewById(R.id.exProgramme);
        btnSubmitTheory = findViewById(R.id.btnSubmitTheory);


        btnSubmitTheory.setOnClickListener(v -> {
            Toast.makeText(this, "Java Theory Submitted!", Toast.LENGTH_SHORT).show();

            // Optionally: send result back to TaskActivity to update UI
            Intent resultIntent = new Intent();
            resultIntent.putExtra("taskName", "Java Theory");
            setResult(RESULT_OK, resultIntent);
            finish();
        });
        btnBasics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(JavaTheory.this, JavaBasicsActivity.class);
                startActivity(intent);
            }
        });
}
}