class BitwiseOperator {
    public static void main(String[] args) {

        int a = 5;  // 0101 in binary
        System.out.println("Initial value of a: " + a);

        int b = 3;  // 0011 in binary
        System.out.println("Initial value of b: " + b);

        //if both are 1 then only 1 else 0
        int andResult = a & b; // Bitwise AND: 0001 (1 in decimal)

        //if any one is 1 then 1 else 0
        int orResult = a | b;  // Bitwise OR:  0111 (7 in decimal)

        //if both are different then 1 else 0
        int xorResult = a ^ b; // Bitwise XOR: 0110 (6 in decimal)

        //~a=-(a+1)
        int notResult = ~a;    // Bitwise NOT: 1010 (-6 in decimal)

        System.out.println("Bitwise AND: " + andResult);
        System.out.println("Bitwise OR: " + orResult);
        System.out.println("Bitwise XOR: " + xorResult);
        System.out.println("Bitwise NOT of a: " + notResult);
    }
}