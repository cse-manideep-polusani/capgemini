class JavaApplication {
    public static void execution(){
        System.out.println(BasicCalculator.addition(1,2));
        System.out.println(BasicCalculator.addition(1,2,3));
        System.out.println(BasicCalculator.addition(1.9,2.0));
        System.out.println(BasicCalculator.addition(1.9,2.9,3.9));
        System.out.println(BasicCalculator.addition(1,2.9));
        System.out.println(BasicCalculator.addition(1.9,2));

        //Non-static overloading
        Instagram user1=new Instagram();
        user1.login("Manideep","Mani@1456");

        Instagram user2=new Instagram();
        user2.login("Manideep","Mani@1456","A1In7Uj");

        Instagram user3=new Instagram();
        user3.login("Manideep@gmail.com","1456");

        Instagram user4=new Instagram();
        user4.login(9989585851l,1456);

        //Constructor overloading(act like service provider for end user)
        Student s1 = new Student("Rani",'F',"21/01/2019");
        s1.displayStudentDetails();

        Student s2 = new Student("Rani",'F',"21/01/2019","Rani@gmail.com");
        s2.displayStudentDetails();

        Student s3 = new Student("Rani",'F',"21/01/2019","Rani@gmail.com",9989585851l);
        s3.displayStudentDetails();


        // Internal constructor chaining:
        // When a child class object is created,
        // the parent class constructor is called automatically first.
        Son son = new Son();
    }
}
