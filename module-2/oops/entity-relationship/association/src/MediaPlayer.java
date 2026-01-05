//Aggregation(weaker bond)
public class MediaPlayer {
    private String brand;
    private String make;
    private double price;
    //parameterized constructor
    public MediaPlayer(String brand,String make,double price){
        this.brand=brand;
        this.make=make;
        this.price=price;
    }


    //getter & setter method for brand
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }

    //getter & setter method for make
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }

    //getter & setter method for price
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    public void displayMediaPlayerInfo(){
        System.out.println("MediaPlayer Details");
        System.out.println("--------------");
        System.out.println("Brand : "+getBrand());
        System.out.println("Make : "+getMake());
        System.out.println("price : "+getPrice());
        System.out.println();
    }
}
