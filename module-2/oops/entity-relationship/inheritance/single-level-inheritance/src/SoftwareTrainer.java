class SoftwareTrainer extends Employee {
    String designation;
    double salary;
    String role;
    double incentive;
    static String department;
    static String branch;
    static String company;
    static {
        department = "Software Training";
        branch = "Jalandhar";
        company = "Test Yantra";
        city = "Amritsar";
        state = "Punjab";
        country = "India";
    }
    public void test(){
        System.out.println("Training the Trainee's");
    }
    public void reverseKT(){
        System.out.println("Explanation about latest Software Development and Testing Tools and technologies");
    }
    public void displaySoftwareTrainerInfo(){
        System.out.println("Software Trainer Info");
        System.out.println("---------------------");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Mail Id : "+emailId);
        System.out.println("Contact Number : "+contactNumber);
        System.out.println("Designation : "+designation);
        System.out.println("Salary : "+salary);
        System.out.println("Role : "+role);
        System.out.println("Incentive : "+incentive);
    }
}
