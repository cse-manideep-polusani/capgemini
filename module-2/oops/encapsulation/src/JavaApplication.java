
import java.util.Scanner;

public class JavaApplication {
    static EmployeePojoClass E1;
    static void execution(){
        Student s1=new Student();


//        //Direct read operation-unsafe
//        System.out.println(s1.id);
//        System.out.println(s1.name);
//        //Direct write operation-unsafe
//        s1.id=1;
//        s1.name="Mani";
//        //Direct read operation-unsafe
//        System.out.println(s1.id);
//        System.out.println(s1.name);


//        //Indirect read operation-safe
//        System.out.println(s1.getId());
//        System.out.println(s1.getName());
//        //Indirect write operation-safe
//        s1.setId(1);
//        s1.setName("Mani");
//        //Indirect read operation-safe
//        System.out.println(s1.getId());
//        System.out.println(s1.getName());





//        Scanner sc = new Scanner(System.in);
//        int choice;
//
//        do{
//            System.out.println("\nSelect your choice:");
//            System.out.println("1.Create Employee");
//            System.out.println("2.Insert Employee");
//            System.out.println("3.Read Employee");
//            System.out.println("4.Update Employee");
//            System.out.println("5.Delete Employee");
//            System.out.println("6.Exit");
//
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            if (choice == 6){
//                System.out.println("Exiting,goodbye!");
//                System.out.println("Thank you,please visit again.");
//                break;
//            } else if (choice>6 || choice<1){
//                System.out.println("Invalid choice! Try again.");
//                continue;
//            }
//            switch(choice){
//                case 1:
//                    E1=new EmployeePojoClass();
//                    E1.createEmployeeDetails();
//                    break;
//                case 2:
//                    if (E1==null){
//                        System.out.println("Please create Employee object first.");
//                    } else {
//                        System.out.print("\nEnter Employee id: ");
//                        E1.setId(sc.nextInt());
//                        System.out.print("Enter Employee name: ");
//                        E1.setName(sc.next());
//                        System.out.print("Enter Employee email id: ");
//                        E1.setMailId(sc.next());
//                        System.out.print("Enter Employee contact number: ");
//                        E1.setContactNumber(sc.nextLong());
//                        System.out.println("\nEmployee details succesfully inserted");
//                        E1.insertEmployeeDetails();
//                    }
//                    break;
//                case 3:
//                    if (E1==null){
//                        System.out.println("Please create Employee object first.");
//                    } else {
//                        E1.readEmployeeDetails();
//                    }
//                    break;
//                case 4:
//                    if (E1==null){
//                        System.out.println("Please create Employee object first.");
//                    } else {
//                        System.out.print("\nEnter the new name of the Employee: ");
//                        E1.setName(sc.next());
//                        System.out.print("Enter the new email id of the Employee: ");
//                        E1.setMailId(sc.next());
//                        System.out.print("Enter the new contact number of the Employee: ");
//                        E1.setContactNumber(sc.nextLong());
//                        System.out.println("\nEmployee details successfully updated");
//                        E1.updateEmployeeDetails();
//                    }
//                    break;
//                case 5:
//                    if (E1==null){
//                        System.out.println("Please create Employee object first.");
//                    } else {
//                        E1.deleteEmployeeDetails();
//                        E1=null;
//                    }
//                    break;
//            }
//        }while(choice!=6);

    }
}
