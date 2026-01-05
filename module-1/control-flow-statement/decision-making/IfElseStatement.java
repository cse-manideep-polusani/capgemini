class IfElseStatement {
    public static void main(String[] args) {
        //If-Else Statement
        boolean like = true;
        System.out.println("Hi..!");
        if (like) {
            System.out.println("My Dear! How are you..!?");
        } else {
            System.out.println("Ohk.. Bye..!");
        }
        System.out.println("bhAAi..!");

        
        System.out.println("------------------------------------------------");


        int i=10;
        System.out.println("Content of i: " + i);

        int j=20;
        System.out.println("Content of j: " + j);

        if(i>j) {
            System.out.println("i is greater than j");
        } else {
            System.out.println("i is not greater than j");
        }

        System.out.println("------------------------------------------------");

        System.out.println("Statement 1");
        boolean val=true;
        if(!val) {
            System.out.println("Statement 3");
        }
        else if(!val) {
            System.out.println("Statement 4");
        }
        else {
            System.out.println("Statement 2");
        }
        System.out.println("Statement 5");


        System.out.println("------------------------------------------------");


        char signal='y';
        if((signal=='r') || (signal=='R')) {
            System.out.println("Red Signal: Stop");
        }
        else if((signal=='y') || (signal=='Y')) {
            System.out.println("Yellow Signal: Get Ready");
        }
        else if((signal=='g') || (signal=='G')) {
            System.out.println("Green Signal: Go");
        }
        else {
            System.out.println("Invalid Signal");
        }
    }
}