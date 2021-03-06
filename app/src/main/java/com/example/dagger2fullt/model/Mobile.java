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



    //2nd field injection
    private Battery battery;
    private  Camera camera;
    private Proccessor proccessor;

    @Inject  //1st constract injection
    public Mobile(Battery battery,Proccessor proccessor,Camera camera) {
        this.battery = battery;
        this.proccessor = proccessor;
        this.camera=camera;
        Log.i("MyMobilexx","Mobile"+battery.toString()+" "+this.toString()+" "+proccessor.toString());
    }

    public void run(){
        proccessor.start();
        Log.i("MyMobile","Mobile Run");
    }


}
