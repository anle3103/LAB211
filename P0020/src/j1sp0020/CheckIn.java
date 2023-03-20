/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0020;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CheckIn {

    public static int checkInt(String Text, int MIN, int MAX) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print(Text);
            try {
                number = Integer.parseInt(sc.nextLine());
                if (number >= MIN && number <= MAX) {
                    return number;
                }
                System.out.println("Please re-enter number: ");
                continue;
            } catch (Exception ex) {
                System.out.println("Number only, Please re-enter ");
            }
        } while (true);
    }
}
