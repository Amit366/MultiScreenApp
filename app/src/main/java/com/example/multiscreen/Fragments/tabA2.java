package com.example.multiscreen.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.multiscreen.R;
import com.example.multiscreen.mData.Model;
import com.example.multiscreen.mGridView.CustomAdapter;

import java.util.ArrayList;

public class tabA2 extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_a2,container,false);
        GridView gv = rootView.findViewById(R.id.animal_tab2);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getBirdsTab2());
        gv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<Model> getBirdsTab2(){

        ArrayList<Model> birds = new ArrayList<>();

        Model bird = new Model("Tiger",R.drawable.tiger,R.raw.tiger);
        birds.add(bird);

        bird = new Model("Deer",R.drawable.deer,R.raw.deer);
        birds.add(bird);


        bird = new Model("Lion",R.drawable.lion,R.raw.lion4);
        birds.add(bird);


        bird = new Model("Zebra",R.drawable.zebra,R.raw.zebra);
        birds.add(bird);


        bird = new Model("Bear",R.drawable.beer,R.raw.bear);
        birds.add(bird);


        bird = new Model("Rhinoceros",R.drawable.rhinoceros,R.raw.rhinoceros);
        birds.add(bird);



        return birds;
    }

    @Override
    public String toString() {
        String title ="Wild Model";
        return title;
    }

}