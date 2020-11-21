package com.example.dagger2fullt.modules;

import com.example.dagger2fullt.model.MediaTek;
import com.example.dagger2fullt.model.Proccessor;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MediaTekModule {

    @Binds
    abstract Proccessor getProccessor(MediaTek mediaTek);
}
