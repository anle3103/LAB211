
import java.math.BigInteger;

public class ConvertHexademicalToDemical {
    // convert hexademical number to demical number 

    public  String ConvertHexademicalToDemical(String hexademical) {
        BigInteger demical = new BigInteger("0");
        BigInteger base = new BigInteger("16");
        String StringHexademical[] = hexademical.split("");
        int index = StringHexademical.length - 1;
        // loop for traverse through all element in string StringHexademical
        for (int i = 0; i < StringHexademical.length; i++) {
            if (ConvertLetter(StringHexademical[i]) != null) {
                StringHexademical[i] = ConvertLetter(StringHexademical[i]);
            }
            BigInteger ValueOfIndex = new BigInteger(StringHexademical[i]);
            demical = demical.add(ValueOfIndex.multiply(base.pow(index)));
            index--;
        }
        return String.valueOf(demical);
    }

    // convert letter in hexademical to number in demical
    public  String ConvertLetter(String letter) {
        String[] numbers = {"10", "11", "12", "13", "14", "15"};
        String letters[] = {"A", "B", "C", "D", "E", "F"};
        // loop for traverse through  index 0 to final index
        for (int i = 0; i < letters.length; i++) {
            if (letter.equals(letters[i])) {
                return numbers[i];
            }
        }
         return null;
    }
}
