class JavaApplication {
    public static void execution(){
//        System.out.println(Super.sv);
//        Super.sm();
//
//        Super sr  =new Super();
//        System.out.println(sr.nsv);
//        sr.nsm();


        //from parent(Super) to child class(Sub) only public can be inherited ,private cant be inherited.E
        System.out.println("------------");

        System.out.println(Sub.sv);
        Sub.sm();

        Sub sb = new Sub();
        System.out.println(sb.nsv);
        sb.nsm();
        System.out.println();



        SoftwareTrainer trainer = new SoftwareTrainer();

        // Parent class (Employee) data
        trainer.id = 201;
        trainer.name = "Suresh";
        trainer.emailId = "suresh@testyantra.com";
        trainer.contactNumber = 9876543210L;

        // Child class (SoftwareTrainer) data
        trainer.designation = "Senior Software Trainer";
        trainer.salary = 75000;
        trainer.role = "Java Full Stack Trainer";
        trainer.incentive = 5000;

        // Employee life cycle
        Employee.entry();
        Employee.login();
        Employee.shortBreak();
        Employee.meeting();

        // SoftwareTrainer specific behavior
        trainer.test();
        trainer.reverseKT();

        Employee.lunchBreak();
        Employee.logout();
        Employee.exit();
        System.out.println();


        // Display trainer information
        trainer.displaySoftwareTrainerInfo();

        // Static details
        System.out.println("Department : " + SoftwareTrainer.department);
        System.out.println("Branch     : " + SoftwareTrainer.branch);
        System.out.println("Company    : " + SoftwareTrainer.company);
        System.out.println("City       : " + Employee.city);
        System.out.println("State      : " + Employee.state);
        System.out.println("Country    : " + Employee.country);

    }
}
