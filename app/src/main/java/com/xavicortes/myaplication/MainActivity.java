package com.xavicortes.myaplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private int numero;

    private static final String TAG = "MainActivity";

    // Proves de git
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(TAG,"OnCreate");
        setContentView(R.layout.activity_main);
        numero = 0;
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "OnStart");
        numero = 1;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "OnStop");
        numero = 2;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "OnDestroy");
        numero = 3;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "OnPause");
        numero = 4;
    }
}
