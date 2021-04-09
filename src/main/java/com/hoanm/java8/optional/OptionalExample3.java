package com.hoanm.java8.optional;

import java.util.Optional;

/**
 * Phương thức map() của Optional: Nếu có một giá trị, áp dụng hàm ánh xạ được cung cấp cho nó. Nếu kết quả != null,
 * trả về một Optional với kết quả. Ngược lại thì trả về một Optional rỗng.
 * */
public class OptionalExample3 {
    public static void main(String[] args) {
        OptionalExample3 optionalExample = new OptionalExample3();
        User user1 = new User(new Address("HCM"));
        User user2 = new User(null);

        System.out.println(optionalExample.getStreetPreJava8(user1));
        System.out.println(optionalExample.getStreetJava8(user1));

        System.out.println(optionalExample.getStreetPreJava8(user2));
        System.out.println(optionalExample.getStreetJava8(user2));
    }

    public String getStreetPreJava8(User user) {
        if (user != null) {
            Address address = user.getAddress();
            if (address != null) {
                String street = address.getStreet();
                if (street != null) {
                    return street;
                }
            }
        }
        return "Not specified";
    }

    public String getStreetJava8(User user) {
        Optional<User> userOpt = Optional.of(user);
        return userOpt.map(User::getAddress)
                .map(Address::getStreet)
                .orElse("Not specified");
    }
}

class User {
    private Address address;

    public User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {
    private String street;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
}