package h202;

import java.util.Scanner;

public class H202 {

    public static Scanner sc = new Scanner(System.in);

    public static void printfReverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse().toString();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String input = sc.nextLine();
        printfReverse(input);
    }
}
