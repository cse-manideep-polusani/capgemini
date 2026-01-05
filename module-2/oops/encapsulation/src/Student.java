//pojo class(plain old java object)
//properties of pojo class
//1)public class ,2)public no argument constructor,3)private non static variables,4)public getter and setter.
//encapsulation
public class Student {
    private int id;
    private String name;

    //getter method
    public int getId(){
        return id;
    }
    //setter method(setting new data into var)
    public void setId(int id){
        this.id=id;
    }


    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
