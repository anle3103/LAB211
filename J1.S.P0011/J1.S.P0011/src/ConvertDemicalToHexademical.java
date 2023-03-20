import java.math.BigInteger;
public class ConvertDemicalToHexademical {
    // convert demical number to hexademical number 

    public  String ConvertDemicalToHexademical(String demical) {
        //  in hexademical, just only digit from 0 to 9 and letter from A to F
        String HexStr[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        BigInteger remainder ;
        String SetOfRemainder="";
        BigInteger IntegerDemical = new BigInteger(demical);  
        BigInteger divisor= new BigInteger("16");  
        // loop until IntegerDemical=new BigInteger("0")
        while(IntegerDemical.compareTo(new BigInteger("0"))>0){
            remainder=IntegerDemical.mod(divisor);
            SetOfRemainder=SetOfRemainder+ HexStr[remainder.intValue()];
            IntegerDemical=IntegerDemical.divide(divisor);
        }
        String hexademical=ReverseString.reverseString(SetOfRemainder);
        return hexademical;
    }
}
