public class PhoneNumber {
    private int countryCode;
    private int cityCode;
    private int lineNumber;


    public PhoneNumber(int countryCode, int cityCode, int lineNumber) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.lineNumber = lineNumber;


    }

    public int getCountryCode() {
        return countryCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getLineNumber() {
        return lineNumber;
    }


}
