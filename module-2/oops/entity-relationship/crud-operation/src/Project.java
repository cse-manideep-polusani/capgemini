public class Project {
    private int id;
    private String name;
    private  String description;

    //Non-parameterized constructor
    //not mandatory ,just created because of we follow pojo class model(1-non parameterized constructor is mandatory in pojo)
    public Project(){

    }
    //parameterized constructor
    public Project(int id,String name,String description){
        this.id=id;
        this.name=name;
        this.description=description;
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

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    public void displayProjectInfo(){
        System.out.println("Project Info");
        System.out.println("------------");
        System.out.println("Id : "+getId());
        System.out.println("Name : "+getName());
        System.out.println("Description : "+getDescription());
        System.out.println();
    }
}
