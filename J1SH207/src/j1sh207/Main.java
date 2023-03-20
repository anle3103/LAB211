/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh207;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) {
        SecondHalfLetters sh;
        sh = new SecondHalfLetters();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        System.out.println(sh.secondHalfLetters(s));
    }

}
