package com.example.myapplication.ui;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import  android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
public class AdminSQLiteOpenHelper extends SQLiteOpenHelper { public  AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
    super(context,name,factory,version);
}
    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos){

        BaseDeDatos.execSQL("create  table articulos2(codigo int primary key, descripcion text,precio real,existencia)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){

    }

}
