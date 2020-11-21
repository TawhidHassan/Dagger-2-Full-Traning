package com.example.dagger2fullt.model;

import android.util.Log;

import javax.inject.Inject;

public class MediaTek implements Proccessor{

    @Inject
    public MediaTek() {
        Log.i("MyMobile"," Mediatek ");
    }

    @Override
    public void start() {
        Log.i("MyMobile","Start: Mediatek start");
    }
}
