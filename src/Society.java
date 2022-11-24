public class Society implements Customer {
    private Integer IDCustomer;
    private String IN;
    private String NameCust;
    private Integer ZipCode;
    private String City;
    private String Province;
    private String Email;
    private Integer PhoneNumber;

    @Override
    public Integer getIDCustomer() {
        return IDCustomer;
    }

    @Override
    public void setIDCustomer(Integer IDCustomer) {
        this.IDCustomer = IDCustomer;
    }

    @Override
    public String getIN() {
        return IN;
    }

    @Override
    public void setIN(String IN) {
        this.IN = IN;
    }

    @Override
    public String getNameCust() {
        return NameCust;
    }

    @Override
    public void setNameCust(String nameCust) {
        this.NameCust = nameCust;
    }

    @Override
    public Integer getZipCode() {
        return ZipCode;
    }

    @Override
    public void setZipCode(Integer zipCode) {
        this.ZipCode = zipCode;
    }

    @Override
    public String getCity() {
        return City;
    }

    @Override
    public void setCity(String city) {
        this.City = city;
    }

    @Override
    public String getProvince() {
        return Province;
    }

    @Override
    public void setProvince(String province) {
        this.Province = province;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String email) {
        this.Email = email;
    }

    @Override
    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    @Override
    public void setPhoneNumber(Integer phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
}
