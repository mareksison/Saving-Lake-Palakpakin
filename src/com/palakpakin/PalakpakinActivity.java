package com.palakpakin;

import android.app.Activity;
import android.os.Bundle;

public class PalakpakinActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PalakpakinSurface(this));
    }
}