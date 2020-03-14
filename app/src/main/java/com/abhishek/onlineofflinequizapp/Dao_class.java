package com.abhishek.onlineofflinequizapp;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface Dao_class {

    @Query("SELECT * from  question_table")
    LiveData<List<Entity_model>> getAllQuestions();

   @Insert
    void insert(Entity_model model);

    @Query("DELETE  FROM question_table")
    void delete();



}

