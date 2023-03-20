
import java.util.Scanner;

public class EnterValue {
    // enter  value binary number

    public static String EnterValueBinaryNumber() {
        String binary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value(BIN):");
        binary = sc.nextLine();
        // loop until user input true binary number
        while (!CheckInput.CheckInputBinaryValue(binary)) {
            System.out.print("Enter again:");
            binary = sc.nextLine();
        }
        return binary;
    }

    // enter  value demical number
    public static String EnterValueDemicalNumber() {
        String demical;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value(DEC):");
        demical = sc.nextLine();
        // loop until input true demical value  number
        while (!CheckInput.CheckInputDemicalValue(demical)) {
            System.out.print("Enter again:");
            demical = sc.nextLine();
        }
        return demical;
    }
    //enter  value  hexademical  number

    public static String EnterValueHexaDecimalNumber() {
        String hexademical;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  value(HEX):");
        hexademical = sc.nextLine();
        // loop until input true hexademical value  number
        while (!CheckInput.CheckInputHexademicalValue(hexademical)) {
            System.out.print("Enter again:");
            hexademical = sc.nextLine();
        }
        return hexademical;
    }
}
