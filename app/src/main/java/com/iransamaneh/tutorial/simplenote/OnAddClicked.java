package com.iransamaneh.tutorial.simplenote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.iransamaneh.tutorial.simplenote.adapter.NoteListRecyclerAdapter;
import com.iransamaneh.tutorial.simplenote.model.Note;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by iransamaneh on 1/25/17.
 */
public class OnAddClicked implements View.OnClickListener {
    private NoteListRecyclerAdapter mAdapter;

    public OnAddClicked(NoteListRecyclerAdapter adapter) {
        if (adapter != null) {
            mAdapter = adapter;
        }else{
            mAdapter = new NoteListRecyclerAdapter(new ArrayList<Note>());
        }
    }

    @Override
    public void onClick(View v) {
        //mAdapter.addNote(new Note(String.valueOf(Calendar.getInstance().getTimeInMillis())));
        mAdapter.getNoteVM().addNote(new Note(String.valueOf(Calendar.getInstance().getTimeInMillis())));

    }
}
