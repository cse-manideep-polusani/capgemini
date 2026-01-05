class Student {
    //blank final non-static variables
    final int id;
    final String name;
    final String mailId;
    final Long contactNumber;
    Student(int id,String name,String mailId,Long contactNumber){
        this.id=id;
        this.name=name;
        this.mailId=mailId;
        this.contactNumber=contactNumber;
    }
    //blank final static variables
    static final String city;
    static final String state;
    static final String country;
    static {
        city = "Jalandhar";
        state = "Punjab";
        country = "India";
    }
    public void displayStudentInfo(){
//        final int id=1;
//        //cant change id,because of final keyword.(CTE)
//        //id=2;
//        String mailId="Mani@gmail.com";
//        //Re-Initialisation,for updating mailId.
//        mailId="Mani1@gmail.com";
//        System.out.println("Id : "+id);
//        System.out.println("Mail Id : "+mailId);

        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Mail Id : "+mailId);
        System.out.println("Contact Number : "+contactNumber);
        System.out.println("City : "+city);
        System.out.println("State : "+state);
        System.out.println("Country : "+country);
        System.out.println();
    }
}
