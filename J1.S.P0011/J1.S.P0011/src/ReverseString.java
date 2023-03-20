
public class ReverseString {
     // reverse string
    public static String reverseString(String string){
        String reverse="";
        // loop for traverse from final index to index 0
        for(int i=string.length()-1;i>=0;i--){
             reverse=reverse+string.charAt(i);
        }
        return reverse;
    }
}
