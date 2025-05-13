import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String phoneNumber = cleanPhoneNumber(inputPhoneNumber());
        isValidPhoneNumber(phoneNumber);
        newPhoneNumberFormat(phoneNumber);
    }

    public static String inputPhoneNumber() {
        System.out.print("Введите номер телефона: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public static String cleanPhoneNumber(String inputPhoneNumber) {
        return inputPhoneNumber.replaceAll("[+\\-(),.\\s]", "");
    }

    public static void isValidPhoneNumber(String inputPhoneNumber) {
        if (inputPhoneNumber.length() == 11 && inputPhoneNumber.charAt(0) == '7') {
            System.out.println(inputPhoneNumber);
        } else if (inputPhoneNumber.length() == 11 && inputPhoneNumber.charAt(0) == '8') {
            System.out.println(inputPhoneNumber.replaceFirst("8", "7"));
        } else if (inputPhoneNumber.length() == 10) {
            System.out.println("7" + inputPhoneNumber);
        } else {
            System.out.println("Неверный формат номера");
        }
    }

    public static void newPhoneNumberFormat(String inputPhoneNumber){
        System.out.println(inputPhoneNumber.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})","+$1 ($2) $3 $4-$5"));
    }
}