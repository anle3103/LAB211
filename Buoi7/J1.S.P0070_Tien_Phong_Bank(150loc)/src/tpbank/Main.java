package tpbank;

import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        EbankManagement manager = new EbankManagement();
        while (true) {
            //display menu
            displayMenu();
            //Get option
            int option = Validation.getOption("Please choice one option:", "option[1-3]", 1, 3);
            //detail
            ResourceBundle bundle = ResourceBundle.getBundle("tpbank.language_en_US");;
            switch (option) {
                //option = 1, Login with vietnamese
                case 1:
                    manager.loginWithVietNamese(bundle);
                    break;
                //option = 2, Login with english
                case 2:
                    manager.loginWithEnglish(bundle);
                    break;
                //option = 3, exit
                case 3:
                    System.exit(0);
                    break;
            }

        }
    }

    private static void displayMenu() {
        System.out.println("-------Login Program-------\n"
                + "1. Vietnamese\n"
                + "2. English\n"
                + "3. Exit");
    }
}
