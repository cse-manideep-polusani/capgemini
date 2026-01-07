class SoftwareDeveloper extends Employee {
    String designation;
    double salary;
    String role;
    double incentive;
    static String branch;
    static String department;
    static String company;
    static {
        city = "Jalandhar";
        state = "Punjab";
        country = "India";
        branch = "Amritsar";
        department = "SoftwareDeveloper";
        company = "Capgemini";
    }
    SoftwareDeveloper
            (int id,String name,String emailId,long contactNumber,
             String designation,double salary,String role,double  incentive)
    {
        super(id,name,emailId,contactNumber);
        this.designation=designation;
        this.salary=salary;
        this.role=role;
        this.incentive=incentive;
    }
    @Override
    public void reverseKT(){
        System.out.println("Explanation about Latest SoftwareDevelopment Tools and Techniques");
    }
    @Override
    public void task(){
        System.out.println("Software Development");
    }
    @Override
    public void employeeInfo(){
        System.out.println("Employee Info");
        System.out.println("-------------");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Email Id : "+emailId);
        System.out.println("Contact Number : "+contactNumber);
        System.out.println();
    }

}
