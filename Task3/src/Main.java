import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String inputData = inputString();
        if (isValidString(inputData)) {
            System.out.println("Фамилия: " + lastName(inputData));
            System.out.println("Имя: " + fullName(inputData));
            System.out.println("Отчество: " + middleName(inputData));
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }

    public static String inputString() {
        System.out.println("Введите ФИО: ");
        return new Scanner(System.in).nextLine().trim();
    }

    public static boolean isValidString(String validateString) {
        boolean isValid = validateString.matches("[А-яё-]+\\s[А-яё-]+\\s[А-яё-]+");
        return isValid;
    }

    public static String lastName(String inputString) {
        return inputString.substring(0, inputString.indexOf(' ')).trim();
    }

    public static String fullName(String inputString) {
        return inputString.substring(inputString.indexOf(' '), inputString.lastIndexOf(' ')).trim();
    }

    public static String middleName(String inputString) {
        return inputString.substring(inputString.lastIndexOf(' ')).trim();
    }
}