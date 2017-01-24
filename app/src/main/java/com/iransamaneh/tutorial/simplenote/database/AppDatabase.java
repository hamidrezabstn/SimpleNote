package com.iransamaneh.tutorial.simplenote.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by iransamaneh on 1/24/17.
 */

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)
public class AppDatabase {

    public static final String NAME = "AppDatabase"; // we will add the .db extension

    public static final int VERSION = 1;
}
