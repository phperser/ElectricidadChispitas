import java.util.Date;

public class Invoice {
    private Integer IDInv;
    private Date Date;
    private Double TaxBase;
    private Double Total;
    private products;
    private services;
    private Autonomous Autonomous;
    private Society Society;

    public Integer getIDInv() {
        return IDInv;
    }

    public void setIDInv(Integer IDInv) {
        this.IDInv = IDInv;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        this.Date = date;
    }

    public Double getTaxBase() {
        return TaxBase;
    }

    public void setTaxBase(Double taxBase) {
        this.TaxBase = taxBase;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        this.Total = total;
    }

    public Autonomous getAutonomous() {
        return Autonomous;
    }

    public void setAutonomous(Autonomous autonomous) {
        this.Autonomous = autonomous;
    }

    public Society getSociety() {
        return Society;
    }

    public void setSociety(Society society) {
        this.Society = society;
    }
}
