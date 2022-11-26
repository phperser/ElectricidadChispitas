public class Invoice {
    private Integer idInv;
    private String date;
    private Double taxBase;
    private Double total;
    private Product product;
    private Service service;
    private Autonomous autonomous;
    private Society society;

    public Integer getIdInv() {
        return idInv;
    }

    public void setIdInv(Integer idInv) {
        this.idInv = idInv;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getTaxBase() {
        return taxBase;
    }

    public void setTaxBase(Double taxBase) {
        this.taxBase = taxBase;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }


    public Autonomous getAutonomous() {
        return autonomous;
    }

    public void setAutonomous(Autonomous autonomous) {
        this.autonomous = autonomous;
    }

    public Society getSociety() {
        return society;
    }

    public void setSociety(Society society) {
        this.society = society;
    }
}
