package com.magdamiu.androidfall2022.storage;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Word.class}, version = 1)
public abstract class WordRoomDatabase extends RoomDatabase {

    public abstract WordDao wordDao();

    private static WordRoomDatabase INSTANCE;

    static WordRoomDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            WordRoomDatabase.class,
                            "word_database")
                    .build();
        }
        return INSTANCE;
    }

    static final ExecutorService databaseWriterExecutor = Executors.newFixedThreadPool(4);
}
