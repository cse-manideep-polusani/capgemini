import java.util.Scanner;
public class PalindromePrimeCompositeNumber {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        int temp = num;
        int rem = 0;
        int rev = 0;

        while (temp > 0) {
            rem = temp % 10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }

        int count=0;
        for(int i=1;i<=num;i++){
            if (num%i==0) {
                count++;
            }
        }

        if ((num==rev) && (count==2)){
            System.out.println(num+ " is palindrome and prime number");
        } else if ((num==rev) && (count>2)) {
            System.out.println(num+ " is palindrome and composite number");
        } else if ((num!=rev) && (count==2)){
            System.out.println(num+ " is not a palindrome but prime number");
        } else{
            System.out.println(num+ " is not a palindrome but composite number");
        }
    }
}
