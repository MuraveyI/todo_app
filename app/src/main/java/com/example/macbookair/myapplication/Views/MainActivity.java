package com.example.macbookair.myapplication.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.macbookair.myapplication.Adapters.TasksAdapter;
import com.example.macbookair.myapplication.Interfaces.IOnClickListener;
import com.example.macbookair.myapplication.Models.Task;
import com.example.macbookair.myapplication.R;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IOnClickListener {

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
        tasks.add(new Task(0,"Task1", "very important task"));
        tasks.add(new Task(1,"Task2", " not very important task"));
        tasks.add(new Task(2,"Task3", "very very  important task"));

    }
    void initRecycler(){
        mainRecycler = findViewById(R.id.main_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        tasksAdapter = new TasksAdapter(tasks,this);

        mainRecycler.setLayoutManager(linearLayoutManager);
        mainRecycler.setAdapter(tasksAdapter);

    }

    @Override
    public void onClick(int taskID) {
        Log.d("qwe", "ONClick");

        Task task =null;
        for(int i=0; i<tasks.size(); i++){
            Log.d("qwe", ""+ tasks.get(i).id);
            if (tasks.get(i).id==taskID){
                task = tasks.get(i);
                break;
            } else {
                Log.d("qwe", "not found");

            }
        }

        if (task == null){
            return;
        }

        Intent intent = new Intent(this, TaskDetailsActivity.class);

        intent.putExtra("task_title", task.title);
        intent.putExtra("task_description", task.description);
        startActivity(intent);
    }
}
