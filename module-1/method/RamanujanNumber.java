import java.util.Scanner;
public class RamanujanNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number:");
        num=sc.nextInt();
        int temp=num;
        int digitSum=0;

        while (temp>0){
            digitSum+=temp%10;
            temp/=10;
        }
        int rev=0;
        int tempDigitSum=digitSum;
        int rem=0;
        while (tempDigitSum>0){
            rem=tempDigitSum%10;
            rev=(rev*10)+rem;
            tempDigitSum/=10;
        }

//        System.out.println(digitSum);
//        System.out.println(rev);
        if (rev*digitSum == num){
            System.out.println(num+" is a ramanujan number");
        } else{
            System.out.println(num+"is not a ramanujan number");
        }
    }
}
