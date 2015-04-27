package org.com.pojo;
// Generated 25 Apr, 2015 7:30:18 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Invoice generated by hbm2java
 */
@Entity
@Table(name="invoice"
    ,catalog="bsale"
)
public class Invoice  implements java.io.Serializable {


     private Integer inid;
     private Date date;
     private String customer;
     private long totalAmmount;
     private BigDecimal discount;
     private BigDecimal ammountPaidonDis;

    public Invoice() {
    }

	
    public Invoice(Date date, long totalAmmount) {
        this.date = date;
        this.totalAmmount = totalAmmount;
    }
    public Invoice(Date date, String customer, long totalAmmount, BigDecimal discount, BigDecimal ammountPaidonDis) {
       this.date = date;
       this.customer = customer;
       this.totalAmmount = totalAmmount;
       this.discount = discount;
       this.ammountPaidonDis = ammountPaidonDis;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Inid", unique=true, nullable=false)
    public Integer getInid() {
        return this.inid;
    }
    
    public void setInid(Integer inid) {
        this.inid = inid;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date", nullable=false, length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="Customer", length=10)
    public String getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    
    @Column(name="TotalAmmount", nullable=false, precision=10, scale=0)
    public long getTotalAmmount() {
        return this.totalAmmount;
    }
    
    public void setTotalAmmount(long totalAmmount) {
        this.totalAmmount = totalAmmount;
    }

    
    @Column(name="Discount", precision=50)
    public BigDecimal getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    
    @Column(name="AmmountPaidonDis", precision=50)
    public BigDecimal getAmmountPaidonDis() {
        return this.ammountPaidonDis;
    }
    
    public void setAmmountPaidonDis(BigDecimal ammountPaidonDis) {
        this.ammountPaidonDis = ammountPaidonDis;
    }




}


