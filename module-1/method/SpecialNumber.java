import java.util.Scanner;

class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sumOfDigits = 0;
        int productOfDigits = 1;
        int number=num;

        while (num > 0) {
            sumOfDigits+=num%10;
            productOfDigits*=num%10;
            num/=10;
        }
        if (sumOfDigits+productOfDigits==number) {
            System.out.println(number + " is a special number.");
        } else {
            System.out.println(number+" is not a special number.");
        }
    }
}
