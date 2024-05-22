import java.util.Random;

public class Constants {
    public static final String BASE_URL = "https://magento.softwaretestingboard.com/";
    public static final String FIRST_NAME = "Andrei";
    public static final String LAST_NAME = "Onica";
    public static final String EMAIL = generateEmail();
    public static final String PASSWORD = "1029384756A@";
    public static final String EXPECTED_SUCCESS_MESSAGE = "Thank you for registering with Main Website Store.";
    public static final String VALID_EMAIL = "onica.ndrei@yahoo.com";

    public static String generateEmail(){
        Random rnd = new Random();
        int number = rnd.nextInt(10000);
        return "andrei" + number + "@gmail.com";
    }
}
