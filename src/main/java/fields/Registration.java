package fields;

public class Registration {
    private String oneFirstName;
    private String oneLastName;
    private String password;
    private String email;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String company;
    private String oneAddress;
    private String twoAddress;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String phoneHome;
    private String phoneMobile;
    private String alias;

    public Registration() {
    }

    public Registration(String oneFirstName, String oneLastName, String password, String email,
                        String day, String month, String year, String firstName, String lastName, String company,
                        String oneAddress, String twoAddress, String city, String state, String postcode, String country,
                        String phoneHome, String phoneMobile, String alias) {
        this.oneFirstName = oneFirstName;
        this.oneLastName = oneLastName;
        this.password = password;
        this.email = email;
        this.day = day;
        this.month = month;
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.oneAddress = oneAddress;
        this.twoAddress = twoAddress;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.country = country;
        this.phoneMobile = phoneMobile;
        this.phoneHome = phoneHome;
        this.alias = this.alias;
    }


    public String getOneFirstName() { return oneFirstName; }

    public void setOneFirstName(String oneFirstName) { this.oneFirstName = oneFirstName; }

    public String getOneLastName() { return oneLastName; }

    public void setOneLastName(String oneLastName) { this.oneLastName = oneLastName; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getDay() { return day; }

    public void setDay(String day) { this.day = day; }

    public String getMonth() { return month; }

    public void setMonth(String month) { this.month = month; }

    public String getYear() { return year; }

    public void setYear(String year) { this.year = year; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public String getOneAddress() { return oneAddress; }

    public void setOneAddress(String address1) { this.oneAddress = oneAddress; }

    public String getTwoAddress() { return twoAddress; }

    public void setTwoAddress(String address2) { this.twoAddress = twoAddress; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    public String getPostcode() { return postcode; }

    public void setPostcode(String postcode) { this.postcode = postcode; }

    public String getCountry() { return country; }

    public void setCountry(String country) { this.country = country; }

    public String getPhoneMobile() { return phoneMobile; }

    public void setPhoneMobile(String phoneMobile) { this.phoneMobile = phoneMobile; }

    public String getPhoneHome() { return phoneHome; }

    public void setPhoneHome(String phoneHome) { this.phoneHome = phoneHome; }

    public String getAlias() { return alias; }

    public void setAlias(String alias) { this.alias = alias; }
}
