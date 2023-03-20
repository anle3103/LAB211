import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Validate {

    public Validate() {
    }
    
    static Scanner sc = new Scanner(System.in);

    // ktra so trong khoang
    public int inputIntLimit(int min, int max) {
        int num;
        while (true) {
            try {                      
                num = Integer.parseInt(sc.nextLine().trim());
                if(num < min || num > max) throw new Exception();
                return num;
            } catch (Exception e) {
                System.out.print("Must be enter number [" + min + " to " + max + "]. Enter again: ");  
            }
        }
    }
    
    // kiem tra chuoi trong
    public String inputString() {
        String s = sc.nextLine();
        while (s.trim().isEmpty()) {
            System.out.print("String empty. Enter again: "); 
            s = sc.nextLine().trim();
        }
        return s.trim();
    }
    
    // kiem tra ngay
    public String inputDate() {
        while (true) {
            String resultDate = inputString();
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
    public double inputTimeFrom(){ 
        while(true){ 
            try{
                double timeFrom = Double.parseDouble(sc.nextLine()); 
                if(timeFrom >= 8 && timeFrom <= 17 && timeFrom % 0.5 == 0){ 
                    return timeFrom; 
                }
                else throw new Exception();
            }catch(Exception e){ 
                System.out.print("The time from must be : 8.0, 8.5, 9.0, 9.5 ...->17.0. Enter again: ");
            }
        }
    }
    // kiem tra TimeTo
    public double inputTimeTo(double timeFrom){ 
        while(true){ 
            try{
                double timeTo = Double.parseDouble(sc.nextLine()); 
                if(timeTo > timeFrom && timeTo <= 17.5 && timeTo % 0.5 == 0){ 
                    return timeTo; 
                }
                else throw new Exception();
            }catch(Exception e){ 
                System.out.print("The time to must be : "+(timeFrom + 0.5) +", " +(timeFrom + 1) + "...->17.5. Enter again: " );
            }
        }
        
    }
    
}
    


