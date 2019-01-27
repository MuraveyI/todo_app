package com.example.macbookair.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.macbookair.myapplication.Adapters.TasksAdapter;
import com.example.macbookair.myapplication.Models.Task;
import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainRecycler;
    TasksAdapter tasksAdapter;
    List<Task>tasks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTasks();
        initRecycler();

        mainRecycler = findViewById(R.id.main_recycler);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);


    }
    void initTasks(){
        tasks=new ArrayList<>();
        tasks.add(new Task("Task1", "very important task"));
        tasks.add(new Task("Task2", " not very important task"));
        tasks.add(new Task("Task3", "very very  important task"));

    }
    void initRecycler(){
        mainRecycler = findViewById(R.id.main_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        tasksAdapter = new TasksAdapter(tasks);

        mainRecycler.setLayoutManager(linearLayoutManager);
        mainRecycler.setAdapter(tasksAdapter);

    }
}
