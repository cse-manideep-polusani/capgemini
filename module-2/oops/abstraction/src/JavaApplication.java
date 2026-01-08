public class JavaApplication {
    public static void execution(){
        State s = new Punjab();
        s.regionalLanguage();

        State s1 = new Telangana();
        s1.regionalLanguage();

        SoftwareDeveloper  softwareDeveloper = new SoftwareDeveloper(1,"Rani","rani@gmail.com",
                9976543210l, "Associate Software Engineer",969999.99,
                "Java Developer",63636363.6535);

        softwareDeveloper.employeeInfo();
        softwareDeveloper.entry();
        softwareDeveloper.login();
        softwareDeveloper.meeting();
        softwareDeveloper.reverseKT();
        softwareDeveloper.task();
        softwareDeveloper.logout();
        softwareDeveloper.exit();



        // Interface variables are by default:
        // public static final
        // So they can be accessed using interface name
        System.out.println(SuperInterface.c);

        // ❌ Not allowed because 'c' is final (constant)
        // SuperInterface.c = 'J';

        // Static methods of interface are called
        // using interface name only
        SuperInterface.sm();

        //Static methods cant be inherited from interface to sub type.So we cant call by using sub class.
        //SubConcreteClass.sm();

        System.out.println();

        // Interface variable can also be accessed
        // using implementing class name (not recommended but allowed)
        System.out.println(SubConcreteClass.c);

        // Creating object of implementing class
        SubConcreteClass subConcreteClass = new SubConcreteClass();

        // Calling non-static method implemented from interface
        subConcreteClass.nsm();

    }
}
