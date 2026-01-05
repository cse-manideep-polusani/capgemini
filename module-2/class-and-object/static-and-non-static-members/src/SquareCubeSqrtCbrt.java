class SquareCubeSqrtCbrt {
    int num;
    int sqrt;
    int cbrt;
    public void Square(){
        System.out.println("Square of "+num+" is = "+(num*num));
    }

    public void Cube(){
        System.out.println("Cube of "+num+" is = "+(num*num*num));
    }

    public void Sqrt(){
        sqrt=-1;
        if ((num==0) || (num==1)) {
            System.out.println("Square root of "+ num + " is = "+num);
        } else if(num<0){
            System.out.println(num+" is not a perfect square");
        } else {
            for(int i=1;i<=num;i++){
                if (i*i==num){
                    sqrt=i;
                    break;
                }
            }
            if (sqrt!=-1){
                System.out.println("Square root of "+ num + " is = "+sqrt);
            } else {
                System.out.println(num+" is not a perfect square");
            }
        }
    }

    public void Cbrt(){
        cbrt=-1;
        if ((num==0) || (num==1)) {
            System.out.println("Cube root of "+ num + " is = "+num);
        } else if(num<0){
            System.out.println(num+" is not a perfect cube root");
        } else {
            for(int i=1;i<=num;i++){
                if (i*i*i==num){
                    cbrt=i;
                    break;
                }
            }
            if (cbrt!=-1){
                System.out.println("Cube root of "+ num + " is = "+cbrt);
            } else {
                System.out.println(num+" is not a perfect Cube");
            }
        }
    }
}
