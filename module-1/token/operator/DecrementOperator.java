class DecrementOperator {
    public static void main(String[] args) {
        int i=10;
        System.out.println("Content of i: "+i);

        // pre-decrement: decrements i, then returns i
        System.out.println("content of i after pre-decrement: "+(--i)); // prints 9
        System.out.println("content of i: "+i);   // i is now 9, prints 9

        // post-decrement: returns i, then decrements i
        System.out.println("content of i after post-decrement: "+(i--)); // prints 9
        System.out.println("content of i: "+i);   // i is now 8,prints 8
        System.out.println();

        int k=34;
        System.out.println("Content of k: "+k);

        int l=75;
        System.out.println("Content of l: "+l);

        int inc = k-- + --l + --k + l--;
        System.out.println("content of inc: "+inc); // prints 214
        System.out.println("content of k: "+k); // prints 32
        System.out.println("content of l: "+l); // prints 73

    }
}