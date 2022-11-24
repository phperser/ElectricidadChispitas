public class Product implements Sales{
    private Integer IDSales;
    private Integer Code;
    private String NameSales;
    private String BrandProd;
    private String ModelProd;
    private Double PriceSales;

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

    public String getBrandProd() {
        return BrandProd;
    }

    public void setBrandProd(String brandProd) {
        this.BrandProd = brandProd;
    }

    public String getModelProd() {
        return ModelProd;
    }

    public void setModelProd(String modelProd) {
        this.ModelProd = modelProd;
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
        return null;
    }

    @Override
    public void setPrice(Double Price) {

    }
}
