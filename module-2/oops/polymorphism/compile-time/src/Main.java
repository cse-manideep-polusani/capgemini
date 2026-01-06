class Main{
    //we can overload main method also,but (String[] args) will only loaded.

    static void main(String[] args) {
        JavaApplication.execution();
    }

//    //if we have more than one (String[] args) ,it will give CTE .
//    static void main(String[] args) {
//        System.out.println("main method");
//    }

    static void main(char c) {
        System.out.println("mani(char)");
    }

    static void main() {
        System.out.println("main()");
    }
}