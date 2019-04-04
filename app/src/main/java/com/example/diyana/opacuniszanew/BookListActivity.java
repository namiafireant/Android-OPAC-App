package com.example.diyana.opacuniszanew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class BookListActivity extends AppCompatActivity {

    private AllData data;
    private ArrayList<Books> lsBooks;
    private String text,search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar) ;
        toolbar.setTitle("Opac Unisza - Books ");
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        text = intent.getExtras().getString("text");
        search = intent.getExtras().getString("search");


        data = new AllData();
        lsBooks = data.getLstBooks();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_book);
        RecyclerViewBookAdapter myAdapter = new RecyclerViewBookAdapter(this,lsBooks, search, text);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}
