package com.example.yokesdhacks2022;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "users.db";
    public static final String TABLE_NAME = "user_table";
    public static final String COL1 = "USERNAME";
    public static final String COL2 = "PASSWORD";
    public static final String COL3 = "GOAL";
    public static final String COL4 = "ACTIVITY_LEVEL";
    public static final String COL5 = "SEX";
    public static final String COL6 = "AGE";
    public static final String COL7 = "HEIGHT";
    public static final String COL8 = "WEIGHT";
    public static final String COL9 = "WEIGHT_GOAL";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOCRIMENT, " + " USERNAME TEXT, PASSWORD TEXT, GOAL TEXT, ACTIVITY_LEVEL TEXT, SEX TEXT, AGE TEXT, HEIGHT TEXT, WEIGHT , WEIGHT_GOAL TEXT";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public boolean addData(String username, String password, String goal, String activity_level, String sex, String age, String height, String weight, String weight_goal) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL1, username);
        contentValues.put(COL2, password);
        contentValues.put(COL3, goal);
        contentValues.put(COL4, activity_level);
        contentValues.put(COL5, sex);
        contentValues.put(COL6, age);
        contentValues.put(COL7, height);
        contentValues.put(COL8, weight);
        contentValues.put(COL9, weight_goal);

        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1) {
            return false;
        }
        else {
            return true;
        }
    }



}
