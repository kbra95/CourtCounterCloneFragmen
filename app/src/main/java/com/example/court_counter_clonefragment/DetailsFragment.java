package com.example.court_counter_clonefragment;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsFragment extends Fragment {
    static final String TEAM_A = "teamA";
    static final String TEAM_B = "teamB";

    TextView scoreTextForA;
    TextView scoreTextForB;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main,container,false);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            FrameLayout frameLayout = new FrameLayout(getActivity());
            LinearLayout detailsLayout = (LinearLayout) inflater.inflate(R.layout.details_fragment,null);

            frameLayout.addView(detailsLayout);
            return frameLayout;

        }

        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }

    public static DetailsFragment newInstance(int index) {
        DetailsFragment f = new DetailsFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);

        return f;
    }
}
