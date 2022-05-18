package com.Pranav;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArraylist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //declaration
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //initialisation
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(s.nextInt());// to get lists at 0,1,2nd index and add elements at particular index of multidimensional arraylist
            }
        }
        System.out.println(list);
    }



}
