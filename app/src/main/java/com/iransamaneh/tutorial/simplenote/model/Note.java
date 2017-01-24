package com.iransamaneh.tutorial.simplenote.model;

import android.app.Application;

import com.iransamaneh.tutorial.simplenote.database.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.annotation.Unique;

/**
 * Created by iransamaneh on 1/24/17.
 */

@Table(database = AppDatabase.class)
public class Note {

    @PrimaryKey(autoincrement = true)
    long id; // package-private recommended, not required

    @Column
    String title;

    @Column
    String time;
}