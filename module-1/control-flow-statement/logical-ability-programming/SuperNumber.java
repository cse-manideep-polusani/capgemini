import java.util.Scanner;
class SuperNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int c=num;

        int evenDigitSum=0,oddDigitSum=0;
        while (num>0){
            int b=num%10;
            num/=10;
            if (b%2==0){
                evenDigitSum+=b;
            } else {
                oddDigitSum+=b;
            }
        }
        if (evenDigitSum==oddDigitSum){
            System.out.println(c +" is a Super Number");
        } else {
            System.out.println(c + " is not a Super Number");
        }
    }
}