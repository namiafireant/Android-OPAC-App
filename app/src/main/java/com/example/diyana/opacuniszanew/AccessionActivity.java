package com.example.diyana.opacuniszanew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.AbstractList;
import java.util.List;

public class AccessionActivity extends AppCompatActivity {

    private AllData data;
    private List<Accession> lstAccession;
    private String value;
    private List<Accession> newlistAccession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accession);

        Intent intent = getIntent();
        value = intent.getExtras().getString("value");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar) ;
        toolbar.setTitle(" Book Accession");
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                onBackPressed();
            }
        });

        data = new AllData();
        lstAccession = data.getLstAccession();

        /*int i;
        for(i = 0; i<lstAccession.size(); i++){
            if(lstAccession.get(i).getaBookId().equalsIgnoreCase("6") ){
                newlistAccession.add(new Accession(lstAccession.get(i).getaId(),lstAccession.get(i).getaCallNum(),lstAccession.get(i).getaCampus(),lstAccession.get(i).getaLocation(),lstAccession.get(i).getaSmd(),lstAccession.get(i).getaCategory(),lstAccession.get(i).getaStatus(),lstAccession.get(i).getaDueDate(),lstAccession.get(i).getaDueTime(),lstAccession.get(i).getaBookId()));
            }
        }*/

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_accession);
        RecyclerViewAccessionAdapter myAdapter = new RecyclerViewAccessionAdapter(this,lstAccession, value);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}
