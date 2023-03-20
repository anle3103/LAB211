import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat sdfday = new SimpleDateFormat("EEEE");
        sdf.setLenient(false);
        Date date;
        while(true){
            try{
                System.out.print("Please enter date with format [dd/MM/YYYY]: ");
                date  = sdf.parse(sc.nextLine());
                break;
            } catch(Exception e) {
                System.out.println("Invalid date, please input again");
            }
        }
        System.out.println("Your day is : "+ sdfday.format(date));
    }
}
