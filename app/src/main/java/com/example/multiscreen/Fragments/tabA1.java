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


public class tabA1 extends Fragment {
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_tab_a1,container,false);
            GridView gv = rootView.findViewById(R.id.animal_tab1);
            CustomAdapter1 adapter = new CustomAdapter1(this.getActivity(),getAnimalsTab1());

            gv.setAdapter(adapter);
            return rootView;
        }

        private ArrayList<Animals> getAnimalsTab1(){

            ArrayList<Animals> animalName = new ArrayList<>();

            Animals animal = new  Animals("Cow",R.drawable.cow2,R.raw.cow);
            animalName.add(animal);

            animal = new  Animals("Dog",R.drawable.dog,R.raw.dog);
            animalName.add(animal);

            animal = new  Animals("Elephant",R.drawable.elephant,R.raw.elephant);
            animalName.add(animal);

            animal = new  Animals("Rabbit",R.drawable.rabbit,R.raw.dog);
            animalName.add(animal);

            animal = new  Animals("Cat",R.drawable.cat2jpg,R.raw.dog);
            animalName.add(animal);

            animal = new  Animals("Buffalo",R.drawable.buffalo2,R.raw.dog);
            animalName.add(animal);

            animal = new  Animals("Horse",R.drawable.horse,R.raw.horse);
            animalName.add(animal);

            animal = new  Animals("Giraffe",R.drawable.giraffejpg,R.raw.dog);
            animalName.add(animal);

            animal = new  Animals("Lion",R.drawable.lion,R.raw.lion4);
            animalName.add(animal);


            return animalName;
        }

        @Override
        public String toString() {
            String title ="Animals";
            return title;
        }
    }
