
public class Fruit {
    int FruitId;
    String FruitName;
    int Price, Quantity; 
    String Origin;

    
    public Fruit() {
    }

    public Fruit(int FruitId, String FruitName, int Quality, int Price,  String Origin) {
        this.FruitId = FruitId;
        this.FruitName = FruitName;
        this.Quantity = Quality;
        this.Price = Price;
        this.Origin = Origin;
    }

    public int getFruitId() {
        return FruitId;
    }

    public String getFruitName() {
        return FruitName;
    }

    public int getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setFruitId(int FruitId) {
        this.FruitId = FruitId;
    }

    public void setFruitName(String FruitName) {
        this.FruitName = FruitName;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }
    
    
}
