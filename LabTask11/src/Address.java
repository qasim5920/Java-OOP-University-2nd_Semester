public class Address {
    private int streetAddress;
    private String town ;
    private String city ;
    private String country;
    private PhoneNumber phoneNumber;

    public Address(int streetAddress, String town, String city, String country, PhoneNumber phoneNumber) {
        this.streetAddress = streetAddress;
        this.town = town;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public int getStreetAddress() {
        return streetAddress;
    }

    public String getTown() {
        return town;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
