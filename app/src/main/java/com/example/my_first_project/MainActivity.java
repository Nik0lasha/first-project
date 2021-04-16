package com.example.my_first_project;

import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Polidrom();
        HashMap<Integer,String> keyValue = new HashMap<Integer,String>();

        keyValue.put(1, "Hello");

        keyValue.put(2, "World");

        keyValue.put(3, "Have a nice day!");

        System.out.println(keyValue.size());

        System.out.println("Цикл While:");

        Iterator iter = keyValue.entrySet().iterator();

        while(iter.hasNext()) {

            Map.Entry qurentMe = (Map.Entry) iter.next();

            System.out.println("Ключ это " + qurentMe.getKey() + " Значение это " + qurentMe.getValue());

        }

        System.out.println("Цикл For:");

        for(Map.Entry qurentMe2: keyValue.entrySet()) {

            System.out.println("Ключ это: " + qurentMe2.getKey() + " Значение это: " + qurentMe2.getValue());

        }

    }
    public class Polidrom{
        public void  main(String[] args) {
            String inputString, reversedString = "";

            Scanner scannerQ = new Scanner(System.in);

            int stringLength;

            System.out.println("Введите число или строку");

            inputString = scannerQ.nextLine();

            stringLength = inputString.length();

            for (int x = stringLength - 1; x >= 0; x--) {

                reversedString = reversedString + inputString.charAt(x);

            }

            System.out.println("перевернутое значение: " + reversedString);


            if (inputString.equals(reversedString))

                System.out.println("Введенное значение является палиндромом");

            else

                System.out.println("Введенное значение не является палиндромом");

        }

}



}
