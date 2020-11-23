package com.example.dagger2fullt.component;

import com.example.dagger2fullt.MainActivity;
import com.example.dagger2fullt.model.Mobile;
import com.example.dagger2fullt.modules.BatteryModule;
import com.example.dagger2fullt.modules.MediaTekModule;
import com.example.dagger2fullt.modules.SanapDragonModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Provides;

@Component(modules = {BatteryModule.class, MediaTekModule.class})
public interface MobileComponent {

    Mobile getMobile();


    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder setClockSpeed(@Named("clockSpeed") int clockSpeed);

        @BindsInstance
        Builder setCore(@Named("core") int core);

        MobileComponent build();
    }
}
