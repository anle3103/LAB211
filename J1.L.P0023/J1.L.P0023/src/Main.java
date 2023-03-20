
import java.util.*;


public class Main {
    public static void main(String[] args) {
        FruitShop fs = new FruitShop();
        fs.test();
        int choice;
        while(true){
            choice = fs.menu();
            if (choice == 5) break;
            switch(choice){
                case 1: 
                    fs.addFruit();
                    break;
                case 2: 
                    fs.updateFruit();
                    break;
                case 3: 
                    fs.displayMenu();
                    break;           
                case 4:
                    fs.shopping();                   
                    break;
                case 5:
                    return;
                    
            }
        }
    }
}
