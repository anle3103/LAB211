import java.util.Locale;
import java.util.Random;
import java.util.ResourceBundle;

public class Ebank {

    ResourceBundle rb;

    public ResourceBundle getBundle() {
        return rb;
    }
    
    //Set locale
    public void setLocale(Locale locale) {
        rb = ResourceBundle.getBundle("language", locale);
    }
    
    //check format Account
    public String checkAccountNumber(String accountNumber) {
        String str = "";
        if (!accountNumber.matches("^[0-9]{10}$")) {
            str = rb.getString("account.error");
        }
        return str;
    }
            
    //check format password
    public String checkPassword(String password) {
        String str = "";
        if (password.length() < 8 || password.length() > 31) {
            str += rb.getString("password.error");
            return str;
        }
        if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,31}$")) {  
            str += rb.getString("password.error");
            return str;
        }
        return str;
    }
    
    //generate random Captcha
    public String generateCaptcha() {
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
    //check captcha
    public String checkCaptcha(String captcha, String recaptcha) {
        String str = "";
        if (!recaptcha.matches("^[a-zA-Z0-9]{5}$")) {
            str += rb.getString("captcha.error");
        } else if (!recaptcha.contains(captcha)) {
            str += rb.getString("captcha.error");
        }
        return str;

    }
}
