package com.example.macbookair.myapplication.Views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.macbookair.myapplication.Models.Task;
import com.example.macbookair.myapplication.R;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle;
    TextView tvDescription;


    public TaskViewHolder(View v){
        super(v);
        tvTitle = v.findViewById(R.id.vh_task_title);
        tvDescription =v.findViewById(R.id.vh_task_description);


    }
    public void onBind(Task task){
        tvTitle.setText(task.title);
        tvDescription.setText(task.description);

    }

}
