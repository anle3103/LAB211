
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DetermineDayOfWeek {
    //enter date with [dd/mm/yyyy] format 

    static String StringDate;

    public static Date EnterDate(String message) {
        Scanner sc = new Scanner(System.in);
        Date date;
        //use class SimpleDateFormat to initialize format date is dd/MM/yyyy
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //loop until return date
        while (true) {
            System.out.print(message);
            StringDate = sc.nextLine();
            try {
                //convert string to date
                date = sdf.parse(StringDate);

                return date;

            } catch (ParseException e) {
                System.err.println("Wrong format!!! format is [dd/MM/yyyy]");
            }

        }
    }

    // check date exist 
    public static boolean CheckDateExist(Date date) {
        // get day of date
        int CurrentDay = date.getDate();
        // get month of date
        // method getMonth() get month 1 as timeline
        // to get current month, add 1 to the value of month obtained from this date
        int CurrentMonth = date.getMonth() + 1;
        // get year of date
        // method getYear() get year 1900 as timeline
        // to get current year, add 1900 to the value of ỷear obtained from this date
        int CurrentYear = date.getYear() + 1900;
        String StringDateSplit[] = StringDate.split("/");
        // StringDateSplit[0]:day of StringDate 
        // StringDateSplit[1]:month of StringDate 
        // StringDateSplit[2]:year of StringDate 
        // if day,month,year of date not equal to day,month,year of StringDate(date not exist)
        if (CurrentDay != Integer.parseInt(StringDateSplit[0]) || CurrentMonth != Integer.parseInt(StringDateSplit[1]) || CurrentYear != Integer.parseInt(StringDateSplit[2])) {
            System.err.println("Date not exist");
            return false;
        }
        return true;
    }

    // determine day of week with input date
    public static void DetermineDayOfWeek(Date date, boolean CheckDateExist) {
        // if date exist 
        if (CheckDateExist) {
            // get day in week
            int day = date.getDay();
            switch (day) {
                case 0:
                    System.out.println("Your day is Sunday");
                    break;
                case 1:
                    System.out.println("Your day is Monday");
                    break;
                case 2:
                    System.out.println("Your day is Tuesday");
                    break;
                case 3:
                    System.out.println("Your day is Wednesday");
                    break;
                case 4:
                    System.out.println("Your day is Thursday");
                    break;
                case 5:
                    System.out.println("Your day is Friday");
                    break;
                case 6:
                    System.out.println("Your day is Saturday");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        boolean CheckDateExist;
        Date date;
        // loop until enter date true
        do {
            // enter date with [dd/mm/yyyy] format 
            date = EnterDate("Please enter date with format [dd/mm/yyyy]: ");
            // check date exist
            CheckDateExist = CheckDateExist(date);
        } while (!CheckDateExist);
        // determine day of week with input date
        DetermineDayOfWeek(date, CheckDateExist);

    }
}
