package com.example.macbookair.myapplication.Models;

import java.util.Date;

public class Task {


    public int id;
   public  String title;
    public String description;
    public Boolean iaDone;
     public Date creationDate;
    public  Date endDate;

    public Task( int id, String title, String description){
        this.title = title;
        this.id = id;
        this.description=description;

    }

}
