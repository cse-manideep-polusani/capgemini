class Son extends Father {

    // @Override acts like a safety check.
    // It gives a Compile-Time Error (CTE) if the method name does not exactly match the parent class method.
    @Override
    public void carrer(){
        System.out.println("Future Doctor");
    }

    // Cannot override marriage() because it is declared as final in the Father class.
    // Final methods can be inherited but cannot be overridden.
    // @Override here would cause a Compile-Time Error.
//    @Override
//    public void marriage(){
//        System.out.println("Love Marriage");
//    }

    // Covariant return type:
    // While overriding a method, the child class can change the return type
    // to a subclass of the parent method’s return type.
    // Applicable only for non-primitive data types.
    // The access level of the overridden method must be the same or higher.
    @Override
    public ScientificCalculator buyCalculator(){
        return new ScientificCalculator();
    }
}
