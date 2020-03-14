package com.abhishek.onlineofflinequizapp;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

public class Repository {

private  Dao_class dao_class;
private LiveData<List<Entity_model>> allQuestions;

    public Repository(Application application) {
          DataBase_class db=DataBase_class.getDatbae(application);
           dao_class=db.dao_class();
           allQuestions=dao_class.getAllQuestions();

    }

  public LiveData<List<Entity_model>>  getAllQuestions(){
        return allQuestions;
  }

        public void insert(Entity_model model){
           new insertAyscClass(
                     dao_class
           ).execute(model);
        }

        private static class insertAyscClass extends AsyncTask<Entity_model ,Void,Void>{
                private Dao_class dao_class;
            public insertAyscClass(Dao_class dao_class) {
                this.dao_class=dao_class;

            }

            @Override
            protected Void doInBackground( final Entity_model... models) {
                 dao_class.insert(models[0]);
                return null;
            }
        }
}
