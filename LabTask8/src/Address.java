public class Address {
    private String city;
   private int streetNumber;
   private String country;

    public Address(String city, int streetNumber, String country) {
        this.city = city;
        this.streetNumber = streetNumber;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
