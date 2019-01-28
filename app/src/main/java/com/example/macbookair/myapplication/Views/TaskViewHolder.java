package com.example.macbookair.myapplication.Views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.macbookair.myapplication.Interfaces.IOnClickListener;
import com.example.macbookair.myapplication.Models.Task;
import com.example.macbookair.myapplication.R;

public class TaskViewHolder extends RecyclerView.ViewHolder {
    TextView tvTitle;
    TextView tvDescription;
    IOnClickListener listener;
    int taskID = -1; // ничего не вернет



    public TaskViewHolder(View v, final IOnClickListener listener){
        super(v);
        this.listener = listener;
        tvTitle = v.findViewById(R.id.vh_task_title);
        tvDescription =v.findViewById(R.id.vh_task_description);



        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               listener.onClick(taskID);
            }
        });
    }
    public void onBind(Task task){
        taskID = task.id;
        tvTitle.setText(task.title);
        tvDescription.setText(task.description);

    }

}
