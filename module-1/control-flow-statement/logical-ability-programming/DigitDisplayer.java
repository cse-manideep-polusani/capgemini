
import java.util.Scanner;

class DigitDisplayer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;

        System.out.print("Enter a number: ");
        A=sc.nextInt();

        //Display digits of a number
        while (A%10 != 0) { 
            System.out.print(A % 10+" ");
            A = A / 10;
        }
    }
}