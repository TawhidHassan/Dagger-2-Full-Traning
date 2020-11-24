package com.example.dagger2fullt.component;

import com.example.dagger2fullt.MainActivity;
import com.example.dagger2fullt.model.Mobile;
import com.example.dagger2fullt.modules.BatteryModule;
import com.example.dagger2fullt.modules.CameraModule;
import com.example.dagger2fullt.modules.MediaTekModule;
import com.example.dagger2fullt.modules.SanapDragonModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Provides;

@Singleton
@Component(modules = {BatteryModule.class, MediaTekModule.class, CameraModule.class})
public interface MobileComponent {

    Mobile getMobile();


    void inject(MainActivity activity);

//    @Component.Builder
//    interface Builder{
//        @BindsInstance
//        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);
//
//        @BindsInstance
//        Builder setCore(@Named("core") int core);
//
//        MobileComponent build();
//    }

    @Component.Factory
    interface Factory{
        MobileComponent create(@BindsInstance @Named("clockSpeed") int clockSpeed,
                               @BindsInstance @Named("core") int core,
                               @BindsInstance @Named("megaPixel") int megaPixel
            );
    }
}
