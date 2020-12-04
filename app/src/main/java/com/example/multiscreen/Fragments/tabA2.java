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
import com.example.multiscreen.mData.Animals;
import com.example.multiscreen.mGridView.CustomAdapter1;

import java.util.ArrayList;

public class tabA2 extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_a2,container,false);
        GridView gv = rootView.findViewById(R.id.animal_tab2);
        CustomAdapter1 adapter = new CustomAdapter1(this.getActivity(),getBirdsTab2());
        gv.setAdapter(adapter);
        return rootView;
    }
    private ArrayList<Animals> getBirdsTab2(){

        ArrayList<Animals> birdName = new ArrayList<>();

        Animals bird = new  Animals("Tiger",R.drawable.tiger,R.raw.tiger);
        birdName.add(bird);

        bird = new  Animals("Deer",R.drawable.deer,R.raw.deer);
        birdName.add(bird);


        bird = new  Animals("Lion",R.drawable.lion,R.raw.lion4);
        birdName.add(bird);


        bird = new Animals("Zebra",R.drawable.zebra,R.raw.zebra);
        birdName.add(bird);


        bird = new  Animals("Bear",R.drawable.beer,R.raw.bear);
        birdName.add(bird);


        bird = new  Animals("Rhinoceros",R.drawable.rhinoceros,R.raw.rhinoceros);
        birdName.add(bird);



        return birdName;
    }

    @Override
    public String toString() {
        String title ="Wild Animals";
        return title;
    }

}