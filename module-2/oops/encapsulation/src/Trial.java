import java.util.Scanner;

public class Trial {

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();   // read name
        int a = sc.nextInt();           // read age

        myMethod(firstName, a);         // method call
    }
}
