import java.time.LocalDate;
import java.util.Scanner;

public class Views {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        Controllers ctl = new Controllers();
        LocalDate date1 = ctl.getDate("Please enter the first date: ");
        LocalDate date2 = ctl.getDate("Please enter the second date: ");
        ctl.compare(date1, date2);
    }
}