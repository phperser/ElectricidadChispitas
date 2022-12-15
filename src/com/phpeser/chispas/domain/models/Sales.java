package com.phpeser.chispas.domain.models;

public interface Sales {

    public String getIdSales();
    public void setIdSales(String idSales);

    public String getNameSales();
    public void setNameSales(String nameSales);

    public Double getPrice();
    public void setPrice(Double price);

    public IVAType getIvaType();
}
