import java.util.Scanner;
class IsDeficientPerfectAbundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int sumOfDivisors = 0;

        for(int i=1;i<num;i++){
            if (num%i==0) {
                sumOfDivisors+=i;
            }
        }

        if (sumOfDivisors < num) {
            System.out.println(num + " is a Deficient number.");//13
        } else if (sumOfDivisors == num) {
            System.out.println(num + " is a Perfect number.");//6
        } else {
            System.out.println(num + " is an Abundant number.");//12
        }

    }
}
