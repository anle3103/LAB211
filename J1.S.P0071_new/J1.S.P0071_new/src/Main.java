
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ManageTask mn = new ManageTask();
        mn.test();
        int choice;
        while(true){
            choice = mn.menu();
            if (choice == 5) break;
            switch(choice){
                case 1: 
                    mn.addManaTask();
                    break;
                case 2: 
                    mn.updateManaTask();
                    break;
                case 3: 
                    mn.deleteManaTask();
                    break;           
                case 4:
                    mn.displayTask();
                    break;
                case 5:
                    return;
                    
            }
        }
    }
}
