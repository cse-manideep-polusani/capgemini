class SwitchCaseStatement {
    public static void main(String[] args) {

        System.out.println("start");
        int choice = 3;
        switch (choice) {
            // //old version
            // case 1: {
            //     System.out.println("You selected option 1");
            // }
            // break;
            // case 2: {
            //     System.out.println("You selected option 2");
            // }
            // break;
            // case 3: {
            //     System.out.println("You selected option 3");
            // }
            // break;
            // default: {
            //     System.out.println("Invalid option selected");
            // }

            //latest version
            case 1 -> System.out.println("You selected option 1");
            case 2 -> System.out.println("You selected option 2");
            case 3 -> System.out.println("You selected option 3");
            default -> System.out.println("Invalid option selected");
        }
        System.out.println("end");
    }
}
