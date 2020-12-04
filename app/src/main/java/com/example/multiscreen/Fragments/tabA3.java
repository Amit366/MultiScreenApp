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


public class tabA3 extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab_a3, container, false);
        GridView gv = rootView.findViewById(R.id.animal_tab3);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(), getAquaticTab3());
        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getAquaticTab3(){

        ArrayList<Model>aquaticName = new ArrayList<>();

        Model aquatic= new Model("Peacock",R.drawable.peacock,R.raw.peacock);
        aquaticName.add(aquatic);

        aquatic = new Model("Pigeon",R.drawable.pigeon,R.raw.pigeons);
        aquaticName.add(aquatic);

        aquatic = new Model("Parrot",R.drawable.parrot,R.raw.parrot);
        aquaticName.add(aquatic);

        aquatic = new Model("Hummingbird",R.drawable.hummingbird,R.raw.hummingbird);
        aquaticName.add(aquatic);

        aquatic= new Model("Crow",R.drawable.crow,R.raw.crow);
        aquaticName.add(aquatic);

        aquatic= new Model("Owl",R.drawable.owl,R.raw.owl);
        aquaticName.add(aquatic);

        return aquaticName;
    }

    @Override
    public String toString() {
        String title ="Birds";
        return title;
    }

}