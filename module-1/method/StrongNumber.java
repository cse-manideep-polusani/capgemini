import java.util.Scanner;
public class StrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int temp=num;
        int digit;
        int factorialSum=0;

        while (temp>0){
            digit=temp%10;
            int factorial=1;
            for(int i=2;i<=digit;i++){
                factorial*=i;
            }
            factorialSum+=factorial;
            temp/=10;
        }

        if (factorialSum==num){
            System.out.println(num+" is a Strong Number");
        } else {
            System.out.println(num+" is not a Strong Number");
        }
    }
}
