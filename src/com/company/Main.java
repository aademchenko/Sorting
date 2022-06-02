package com.company;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int size = 999;
        ArrayList <Integer> list = new ArrayList<>(size);
        for (int i=0;i<size;i++) {
            list.add((int) (Math.random() * 10000));
        }
        long start =  System.currentTimeMillis();
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(list.get(j) > list.get(j + 1)){
                    int s= list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, s);
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Сортировка методом пузырька: " + (end-start));

        long start2 =  System.currentTimeMillis();
        Collections.sort(list);
        long end2 = System.currentTimeMillis();
        System.out.println("Сортировка методом Collections.sort: " +(end2-start2));
    }
}
