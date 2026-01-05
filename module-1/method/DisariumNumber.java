import java.util.Scanner;
public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num=sc.nextInt();

        int temp=num;
        int digit;
        int length = String.valueOf(num).length();
        int total=0;

        while (temp>0){
            digit=temp%10;
            total+=Math.pow(digit,length);
            length--;
            temp/=10;
        }

        if (total==num){
            System.out.print(num+" is a Disarium number");
        } else {
            System.out.print(num+" is not a Disarium number");
        }
    }
}
