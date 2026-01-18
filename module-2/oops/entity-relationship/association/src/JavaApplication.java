class JavaApplication {
    public static void execution(){
        //how to create space in car(object) to place media player and engine(objects).
        MediaPlayer mediaPlayer1 = new MediaPlayer("Bose","India",20000.00);

        //Dependency Injection - Constructor (Formal Way)
        Engine engine = new Engine(1200,4,1000);
        Car car=new Car("Kia","White","India",2000000.00,engine);
        car.displayCarDetails();
        car.getEngine().displayEngineInfo();

        System.out.println(engine.getCc());
        System.out.println(car.getEngine().getCc());

        //object injection(because of manual creation of mediaPlayer object)
        //Dependency Injection - Setter Method
        car.setMediaPlayer(mediaPlayer1);
        car.getMediaPlayer().displayMediaPlayerInfo();
    }
}
