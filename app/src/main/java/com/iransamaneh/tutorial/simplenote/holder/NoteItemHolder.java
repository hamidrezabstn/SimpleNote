package com.iransamaneh.tutorial.simplenote.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.iransamaneh.tutorial.simplenote.R;
import com.iransamaneh.tutorial.simplenote.adapter.OnNoteListener;
import com.iransamaneh.tutorial.simplenote.model.Note;


/**
 * Created by iransamaneh on 1/25/17.
 */

public class NoteItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView mTitle;
    OnNoteListener mListener;


    public NoteItemHolder(View itemView , OnNoteListener listener) {
        super(itemView);
        mListener = listener;
        mTitle = (TextView) itemView.findViewById(R.id.note_list_item_title);

        mTitle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        mListener.onClick(v , getLayoutPosition());
    }

    public void createView(Note note) {
        mTitle.setText(note.getTitle());
    }
}
