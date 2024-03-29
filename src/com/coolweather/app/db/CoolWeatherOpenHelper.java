package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	
	/**
	 * Province表建表语句
	 */
	public static final String CREATE_PROVINCE = "create table Province ("
			+ "id integer primary Key aotuincrement, "
			+ "province_name text, "
			+ "province_code text) ";
	
	/**
	 * City表建表语句
	 */
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary Key aotoincrement, "
			+ "city_name text, "
			+ "city_code text, "
			+ "province_id integer) ";
	
	/**
	 * Country表建表语句
	 */
	public static final String CREATE_COUNTRY = "create table Country ("
			+ "id integer primary Key aotoincrement, "
			+ "country_name text, "
			+ "country_code text, "
			+ "city_id integer) ";
	
	public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,
			int version){
		super(context,name,factory,version);
	}
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
			db.execSQL(CREATE_PROVINCE);//创建province表
			db.execSQL(CREATE_CITY);//创建city表
			db.execSQL(CREATE_COUNTRY);//创建country表
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
