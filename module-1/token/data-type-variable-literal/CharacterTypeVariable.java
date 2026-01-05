// Demonstration of char data type in Java
class CharacterTypeVariable {

    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. char can store ONLY a single character
        // --------------------------------------------------
        // It must be written inside SINGLE QUOTES (' ')
        // Using empty '' or more than one character like 'AB'
        // will cause a COMPILE-TIME ERROR

        char ch1 = '1';
        System.out.println(ch1);   // Output: 1

        char ch2 = 'A';
        System.out.println(ch2);   // Output: A


        // --------------------------------------------------
        // 2. char can store numeric values (Unicode values)
        // --------------------------------------------------
        // Java uses UNICODE, so numbers map to characters
        // Unicode value of 'A' is 65

        char ch3 = 65;
        System.out.println(ch3);   // Output: A

        char ch4 = 97;
        System.out.println(ch4);   // Output: a


        // --------------------------------------------------
        // 3. char supports arithmetic operations
        // --------------------------------------------------
        // 'A' has Unicode value 65
        // 'A' + 1 = 66 → 'B'

        char ch5 = 'A' + 1;
        System.out.println(ch5);   // Output: B


        // --------------------------------------------------
        // 4. char to int conversion (implicit)
        // --------------------------------------------------
        // When a char is assigned to int, its Unicode value is stored

        char ch6 = 'Z';
        int value = ch6;
        System.out.println(value); // Output: 90


        // --------------------------------------------------
        // 5. int to char conversion (explicit casting)
        // --------------------------------------------------
        int num = 66;
        char ch7 = (char) num;
        System.out.println(ch7);   // Output: B


        // --------------------------------------------------
        // 6. Special characters using escape sequences
        // --------------------------------------------------

        char newline = '\n';   // New line
        char tab = '\t';       // Tab space
        char singleQuote = '\''; // Single quote
        char backslash = '\\'; // Backslash

        System.out.println("Hello" + newline + "World");
        System.out.println("Java" + tab + "Programming");
        System.out.println(singleQuote);
        System.out.println(backslash);

    }
}
