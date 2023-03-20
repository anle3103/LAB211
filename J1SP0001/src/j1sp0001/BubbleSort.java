package j1sp0001;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author HP
 */

public class BubbleSort {

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
        Random rd = new Random();
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(a.length);
        }
    }
    
    private void sort(int[] a) {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    
    private void display(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
