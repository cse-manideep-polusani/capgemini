public class Student {
    int id;
    String name;
    String mailId;
    Long contactNumber;
    static String city;
    static String state;
    static String country;

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
