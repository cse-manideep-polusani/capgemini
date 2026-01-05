import java.util.Scanner;
class MultiplicationTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num=sc.nextInt();

        System.out.println(num+" Table");
        System.out.println("-------------");
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+ i + " = " + (num*i));
        }
    }
}