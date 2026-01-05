import java.util.Scanner;
class JavaApplication {
    public static void execution() {
        //static method call,giving inputs statically or initializing variables
        //static inputs
        ArithmaticOperator.addition(8,5);
        ArithmaticOperator.subtraction(20,10);
        ArithmaticOperator.multiplication(5,4);
        ArithmaticOperator.division(20,5);
        ArithmaticOperator.modulus(20,3);
        NumberDisplayerSystem.series(10,20);
        NumberDisplayerSystem.series(20,10);
        NumberDisplayerSystem.series(10,10);

        //Dynamic inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of start:");
        int s =sc.nextInt();
        System.out.println("Enter value of end:");
        int e =sc.nextInt();
        NumberDisplayerSystem.series(s,e);
        
    }
}
