public class EmployeePojoClass {

    private int id;
    private String name;
    private String mailId;
    private Long contactNumber;

    static String city;
    static String state;
    static String country;

    // Static block
    static {
        city = "Hyderabad";
        state = "Telangana";
        country = "India";
    }

    // Getter & Setter for id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Getter & Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter & Setter for mailId
    public String getMailId() {
        return mailId;
    }
    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    // Getter & Setter for contactNumber
    public long getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Create
    public void createEmployeeDetails() {
        System.out.println("New Employee successfully created");
    }

    // Insert
    public void insertEmployeeDetails() {
        System.out.println("\nEmployee Details");
        System.out.println("-----------------");
        System.out.println("Employee id: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee mail id: " + getMailId());
        System.out.println("Employee contact number: " + getContactNumber());
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }

    // Read
    public void readEmployeeDetails() {
        System.out.println("Employee id: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee mail id: " + getMailId());
        System.out.println("Employee contact number: " + getContactNumber());
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }

    // Update
    public void updateEmployeeDetails() {
        System.out.println("\nUpdated Employee Details");
        System.out.println("--------------------------");
        System.out.println("Employee id: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee mail id: " + getMailId());
        System.out.println("Employee contact number: " + getContactNumber());
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
    }

    // Delete
    public void deleteEmployeeDetails() {
        System.out.println("Employee object deleted successfully");
    }
}
