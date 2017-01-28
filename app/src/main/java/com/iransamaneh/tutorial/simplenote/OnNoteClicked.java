package com.iransamaneh.tutorial.simplenote;

import android.view.View;

import com.iransamaneh.tutorial.simplenote.adapter.NoteListRecyclerAdapter;
import com.iransamaneh.tutorial.simplenote.adapter.OnNoteListener;
import com.iransamaneh.tutorial.simplenote.model.Note;

import java.util.Calendar;

/**
 * Created by iransamaneh on 1/25/17.
 */

public class OnNoteClicked implements OnNoteListener {
    private final NoteListRecyclerAdapter mAdapter;

    public OnNoteClicked(NoteListRecyclerAdapter noteListRecyclerAdapter) {
        mAdapter = noteListRecyclerAdapter;
    }

    @Override
    public void onClick(View v, int position) {
        //delete item from list
        mAdapter.getNoteVM().removeNote(position);
    }
}
