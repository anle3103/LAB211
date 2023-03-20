
import java.math.BigInteger;

public class ConvertBinaryToDemical {
    // convert binary number to demical number

    public String ConvertBinaryToDemical(String binary) {
        BigInteger demical = new BigInteger("0");
        BigInteger NumberTwo = new BigInteger("2");
        String StringBinary[] = binary.split("");
        int index = StringBinary.length - 1;
        // loop for traverse through string binary
        for (int i = 0; i < StringBinary.length; i++) {
            BigInteger ValueOfIndex = new BigInteger(StringBinary[i]);
            demical = demical.add(ValueOfIndex.multiply(NumberTwo.pow(index)));
            index--;
        }
        return String.valueOf(demical);
    }
}
