package com.example.taten.chivasa_cardiobook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ArrayList<Measurement>mdata = new ArrayList<>();
    private RecyclerView myRecyclerView;
    private RecyclerView.Adapter myAdapter;
    private RecyclerView.LayoutManager myLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddm();
            }
        });


        Measurement m1 = new Measurement();
        Measurement m2 = new Measurement();
        Measurement m3 = new Measurement();
        Measurement m4 = new Measurement();
        Measurement m5 = new Measurement();

        //ArrayList<Measurement> data = new ArrayList<>();
        mdata.add(m1);
        mdata.add(m2);
        mdata.add(m3);
        mdata.add(m4);
        mdata.add(m5);

        //measure = (ListView) findViewById(R.id.measurements);
        //CustomListview customListview = new CustomListview(this, data);
        //measure.setAdapter(customListview);

    }

        public void openAddm(){
            Intent intent = new Intent(this, Addm.class);
            startActivity(intent);

        }

    }


