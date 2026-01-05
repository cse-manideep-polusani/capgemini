class ForLoop{
    public static void main(String[] args) {
        // Using a for loop to print numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("-------------------------------------------");
        
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("-------------------------------------------");

        //to print even numbers from 2 to 10
        for(int i=2;i<=10;i+=2){
            System.out.println(i);
        }


        System.out.println("-------------------------------------------");
        //to print number from 1 to 10 except 3,4
        for(int i=1;i<=10;i++){
            if(i==3 || i==4){
                continue; //skip the iteration
            }
            System.out.println(i);
        }
    }
}