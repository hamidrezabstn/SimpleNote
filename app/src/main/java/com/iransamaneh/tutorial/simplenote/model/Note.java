package com.iransamaneh.tutorial.simplenote.model;


import com.iransamaneh.tutorial.simplenote.database.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

/**
 * Created by iransamaneh on 1/24/17.
 */

@Table(database = AppDatabase.class)
public class Note {
    public Note() {
    }

    public Note(String title) {
        this.title = title;
    }

    @PrimaryKey(autoincrement = true)
    long id; // package-private recommended, not required

    @Column
    String title;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}