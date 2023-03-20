
import java.util.*;

public class FruitShop {
    FruitList fl = new FruitList();
    Validate valid = new Validate();
    
    public int menu() { 
        System.out.println("======= Fruit Program =======");
        System.out.println("\t1. Add Fruit");
        System.out.println("\t2. Update Fruit");
        System.out.println("\t3. View Order");
        System.out.println("\t4. Shopping (for buyer)");
        System.out.println("\t5. Exit");
        System.out.print("Enter your choice: ");
        int choice =  valid.checkInputIntLimit(1, 5);
        return choice;
    }
    
    public void test() {
        fl.getListFruit().add( new Fruit(1," Coconut",3, 5, "Vietnam"));
        fl.getListFruit().add( new Fruit(2," Apple",3, 6, "ThaiLan"));
        fl.getListFruit().add( new Fruit(3," Grape",5, 2, "US"));          
    }
    
    public void addFruit(){
        int ID = valid.inputId(fl);
        Fruit f = valid.inputFruit(ID);
        fl.getListFruit().add(f);
        
        while (true) {
            System.out.println("Do you want to continue (Y/N)?");
            if (valid.checkInputYN()) {
                int id = valid.inputId(fl);
                Fruit f2 = valid.inputFruit(id);
                fl.getListFruit().add(f2);
            } else {
                fl.getDataFruits();
                return;
            }
        

        }
    }
    
    public void updateFruit(){
        if (fl.getListFruit().isEmpty()) {
            System.out.println("Menu is empty.");
            return;
        }
        int id, index;
        System.out.print("ID: ");
        id = valid.checkNum();
        index = fl.searchId(id);
        if (index == -1 ) {
            System.out.println("ID is not exsit.");
            System.out.println("Do you want to create Fruit (Y/N)?");
            if (valid.checkInputYN()) {
                addFruit();
            } 
        } else {
            System.out.println("Update Quantity: ");
            int Quantity = valid.checkNum();
            fl.getListFruit().get(index).setQuantity(Quantity);
        }
        
    }
    
    // di shopping
    public void shopping(){
        Order order = new Order();
        if (fl.getListFruit().isEmpty()) {
            System.out.println("Menu is empty.");
            return;
        }
        fl.getDataFruits();       
        int id = valid.indexID(fl);
        System.out.print("Quanlity: ");
        int Quantity = valid.checkInputIntLimit(1, fl.getListFruit().get(id).getQuantity()); 
        order.orderFruit(fl.getListFruit().get(id),Quantity); fl.menuAfter();
        order.getBill();
        
        while (true) {            
            System.out.println("Do you want to order now (Y/N)?");
            if (!valid.checkInputYN()) {       
                if (fl.getListFruit().isEmpty()) {
                    System.out.println("Menu is sold out.");
                    break;
                }
                fl.getDataFruits();
                int IdFruit2, id2;
                while (true) {
                    id2 = valid.indexID(fl);
                    System.out.print("Quantity: ");
                    int Quantity2 = valid.checkInputIntLimit(1, fl.getListFruit().get(id2).getQuantity());
                    order.orderFruit(fl.getListFruit().get(id2), Quantity2); fl.menuAfter();
                    order.getBill();
                    break;
                }
            }
            else break;
        }
        System.out.println("Input Name-Buyer: ");
        String name = valid.checkInputString();
        fl.tableOrder.put(name + " -" + new Date().toString(), order);
        order.getBill();
        
    }
     
    
    // view list
    public void displayMenu(){
        fl.viewOrder();
        System.out.println("---------------------------------------"); 
        if(fl.getListFruit().isEmpty())
        {
            System.out.println("Menu is empty.");
            return;
        }
        fl.getDataFruits();
              
    }
    
    
}
