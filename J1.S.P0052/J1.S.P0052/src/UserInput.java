
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class UserInput {

    ArrayList<EastAsiaCountries> alist = new ArrayList<>();

    // Check Int
    public int getInt(int min, int max) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                // nhap vao so i
                i = Integer.parseInt(sc.nextLine());
                // Kiem tra dieu kien, neu dung thi break
                // neu sai thi bat nguoi dung nhap lai
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
                //Bat number exception cho den khi nguoi dung nhap dung thi thoi
            } catch (Exception e) {
                System.out.println("Please enter number!");
            }
        } while (true);
        return i;
    }

    // Check DOuble
    public double getDouble(double min, double max) {
        double i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                i = Double.parseDouble(sc.nextLine());
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
            } catch (Exception e) {
                System.out.println("Please enter number!");
            }
        } while (true);
        return i;
    }

    // Check Float
    public float getFloat(double min, double max) {
        double i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                i = Double.parseDouble(sc.nextLine());
                if (i >= min && i <= max) {
                    break;
                } else {
                    System.out.println("Please enter number in range of " + min + " - " + max);
                }
            } catch (Exception e) {
                System.out.println("Please enter number!");
            }
        } while (true);
        // ep kieu double tra ve float
        return (float) i;
    }

    // Check String
    public String getString() {
        String str = "";
        Scanner sc = new Scanner(System.in);
        do {
            try {
                //kiem tra String rong hay khong
                str = sc.nextLine();
                if (!str.isEmpty()) {
                    break;
                } else {
                    System.out.println("Please enter String");
                }
            } catch (Exception e) {
                System.out.println("Please enter String");
            }
        } while (true);
        return str;
    }

}
