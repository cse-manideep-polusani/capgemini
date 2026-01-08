// Interface
interface SuperInterface {

    // By default, interface variables are:
    // public static final
    // → They are constants
    char c = 'I';

    // Interface static methods:
    // - Must have body
    // - Cannot be overridden
    // - Called using interface name only
    public static void sm() {
        System.out.println("static sm() of interface SuperInterface");
    }

    // By default, non-static methods in interface are:
    // public abstract
    // So no method body is allowed
    public void nsm();
}
