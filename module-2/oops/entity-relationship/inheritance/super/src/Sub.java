class Sub extends Super {
    public String nsv = "Sub";
    public void nsm(){
        System.out.println("nsm() of Sub class");
    }

    public void displaySubClassInfo(){
        //this keyword is not mandatory to use.Current class properties can be accessed without using this also.
        System.out.println("SubClassInfo");
        System.out.println(this.nsv);
        this.nsm();
        System.out.println();
    }

    public void displaySuperClassInfo(){
        System.out.println("SuperClassInfo");
        //super is only to access immediate parent of the class(Super).Not for grandParent.
        System.out.println(super.nsv);
        super.nsm();
        System.out.println();
    }
}
