public class news {
    public static void main(String[] args) {

        char ch = '.';
        System.out.println(ch);

        String str = "Hello, World";
        System.out.println(str);

        // 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 10 to 6
        for (int i = 10; i >= 6; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // A to E
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Z to V
        for (char c = 'Z'; c >= 'V'; c--) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
