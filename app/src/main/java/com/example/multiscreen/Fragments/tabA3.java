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


public class tabA3 extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_a3, container, false);
        GridView gv = rootView.findViewById(R.id.animal_tab3);
        CustomAdapter1 adapter = new CustomAdapter1(this.getActivity(), getAquaticTab3());
        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Animals> getAquaticTab3(){

        ArrayList<Animals>aquaticName = new ArrayList<>();

        Animals aquatic= new   Animals("Cow",R.drawable.cow2,R.raw.dog);
        aquaticName.add(aquatic);

        aquatic= new  Animals("Elephant",R.drawable.elephant,R.raw.elephant);
        aquaticName.add(aquatic);

        aquatic = new  Animals("Rabbit",R.drawable.rabbit,R.raw.dog);
        aquaticName.add(aquatic);

        aquatic = new  Animals("Cat",R.drawable.cat2jpg,R.raw.dog);
        aquaticName.add(aquatic);

        aquatic = new  Animals("Buffalo",R.drawable.buffalo2,R.raw.dog);
        aquaticName.add(aquatic);

        aquatic= new  Animals("Elephant",R.drawable.elephant,R.raw.dog);
        aquaticName.add(aquatic);

        aquatic = new  Animals("Rabbit",R.drawable.rabbit,R.raw.dog);
        aquaticName.add(aquatic);

        aquatic = new Animals("Cat",R.drawable.cat2jpg,R.raw.dog);
        aquaticName.add(aquatic);


        return aquaticName;
    }

    @Override
    public String toString() {
        String title ="Others";
        return title;
    }

}