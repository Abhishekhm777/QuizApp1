package com.abhishek.onlineofflinequizapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ViewModel extends AndroidViewModel {
   private Repository repository;
   private LiveData<List<Entity_model>>allQuestions;
    public ViewModel(@NonNull Application application) {
        super(application);
        repository=new Repository(application);
       allQuestions =repository.getAllQuestions();

    }

    LiveData<List<Entity_model>>getAllQuestions(){
          return allQuestions;
    }

    public void insert(Entity_model word) { repository.insert(word); }




}
