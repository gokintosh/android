package com.gokul.fragmentapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class fragment2 extends ListFragment {

    String[] AndroidApps=new String[]{
            "Gokul",
            "Rahul",
            "Mohan",
            "Midhtun",
            "Devdatt"
    };

    String[] Descriptions=new String[]{
            "Gokul is a good boy",
            "Rahul is very fat",
            "Mohan is a genius",
            "Midhun is a Pro",
            "devdutt is a nice guy"
    };



    public fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_fragment2,container,false);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,AndroidApps);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        fragment1 txt=(fragment1)
                getFragmentManager().findFragmentById(R.id.fragment1);
        txt.change(AndroidApps[position],"Version : "+Descriptions[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}