package j1sp0020;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */

public class SelectionSort {

    public void work() {
        //nhap size
        int n = InputArray.checkInt("Enter number of array", 0, Integer.MAX_VALUE);
        int[] a = new int[n];
        
        Random(a);
        System.out.print("Unsorted array: ");
        display(a);
        sort(a);
        System.out.print("Sorted array: ");
        display(a);
    }
    
    private void Random(int[] a) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = CheckIn.checkInt("Enter number: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }
    
    private void sort(int[] a) {
        int min,temp;
        for (int i = 0; i < a.length-1; i++) {
            min = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] <a[min]) {
                    min = j;
                    temp = a[min];
                    a[min] = a[i];
                    a[i]= temp;
                }
            }
        }
    }
    
    private void display(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
