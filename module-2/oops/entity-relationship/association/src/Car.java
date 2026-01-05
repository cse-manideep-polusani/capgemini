class Car {
    private String brand;
    private String color;
    private String make;
    private double price;
    //constructor injection
    private Engine engine;
    //use public in constructor car ,for pojo class
    public Car(String brand,String color,String make,double price,Engine engine){
        this.brand=brand;
        this.color=color;
        this.make=make;
        this.price=price;
        this.engine=engine;
    }

      //Informal way

//    //created space to place engine,media player(objects) in car(object)
//    //Composition.(First engine should be created then place it in car)
//    //Car HAS-A Engine
//    private Engine engine = new Engine(1200.00,4,5000);

    //Car HAS-A Media Player
    //Aggregation(Manual installation any time)
    //some empty space should be left for mediaPlayer to place in car.
    private MediaPlayer mediaPlayer;

    public String getBrand(){
        return brand;
    }

    public  String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public  String getMake(){
        return make;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }

    //READ ONLY
    public Engine getEngine(){
        return engine;
    }


    //READ ONLY
    public MediaPlayer getMediaPlayer(){
        return mediaPlayer;
    }
    //WRITE ONLY
    public void setMediaPlayer(MediaPlayer mediaPlayer){
        this.mediaPlayer=mediaPlayer;
    }

    public void displayCarDetails(){
        System.out.println("Car Details");
        System.out.println("--------------");
        System.out.println("Brand : "+getBrand());
        System.out.println("Color : "+getColor());
        System.out.println("Made In: "+getMake());
        System.out.println("Price : "+getPrice());
        System.out.println();
    }
}
