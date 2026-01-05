class ShiftOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = -8;

        // -------------------------------
        // 1. Left Shift Operator (<<)
        // -------------------------------
        // Shifts bits to the left,fills 0 in the rightmost bits
        // a << b = a * 2^b

        System.out.println("Left Shift:");
        System.out.println("a << b = " + (a << b));   // 1280

        // -------------------------------
        // 2. Right Shift Operator (>>)
        // -------------------------------
        // Shifts bits to the right ,Preserves the sign bit
        // a >> b = a / 2^b

        System.out.println("\nRight Shift (Signed):");
        System.out.println("a >> b = " + (a >> b)); // 2

        // -------------------------------
        // 3. Unsigned Right Shift (>>>)
        // -------------------------------
        // Shifts bits to the right,Fills 0 in the leftmost bits

        System.out.println("\nUnsigned Right Shift:");
        System.out.println("b >>> 1 = " + (b >>> 1)); 
    }
}
