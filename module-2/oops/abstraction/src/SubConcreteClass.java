// Concrete class implementing the interface
class SubConcreteClass implements SuperInterface {

    // implements → used when a class uses an interface
    // extends    → used between classes (parent → child)

    // Mandatory to override abstract methods of interface
    @Override
    public void nsm() {
        System.out.println("non static nsm() of class SubConcreteClass");
    }
}
