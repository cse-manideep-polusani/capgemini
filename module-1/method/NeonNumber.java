import java.util.Scanner;
class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int sumOfDigits = 0;
        int squareOfNumber = num * num;


        while (squareOfNumber > 0){
            sumOfDigits += squareOfNumber % 10;
            squareOfNumber/=10;
        }

        if (sumOfDigits == num) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }
    }
}