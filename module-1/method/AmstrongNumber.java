import java.util.Scanner;
class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int y=  String.valueOf(num).length();

        int temp=num;
        int x=0;
        int digit;

        while(temp>0){
            digit=temp%10;
            x+=Math.pow(digit,y);
            temp/=10;

        }
        if(x==num){
            System.out.println(num+" is an Armstrong number.");
        } else {
            System.out.println(num+" is not an Armstrong number.");
        }
    }
}