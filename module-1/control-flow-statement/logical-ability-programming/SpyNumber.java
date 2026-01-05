import java.util.Scanner;
class SpyNumber {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();

        int b=num;
        int digitSum=0,digitProduct=1;
        while (num>0) {
            digitSum+=num%10;
            digitProduct*=num%10;
            num/=10;
        }

        if (digitSum==digitProduct) {
            System.out.println(b +" is a Spy Number");
        } else {
            System.out.println(b + " is not a Spy Number");
        }
    }
}