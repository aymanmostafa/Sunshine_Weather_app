package com.example.ayman.sunshine3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class Custom_adapter extends AppCompatActivity {

    ListView mylist;
    ArrayList<String> con,cap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });



        mylist=(ListView) findViewById(R.id.listView_country);

        con=new ArrayList<String>();
        con.add("1");
        con.add("2");
        con.add("3");
        con.add("4");
        con.add("5");
        con.add("6");
        con.add("7");
        con.add("8");
        con.add("9");
        con.add("10");
        con.add("11");
        con.add("12");
        con.add("13");
        con.add("14");
        con.add("15");
        con.add("16");
        con.add("17");
        con.add("18");
        con.add("19");
        con.add("20");


        cap=new ArrayList<String>();
        cap.add("1");
        cap.add("2");
        cap.add("3");
        cap.add("4");
        cap.add("5");
        cap.add("6");
        cap.add("7");
        cap.add("8");
        cap.add("9");
        cap.add("10");
        cap.add("11");
        cap.add("12");
        cap.add("13");
        cap.add("14");
        cap.add("15");
        cap.add("16");
        cap.add("17");
        cap.add("18");
        cap.add("19");
        cap.add("20");

        Custom_adapter_implement ada=new Custom_adapter_implement(getApplicationContext(),con,cap);
        mylist.setAdapter(ada);



    }

}
