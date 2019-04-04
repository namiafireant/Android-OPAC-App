package com.example.diyana.opacuniszanew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SearchActivity extends AppCompatActivity {

    private RadioGroup radioSearchGroup,radioAccessGroup;
    private Button searchBtn;
    private RadioButton radioSearchButton,radioAccessButton;
    private EditText searchText;
    private String text;
    private String search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar) ;
        toolbar.setTitle("Opac Unisza - Homes");
        setSupportActionBar(toolbar);

        radioSearchGroup = (RadioGroup) findViewById(R.id.searchType);
        radioAccessGroup = (RadioGroup) findViewById(R.id.accessSearch);
        searchText = (EditText) findViewById(R.id.search_src_text);
        searchBtn = (Button) findViewById(R.id.search_button);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=radioSearchGroup.getCheckedRadioButtonId();
                radioSearchButton = (RadioButton) findViewById(selectedId);
                int selectedAccessId=radioAccessGroup.getCheckedRadioButtonId();
                radioAccessButton = (RadioButton) findViewById(selectedAccessId);

                search = radioAccessButton.getText().toString(); //title,subject,series,...
                text = searchText.getText().toString();
                //Toast.makeText(SearchActivity.this,searchText.getText(),Toast.LENGTH_SHORT).show();

                Intent i = new Intent(SearchActivity.this, BookListActivity.class);
                i.putExtra("text", text);
                i.putExtra("search", search);
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
