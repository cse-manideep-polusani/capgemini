// Not required to import explicitly.
// java.lang package is imported automatically by the compiler.
import java.lang.Object;
class Student extends Object {
    // Every Java class implicitly extends java.lang.Object.
    // Writing "extends Object" is OPTIONAL and usually NOT written in real code.
    // It is written here only to show that the compiler adds it automatically.

    String name;
    char gender;
    String dob;
    String mailId;
    Long contactNumber;

    // This constructor initializes only basic student details.
    // super() calls the constructor of the parent class (Object).
    // Even if super() is not written, the compiler automatically inserts it.
    Student(String name, char gender, String dob){
        super();   // Calls Object class constructor (implicitly added by compiler if not added manually)
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }


//    Student(String name,char gender,String dob,String mailId){
//        this.name=name;
//        this.gender=gender;
//        this.dob=dob;
//        this.mailId=mailId;
//    }

    // Constructor chaining:
    // this() calls another constructor of the SAME class.
    // It must be the first statement in the constructor.
    Student(String name,char gender,String dob,String mailId){
        this(name,gender,dob);//this() → calls constructor of same class
        this.mailId=mailId;
    }



//    Student(String name,char gender,String dob,String mailId,long contactNumber){
//        this.name=name;
//        this.gender=gender;
//        this.dob=dob;
//        this.mailId=mailId;
//        this.contactNumber=contactNumber;
//    }

    // Constructor chaining:
    // First executes the previous constructor,
    // then initializes the contact number.
    Student(String name,char gender,String dob,String mailId,long contactNumber){
        this(name,gender,dob,mailId);//this() → calls constructor of same class
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
