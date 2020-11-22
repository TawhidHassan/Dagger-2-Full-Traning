package com.example.dagger2fullt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.dagger2fullt.component.DaggerMobileComponent;
import com.example.dagger2fullt.component.MobileComponent;
import com.example.dagger2fullt.model.Battery;
import com.example.dagger2fullt.model.Mobile;
import com.example.dagger2fullt.model.Proccessor;
import com.example.dagger2fullt.modules.SanapDragonModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    public Mobile mobile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Battery battery=new Battery();
//        Proccessor proccessor=new Proccessor();
//        Mobile mobile=new Mobile(battery,proccessor);


        MobileComponent component= DaggerMobileComponent.builder()
                .sanapDragonModule(new SanapDragonModule(3))
                .build();
//        Mobile mobile=component.getMobile();
        component.inject(this);
        mobile.run();

    }
}