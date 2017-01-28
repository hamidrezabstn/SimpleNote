package com.iransamaneh.tutorial.simplenote.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.iransamaneh.tutorial.simplenote.R;
import com.iransamaneh.tutorial.simplenote.adapter.OnNoteListener;
import com.iransamaneh.tutorial.simplenote.databinding.LayoutNoteListItemBinding;
import com.iransamaneh.tutorial.simplenote.model.Note;


/**
 * Created by iransamaneh on 1/25/17.
 */

public class NoteItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    LayoutNoteListItemBinding mBinder;
    OnNoteListener mListener;


    public NoteItemHolder(LayoutNoteListItemBinding itemView , OnNoteListener listener) {
        super(itemView.getRoot());
        mBinder = itemView;
        mListener = listener;
        mBinder.noteListItemTitle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        mListener.onClick(v , getLayoutPosition());
    }

    public void createView(Note note) {
        mBinder.setNote(note);
    }
}
