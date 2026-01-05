class Teacher {
    int id;
    String name;
    Long contactNumber;

    public void createTeacherDetails(){
        System.out.println("New Teacher succesfully created");
    }

    public void insertTeacherDetails(){
        System.out.println("\nTeacher Details");
        System.out.println("-----------------");
        System.out.println("Teacher id: "+id);
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher contact number: "+contactNumber);
    }

    public void readTeacherDetails(){
        System.out.println("Teacher id: "+id);
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher contact number: "+contactNumber);
    }

    public void updateTeacherDetails(){
        System.out.println("\n Updated Teacher Details");
        System.out.println("--------------------------");
        System.out.println("Teacher id: "+id);
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher contact number: "+contactNumber);
    }

    public void deleteTeacherDetails(){
        System.out.println("Teacher object deleted succesfully");
    }
}
