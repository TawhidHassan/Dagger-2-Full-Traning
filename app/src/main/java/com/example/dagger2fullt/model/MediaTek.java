package com.example.dagger2fullt.model;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MediaTek implements Proccessor{

    int clockSpeed;
    int core;

    @Inject
    public MediaTek(@Named("clockSpeed") int clockSpeed,@Named("core") int core) {
        this.clockSpeed=clockSpeed;
        this.core=core;
        Log.i("MyMobile"," Mediatek ");
    }

    @Override
    public void start() {
        Log.i("MyMobile","Start: Mediatek start: "+clockSpeed+" Core: "+core);
    }
}
