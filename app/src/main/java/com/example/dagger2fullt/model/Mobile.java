package com.example.dagger2fullt.model;

import android.util.Log;

import javax.inject.Inject;

public class Mobile {

//    public Battery battery;
//    private Proccessor proccessor;
//
//    @Inject
//    public Mobile(Battery battery, Proccessor proccessor) {
//        this.battery = battery;
//        this.proccessor = proccessor;
//        Log.i("MyMobile","Mobile");
//    }



    @Inject //2nd field injection
    public Battery battery;

    private Proccessor proccessor;

    @Inject  //1st constract injection
    public Mobile(Proccessor proccessor) {
        this.proccessor = proccessor;
        Log.i("MyMobile","Mobile");
    }

    public void run(){
        Log.i("MyMobile","Run");
    }

    @Inject  //3rd method injection
    public void connectCharger(Charger charger){
        charger.setCharger(this);
    }
}
