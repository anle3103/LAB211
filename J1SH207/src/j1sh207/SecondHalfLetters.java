/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sh207;

/**
 *
 * @author HP
 */
public class SecondHalfLetters {

    public int secondHalfLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 78) && (s.charAt(i) <= 90) || (s.charAt(i) >= 110 && (s.charAt(i) <= 122))) {
                count++;
            }

        }
        return count;
    }
}
