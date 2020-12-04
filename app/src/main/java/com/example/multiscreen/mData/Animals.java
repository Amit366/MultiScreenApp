package com.example.multiscreen.mData;



public class Animals {

    String name;
    int image;
    int audio;

    public Animals(String name, int image, int audio){
         this.name = name;
         this.image = image;
         this.audio = audio;
    }

     public String getName()
     {
        return name;
     }

     public int getImage()
     {
        return image;
     }

    public int getAudio()
    {
        return audio;
    }


}
