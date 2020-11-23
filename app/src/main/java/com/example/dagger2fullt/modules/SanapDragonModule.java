package com.example.dagger2fullt.modules;

import com.example.dagger2fullt.model.Proccessor;
import com.example.dagger2fullt.model.SnapDragon;

import dagger.Module;
import dagger.Provides;

@Module
public class SanapDragonModule {

    int clockSpeed;

    public SanapDragonModule(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    @Provides
    int getClockSpped(){
        return clockSpeed;
    }

    @Provides
    Proccessor getProccessor(SnapDragon snapDragon){
        return snapDragon;
    }


}
