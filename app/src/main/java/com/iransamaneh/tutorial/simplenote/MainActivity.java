package com.iransamaneh.tutorial.simplenote;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import com.iransamaneh.tutorial.simplenote.adapter.NoteListRecyclerAdapter;
import com.iransamaneh.tutorial.simplenote.databinding.ActivityMainBinding;
import com.iransamaneh.tutorial.simplenote.model.Note;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mBinder = DataBindingUtil.setContentView(this , R.layout.activity_main);

        mBinder.noteList.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL,false));
        //getListFromDB();
        mBinder.noteList.setAdapter(new NoteListRecyclerAdapter(new ArrayList<Note>()));

        mBinder.noteAddbtn.setOnClickListener(new OnAddClicked(
                (NoteListRecyclerAdapter)mBinder.noteList.getAdapter()));

    }
}
