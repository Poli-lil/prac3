import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        System.out.print("Введіть число з плаваючою крапкою: ");
        double decimal = scanner.nextDouble();

        System.out.print("Введіть рядок: ");
        String text = scanner.next();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean logic = scanner.nextBoolean();

        System.out.println("\n===== 1 =====");
        System.out.println(number);
        System.out.println(decimal);
        System.out.println(text);
        System.out.println(logic);

        System.out.println("\n===== 2 =====");
        System.out.printf("%d%n", number);

        System.out.println("\n===== 3 =====");
        System.out.printf("%10d%n", number);

        System.out.println("\n===== 4 =====");
        System.out.printf("%x%n", number);

        System.out.println("\n===== 5 =====");
        System.out.printf("%o%n", number);

        System.out.println("\n===== 6 =====");
        System.out.printf("%.2f%n", decimal);

        System.out.println("\n===== 7 =====");
        System.out.printf("%10.2f%n", decimal);

        System.out.println("\n===== 8 =====");
        System.out.printf("%10s%n", text);

        System.out.println("\n===== 9 =====");
        System.out.printf("%-10s%n", text);

        System.out.println("\n===== 10 =====");
        System.out.printf("%d | %.2f | %s | %b%n",
                number, decimal, text, logic);

        scanner.close();
    }
}