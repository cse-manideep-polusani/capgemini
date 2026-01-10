class TypeCasting{
    public static void boxing(){
        int i=10;
        System.out.println("i is : "+i);
        Integer I = Integer.valueOf(i);//boxing
        System.out.println("I is : "+I);
        System.out.println();
    }

    public static void autoboxing(){
        int j=20;
        System.out.println("j is : "+j);
        Integer I = j;//autoboxing
        System.out.println("I is : "+I);
        System.out.println();
    }

    public static void unboxing(){
        Double D = Double.valueOf(12.34);
        System.out.println("D is : "+D);
        double d = D.doubleValue();//unboxing
        System.out.println("d is : "+d);
        System.out.println();
    }

    public static void autounboxing(){
        Double D = Double.valueOf(12.34);
        System.out.println("D is : "+D);
        double d = D;//auto-unboxing
        System.out.println("d is : "+d);
        System.out.println();
    }
}