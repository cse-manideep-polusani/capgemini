class NumberDisplayerSystem{
    public static void series(int start,int end){
        if (start<end){
            System.out.println("Forward series!");
            for (int i=start;i<=end;i++){
                System.out.print(i+" ");
            }
            System.out.println();
        } else if(start>end){
            System.out.println("Backward series!");
            for (int i=start;i>=end;i--){
                System.out.print(i+" ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid series!");
        }
        System.out.println();
    }
}