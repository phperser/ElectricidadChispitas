public class Product implements Sales{
    private String idSales;
    private String nameProd;
    private String nameSales;
    private String brandProd;
    private String modelProd;
    private Double price;
    private IVAType ivaType;

    @Override
    public String getIdSales() {
        return idSales;
    }

    @Override
    public void setIdSales(String idSales) {
        this.idSales = idSales;
    }

    public String getNameProd() {
        return nameProd;
    }

    public void setNameProd(String nameProd) {
        this.nameProd = nameProd;
    }

    @Override
    public String getNameSales() {
        return this.nameProd;
    }

    @Override
    public void setNameSales(String nameSales) {
        this.nameSales = nameSales;
    }

    public String getBrandProd() {
        return brandProd;
    }

    public void setBrandProd(String brandProd) {
        this.brandProd = brandProd;
    }

    public String getModelProd() {
        return modelProd;
    }

    public void setModelProd(String modelProd) {
        this.modelProd = modelProd;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public IVAType getIvaType() {
        return ivaType;
    }

    public void setIvaType(IVAType ivaType) {
        this.ivaType = ivaType;
    }
}
