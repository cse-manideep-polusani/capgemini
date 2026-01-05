class DoWhileLoop {
    public static void main(String[] args) {
        //Do while is exit checking loop,min execution count is 1
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        System.out.println();

        int j = 5;
        do {
            System.out.println(j);
            j--;
        } while (j >= 1);
    }
}