package com.example.my_first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    byte y = 125;
    short a = (short) 40000;
    int b = 50000;
    long c = 1;
    float d = 3.1F;
    double e = 4.13235;
    boolean r = true;
    char t = 'o';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("example_boolean", String.valueOf(r));
        Log.i("example_byte", String.valueOf(y));
        Log.i("example_short", String.valueOf(a));
        Log.i("example_int", String.valueOf(b));
        Log.i("example_float", String.valueOf(d));
        Log.i("example_long", String.valueOf(c));
        Log.i("example_double", String.valueOf(e));
        Log.i("example_char", String.valueOf(t));
    }
}