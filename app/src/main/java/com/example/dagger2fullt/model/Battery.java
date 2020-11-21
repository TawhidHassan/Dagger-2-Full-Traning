package com.example.dagger2fullt.model;

import android.util.Log;

import javax.inject.Inject;

public class Battery {

   //we dont own this class So wer cantr edit or change and not use @Inject

    private Cobalt cobalt;
    private Lithium lithium;

    public Battery(Cobalt cobalt, Lithium lithium) {
        this.cobalt = cobalt;
        this.lithium = lithium;
        Log.i("MyMobile","Battery");
    }

}
