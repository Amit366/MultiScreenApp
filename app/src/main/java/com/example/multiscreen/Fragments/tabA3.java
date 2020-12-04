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

        Animals aquatic= new  Animals("Peacock",R.drawable.peacock,R.raw.peacock);
        aquaticName.add(aquatic);

        aquatic = new  Animals("Pigeon",R.drawable.pigeon,R.raw.pigeons);
        aquaticName.add(aquatic);

        aquatic = new Animals("Parrot",R.drawable.parrot,R.raw.parrot);
        aquaticName.add(aquatic);

        aquatic = new Animals("Hummingbird",R.drawable.hummingbird,R.raw.hummingbird);
        aquaticName.add(aquatic);

        aquatic= new   Animals("Crow",R.drawable.crow,R.raw.crow);
        aquaticName.add(aquatic);

        aquatic= new  Animals("Owl",R.drawable.owl,R.raw.owl);
        aquaticName.add(aquatic);

        return aquaticName;
    }

    @Override
    public String toString() {
        String title ="Birds";
        return title;
    }

}