class Father {

    public void carrer(){
        System.out.println("Future Engineer");
    }

    // Final methods CANNOT be overridden.
    // They can be inherited by the child class, but their implementation cannot be changed.
    // If we try to override a final method, the compiler gives a Compile-Time Error (CTE).
    public final void marriage(){
        System.out.println("Arranged Marriage");
    }

    // This method returns a BasicCalculator object.
    // It can be overridden in the child class using a covariant return type.
    public BasicCalculator buyCalculator(){
        return new BasicCalculator();
    }
}
