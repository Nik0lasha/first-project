package com.example.my_first_project;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.LinkedList;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compare2Lists();
    }
        public void compare2Lists(){

            ArrayList<Double> arrayList = new ArrayList<>();
            LinkedList<Double> linkedList = new LinkedList<>();
            final int N = 1000000;
            final int M = 1000;
            for (int i = 0; i < N; i++) {
                arrayList.add(Math.random());
                linkedList.add(Math.random());
            }

            long startTime = System.currentTimeMillis();
            for (int i = 0; i < M; i++) {
                arrayList.get((int) (Math.random() * (N - 1)));
            }
            Log.d("Result", String.valueOf(System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            for (int i = 0; i < M; i++) {
                linkedList.get((int) (Math.random() * (N - 1)));
            }
            Log.d("Result",String.valueOf(System.currentTimeMillis() - startTime));
        }
    }
