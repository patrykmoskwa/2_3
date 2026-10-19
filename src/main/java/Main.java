import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe (a): ");
        double a = scanner.nextDouble();
        System.out.print("Podaj liczbe (b): ");
        double b = scanner.nextDouble();
        System.out.println("Suma: "+(a+b));
        scanner.close();
    }
}
