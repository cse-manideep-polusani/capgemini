// Interface definition
interface Interface {

    // Static method in interface
    // - Must have implementation
    // - Not inherited by implementing classes
    // - Called using interface name only
    public static void sm() {
        System.out.println("static sm() of interface MyInterface");
    }

    // Default method in interface (Java 8+)
    // - Non-static method with implementation
    // - Used to avoid abstract methods
    // - Can be overridden by implementing class
    public default void nsm1() {
        System.out.println("non static nsm1() of interface MyInterface");
    }

    // Abstract method in interface
    // - public and abstract by default
    // - Must be implemented by the concrete class
    public void nsm2();
}
