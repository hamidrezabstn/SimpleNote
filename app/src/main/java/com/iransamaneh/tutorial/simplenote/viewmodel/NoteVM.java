package com.iransamaneh.tutorial.simplenote.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;

import com.iransamaneh.tutorial.simplenote.BR;
import com.iransamaneh.tutorial.simplenote.model.Note;

/**
 * Created by iransamaneh on 1/25/17.
 */

public class NoteVM extends BaseObservable {


    private ObservableArrayList<Note> mNotes;

    public NoteVM(ObservableArrayList.OnListChangedCallback callback) {
        this.setmNotes(new ObservableArrayList<Note>());
        this.mNotes.addOnListChangedCallback(callback);
    }

    public NoteVM(ObservableArrayList<Note> mNotes , ObservableArrayList.OnListChangedCallback callback) {
        this.setmNotes(mNotes);
        this.mNotes.addOnListChangedCallback(callback);
    }

    @Bindable
    public ObservableArrayList<Note> getmNotes() {
        return mNotes;
    }

    public void setmNotes(ObservableArrayList<Note> mNotes) {
        this.mNotes = mNotes;
        notifyPropertyChanged(BR.mNotes);
    }

    public void addNote(Note note) {
        mNotes.add(note);
        notifyPropertyChanged(BR.mNotes);
    }

    public void removeNote(int position) {
        mNotes.remove(position);
        notifyPropertyChanged(BR.mNotes);
    }


}
