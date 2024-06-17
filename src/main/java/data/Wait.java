package data;

public class Wait {
    public static void waitInSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
