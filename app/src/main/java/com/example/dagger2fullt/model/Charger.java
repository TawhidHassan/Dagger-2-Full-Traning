package com.example.dagger2fullt.model;

import android.util.Log;

import javax.inject.Inject;

public class Charger {

    @Inject
    public Charger() {
    }

    void setCharger(Mobile mobile){
        Log.i("MyMobile","set charger");
    }
}
