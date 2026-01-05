import java.util.Scanner;
class AutoBiographicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //to find the length of the number
        //int length = String.valueOf(num).length();

        int b=num;
        int digitCount=0,sumOfDigits=0;
        while ( num>0) {
            sumOfDigits+=num % 10;
            num/=10;
            digitCount++;
        }
        if (sumOfDigits==digitCount) {
            System.out.println(b +" is a Autobiographical Number");
        } else {
            System.out.println(b + " is not a Autobiographical Number");
        }
    }
}