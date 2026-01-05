class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);

        a += b; // Equivalent to a = a + b
        System.out.println("After a += b, value of a: " + a);

        a -= b; // Equivalent to a = a - b
        System.out.println("After a -= b, value of a: " + a);

        a *= b; // Equivalent to a = a * b
        System.out.println("After a *= b, value of a: " + a);

        a /= b; // Equivalent to a = a / b
        System.out.println("After a /= b, value of a: " + a);

        a %= b; // Equivalent to a = a % b
        System.out.println("After a %= b, value of a: " + a);
    }
}