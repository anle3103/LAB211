import java.util.Scanner;
public class ChangeBaseNumber {
      // choose base number input
      public static int ChooseBaseNumberInput(){
        Scanner sc=new Scanner(System.in);
        int BaseNumberInput=0;
        System.out.print("Choose base number input(2,10,16):");
        // loop until enter true base number input
        while(true){
            try{
               BaseNumberInput=Integer.parseInt(sc.nextLine().trim());
               if(BaseNumberInput!=2 && BaseNumberInput!=10 && BaseNumberInput!=16){
                   System.out.print("Enter again:");
               }else{
                   return BaseNumberInput;
               }
            }catch(NumberFormatException e){
                  System.err.println("Exist character!! Only base 2,10,16");
                  System.out.print("Enter again:");
        }
        }
        }
      // choose base number output
      public static int ChooseBaseNumberOutput(){
        Scanner sc=new Scanner(System.in);
        int BaseNumberOutput=0;
        System.out.print("Choose base number output(2,10,16):");
        // loop until enter true base number output
        while(true){
            try{
               BaseNumberOutput=Integer.parseInt(sc.nextLine().trim());
               if(BaseNumberOutput!=2 && BaseNumberOutput!=10 && BaseNumberOutput!=16){
                   System.out.print("Enter again:");
               }else{
                   return BaseNumberOutput;
               }
            }catch(NumberFormatException e){
                  System.err.println("Exist character!! Only base 2,10,16");
                  System.out.print("Enter again:");
        }
        }
        }
      // enter input value binary number
      public static int EnterInputValueBinaryNumber(){
        int InputValue ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value(BIN):");
        // loop until input true binary number
        while(true){
            try{
                InputValue=Integer.parseInt(sc.nextLine().trim());
                if(InputValue<=1||String.valueOf(InputValue).contains("2")||String.valueOf(InputValue).contains("3")||String.valueOf(InputValue).contains("4")||String.valueOf(InputValue).contains("5")||String.valueOf(InputValue).contains("6")||String.valueOf(InputValue).contains("7")||String.valueOf(InputValue).contains("8")||String.valueOf(InputValue).contains("9")){
                      System.out.print("Enter again:");
                }else{
                    return InputValue;
                }
            }catch(NumberFormatException e){
                 System.err.println("Exist character!! Only digit 0 and 1");
                 System.out.print("Enter again:");
            }
        }    
    }
      // enter demical value number
      public static int EnterInputValueDemicalNumber(){
           int InputValue ;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value(DEC):");
       // loop until input true decimal number
        while(true){
            try{
                InputValue=Integer.parseInt(sc.nextLine().trim());
                if(InputValue<=0){
                      System.out.print("Enter again:");
                }else{
                    return InputValue;
                }
            }catch(NumberFormatException e){
                 System.err.println("Exist character!! Only digit from 0 to 9");
                 System.out.print("Enter again:");
            }
        }   
      }
      //enter hexademical value  number
      public static String  EnterInputValueHexaDecimalNumber(){
           String InputValue;
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter  value(HEX):");
           InputValue=sc.nextLine();
           // loop until input true hexademical value  number
           while(!CheckHexademicalValue(InputValue)){
              System.out.print("Enter again:");
              InputValue=sc.nextLine();
        }
       return InputValue;
        }
      // check enter hexademical value number
      public static boolean CheckHexademicalValue(String HexademicalValue){
          char character[]=HexademicalValue.toCharArray();
       // loop for traverse through all characters
       for(int i=0;i<character.length;i++){
           if((character[i]<'0'||character[i]>'9')&&(character[i]<'A'||character[i]>'F')){
                   return false;
           }
       }
       return true;
      }
      // convert demical number to binary number
      public static void ConvertDemicalToBinary(int demical){
           int i=1;
           int remainder;
           int binary=0;
           // loop until demical=0
            while(demical!=0){
               System.out.print(demical+" : "+2); 
     	        remainder=demical%2;
                demical=demical/2;
                System.out.print("="+demical+" remainder: "+remainder+"\n"); 
		binary=binary+remainder*i;
		i=i*10;
               }
            System.out.println(binary+"(BIN)");
    }
      // convert binary number to demical number
      public static void ConvertBinaryToDemical(int binary){
           int remainder;
          int demical=0;
          int i;// base
          // loop for incresing base while convert binary to demical
          for(i=1;binary!=0;i=i*2){
            remainder=binary%10;
            demical=demical+remainder*i;
            System.out.print(remainder+"*"+i+"  +");
             binary=binary/10;
             }
          System.out.print("\b");
          System.out.println("="+demical+"(DEC)");
       }
      // convert hexademical number to demical number 
      public static void ConvertHexademicalToDemical(String hexademical){
           int base=1;
           int demical=0;
           char character[]=hexademical.toCharArray();
           // loop for traverse through all characters
           for(int i=character.length-1;i>=0;i--){
               if(character[i]>='0' &&character[i]<='9'){
                  // 0->9 (character)in ASCII convert to demical is 48->57
                  // 0->9 in hexademical convert to demical is 0->9
                  // subtract 48
                  demical=demical+(character[i]-48)*base;
                  System.out.print((character[i]-48)+"*"+base+"    + \b");
                  base=base*16;
               }else if(character[i]>='A' &&character[i]<='F'){
                  // A->F in ASCII convert to demical is 65->70
                  // A->F in hexademical convert to demical is 10->15
                  // subtract 55
                  demical=demical+(character[i]-55)*base;
                  System.out.print((character[i]-55)+"*"+base+"    + \b");
                  base=base*16;
               }
           }
           System.out.println("\b="+demical+"(DEC)");
       }
      // convert demical number to hexademical number 
      public static void ConvertDemicalToHexademical(int demical){
            int remainder;
            String hexademical="";
            // in hexademical, just only digit from 0 to 9 and letter from A to F
            char hexchar[]={'0','1','2','3','4' ,'5','6','7','8','9','A','B','C','D','E','F'};
            // loop until demical =0
            while(demical!=0){
                remainder=demical%16;
                System.out.print(demical+":"+16+"=\t"+" remainder:"+remainder+"\n");
                hexademical=hexademical+hexchar[remainder];
                demical=demical/16;
            }
            char character[]=hexademical.toCharArray();
            // loop for traverse through all characters
            for(int i=character.length-1;i>=0;i--){
                System.out.print(character[i]);
            }
            System.out.println("(HEX)");
          }
      public static void main(String[] args) {
           // choose base number input
          int ChoiceInputBase=ChooseBaseNumberInput();
           // choose base number output
          int ChoiceOutputBase=ChooseBaseNumberOutput();
           // enter input value
          int BinaryNumber=0;
          int DemicalNumber=0;
          String  HexaDemicalNumber=null;
           if(ChoiceInputBase==2){
               BinaryNumber= EnterInputValueBinaryNumber();
           }
           if(ChoiceInputBase==10){
              DemicalNumber= EnterInputValueDemicalNumber();
           }
           if(ChoiceInputBase==16){
              HexaDemicalNumber= EnterInputValueHexaDecimalNumber();
           }
           // convert demical number to binary number
           if(ChoiceInputBase==10 &&ChoiceOutputBase==2 ){
               ConvertDemicalToBinary(DemicalNumber);
           }  
           // convert binary number to demical number
           if(ChoiceInputBase==2 &&ChoiceOutputBase==10){
               ConvertBinaryToDemical(BinaryNumber);
           }
           // convert hexademical number to demical number
             if(ChoiceInputBase==16 &&ChoiceOutputBase==10){
                ConvertHexademicalToDemical(HexaDemicalNumber);
            }
            // convert demical number to hexademical number
               if(ChoiceInputBase==10 &&ChoiceOutputBase==16){
               ConvertDemicalToHexademical(DemicalNumber);
            }
           
    }
   }
