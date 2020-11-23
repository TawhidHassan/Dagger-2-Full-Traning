package com.example.dagger2fullt.modules;

import com.example.dagger2fullt.model.Camera;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class CameraModule {

    @Provides
   static Camera getCamera(@Named("megaPixel") int megaPixel){
        return  new Camera(megaPixel);
    }
}
