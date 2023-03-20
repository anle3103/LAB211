package tpbank;

import java.util.Random;
import java.util.ResourceBundle;

public class EbankManagement {

    public void loginWithVietNamese(ResourceBundle bundle) {
        bundle = ResourceBundle.getBundle("tpbank.language_vi_VN");
        login(bundle);

    }

    public void loginWithEnglish(ResourceBundle bundle) {
        bundle = ResourceBundle.getBundle("tpbank.language_en_US");
        login(bundle);
    }

    public String randomCaptcha() {
        Random rand = new Random();
        StringBuilder anphabet = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            anphabet.append(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            anphabet.append(i);
        }
        for (char i = '0'; i <= '9'; i++) {
            anphabet.append(i);
        }
        StringBuilder captCha = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int index = rand.nextInt(anphabet.length());
            captCha.append(anphabet.charAt(index));
        }
        return captCha.toString();
    }

    public void login(ResourceBundle bundle) {
        // Lay 1 chuoi va dat ten la accountNumber 
        String accountNumber = Validation.getString(bundle.getString("account"),
                bundle.getString("account.error"), "^\\d{10}$");
        // Lay 1 chuoi va dat ten la Password
        String password = Validation.getPassword(bundle.getString("password"),
                bundle.getString("password.error"));

        //5 ki tu captcha ngau nhien bao gom chu va so
        while (true) {
            String captcha = randomCaptcha();
            System.out.println("Captcha: " + captcha);
            String reCaptcha = Validation.getString(bundle.getString("captcha"),
                    bundle.getString("captcha.error"), "^[a-zA-Z0-9]{5}$");
            if (captcha.equals(reCaptcha)) {
                System.out.println(bundle.getString("login.success"));
                break;
            } else {
                System.out.println(bundle.getString("captcha.incorrect"));
            }
        }
    }

}
