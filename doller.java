import java.util.Scanner;

public class doller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

               System.out.print("Enter the first dollar value: ");
        int dollar1 = scanner.nextInt();
        System.out.print("Enter the first cent value: ");
        int cent1 = scanner.nextInt();
        System.out.print("Enter the second dollar value: ");
        int dollar2 = scanner.nextInt();
        System.out.print("Enter the second cent value: ");
        int cent2 = scanner.nextInt();

                int totalCents = cent1 + cent2;
        int extraDollars = totalCents / 100;
        totalCents = totalCents % 100;
        int totalDollars = dollar1 + dollar2 + extraDollars;

                System.out.println("The sum is " + totalDollars + " dollars and " + totalCents + " cents.");
    }
}
