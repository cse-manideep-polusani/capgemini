import java.security.PublicKey;

//composition(Strong bond)
class Engine {
    private double cc;
    private int cylinderCount;
    private int hp;
    //parameterized constructor
    public Engine(double cc,int cylinderCount,int hp){
        this.cc=cc;
        this.cylinderCount=cylinderCount;
        this.hp=hp;
    }


    public double getCc(){
        return cc;
    }
    public int getCylinderCount() {
        return cylinderCount;
    }
    public int getHp(){
        return hp;
    }


    public void displayEngineInfo(){
        System.out.println("Engine Details");
        System.out.println("--------------");
        System.out.println("CC : "+getCc());
        System.out.println("Cylinder Count : "+getCylinderCount());
        System.out.println("Horse Power : "+getHp());
        System.out.println();
    }
}
