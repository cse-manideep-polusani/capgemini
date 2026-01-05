class Student {
    private int id;
    private String name;
    private String emailId;
    private long contactNumber;

    //Student HAS-A Project
    //Aggregation
    private Project project;


    //Non-parameterized constructor
    //not mandatory ,just created because of we follow pojo class model(1-non parameterized constructor is mandatory in pojo)
    public Student(){

    }
    //parameterized constructor
    public Student(int id,String name,String emailId,Long contactNumber){
        this.id=id;
        this.name=name;
        this.emailId=emailId;
        this.contactNumber=contactNumber;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId=emailId;
    }

    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }

    public Project getProject(){
        return project;
    }
    public void setProject(Project project){
        this.project=project;
    }

    public void displayStudentInfo(){
        System.out.println("Student Info");
        System.out.println("------------");
        System.out.println("Id : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Email id : "+getEmailId());
        System.out.println("Contact Number : "+getContactNumber());
        System.out.println();

    }
    public void createProject(Project project){
        if(this.project == null && project!=null){
            //we can write any one of those 2
            //this.project=project;
            this.setProject(project);
            System.out.println("Project Created");
        } else {
            System.out.println("Project Not Created!");
        }
    }

    public void readProject(){
        if(this.getProject() != null){
            this.getProject().displayProjectInfo();
            System.out.println("Project Displayed!");
        } else {
            System.out.println("Project Not Displayed");
        }
    }

    public void updateProject(int id,String name,String description){
        if (id > 0 && name != null && description != null) {
            if (this.getProject().getId() == id){
                this.getProject().setName(name);
                this.getProject().setDescription(description);
                System.out.println("Project Updated");
            } else {
                System.out.println("Project Not Updated");
            }
        } else {
            System.out.println("Invalid Data!");
        }
    }

    public void deleteProject(int id){
        if(id > 0){
            if(this.getProject().getId() == id){
                this.setProject(null);
                System.out.println("Project Deleted!");
            } else {
                System.out.println("Project Not Deleted!");
            }
        } else {
            System.out.println("Invalid Data!");
        }
    }
}

