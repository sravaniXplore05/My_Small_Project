package com.example.my_small_project;


import android.app.Activity;
import android.content.Context;

import android.content.Intent;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.ViewHolder> {

    List<Task_Menu> tasks;
    Context context;

    public TaskAdapter(List<Task_Menu> tasks, Context context) {
        this.tasks = tasks;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        Button taskButton;

        public ViewHolder(View itemView) {
            super(itemView);
            taskButton = itemView.findViewById(R.id.taskButton);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.task_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Task_Menu task = tasks.get(position);
        holder.taskButton.setText(task.getTaskName());

        holder.taskButton.setOnClickListener(v -> {
            Intent intent = null;

            if (task.getTaskName().equals("Java Theory")) {
                intent = new Intent(context, JavaTheory.class);
            } else if (task.getTaskName().equals("Java Practice")) {
                intent = new Intent(context, javaPractice.class);
            } else if (task.getTaskName().equals("Java Assignment")) {
                intent = new Intent(context, javaAssignment.class);
            }

            if (intent != null) {
               context.startActivity(intent);
            }

        });
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}