package com.magdamiu.androidfall2022.storage;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class WordDao_Impl implements WordDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Word> __insertionAdapterOfWord;

  public WordDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWord = new EntityInsertionAdapter<Word>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `word` (`word`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Word value) {
        if (value.getTheWord() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTheWord());
        }
      }
    };
  }

  @Override
  public void insert(final Word word) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWord.insert(word);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<Word>> getWords() {
    final String _sql = "SELECT * FROM word ORDER BY word ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"word"}, false, new Callable<List<Word>>() {
      @Override
      public List<Word> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTheWord = CursorUtil.getColumnIndexOrThrow(_cursor, "word");
          final List<Word> _result = new ArrayList<Word>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Word _item;
            final String _tmpTheWord;
            _tmpTheWord = _cursor.getString(_cursorIndexOfTheWord);
            _item = new Word(_tmpTheWord);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
