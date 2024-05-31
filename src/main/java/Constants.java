import java.util.Random;

public class Constants {
    public static final String BASE_URL = "https://magento.softwaretestingboard.com/";
    public static final String FIRST_NAME = "Andrei";
    public static final String LAST_NAME = "Onica";
    public static final String EMAIL = generateEmail();
    public static final String PASSWORD = "1029384756A@";
    public static final String EXPECTED_SUCCESS_MESSAGE = "Thank you for registering with Main Website Store.";
    public static final String VALID_EMAIL = "onica.ndrei@yahoo.com";
    public static final String COMPANY = "Academia Programatorilor";
    public static final String ADDRESS = "Sos. Pantelimon nr. 91, sector 2";
    public static final String CITY = "Bucuresti";
    public static final String STATE = "Bucuresti";
    public static final String POSTCODE = "021569";
    public static final String COUNTRY = "Romania";
    public static final String PHONE = "0756778899";

    // colours
    public static final String ERROR_RED_COLOUR = "rgb(224, 43, 39)";
    public static final String GREY_COLOUR = "rgb(110, 113, 110)";
    public static final String ORANGE_COLOUR = "rgb(255, 1, 1)";


    public static String generateEmail(){
        Random rnd = new Random();
        int number = rnd.nextInt(10000);
        return "andrei" + number + "@gmail.com";
    }
}
