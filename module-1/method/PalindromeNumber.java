import java.util.Scanner;
public class PalindromeNumber {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number : ");
        num=sc.nextInt();

        int temp=num;
        int rem=0;
        int rev=0;

        while (temp>0){
            rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }

        if (rev==num){
            System.out.println(num+" is a palindrome number");
        } else {
            System.out.println(num+" is not a palindrome number");
        }

    }
}
