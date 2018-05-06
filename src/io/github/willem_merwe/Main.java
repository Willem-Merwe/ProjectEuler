package io.github.willem_merwe;

import java.util.*;
import java.math.*;


public class Main {

    public static void main(String[] args) {
        numberOne();
    }

    //https://www.hackerrank.com/contests/projecteuler/challenges/euler001
    public static void numberOne() {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long userInput, temp1, temp2, temp3;
            BigInteger total = BigInteger.valueOf(0);

            userInput = (sc.nextLong() - 1);
            temp1 = Math.floorDiv(userInput, 3);
            temp2 = Math.floorDiv(userInput, 5);
            temp3 = Math.floorDiv(userInput, 15);
            total = total.add(BigInteger.valueOf(3 * (temp1 * (temp1 + 1) / 2) + 5 * (temp2 * (temp2 + 1) / 2) - 15 * (temp3 * (temp3 + 1) / 2)));
            System.out.println(total.toString());
        }
    }

    //https://www.hackerrank.com/contests/projecteuler/challenges/euler002
    public static void numberTwo(){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
        }

    }
}
