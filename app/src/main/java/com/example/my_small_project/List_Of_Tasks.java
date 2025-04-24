package com.example.my_small_project;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class List_Of_Tasks extends AppCompatActivity {
RecyclerView recyclerView;
List<Task_Menu> tasklist;
TaskAdapter taskAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_of_tasks);

        recyclerView=findViewById(R.id.JavaRecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        tasklist=new ArrayList<>();
        tasklist.add(new Task_Menu("Java Theory"));
        tasklist.add(new Task_Menu("Java Practice"));
        tasklist.add(new Task_Menu("Java Assignment"));
        taskAdapter=new TaskAdapter(tasklist,this);
        recyclerView.setAdapter(taskAdapter);
    }
}