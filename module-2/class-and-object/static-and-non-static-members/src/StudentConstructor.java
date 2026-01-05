class StudentConstructor {
    int id;
    String name;
    String mailId;
    Long contactNumber;

//    //constructor
//    StudentConstructor(int a,String b,String c,Long d){
//        id=a;
//        name=b;
//        mailId=c;
//        contactNumber=d;
//    }

    StudentConstructor(int id,String name,String mailId,Long contactNumber){
        this.id=id;
        this.name=name;
        this.mailId=mailId;
        this.contactNumber=contactNumber;
    }
    static String city;
    static String state;
    static String country;
    static {
        city="Hyderabad";
        state="Telangana";
        country="India";
    }
    public void displayStudentDetails(){
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("mailId : "+mailId);
        System.out.println("Contact Number : "+contactNumber);
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("Country : "+country);
        System.out.println();
    }
}
