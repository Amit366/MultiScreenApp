package com.example.multiscreen.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.multiscreen.R;
import com.example.multiscreen.mData.Model;
import com.example.multiscreen.mGridView.CustomAdapter;

import java.util.ArrayList;

public class AFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        GridView gv = rootView.findViewById(R.id.animal_tab1);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getAlphaTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getAlphaTab1(){

        ArrayList<Model> alpha = new ArrayList<>();


        Model alphabets = new Model("A", R.drawable.a, R.raw.a);
        alpha.add(alphabets);

        alphabets= new Model("B",R.drawable.b,R.raw.b);
        alpha.add(alphabets);

        alphabets= new Model("C",R.drawable.c,R.raw.c);
        alpha.add(alphabets);

        alphabets = new Model("D",R.drawable.d,R.raw.d);
        alpha.add(alphabets);

        alphabets = new Model("E",R.drawable.e,R.raw.e);
        alpha.add(alphabets);

        alphabets = new Model("F",R.drawable.f,R.raw.f);
        alpha.add(alphabets);

        alphabets= new Model("G",R.drawable.g,R.raw.g);
        alpha.add(alphabets);

        alphabets = new Model("H",R.drawable.h,R.raw.h);
        alpha.add(alphabets);

        alphabets= new Model("I",R.drawable.i,R.raw.i);
        alpha.add(alphabets);

        alphabets= new Model("J",R.drawable.j,R.raw.j);
        alpha.add(alphabets);




        return alpha;
    }

    @Override
    public String toString() {
        String title = "Numbers";
        return title;
    }

}


