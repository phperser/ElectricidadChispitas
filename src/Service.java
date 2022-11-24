public class Service implements Sales {
    private Integer IDSales;
    private Integer Code;
    private String NameSales;
    private Double PriceSales;
    private Double Price;

    @Override
    public Integer getIDSales() {
        return IDSales;
    }

    @Override
    public void setIDSales(Integer IDSales) {
        this.IDSales = IDSales;
    }

    @Override
    public Integer getCode() {
        return Code;
    }

    @Override
    public void setCode(Integer code) {
        this.Code = code;
    }

    @Override
    public String getNameSales() {
        return NameSales;
    }

    @Override
    public void setNameSales(String nameSales) {
        this.NameSales = nameSales;
    }

    @Override
    public Double getPriceSales() {
        return PriceSales;
    }

    @Override
    public void setPriceSales(Double priceSales) {
        this.PriceSales = priceSales;
    }

    @Override
    public Double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(Double price) {
        this.Price = price;
    }
}