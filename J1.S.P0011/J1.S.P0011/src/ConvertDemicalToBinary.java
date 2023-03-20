
import java.math.BigInteger;

public class ConvertDemicalToBinary {

    // convert demical number to binary number
    public String ConvertDemicalToBinary(String demical) {
        BigInteger divisor = new BigInteger("2");
        BigInteger IntegerDemical = new BigInteger(demical);
        BigInteger remainder;
        String SetOfRemainder = "";
        // loop until IntegerDemical=new BigInteger("0")
        while (IntegerDemical.compareTo(new BigInteger("0"))>0) {
            remainder = IntegerDemical.mod(divisor);
            SetOfRemainder = SetOfRemainder + remainder;
            IntegerDemical = IntegerDemical.divide(divisor);
        }
        String binary = ReverseString.reverseString(SetOfRemainder);
        return binary;
    }

}
