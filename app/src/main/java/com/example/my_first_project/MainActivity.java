package com.example.my_first_project;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



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







