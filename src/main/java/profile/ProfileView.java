package profile;

import address.Address;

public class ProfileView {
    public static void main(String[] args) {
        Profile admin = new Profile();

        admin.setFirstName("");
        admin.setLastName("");
        admin.setEmail("");

        Address address = new Address();

        address.setStreet("");
        address.setCity("");
        address.setState("");
        address.setZip("");

        admin.setAddress(address);
    }
}
