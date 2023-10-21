package Package1;

public class Digits{
    public static void main(String[] args) {
        int number = 42; // 

        int onesPlace = number % 10;
        int tensPlace = number / 10;

        System.out.println("Ones place digit: " + onesPlace);
        System.out.println("Tens place digit: " + tensPlace);
    }
}