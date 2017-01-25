package com.iransamaneh.tutorial.simplenote;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.View;

import com.iransamaneh.tutorial.simplenote.adapter.NoteListRecyclerAdapter;
import com.iransamaneh.tutorial.simplenote.model.Note;

/**
 * Created by iransamaneh on 1/25/17.
 */
public class OnAddClicked implements View.OnClickListener {
    private NoteListRecyclerAdapter mAdapter;

    public OnAddClicked(NoteListRecyclerAdapter adapter) {
        if (adapter != null) {
            mAdapter = adapter;
        }else{
            mAdapter = new NoteListRecyclerAdapter();
        }
    }

    @Override
    public void onClick(View v) {
        mAdapter.addNote(new Note("salam"));
        /*AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext()).setView(R.layout.layout_note_list_add);
        builder.setTitle("متن خود را وارد کنید");
        builder.setPositiveButton("ثبت", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                mAdapter.addNote(new Note("salam"));
            }
        });
        builder.create().show();*/
    }
}
