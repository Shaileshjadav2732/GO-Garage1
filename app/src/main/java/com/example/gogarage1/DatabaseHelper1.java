package com.example.gogarage1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper1 extends SQLiteOpenHelper
{
    // to cerate SQLite database
    public DatabaseHelper1(Context context, String dbname, SQLiteDatabase.CursorFactory factory ,int version) {
        super (context,dbname,factory,version);
    }
    //creating table
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Users(Email varchar(15),PassWord varchar(20))");
    }
    //drop the table when version changes
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists Users");
        onCreate(db);
    }
    public long savenewuserdata(String Email,String PassWord){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv= new ContentValues();

        cv.put("email",Email);
        cv.put("password",PassWord);
        long recordid= db.insert("users",null,cv);
        return recordid;
    }
}
