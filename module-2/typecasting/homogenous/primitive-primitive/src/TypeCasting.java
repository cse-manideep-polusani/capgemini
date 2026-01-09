class TypeCasting {
//    public static void  widening(){
//        int i=10;
//        System.out.println("i is : "+i);
//        double d=i;
//        System.out.println("d is : "+d);
//        System.out.println();
//
//        char c = 'A';
//        System.out.println("c is : "+c);
//        int i1 = c;
//        System.out.println("i is : "+i1);
//        System.out.println();
//    }

    public static int widening(char c){
        return c;
    }

//    public static void narrowing(){
//        double d=10.98;
//        System.out.println("d is : "+d);
//        int i =(int)d;
//        System.out.println("i is : "+i);
//        System.out.println();
//
//        int i1 = 122;
//        System.out.println("i is : "+i1);
//        char c = (char)i1;
//        System.out.println("c is : "+c);
//        System.out.println();
//    }

    public static char narrowing(int i){
        return (char)i;
    }
}
