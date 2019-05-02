public class VipCustomer {
    private String name;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("test", "$5.00", "test@example.com");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name, creditLimit, "example.com");
    }

    public VipCustomer(String name, String creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getVipCustomer() {
        return this.name + " " + this.creditLimit + " " + this.email;
    }
}