import java.util.*;

public class Validate {

    public Validate() {
    }
    
    static Scanner sc = new Scanner(System.in);

    // ktra so trong khoang
    public int checkInputIntLimit(int min, int max) {
        int num;
        while (true) {
            try {                      
                num = Integer.parseInt(sc.nextLine().trim());
                if(num < min || num > max) throw new Exception();
                return num;
            } catch (Exception e) {
                System.err.print("Must be enter number [" + min + " to " + max + "]. Enter again: ");  
            }
        }
    }
    
    // kiem tra chuoi trong
    public String checkInputString() {
        String s = sc.nextLine();
        while (s.trim().isEmpty()) {
            System.err.print("String empty. Enter again: "); 
            s = sc.nextLine().trim();
        }
        return s.trim();
    }
    
    // kiem tra 
    public int checkNum() {
        int num;
        while (true) {
            try {                      
                num = Integer.parseInt(sc.nextLine().trim());
                if (num < 0) throw new Exception();
                return num;
            } catch (Exception e) {
                System.err.print("Must be enter positive number. Enter again: ");  
            }
        }
    }
    
    //kiem tra Yes No
    public boolean checkInputYN() {
        while (true) {
            String s = checkInputString();
            if (s.equalsIgnoreCase("Y")) 
                return true;
            if (s.equalsIgnoreCase("N")) 
                return false;
            System.err.print("Please input y/Y or n/N. Enter again: ");
        }
    }
                    
    // nhap input Fruit
    public Fruit inputFruit(int id){
        System.out.print("FruitName: ");
        String FruitName = checkInputString();
        System.out.print("Quanlity: ");
        int Quantity = checkNum();
        System.out.print("Price: ");
        int Price = checkNum();
        System.out.print("Origin: ");
        String Origin = checkInputString();

        Fruit f = new Fruit(id, FruitName, Quantity, Price, Origin);
        return f;
    }
    
    // check input Id ko ton tai --> ID
    public int inputId(FruitList fl){
        int ID;
        while (true) {
            System.out.print("ID: ");
            ID = checkNum();          
            if (fl.searchId(ID) != -1) 
                System.out.print("ID is exsit. Enter again ");
            else 
                return ID;
        }
    }
    
    // check input ID ton tai --> index cua ID trong list
    public int indexID(FruitList fl){
        int IdFruit;
        while(true){           
            System.out.print("ID: ");
            IdFruit = checkNum();
            int index = fl.searchId(IdFruit);
            if (index == -1)
                System.out.print("ID is not exsit. Enter again: ");                
            else return index;   
            
        }
    }
    
}
    


