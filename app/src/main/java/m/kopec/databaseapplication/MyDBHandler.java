package m.kopec.databaseapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kopec on 10/31/2018.
 */

public class MyDBHandler extends SQLiteOpenHelper {
    // information of database
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "studentDB.db";
    public static final String TABLE_NAME = "Student";
    public static final String COLUMN_ID = "StudentID";
    public static final String COLUMN_NAME = "StudentName";

    // initialize the database
    public MyDBHandler(Context context, Stringname, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE" + TABLE_NAME + "(" + COLUMN_ID + ")" + "INTEGER PRIMARYKEY," + COLUMN_NAME + "TEXT )";
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    }

    public String loadHandler() {
    }

    public void addHandler(Student student) {
    }

    public Student findHandler(String studentname) {
    }

    public boolean deleteHander(int ID) {
    }

    public boolean updateHandler(int ID, String name) {
    }

}
