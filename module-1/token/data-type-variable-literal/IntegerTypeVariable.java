class IntegerTypeVariable {
    public static void main(String[] args) {

        byte byteTypeVariable=127; //-128 to 127
        System.out.println(byteTypeVariable);

        short shortTypeVariable=32767; //-32,768 to 32,767
        System.out.println(shortTypeVariable);

        int intTypeVariable=50000; //-2,147,483,648 to 2,147,483,647
        System.out.println(intTypeVariable);

        //l or L is mandatory for long literal
        long longTypeVariable= 2147483648l; //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println(longTypeVariable);
    }
}