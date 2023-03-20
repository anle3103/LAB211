
public class CheckInput {
    // check  input value binary number

    public static boolean CheckInputBinaryValue(String binary) {
        if (binary.isEmpty()) {
            System.err.println("Not empty");
            return false;
        }
        char character[] = binary.toCharArray();
        // loop for traverse through array
        for (int i = 0; i < character.length; i++) {
            if (character[i] != '0' && character[i] != '1') {
                System.err.println("Only digit 0,1");
                return false;
            }
        }
        return true;
    }

    // check input demical value number
    public static boolean CheckInputDemicalValue(String demical) {
        if (demical.isEmpty()) {
            System.err.println("Not empty");
            return false;
        }
        char character[] = demical.toCharArray();
        // loop for traverse through all characters
        for (int i = 0; i < character.length; i++) {
            if (character[i] < '0' || character[i] > '9') {
                System.err.println("Only digit 0->9");
                return false;
            }
        }
        return true;
    }

    // check  input hexademical value number
    public static boolean CheckInputHexademicalValue(String hexademical) {
        if (hexademical.isEmpty()) {
            System.err.println("Not empty");
            return false;
        }
        char character[] = hexademical.toCharArray();
        // loop for traverse through all characters
        for (int i = 0; i < character.length; i++) {
            if ((character[i] < '0' || character[i] > '9') && (character[i] < 'A' || character[i] > 'F')) {
                System.err.println("Only digit 0->9 and character A->F");
                return false;
            }
        }
        return true;
    }
}
