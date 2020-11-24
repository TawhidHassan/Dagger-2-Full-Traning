package com.example.dagger2fullt.modules;

import com.example.dagger2fullt.model.Battery;
import com.example.dagger2fullt.model.Cobalt;
import com.example.dagger2fullt.model.Lithium;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteryModule {

    @Provides
   static Cobalt getCobalt(){
        return new Cobalt();
    }

    @Provides
   static Lithium getLitium(){
        Lithium lithium=new Lithium();
        lithium.done();
        return  lithium;
    }

    @Singleton
    @Provides
   static Battery getBattery(Lithium lithium,Cobalt cobalt){
        return new Battery(cobalt,lithium);
    }


}
