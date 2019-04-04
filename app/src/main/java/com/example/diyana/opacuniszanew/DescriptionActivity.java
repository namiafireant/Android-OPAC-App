package com.example.diyana.opacuniszanew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DescriptionActivity extends AppCompatActivity {

    private Button buttonOne, buttonTwo;
    private TextView isbnTxt,callNoTxt,authorTxt,titleTxt,editionTxt,imprintTxt,descTxt,notesTxt,biblioTxt,subjectTxt,otherAuthorTxt,entryTitleTxt;
    private AllData data;
    private List<Books> lstBooks;
    private String id;
    private String value;
    private String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar) ;
        toolbar.setTitle("Book Description");
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        value = intent.getExtras().getString("value");

        buttonOne = (Button) findViewById(R.id.btnOne);
        buttonTwo = (Button) findViewById(R.id.btnTwo);

        isbnTxt = (TextView) findViewById(R.id.isbntxt);
        callNoTxt = (TextView) findViewById(R.id.callNotxt);
        authorTxt = (TextView) findViewById(R.id.authortxt);
        titleTxt = (TextView) findViewById(R.id.titletxt);
        editionTxt = (TextView) findViewById(R.id.editiontxt);
        imprintTxt = (TextView) findViewById(R.id.imprinttxt);
        descTxt = (TextView) findViewById(R.id.desctxt);
        notesTxt = (TextView) findViewById(R.id.notestxt);
        biblioTxt = (TextView) findViewById(R.id.bibliotxt);
        subjectTxt = (TextView) findViewById(R.id.subjecttxt);
        otherAuthorTxt = (TextView) findViewById(R.id.otherAuthortxt);
        entryTitleTxt = (TextView) findViewById(R.id.entryTitletxt);

        data = new AllData();
        lstBooks = data.getLstBooks();

        int i;
        for(i = 0; i<37; i++){
            if(lstBooks.get(i).getbId().equalsIgnoreCase(value)){
                id = lstBooks.get(i).getbId();
                status = lstBooks.get(i).getbStatus();
                isbnTxt.setText(lstBooks.get(i).getbIsbnNum());
                callNoTxt.setText(lstBooks.get(i).getbCallNum());
                authorTxt.setText(lstBooks.get(i).getbAuthor());
                titleTxt.setText(lstBooks.get(i).getbTitle());
                editionTxt.setText(lstBooks.get(i).getbEdition());
                imprintTxt.setText(lstBooks.get(i).getbImprint());
                descTxt.setText(lstBooks.get(i).getbDescription());
                notesTxt.setText(lstBooks.get(i).getbNotes());
                biblioTxt.setText(lstBooks.get(i).getbBiblio());
                subjectTxt.setText(lstBooks.get(i).getbSubject());
                otherAuthorTxt.setText(lstBooks.get(i).getbAuthor());
                entryTitleTxt.setText(lstBooks.get(i).getbEntryTitle());
            }
        }

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(status.equalsIgnoreCase("0")){
                    Toast.makeText(DescriptionActivity.this,"No Accession Available",Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(DescriptionActivity.this, AccessionActivity.class);
                    i.putExtra("value", value);
                    startActivity(i);
                }

            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DescriptionActivity.this, AcquisitionActivity.class);
                i.putExtra("value", value);
                startActivity(i);
            }
        });

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                onBackPressed();
            }
        });

    }
}
