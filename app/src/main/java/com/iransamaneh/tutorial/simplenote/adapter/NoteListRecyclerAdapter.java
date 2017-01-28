package com.iransamaneh.tutorial.simplenote.adapter;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iransamaneh.tutorial.simplenote.OnNoteClicked;
import com.iransamaneh.tutorial.simplenote.R;
import com.iransamaneh.tutorial.simplenote.databinding.LayoutNoteListItemBinding;
import com.iransamaneh.tutorial.simplenote.holder.NoteItemHolder;
import com.iransamaneh.tutorial.simplenote.model.Note;
import com.iransamaneh.tutorial.simplenote.viewmodel.NoteVM;

import java.util.ArrayList;
import java.util.List;

public class NoteListRecyclerAdapter
        extends RecyclerView.Adapter<NoteItemHolder>  {

    private NoteVM noteVM;
    private ObservableList.OnListChangedCallback<ObservableArrayList<Note>> callback =
            new ObservableList.OnListChangedCallback<ObservableArrayList<Note>>() {
                @Override
                public void onChanged(ObservableArrayList<Note> notes) {
                    notifyDataSetChanged();
                }

                @Override
                public void onItemRangeChanged(ObservableArrayList<Note> notes, int i, int i1) {
                        notifyItemRangeChanged(i , i1);
                }

                @Override
                public void onItemRangeInserted(ObservableArrayList<Note> notes, int i, int i1) {
                        notifyItemRangeInserted(i , i1);
                }

                @Override
                public void onItemRangeMoved(ObservableArrayList<Note> notes, int i, int i1, int i2) {
                        notifyItemRangeInserted(i , i2);
                        notifyItemRangeRemoved(i1 , i2);
                }

                @Override
                public void onItemRangeRemoved(ObservableArrayList<Note> notes, int i, int i1) {
                        notifyItemRangeRemoved(i , i1);
                }
            };

    public NoteListRecyclerAdapter(List<Note> noteList) {
            noteVM = new NoteVM(callback);
            noteVM.getmNotes().addAll(noteList);
    }

    @Override
    public NoteItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutNoteListItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext())
                ,R.layout.layout_note_list_item,parent,false);

        return new NoteItemHolder(binding,new OnNoteClicked(this));
    }

    /*public void addNote(Note note) {
        noteList.add(note);
        notifyItemInserted(noteList.size()-1);
        notifyItemRangeChanged(noteList.size()-1,1);
    }


    public void deleteNote(int position) {
        noteList.remove(position);
        notifyItemRemoved(position);
    }*/

    @Override
    public void onBindViewHolder(NoteItemHolder holder, int position) {
        holder.createView(noteVM.getmNotes().get(position));
    }

    @Override
    public int getItemCount() {
        return noteVM.getmNotes().size();
    }


    public NoteVM getNoteVM() {
        return noteVM;
    }

    public void setNoteVM(NoteVM noteVM) {
        this.noteVM = noteVM;
    }
}
