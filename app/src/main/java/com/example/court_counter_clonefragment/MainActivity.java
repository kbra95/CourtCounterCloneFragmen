package com.example.court_counter_clonefragment;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ListFragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (savedInstanceState == null) {
            // During initial setup, plug in the details fragment.

            // create fragment
            DetailsFragment details = new DetailsFragment();

            // get and set the position input by user (i.e., "index")
            // which is the construction arguments for this fragment
            details.setArguments(getIntent().getExtras());

            //
            getSupportFragmentManager().beginTransaction()
                    .add(android.R.id.content,details)
                    .commit();
        }

    }


    public void addThreeForTeamA(View view) {
    }

    public void addTwoForTeamA(View view) {
    }

    public void addOneForTeamA(View view) {
    }

    public void addThreeForTeamB(View view) {
    }

    public void addTwoForTeamB(View view) {
    }

    public void addOneForTeamB(View view) {
    }
}
