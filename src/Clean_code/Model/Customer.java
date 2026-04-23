package Clean_code.Model;

public class Customer {
    private String name;
    private String birthday;
    private String address;

    public Customer(String name, String birthday, String address) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public String getBirthday() {
        return birthday;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return name+ "|" + birthday + "|" + address;
    }
}
