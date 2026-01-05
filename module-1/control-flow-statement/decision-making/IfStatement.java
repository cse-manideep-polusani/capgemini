class IfStatement {
    public static void main(String[] args) {

        //Every thing will be executed sequentially
        /* boolean like = true;
        System.out.println("Hi..!");
        if (like) {
            System.out.println("My Dear! How are you..!?");
        }
        System.out.println("Bye..!"); */


        //If condition is false,except if block evrything will be executed sequentially
        boolean like = false;
        System.out.println("Hi..!");
        if (like) {
            System.out.println("My Dear! How are you..!?");
        }
        System.out.println("bhAAi..!");
    }
}