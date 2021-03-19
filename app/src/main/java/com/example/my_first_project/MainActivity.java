package com.example.my_first_project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvRes;
    private EditText eText;
    private EditText eText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvRes = findViewById(R.id.tvresult);
        eText = findViewById(R.id.editText);
        eText2 = findViewById(R.id.editText2);
    }

    {
        int a = 10;
        int b =20;
        int c =0;
        System.out.println("a == b=" +(a == b));
        System.out.println("a != b =" +(a != b));
        System.out.println("a > b =" +(a > b));
        System.out.println("a < b =" +(a < b));
        System.out.println("a >= b =" +(a >= b));
        System.out.println("a <= b =" +(a <= b));




        c = a + b;
        System.out.println("c = a + b  =" +c);

        c += a;
        System.out.println("c += a =" +c);

        c -= a;
        System.out.println("c -= a =" +c);

        c *= a;
        System.out.println("c *= a =" +c);

        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a" +c);


        int p = 5;
        int w = 10;
        int e = 25;
        System.out.println("p + w=" +(p + w));
        System.out.println("p - w =" +(p - w));
        System.out.println("p * w =" +(p * w));
        System.out.println("p / w =" +(p / w));
        System.out.println("w % p =" +(w % p));
        System.out.println("e % p =" +(e % p));

        boolean v = true;
        boolean t = false;
        boolean q = v | t;
        boolean d = v & t;

        System.out.println(" v = " +v);
        System.out.println(" t = " +b);
        System.out.println(" v|t = " +q);
        System.out.println(" v&t = " +d);
    }
    public void onClickResult(View view)
    {}

}
