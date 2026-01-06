class Student {
    String name;
    char gender;
    String dob;
    String mailId;
    Long contactNumber;

    Student(String name,char gender,String dob){
        this.name=name;
        this.gender=gender;
        this.dob=dob;
    }
    Student(String name,char gender,String dob,String mailId){
        this.name=name;
        this.gender=gender;
        this.dob=dob;
        this.mailId=mailId;
    }
    Student(String name,char gender,String dob,String mailId,long contactNumber){
        this.name=name;
        this.gender=gender;
        this.dob=dob;
        this.mailId=mailId;
        this.contactNumber=contactNumber;
    }


    public void displayStudentDetails(){
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Date of birth : "+dob);
        System.out.println("Mail Id : "+mailId);
        System.out.println("Contact Number : "+contactNumber);
        System.out.println();
    }
}
