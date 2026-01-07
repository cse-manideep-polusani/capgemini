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
    }
}
