import java.util.Scanner;
class NumberVerifierSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a < 0) && (a % 2 == 0)) {
            System.out.println(a+" is negative and Even Number");
        } else if ((a < 0) && (a % 2 != 0)) {
            System.out.println(a+" is negative and Odd Number");
        } else if ((a > 0) && (a % 2 != 0)) {
            System.out.println(a+" is positive and Odd Number");
        } else if ((a > 0) && (a % 2 == 0)) {
            System.out.println(a+" is positive and Even Number");
        } else {
            System.out.println("The number is zero");
        }
        sc.close();
    }
}