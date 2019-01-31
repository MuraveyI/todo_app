package com.example.macbookair.myapplication.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.macbookair.myapplication.Models.Task;
import com.example.macbookair.myapplication.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TaskDetailsActivity extends AppCompatActivity {

        TextView tvTitle;
        TextView tvDescription;
        TextView tvCreationDate;
        TextView tvEndDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_ditailes);
        initViews();



        Intent intent = getIntent();

        Task task = (Task) intent.getSerializableExtra("task");



        tvTitle.setText(task.title);
        tvDescription.setText(task.description);
        tvCreationDate.setText(task.strCreationDate());
        tvEndDate.setText(task.strEndDate());
    }

    void initViews(){
        tvTitle =findViewById(R.id.task_title);
        tvDescription = findViewById(R.id.task_description);
        tvCreationDate =findViewById(R.id.creation_date);
        tvEndDate = findViewById(R.id.end_date);

    }
}
