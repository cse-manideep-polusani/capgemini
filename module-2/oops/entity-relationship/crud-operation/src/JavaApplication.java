class JavaApplication {
    public static void execution(){
        Student student = new Student(1,"Rani","rani@gmail.com",9876543210L);
        student.displayStudentInfo();

        Project project = new Project(1,"E-Commerce","Java based web application");

        //Student will create a new project
        student.createProject(project);

        //Student will Read the Existing Project
        student.readProject();

        //Student will update the Existing Project
        student.updateProject(1,"Car Rental System","Python based web application");

        //Student will Delete the Existing project
        student.deleteProject(1);
    }
}
