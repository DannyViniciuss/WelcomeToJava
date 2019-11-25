import java.util.Scanner;

import java.util.*;
import java.io.*;
import java.lang.Math;

class Polinom {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        double previous = 0;
//        double powerResult = 0;
//
//        for (int i = 0; i < t; i++) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            int n = in.nextInt();
//
//            for (int j = 0; j < n; j++) {
//
//                if (j == 0) {
//                    previous = a + b;
//                } else {
//                    for (int k = 1; k <= j; k++) {
//                        powerResult = Math.pow(2, k) * b;
//                    }
//                }
//
//                previous = powerResult + previous;
//                System.out.print((int) previous + " ");
//                powerResult = 0;
//            }
//            System.out.println();
//        }
//        in.close();
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(s1 + " " + x);
        }
        System.out.println("================================");
    }

    public static void close(){

    }
}

