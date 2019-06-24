package com.iMeniac.Happen;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragment_Home extends Fragment {

    Toolbar toolbar;

    public Fragment_Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment__home, container, false);

        toolbar = v.findViewById(R.id.toolbar);
        //toolbar.setTitle("Happen");


        return v;
    }

}
