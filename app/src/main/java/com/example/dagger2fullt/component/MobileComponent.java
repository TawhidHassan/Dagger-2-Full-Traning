package com.example.dagger2fullt.component;

import com.example.dagger2fullt.model.Mobile;

import dagger.Component;
import dagger.Provides;

@Component
public interface MobileComponent {

    Mobile getMobile();
}
