import java.util.Scanner;
class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int sumOfDigits = 0;
        int temp=num;

        while (temp > 0){
            sumOfDigits += temp % 10;
            temp/=10;
        }

        if (num % sumOfDigits==0) {
            System.out.println(num + " is a Harshad number.");
        } else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
}