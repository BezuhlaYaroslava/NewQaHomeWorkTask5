package fields;

public class RegistrationBuild {
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

    public RegistrationBuild withOneFirstName(String oneFirstName) {
        this.oneFirstName = oneFirstName;
        return this;
    }

    public RegistrationBuild withOneLastName(String oneLastName) {
        this.oneLastName = oneLastName;
        return this;
    }

    public RegistrationBuild withPassword(String password) {
        this.password = password;
        return this;
    }

    public RegistrationBuild withEmail(String email) {
        this.email = email;
        return this;
    }

    public RegistrationBuild withBirthdayDay(String day) {
        this.day = day;
        return this;
    }

    public RegistrationBuild withBirthdayMonth(String month) {
        this.month = month;
        return this;
    }

    public RegistrationBuild withBirthdayYear(String year) {
        this.year = year;
        return this;
    }

    public RegistrationBuild withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public RegistrationBuild withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RegistrationBuild withCompany(String company) {
        this.company = company;
        return this;
    }

    public RegistrationBuild withOneAddress(String oneAddress) {
        this.oneAddress = oneAddress;
        return this;
    }

    public RegistrationBuild withTwoAddress(String twoAddress) {
        this.twoAddress = twoAddress;
        return this;
    }

    public RegistrationBuild withCity(String city) {
        this.city = city;
        return this;
    }

    public RegistrationBuild withState(String state) {
        this.state = state;
        return this;
    }

    public RegistrationBuild withZipCode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public RegistrationBuild withCountry(String country) {
        this.country = country;
        return this;
    }
    public RegistrationBuild withPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
        return this;
    }

    public RegistrationBuild withPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
        return this;
    }

    public RegistrationBuild withAliasAddress(String alias) {
        this.alias = alias;
        return this;
    }

    public Registration build() {
        return new Registration(oneFirstName, oneLastName, password, email, day, month,
                year, firstName, lastName, company, oneAddress, twoAddress, city, state, postcode,
                country, phoneHome, phoneMobile, alias);
    }

}
