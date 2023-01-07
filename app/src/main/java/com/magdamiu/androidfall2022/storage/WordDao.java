package com.magdamiu.androidfall2022.storage;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word);

    @Query("SELECT * FROM word ORDER BY word ASC")
    LiveData<List<Word>> getWords();
}
