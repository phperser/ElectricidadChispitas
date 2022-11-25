public class Autonomous implements Customer {
    private String codeCustomer;
    private String dni;
    private String nameCust;
    private String surnameAutonomous;
    private String address;
    private String city;
    private String province;
    private String email;
    private Integer phoneNumber ;

    @Override
    public String getCodeCustomer() {
        return this.dni;
    }

    @Override
    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNameCust() {
        return nameCust;
    }

    public void setNameCust(String nameCust) {
        this.nameCust = nameCust;
    }

    public String getSurnameAutonomous() {
        return surnameAutonomous;
    }

    public void setSurnameAutonomous(String surnameAutonomous) {
        this.surnameAutonomous = surnameAutonomous;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String getProvince() {
        return province;
    }

    @Override
    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
