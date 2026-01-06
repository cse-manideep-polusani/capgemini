class Son extends Father {
    //@Override Act like alarm and give CTE if we mismatched method name in inheritance.
    @Override
    public void carrer(){
        System.out.println("Future Doctor");
    }

//    @Override
//    public void marriage(){
//        System.out.println("Love Marriage");
//    }

    //Variance--->Covariant return type.
    //we can change return type of method by using Covariant.
    //Only applicable for Non-Primitive Data Types.
    //While overriding method should have equal or higher accessibility.
    @Override
    public ScientificCalculator buyCalculator(){
        return new ScientificCalculator();
    }
}
