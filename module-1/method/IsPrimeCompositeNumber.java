import java.util.Scanner;
class IsPrimeCompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        int count=0;

        if (num <= 1) {
            System.out.println(num + " is neither prime nor composite.");
        } else {
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num+" is a prime number.");
            } else {
                System.out.println(num+" is a composite number.");
            }
        }
    }
}