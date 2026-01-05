class ConditionalOperator{
    public static void main(String args[]){
        int a=10;
        System.out.println("Content of a: "+a);

        int b=20;
        System.out.println("Content of b: "+b);

        int max=(a>b)?a:b;
        //Inderect utilization
        System.out.println("Maximum value is: "+max);

        //Direct utilization
        //if expression1 and expression2 are of different data type we cannot use indirect utilization
        System.out.println((a>b)? "Max" : '0'); 
    }
}