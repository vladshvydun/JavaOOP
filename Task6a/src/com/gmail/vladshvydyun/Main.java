package com.gmail.vladshvydyun;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        myList();
    }

    public static void myList() {
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println("List created");

        Random rn = new Random();
        for (int i = 0; i < 10; i++) {
            myList.add(rn.nextInt(10));
        }
        System.out.println("Added elements");
        System.out.println(myList);

        myList.remove(0);
        myList.remove(0);
        myList.remove(myList.size() - 1);

        System.out.println("Deleted first two elements and last: ");
        System.out.println(myList);
    }

}
