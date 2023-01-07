package com.magdamiu.androidfall2022.storage;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class WordRepository {
    private WordDao wordDao;
    private LiveData<List<Word>> words;

    WordRepository(Application application) {
        WordRoomDatabase wordRoomDatabase = WordRoomDatabase.getDatabase(application);
        wordDao = wordRoomDatabase.wordDao();
        words = wordDao.getWords();
    }

    void insert(Word word) {
        WordRoomDatabase.databaseWriterExecutor.execute(() -> {
            wordDao.insert(word);
        });
    }

    LiveData<List<Word>> getWords() {
        return words;
    }
}
