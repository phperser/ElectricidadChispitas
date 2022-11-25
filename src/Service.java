public class Service implements Sales {
    private String idSales;
    private String nameServ;
    private String nameSales;
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

    public String getNameServ() {
        return nameServ;
    }

    public void setNameServ(String nameServ) {
        this.nameServ = nameServ;
    }

    @Override
    public String getNameSales() {
        return this.nameServ;
    }

    @Override
    public void setNameSales(String nameSales) {
        this.nameSales = nameSales;
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