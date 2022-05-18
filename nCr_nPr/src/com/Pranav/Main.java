package com.Pranav;

import java.util.Scanner;
 class PermutationCombination {
    static int ncr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static int npr(int n, int r) {
        return fact(n) / fact(n-r);
    }

    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        PermutationCombination S=new PermutationCombination();

        System.out.println("COMBINATION IS "+ S.ncr(n, r));
        System.out.println("PERMUTATION IS "+ S.npr(n, r));
    }
}
