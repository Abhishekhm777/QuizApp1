package com.abhishek.onlineofflinequizapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "question_table")
public class Entity_model {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id")
    private int id;

    @NonNull
    @ColumnInfo(name = "firstname")
    private String firstname;

    @Nullable
    @ColumnInfo(name = "lastname")
    private String lastname;

    @Nullable
    @ColumnInfo(name = "number")
    private String number;

    public Entity_model(int id, @NonNull String firstname, @Nullable String lastname, @Nullable String number) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(@NonNull String firstname) {
        this.firstname = firstname;
    }

    @Nullable
    public String getLastname() {
        return lastname;
    }

    public void setLastname(@Nullable String lastname) {
        this.lastname = lastname;
    }

    @Nullable
    public String getNumber() {
        return number;
    }

    public void setNumber(@Nullable String number) {
        this.number = number;
    }
}
