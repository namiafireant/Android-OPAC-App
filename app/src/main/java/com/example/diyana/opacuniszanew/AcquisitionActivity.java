package com.example.diyana.opacuniszanew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class AcquisitionActivity extends AppCompatActivity {

    List<Acquisition> lstAcquisition;
    private AllData data;
    private TextView orderTxt, vendorTxt, statusTxt, setTxt, receivedTxt, copiesTxt, feedbackTxt;
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acquisition);

        Intent intent = getIntent();
        value = intent.getExtras().getString("value");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar) ;
        toolbar.setTitle("Book Acquisition");
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                onBackPressed();
            }
        });

        orderTxt = (TextView) findViewById(R.id.ordertxt);
        vendorTxt = (TextView) findViewById(R.id.vendortxt);
        statusTxt = (TextView) findViewById(R.id.statustxt);
        setTxt = (TextView) findViewById(R.id.settxt);
        receivedTxt = (TextView) findViewById(R.id.receivedtxt);
        copiesTxt = (TextView) findViewById(R.id.copiestxt);
        feedbackTxt = (TextView) findViewById(R.id.feedbacktxt);

        //retrieve all data
        data = new AllData();
        lstAcquisition = data.getLstAcquisition();

        int i;int check = 0;
        for(i = 0; i<15; i++){
            if(lstAcquisition.get(i).getAcBookId().equalsIgnoreCase(value) ){
                check = 1;
                orderTxt.setText(lstAcquisition.get(i).getAcOrderDate());
                vendorTxt.setText(lstAcquisition.get(i).getAcVendor());
                statusTxt.setText(lstAcquisition.get(i).getAcStatus());
                setTxt.setText(lstAcquisition.get(i).getAcSets());
                receivedTxt.setText(lstAcquisition.get(i).getAcReceived());
                copiesTxt.setText(lstAcquisition.get(i).getAcCopies());
                feedbackTxt.setText(lstAcquisition.get(i).getAcFeedback());
            }
        }
        if(check == 0){
            Toast.makeText(AcquisitionActivity.this,"No Acquisition",Toast.LENGTH_SHORT).show();
        }
    }
}
