package com.example.my_first_project;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.LinkedList;
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

        compare2Lists();
        WorkSet();
    }
    private void WorkSet() {
        Set<String> set = new HashSet<>();
        set.add("15");
        for (String s : set) {
            System.out.println(s);
        }
    }
    public void compare2Lists() {
        LinkedList<Integer> linkedList = new LinkedList<>();


        for (int i = 0; i < 5; i++) {
            linkedList.add(i);
            System.out.println(linkedList);
            linkedList.add(15);
            linkedList.removeAll(Collections.singleton(15));
            System.out.println(linkedList);
        }
        }
    }
       compare2Lists();
        Log.i("example_boolean", String.valueOf(r));
        Log.i("example_byte", String.valueOf(y));
        Log.i("example_short", String.valueOf(a));
        Log.i("example_int", String.valueOf(b));
        Log.i("example_float", String.valueOf(d));
        Log.i("example_long", String.valueOf(c));
        Log.i("example_double", String.valueOf(e));
        Log.i("example_char", String.valueOf(t));
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

