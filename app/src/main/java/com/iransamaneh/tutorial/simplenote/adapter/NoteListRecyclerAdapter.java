package com.iransamaneh.tutorial.simplenote.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iransamaneh.tutorial.simplenote.OnNoteClicked;
import com.iransamaneh.tutorial.simplenote.R;
import com.iransamaneh.tutorial.simplenote.databinding.LayoutNoteListItemBinding;
import com.iransamaneh.tutorial.simplenote.holder.NoteItemHolder;
import com.iransamaneh.tutorial.simplenote.model.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iransamaneh on 1/25/17.
 */

public class NoteListRecyclerAdapter extends RecyclerView.Adapter<NoteItemHolder> {

    private List<Note> noteList = new ArrayList<>();


    @Override
    public NoteItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutNoteListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext())
                ,R.layout.layout_note_list_item,parent,false);

        return new NoteItemHolder(binding,new OnNoteClicked(this));
    }

    public void addNote(Note note) {
        noteList.add(note);
        notifyItemInserted(noteList.size()-1);
        notifyItemRangeChanged(noteList.size()-1,1);
    }


    public void deleteNote(int position) {
        noteList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public void onBindViewHolder(NoteItemHolder holder, int position) {
        holder.createView(noteList.get(position));
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }




}
