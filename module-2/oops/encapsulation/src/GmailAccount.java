class GmailAccount {

    private String firstName;
    private String lastName;
    private long contactNumber;
    private String mailId;
    private String password;

    public GmailAccount(String firstName,String lastName,long contactNumber,String mailId,String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.contactNumber=contactNumber;
        this.mailId=mailId;
        this.password=password;
    }

    public void setPassword(String password){
        this.password=password;
    }
}
