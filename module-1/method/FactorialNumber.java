import java.util.Scanner;
class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int factorial=1;
        for(int i=2;i<=num;i++){
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}