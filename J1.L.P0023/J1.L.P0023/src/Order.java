
import java.util.*;

public class Order {

    public Order() {
    }
    
    List<Fruit> order = new ArrayList<>();
        
    public void orderFruit(Fruit f, int Quanlity) {
        f.setQuantity(f.getQuantity()- Quanlity);
        for (int i = 0; i < order.size(); i++) {
            if (f.getFruitId() ==  order.get(i).getFruitId()) {
                order.get(i).setQuantity(Quanlity + order.get(i).getQuantity());
                return;
            }
        }     
        order.add( new Fruit(f.getFruitId(), f.getFruitName(), Quanlity, f.getPrice(), f.getOrigin()));
    //    return order;
    }

   
    // tra ve tong cua 1 list Order
    public int getTotal() {
        int sum = 0;
        for (int i = 0; i < order.size(); i++) 
            sum += order.get(i).getPrice()*order.get(i).getQuantity();
        return sum;
    }
    
    // in ra hoa qua da order
    public void getBill() {        
        System.out.println("Product " + "| Quantity " + "| Price" + "| Amount");
        for (int i = 0; i < order.size(); i++) {
            System.out.printf("%d." + "%-12s%-6d   %d$     %d$ \n",
                    i+1,
                    order.get(i).getFruitName(),
                    order.get(i).getQuantity(),
                    order.get(i).getPrice(),
                    order.get(i).getPrice() * order.get(i).getQuantity());
        }
        System.out.println("Total: " + getTotal());
    }
    
    
}
