package com.example.dagger2fullt.model;

import android.util.Log;

import javax.inject.Inject;

public class SnapDragon implements Proccessor{

    @Inject
    public SnapDragon() {
        Log.i("MyMobile","Snapdragon");
    }

    @Override
    public void start() {
        Log.i("MyMobile","Start: SnapDragon Start");
    }
}