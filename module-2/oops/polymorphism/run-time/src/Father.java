class Father {
    public void carrer(){
        System.out.println("Future Engineer");
    }

    //Final method cant be overridden ,if we try to Override it give CTE.able to inherit but cant change it.
    //Static methods cant be overridden,it is called overhiding.
    public final void marriage(){
        System.out.println("Arranged Marriage");
    }

    public BasicCalculator buyCalculator(){
        return new BasicCalculator();
    }
}
