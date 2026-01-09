class JavaApplication {
    public static void execution(){
        Interface.sm();
        Concrete concrete =new Concrete();
        concrete.nsm1();
        concrete.nsm2();


        TextBook textBook = new TextBook();
        textBook.read();

        NoteBook noteBook = new NoteBook();
        noteBook.write();
    }
}
