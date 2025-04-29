import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0); // Read the first character

        int ascii = (int) ch; // Typecasting char to int to get ASCII value

        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
    }
}
