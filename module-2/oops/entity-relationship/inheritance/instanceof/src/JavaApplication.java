import javax.smartcardio.CardChannel;

class JavaApplication {
    public static void execution(){
        Parent p = new Parent();
        //check whether Parent object belongs to Parent or not by using instanceof.
        //instanceof checks non-primitive dataTypes like >,<,>=,<=,!= and return boolean value like true or false.

        //p belongs to Parent (true)
        System.out.println(p instanceof Parent);
        //p does not belongs to Child(false),but Child belongs to parent
        System.out.println(p instanceof Child);


        Child c = new Child();
        System.out.println(c instanceof Child);
        System.out.println(c instanceof Parent);


        //If we dont use extends  line 12 and 17 will be compile time error.
    }
}
