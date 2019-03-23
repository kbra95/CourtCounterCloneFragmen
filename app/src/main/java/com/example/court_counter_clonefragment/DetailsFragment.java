package com.example.court_counter_clonefragment;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsFragment extends Fragment {
    static final String TEAM_A = "teamA";
    static final String TEAM_B = "teamB";


    FrameLayout frameLayout;
    LinearLayout detailsLayout;
    TextView scoreTextForA;
    TextView scoreTextForB;
    TextView titleText;

    @Override
    public void onResume() {
        super.onResume();
        if(getResources().getConfiguration().orientation ==
                            Configuration.ORIENTATION_LANDSCAPE){
            titleText = frameLayout.findViewById(R.id.textview_title);
        }else{
            //titleText = detailsLayout.findViewById(R.id.textview_title);
        }

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.activity_main,container,false);
        final SharedViewModel model =ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        model.getSelected().observe(this, new Observer() {
            @Override
            public void onChanged(@Nullable Object o) {
                //titleText.setText(""+o);
                Log.d("TAG" , "olsun artkk " +o);

            }
        });
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            frameLayout = new FrameLayout(getActivity());
            detailsLayout = (LinearLayout) inflater.inflate(R.layout.details_fragment,null);
            frameLayout.addView(detailsLayout);
            titleText = frameLayout.findViewById(R.id.textview_title);
            model.getSelected().observe(this, new Observer() {
                @Override
                public void onChanged(@Nullable Object o) {
                    titleText.setText(""+o);
                    Log.d("TAG" , "olsun artkk " +o);

                }
            });
            return frameLayout;

        }

        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){

        }
        //Log.d("TAG" ,getArguments().getString("index" ));

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }

    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }

    public static DetailsFragment newInstance(String index) {
        DetailsFragment f = new DetailsFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putString("index", index);
        f.setArguments(args);

        return f;
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
