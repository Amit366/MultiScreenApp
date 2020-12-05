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

public class NumFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_a, container, false);
        GridView gv = rootView.findViewById(R.id.animal_tab1);
        CustomAdapter adapter = new CustomAdapter(this.getActivity(),getNumTab1());

        gv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Model> getNumTab1(){

        ArrayList<Model> alpha = new ArrayList<>();


        Model alphabets = new Model("1", R.drawable.num1, R.raw.num1);
        alpha.add(alphabets);

        alphabets= new Model("2",R.drawable.num2,R.raw.num2);
        alpha.add(alphabets);

        alphabets= new Model("3",R.drawable.num3,R.raw.num3);
        alpha.add(alphabets);

        alphabets = new Model("4",R.drawable.num4,R.raw.num4);
        alpha.add(alphabets);

        alphabets = new Model("5",R.drawable.num5,R.raw.num5);
        alpha.add(alphabets);

        alphabets = new Model("6",R.drawable.num6,R.raw.num6);
        alpha.add(alphabets);

        alphabets= new Model("7",R.drawable.num7,R.raw.num7);
        alpha.add(alphabets);

        alphabets = new Model("8",R.drawable.num8,R.raw.num8);
        alpha.add(alphabets);

        alphabets= new Model("9",R.drawable.num9,R.raw.num9);
        alpha.add(alphabets);

        alphabets= new Model("10",R.drawable.num10,R.raw.num10);
        alpha.add(alphabets);




        return alpha;
    }

    @Override
    public String toString() {
        String title = "Numbers";
        return title;
    }
}
