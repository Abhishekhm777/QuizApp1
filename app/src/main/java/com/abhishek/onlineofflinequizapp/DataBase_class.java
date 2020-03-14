package com.abhishek.onlineofflinequizapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;


@Database(entities = {Entity_model.class},version = 1)
abstract public class DataBase_class  extends RoomDatabase {
    public abstract Dao_class dao_class();
    private static DataBase_class INSTANCE;

   static public DataBase_class getDatbae(final Context context) {
       if(INSTANCE==null){
           synchronized (Dao_class.class){

            INSTANCE= Room.databaseBuilder(context.getApplicationContext(),
                    DataBase_class.class,"question_table")
                    .fallbackToDestructiveMigration()
                    .addCallback(sRoomDatabaseCallback)
                    .build();
           }
       }

         return INSTANCE;
    }


    /**
     * Override the onOpen method to populate the database.
     * For this sample, we clear the database every time it is created or opened.
     */
    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){

        @Override
        public void onOpen (@NonNull SupportSQLiteDatabase db){
            super.onOpen(db);
        }
    };
}
