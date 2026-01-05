import java.util.Scanner;

public class JavaApplication {
    static Teacher teacher1;
    public static void execution(){
        Student.city="Jalandhar";
        Student.state="Punjab";
        Student.country="India";

        Student student1 = new Student();
        System.out.println("student1 : "+student1);
        student1.id=1;
        student1.name="Raja";
        student1.mailId="raja@gmail.com";
        student1.contactNumber=9989114998L;
        student1.displayStudentDetails();

        Student student2 = new Student();
        System.out.println("student2 : "+student2);
        student2.id=2;
        student2.name="Rani";
        student2.mailId="rani@gmail.com";
        student2.contactNumber=9989585851L;
        student2.displayStudentDetails();


//        Employee.company="Capgemini";
//        Employee.city="Hyderabad";
//        Employee.state="Telangana";
//        Employee.country="India";
//
//        Employee E1 = new Employee();
//        System.out.println("Employee : "+E1);
//        E1.id=1;
//        E1.name="Mani";
//        E1.mailId="mani@gmail.com";
//        E1.contactNumber=9989585851L;
//        E1.aadhaarNumber=123456789999L;
//        E1.panNumber="IP1236K";
//        E1.dateOfBirth="23-12-2005";
//        E1.age=20;
//        E1.gender="Male";
//        E1.maritalStatus="Not Married";
//        E1.branch="Uppal";
//        E1.department="Development";
//        E1.reportingManager="Harish";
//        E1.designation="Software Engineer";
//        E1.salary=600000L;
//        E1.role="Frontend Developer";
//        E1.incentive=100000L;
//        E1.universalAmountNumber=123498895678L;
//        E1.yearOfExperience=0;
//        E1.displayEmployeeDetails();




//        System.out.println(Members.sv);
//        Members.sm();
//
//        Members members = new Members();
//
//
//        System.out.println(members.nsv);
//        members.nsm();




//        Scanner sc = new Scanner(System.in);
//        int choice;
//
//        do{
//            System.out.println("\nSelect your choice");
//            System.out.println("1.Create Teacher");
//            System.out.println("2.Insert Teacher");
//            System.out.println("3.Read Teacher");
//            System.out.println("4.Update Teacher");
//            System.out.println("5.Delete Teacher");
//            System.out.println("6.Exit");
//
//            System.out.print("Enter your choice: ");
//            choice=sc.nextInt();
//
//            if (choice == 6){
//                System.out.println("Exiting,goodbye!");
//                System.out.println("Thank you,please visit again.");
//                break;
//            } else if (choice>6 || choice<1){
//                System.out.println("Invalid choice! Try again.");
//                continue;
//            }
//
//            switch(choice){
//                case 1:
//                    teacher1=new Teacher();
//                    teacher1.createTeacherDetails();
//                    break;
//                case 2:
//                    if (teacher1==null){
//                        System.out.println("Please create teacher object first.");
//                    } else {
//                        System.out.print("\nEnter teacher id: ");
//                        teacher1.id=sc.nextInt();
//                        System.out.print("Enter teacher name: ");
//                        teacher1.name=sc.next();
//                        System.out.print("Enter teacher contact number: ");
//                        teacher1.contactNumber=sc.nextLong();
//                        System.out.println("\nTeacher details succesfully inserted");
//                        teacher1.insertTeacherDetails();
//                    }
//                    break;
//                case 3:
//                    if (teacher1==null){
//                        System.out.println("Please create teacher object first.");
//                    } else {
//                        teacher1.readTeacherDetails();
//                    }
//                    break;
//                case 4:
//                    if (teacher1==null){
//                        System.out.println("Please create teacher object first.");
//                    } else {
//                        System.out.print("\nEnter the new name of the teacher: ");
//                        teacher1.name=sc.next();
//                        System.out.print("Enter the new contact number of the teacher: ");
//                        teacher1.contactNumber=sc.nextLong();
//                        System.out.println("\nTeacher details successfully updated");
//                        teacher1.updateTeacherDetails();
//                    }
//                    break;
//                case 5:
//                    if (teacher1==null){
//                        System.out.println("Please create teacher object first.");
//                    } else {
//                        teacher1.deleteTeacherDetails();
//                        teacher1=null;
//                    }
//                    break;
//            }
//        }while(choice !=6 );



//        StudentInitializer student1 = new StudentInitializer();
//        student1.displayStudentDetails();
//
//        StudentInitializer student2 = new StudentInitializer();
//        student2.displayStudentDetails();


//        //Constructor
//        StudentConstructor student1 = new StudentConstructor(1,"Mani","Mani@gmail.com",98991881918L);
//        student1.displayStudentDetails();
//
//        StudentConstructor student2 = new StudentConstructor(2,"rani","rani@gmail.com",90019189202L);
//        student2.displayStudentDetails();




//        Scanner sc = new Scanner(System.in);
//        int choice;
//
//        SquareCubeSqrtCbrt obj = new SquareCubeSqrtCbrt();
//
//        do{
//            System.out.println("\nSelect your choice");
//            System.out.println("1.Square");
//            System.out.println("2.Cube");
//            System.out.println("3.Square Root");
//            System.out.println("4.Cube Root");
//            System.out.println("5.Exit");
//
//            System.out.print("Enter your choice: ");
//            choice=sc.nextInt();
//
//            if (choice == 5){
//                System.out.println("Exiting,goodbye!");
//                System.out.println("Thank you,please visit again.");
//                break;
//            } else if (choice>5 || choice<1){
//                System.out.println("Invalid choice! Try again.");
//                continue;
//            }
//
//            System.out.print("Enter a number: ");
//            obj.num = sc.nextInt();
//
//            switch(choice){
//                case 1:
//                    obj.Square();
//                    break;
//                case 2:
//                    obj.Cube();
//                    break;
//                case 3:
//                    obj.Sqrt();
//                    break;
//                case 4:
//                    obj.Cbrt();
//                    break;
//            }
//        } while (choice != 5);

    }
}
