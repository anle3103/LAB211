package j1sp0001;

import java.util.Scanner;


public class InputArray {
    public static int checkInt(String Text, int MIN, int MAX) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println(Text);
            try{
                number = Integer.parseInt(sc.nextLine());
                if (number >=MIN && number <= MAX) {
                    break; 
                }
                System.out.println("Please re-enter number: ");
            } catch (Exception ex){
                System.out.println("Number only, Please re-enter");
            }
        } while(true);
        return number;
    }
}
