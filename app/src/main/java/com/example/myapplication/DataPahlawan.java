package com.example.myapplication;

import java.util.ArrayList;

public class DataPahlawan {

    private static String[] title = {
            "Portofolio A ",
            "Portofolio B ",
            "Portofolio C ",
            "Portofolio D ",
            "Portofolio E ",
            "Portofolio F ",
            "Portofolio G ",
            "Portofolio H ",
            "Portofolio I ",
            "Portofolio J ",
    };

    private static String[] keterangan = {
            "Portofolio A ",
            "Portofolio B ",
            "Portofolio C ",
            "Portofolio D ",
            "Portofolio E ",
            "Portofolio F ",
            "Portofolio G ",
            "Portofolio H ",
            "Portofolio I ",
            "Portofolio J ",
    };

    private static String [] gambarUrl ={
      "http://image.com/asdad/dada"
    };
    private static int[] gambar = {
            R.mipmap.ic_launcher,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,

    };

    // set data dari variabel di atas
    static ArrayList<ModelPahlawan> getListData() {
        //objek list
        ArrayList<ModelPahlawan> list = new ArrayList<>();
        //looping for do while do
        // if condition if when
        for (int position = 0; position < title.length; position++) {

            ModelPahlawan modelPortofolio = new ModelPahlawan();
            modelPortofolio.setTitle(title[position]);
            modelPortofolio.setKeterangan(keterangan[position]);
            modelPortofolio.setImgPahlawan(gambar[position]);

            list.add(modelPortofolio);
        }
        return list;

    }

}
