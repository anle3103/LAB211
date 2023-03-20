
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Validate val = new Validate();
        Views view = new Views();
        Ebank e = new Ebank();
        Locale locale;
        int choice;
        do {
            view.printMenu();
            choice = val.inputChoice();
            switch(choice){
                case 1:
                    locale = new Locale("vi");
                    e.setLocale(locale);
                    view.login(e);
                    break;
                case 2:
                    locale = new Locale("en");
                    e.setLocale(locale);
                    view.login(e);
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
