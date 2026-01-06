class Son extends Father {

    // Child class constructor.
    // Even though super() is not written explicitly,
    // the Java compiler automatically inserts super() as the first statement.
    // super() calls the Father class constructor to initialize
    // the parent part of the Son object.
    Son(){
        // super();   // inserted automatically by the compiler
        System.out.println("Son()");
    }
}
