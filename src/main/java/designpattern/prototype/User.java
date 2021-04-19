package designpattern.prototype;

public class User {

    private String firstName;
    private String lastName;
    private String displayName;
    private String email;
    private Address address;

    public User() {
    }

    public User(String firstName, String lastName, String displayName, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User shallowCopy() {
        User user = new User(this.firstName, this.lastName, this.displayName, this.email, this.address);
        return user;
    }

    public User deepCopy() {
        Address address = new Address(this.getAddress().getProvince(), this.getAddress().getDistrict(),
                this.getAddress().getStreet());
        User user = new User(this.firstName, this.lastName, this.displayName, this.email, address);
        return user;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", displayName=" + displayName + ", email="
                + email + ", address=" + address + "]";
    }

}
