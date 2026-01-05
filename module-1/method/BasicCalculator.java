import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nENTER YOUR CHOICE:");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");
            System.out.println("5.MODULUS");
            System.out.println("6.EXIT");

            choice = sc.nextInt();

            int a, b;

            if (choice >= 1 && choice <= 5) {
                System.out.println("Enter the first integer:");
                a = sc.nextInt();
                System.out.println("Enter the second integer:");
                b = sc.nextInt();
            } else if (choice == 6) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;   // exit loop
            } else {
                System.out.println("Invalid choice! Try again.");
                continue; // restart loop
            }

            switch (choice) {
                case 1:
                    System.out.println("Addition: " + Math.addExact(a, b));
                    break;

                case 2:
                    System.out.println("Subtraction: " + Math.subtractExact(a, b));
                    break;

                case 3:
                    System.out.println("Multiplication: " + Math.multiplyExact(a, b));
                    break;

                case 4:
                    if (b != 0) {
                        System.out.println("Division: " + Math.floorDiv(a, b));
                    } else {
                        System.out.println("Error: Division by zero not allowed");
                    }
                    break;

                case 5:
                    System.out.println("Modulus: " + Math.floorMod(a, b));
                    break;
            }

        } while (choice != 6);
    }
}
