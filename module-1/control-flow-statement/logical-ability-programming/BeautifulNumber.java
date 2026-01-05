import java.util.Scanner;
class BeautifulNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int b=num;

        int evenDigitCount=0,oddDigitCount=0;
        while (num>0){
            int c=num%10;
            num/=10;
            if (c%2==0){
                evenDigitCount++;
            } else {
                oddDigitCount++;
            }
        }
        if (evenDigitCount==oddDigitCount){
            System.out.println(b +" is a Beautiful Number");
        } else {
            System.out.println(b + " is not a Beautiful Number");
        }
    }

}