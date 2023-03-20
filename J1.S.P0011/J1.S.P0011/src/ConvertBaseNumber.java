
import java.util.Scanner;

public class ConvertBaseNumber {
    // choose base number 

    public static int ChooseBaseNumber(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        int BaseNumber;
        // loop until return base number
        while (true) {
            try {
                BaseNumber = Integer.parseInt(sc.nextLine().trim());
                if (BaseNumber != 2 && BaseNumber != 10 && BaseNumber != 16) {
                    System.err.println("Base number only 2,10,16");
                    System.out.print("Enter again:");
                } else {
                    return BaseNumber;
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid input");
                System.out.print("Enter again:");
            }
        }
    }

    // enter input value based on  input base
    public static String EnterInputValue(int InputBase) {
        String InputValue = "";

        switch (InputBase) {
            // if base input is binary
            case 2:
                InputValue = EnterValue.EnterValueBinaryNumber();
                break;
            // if base input is demical 
            case 10:
                InputValue = EnterValue.EnterValueDemicalNumber();
                break;
            // if base input is hexademical 
            case 16:
                InputValue = EnterValue.EnterValueHexaDecimalNumber();
                break;
            default:
                break;
        }
        return InputValue;
    }

    // convert input value of input base to value of output base
    public static void ConvertInputValue(String InputValue, int InputBase, int OutputBase) {
        // if user want convert from binary to demical
        if (InputBase == 2 && OutputBase == 10) {
            ConvertBinaryToDemical convert = new ConvertBinaryToDemical();
            String demical = convert.ConvertBinaryToDemical(InputValue);
            System.out.println("=" + demical + "(DEC)");
            // if user want convert from demical to binary
        } else if (InputBase == 10 && OutputBase == 2) {
            ConvertDemicalToBinary convert = new ConvertDemicalToBinary();
            String binary = convert.ConvertDemicalToBinary(InputValue);
            System.out.println("=" + binary + "(BIN)");
            // if user want convert from hexademical to demical
        } else if (InputBase == 16 && OutputBase == 10) {
            ConvertHexademicalToDemical convert = new ConvertHexademicalToDemical();
            String demical = convert.ConvertHexademicalToDemical(InputValue);
            System.out.println("=" + demical + "(DEC)");
            // if user want convert from demical to hexademical  
        } else if (InputBase == 10 && OutputBase == 16) {
            ConvertDemicalToHexademical convert = new ConvertDemicalToHexademical();
            String hexademical = convert.ConvertDemicalToHexademical(InputValue);
            System.out.println("=" + hexademical + "(HEX)");
            // if user want convert from binary to hexademical
        } else if (InputBase == 2 && OutputBase == 16) {
            // convert from binary to demical first 
            ConvertBinaryToDemical ConvertBinaryToDemical = new ConvertBinaryToDemical();
            String demical = ConvertBinaryToDemical.ConvertBinaryToDemical(InputValue);
            // then convert demical value to hexademical
            ConvertDemicalToHexademical ConvertDemicalToHexademical = new ConvertDemicalToHexademical();
            String hexademical = ConvertDemicalToHexademical.ConvertDemicalToHexademical(demical);
            System.out.println("=" + hexademical + "(HEX)");
            // if user want convert from hexademical to binary
        } else if (InputBase == 16 && OutputBase == 2) {
            // convert from hexademical to demical first
            ConvertHexademicalToDemical ConvertHexademicalToDemical = new ConvertHexademicalToDemical();
            String demical = ConvertHexademicalToDemical.ConvertHexademicalToDemical(InputValue);
            // then convert from demical to binary
            ConvertDemicalToBinary ConvertDemicalToBinary = new ConvertDemicalToBinary();
            String binary = ConvertDemicalToBinary.ConvertDemicalToBinary(demical);
            System.out.println("=" + binary + "(BIN)");
        } 

    }

    public static void main(String[] args) {
        //choose base number input
        int InputBase = ChooseBaseNumber("Choose base number input(2,10,16):");
        //choose base number output
        int OutputBase = ChooseBaseNumber("Choose base number output(2,10,16):");
        // enter input value based on choose input base
        String InputValue = EnterInputValue(InputBase);
        // convert input value of input base to value of output base
        ConvertInputValue(InputValue, InputBase, OutputBase);
    }
}
