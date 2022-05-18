package com.Pranav;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer>list= new ArrayList<>(10);
        Scanner s=new Scanner(System.in);
//        list.add(34);
//        list.add(56);
//        list.add(36);
//        list.add(37);
//        list.add(23);
//        list.add(77);
//        System.out.println(list);
//        System.out.println(list.contains(56));
//        System.out.println(list.contains(456));
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());

        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.print(list);



    }
}
