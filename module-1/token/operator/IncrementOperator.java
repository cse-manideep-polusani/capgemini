class IncrementOperator{
    public static void main(String args[]){
        int i=10;
        System.out.println("Content of i: "+i);

        // pre-increment: increments i, then returns i
        System.out.println("content of i after pre-increment: "+(++i)); // prints 11
        System.out.println("content of i: "+i);   // i is now 11, prints 11

        // post-increment: returns i, then increments i
        System.out.println("content of i after post-increment: "+(i++)); // prints 11
        System.out.println("content of i: "+i);   // i is now 12,prints 12
        System.out.println();

        int k=10;
        System.out.println("Content of k: "+k);

        int l=20;
        System.out.println("Content of l: "+l);

        int inc= ++k - l++ + k++ - ++l;
        System.out.println("content of inc: "+inc); // prints -20

        System.out.println("content of k: "+k); // prints 11
        System.out.println("content of l: "+l); // prints 22
    }
}