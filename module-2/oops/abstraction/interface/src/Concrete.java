import java.lang.Object;

// Concrete class implicitly extends Object
// and explicitly implements Interface
class Concrete extends Object implements Interface {

    // Compiler provides a default constructor
    // which internally calls Object's constructor
    Concrete() {
        super();   // call to Object()
    }

    // Overridden default method from interface
    @Override
    public void nsm1() {
        System.out.println("non static nsm1() of class Concrete");
    }

    // Implementation of abstract interface method
    @Override
    public void nsm2() {
        System.out.println("non static nsm2() of class Concrete");
    }
}
