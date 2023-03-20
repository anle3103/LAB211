
import java.io.*;
import java.util.*;

public class printReverse {

    public static void main(String args[]) {
        String input = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            input = bufferedReader.readLine();
            char[] stt = input.toCharArray();
            for (int i = stt.length - 1; i >= 0; i--) {
                System.out.print(stt[i]);
            }
        } catch (IOException e) {
        }
    }
}
