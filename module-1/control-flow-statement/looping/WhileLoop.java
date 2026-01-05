class WhileLoop {
    public static void main(String[] args) {
        //while is entry checking loop,min execution count is 0
        // Using a while loop to print numbers from 1 to 5
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        // Using a while loop to print numbers from 5 to 1
        int j = 5;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
    }
}