package com.example.projecttodolist;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

public interface Dao {
    @Insert
    Void insert(UserModel... UserModels);

    @Query("SELECT*FROM UserModel")
    List<UserModel> getAll();

    @Update
    void update(UserModel UserModel);

    @Delete
    void delete(UserModel UserModel);

}
