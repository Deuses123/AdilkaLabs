package com.example.untitled;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lab5 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i<30; i++) a.add(random.nextInt(10));

        System.out.println("Массив A: " + a);

        for (Integer integer : a) {
            if (integer % 2 == 0)
                b.add(integer);
            else
                c.add(integer);
        }


        System.out.println("Массив B: " + b);
        System.out.println("Массив C: " + c);
    }
}
