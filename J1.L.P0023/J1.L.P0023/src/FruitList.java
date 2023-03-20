
import java.util.*;

public class FruitList {

    List<Fruit> listFruit = new ArrayList<>();
    Hashtable<String,Order> tableOrder = new Hashtable<>();

    public void setListFruit(List<Fruit> listFruit) {
        this.listFruit = listFruit;
    }

    public List<Fruit> getListFruit() {
        return listFruit;
    }
    
    // tim id
    public int searchId(int id) {
        for (int i = 0; i < listFruit.size(); i++) {
            if (listFruit.get(i).getFruitId() == id) {
                return i;
            }
        }
        return -1;
    }

    // loai Fruit da het
    public void menuAfter() {
        for (int i = 0; i < listFruit.size(); i++) {
            if (listFruit.get(i).getQuantity() == 0) {
                listFruit.remove(i);
                i--;
            }
        }
    }
          
    // hien thi Danh sach Hoa Qua
    public void getDataFruits() {
        menuAfter();
        System.out.printf("%-16s%-16s%-16s%-16s%-16s\n", "++Items++", "++FruitName++", "++Quantity++", "++Origin++", "++Price++");
        for (int i = 0; i < listFruit.size(); i++) {          
                System.out.printf("%-18d%-17s%-14d%-20s%d$ \n",
                    listFruit.get(i).getFruitId(),
                    listFruit.get(i).getFruitName(),                  
                    listFruit.get(i).getQuantity(),
                    listFruit.get(i).getOrigin(),
                    listFruit.get(i).getPrice());
        }
    }
   
    
    // hien thi list cac order
    public void viewOrder() {
    Set<String> keyname = tableOrder.keySet();
        for (String key : keyname) {
        System.out.println("Customer: " + key.substring(0, key.indexOf("-")));
            Order o = tableOrder.get(key);
            o.getBill();
        }
    }
   
}
