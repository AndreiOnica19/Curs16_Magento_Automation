package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Random;

@AllArgsConstructor
@Getter
public enum Data {
    PHONE("0756778899"),
    COUNTRY("Romania"),
    POSTCODE("021569"),
    STATE("Bucuresti"),
    CITY("Bucuresti"),
    ADDRESS("Sos. Pantelimon nr. 91, sector 2"),
    COMPANY("Academia Programatorilor"),
    EXPECTED_SUCCESS_MESSAGE("Thank you for registering with Main Website Store."),
    PASSWORD("1029384756A@"),
    EMAIL(generateEmail()),
    LAST_NAME("Onica"),
    FIRST_NAME("Andrei"),
    BASE_URL("https://magento.softwaretestingboard.com/"),
    RANDOM_QUANTITY(generateQuantity());

    private final String value;

    public static String generateEmail(){
        Random rnd = new Random();
        int number = rnd.nextInt(10000);
        return "andrei" + number + "@gmail.com";
    }

    public static String generateQuantity() {
        Random rnd = new Random();
        int quantity = rnd.nextInt(10) + 1;
        return Integer.toString(quantity);
    }
}