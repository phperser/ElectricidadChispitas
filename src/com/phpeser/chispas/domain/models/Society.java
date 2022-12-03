package com.phpeser.chispas.domain.models;

public class Society implements Customer {
    private String codeCustomer;
    private String nif;
    private String nameCust;
    private String address;
    private String city;
    private String province;
    private String email;
    private Integer phoneNumber;

    @Override
    public String getCodeCustomer() {
        return this.nif;
    }

    @Override
    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String getNameCust() {
        return nameCust;
    }

    @Override
    public void setNameCust(String nameCust) {
        this.nameCust = nameCust;
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
