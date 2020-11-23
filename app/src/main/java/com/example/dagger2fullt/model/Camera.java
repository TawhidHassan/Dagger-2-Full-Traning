package com.example.dagger2fullt.model;

import android.util.Log;

public class Camera {

    //we dont own this class So wer cantr edit or change and not use @Inject

    int megaPixel;

    public Camera(int megaPixel) {
        this.megaPixel=megaPixel;
        Log.i("MyMobile","Camera: megapixel was: "+megaPixel);
    }
}
