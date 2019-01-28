package com.example.macbookair.myapplication.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.macbookair.myapplication.R;

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
    }

    void initViews(){
        tvTitle =findViewById(R.id.task_title);
        tvDescription = findViewById(R.id.task_description);
        tvCreationDate =findViewById(R.id.creation_date);
        tvEndDate = findViewById(R.id.end_date);

    }

}
