import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateUpdate {
    static Scanner sc = new Scanner(System.in);
    Validate valid = new Validate();
    // ktra so trong khoang
    public String inputIntLimit(String old, int min, int max) {
        int num;
        while (true) {
            try {           
                String s = valid.inputString();
                if(s.equalsIgnoreCase("nope"))
                    return old;
                else
                {
                    num = Integer.parseInt(s);
                    if(num < min || num > max) throw new Exception();
                    return num+"";
                }                   
            } catch (Exception e) {
                System.out.print("Must be enter number [" + min + " to " + max + "]. Enter again: ");  
            }
        }
    }
    // update String
    public String inputString(String old) {
        String s = sc.nextLine();
        while (true) {
            if(s.equalsIgnoreCase("nope"))
                return old;
            else if(s.trim().isEmpty()){
                System.out.print("String empty. Enter again: "); 
                s = sc.nextLine().trim();
            }  
            else return s.trim();
        }
    }
    // kiem tra ngay
    public String inputDate(String old) {
        while (true) {
            String resultDate = inputString(old);
            SimpleDateFormat tempDate = new SimpleDateFormat("dd-MM-yyyy");
            tempDate.setLenient(false);
            try {
                Date date = tempDate.parse(resultDate);
                return resultDate;
            } catch (Exception e) {
                System.out.print("Invalid date. Please enter again: ");
            }
        }
    }

    // kiem tra TimeFrom
    public double inputTimeFrom(double old){ 
        
        while(true){ 
            try{
                String s = valid.inputString();
                if(s.equalsIgnoreCase("nope"))
                    return old;
                else {
                    double timeFrom = Double.parseDouble(s);
                    if (timeFrom >= 8 && timeFrom <= 17 && timeFrom % 0.5 == 0) {
                        return timeFrom;
                    } else {
                        throw new Exception();
                    }
                }
            } catch (Exception e){ 
                System.out.print("The time from must be : 8.0, 8.5, 9.0, 9.5 ...->17.0. Enter again: ");
            }
        }
    }
    // kiem tra TimeTo
    public double inputTimeTo(double timeFrom, double old){ 
        double timeTo;
        if (old < timeFrom)   
        {
            timeTo = valid.inputTimeTo(timeFrom);
        }
        else{
            while(true){ 
                try{
                    String s = valid.inputString();
                    if (s.equalsIgnoreCase("nope")) {
                        return old;
                    } else {
                        timeTo = Double.parseDouble(s);
                        if (timeTo > timeFrom && timeTo <= 17.5 && timeTo % 0.5 == 0) {
                            return timeTo;
                        } else {
                            throw new Exception();
                        }
                    }
                }catch(Exception e){ 
                    System.out.print("The time to must be : "+(timeFrom + 0.5) +", " +(timeFrom + 1) + "...->17.5. Enter again: " );
                }
            }             
        }
        return timeTo;
        
    }
    
    // kiem tra nope
    public boolean checkNope(String s){
        while (true) {
            if (s.equalsIgnoreCase("nope")) 
                return true;
            return false;
        }
    }
}
