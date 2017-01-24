package com.iransamaneh.tutorial.simplenote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mList;
    private Button mBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mList = (RecyclerView) findViewById(R.id.note_list);
        mBtn = (Button) findViewById(R.id.note_addbtn);

        mList.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL,false));
        getListFromDB();


    }

    private void addItem(){

    }

    private void getListFromDB() {

    }
}
