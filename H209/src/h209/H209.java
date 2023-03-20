package h209;

import java.util.Scanner;

public class H209 {
    public static void countCoins(Scanner sc) {
        double totalCents = 0;
        while (sc.hasNext()) {
            int amount = sc.nextInt();
            String type = sc.next().toLowerCase();
            if (type.equals("pennies")) {
                totalCents += amount;
            } else if (type.equals("nickels"))  {
                totalCents += 5 * amount;
            } else if (type.equals("dimes"))  {
                totalCents += 10 * amount;
            } else if (type.equals("quarters"))  {
                totalCents += 25 * amount;
            }
        }
        System.out.println("Total money: $" + String.format("%.2f", totalCents / 100));
    }
    

    public static void main(String[] args) {
        String string = "3 pennies 2 quarters 1 pennies 3 nickels 4 dimes ";
        Scanner sc = new Scanner(string);
        countCoins(sc);
    }

}
