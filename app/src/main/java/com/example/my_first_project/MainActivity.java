package com.example.my_first_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            int[] numbers = { 92, -98, 2, 170, 67, 4, -81, 9, 88, 1 };
            int min, max;
            min = max = numbers[0];
            for (int i = 1; i < 10; i++) {
                if (numbers[i] < min)
                    min = numbers[i];
                if(numbers[i] > max){
                    max = numbers[i];
                }
       }
        System.out.println("min is: " + min + "; max is: " + max);
        int[] array1 = new int[6];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        array1[5] = 6;
        for (int index = 0; index < array1.length; index++) {
            if (index % 2 == 0) {
                System.out.print("\nEven index: " + array1[index]);
            }
        }

        int[] array = {1, 2, 3, 4, 5};
        System.out.print("\nЧетные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.print("\nНечетные элементы массива: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}