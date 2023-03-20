/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h206;

import java.util.Scanner;

public class H206 {

    public static int input() {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Must be integer");
            }
        }
        return n;
    }

    public static void printSquare(int min, int max) {
        if (min > max) {
            System.out.println("Min must <= max");
            return;
        }
        int dong = max - min + 1;
        int cot1 = dong;
        int cot2 = 0;
        int count = min;
        int a,b;
        int i,j,k;
        //So lan lap bang so dong
        for (i = 1; i <= dong; i++) {
            a = count;
            b = min;
        //So lan lap bang so cot 1
            for (j = 1; j <= cot1; j++) {
                System.out.print("" + a);
                a++;
            }
        //  So lan lap bang so cot 2
            for (k = 0; k <= cot2; k++) {
                System.out.print("" + b);
                b++;
            }
            cot1--;
            cot2++;
            count++;
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter min : ");
        int a = input();
        System.out.println("Enter max : ");
        int b = input();
        System.out.println("");
        printSquare(a,b);
    }

}
