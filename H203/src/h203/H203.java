package h203;
import java.util.Scanner;
public class H203 {
    public static void Reverse(String str){
        Scanner sc = new Scanner(System.in);
        while(str.isEmpty()){
            System.out.print("Enter the string: ");
            str = sc.nextLine();
        }
        String[] part = str.split("\\s+");
        for (int k=part.length-1; k >= 0; k--) {
            if (k==part.length-1) {
                String first = part[k].substring(0, 1);
                part[k] = first.toUpperCase()+part[k].substring(1, part[k].length());    
            }
            if(k==0){
                System.out.println(part[0]);
                break;
            }
            System.out.print(part[k]+" ");
        }
    }
    public static void main(String[] args) {
        Reverse("hello there");
        Reverse("");
    }   
}
