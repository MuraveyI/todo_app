package com.example.macbookair.myapplication.Models;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task  implements Serializable {


    public int id;
   public  String title;
    public String description;
    public Boolean isDone;
     public Date creationDate;
    public  Date endDate;

    public Task( int id, String title, String description, Date creationDate, Date endDate, Boolean isDone){
        this.title = title;
        this.id = id;
        this.description=description;
        this.creationDate=creationDate;
        this.endDate=endDate;
        this.isDone=isDone;



    }

    public String strCreationDate(){
        return dateToString(creationDate);
    }

   public String strEndDate(){
        return dateToString(endDate);
    }

    private String dateToString (Date date){
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");// 02.11/2019
        return dateFormat.format(date);

    }


}
