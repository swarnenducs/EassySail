package org.com.pojo;
// Generated 25 Apr, 2015 7:30:18 PM by Hibernate Tools 4.3.1


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
 * LotTable generated by hbm2java
 */
@Entity
@Table(name="lot_table"
    ,catalog="bsale"
)
public class LotTable  implements java.io.Serializable {


     private Integer lid;
     private Date date;
     private Integer pid;
     private Integer quantity;

    public LotTable() {
    }

    public LotTable(Date date, Integer pid, Integer quantity) {
       this.date = date;
       this.pid = pid;
       this.quantity = quantity;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="Lid", unique=true, nullable=false)
    public Integer getLid() {
        return this.lid;
    }
    
    public void setLid(Integer lid) {
        this.lid = lid;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date", length=10)
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }

    
    @Column(name="Pid")
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    
    @Column(name="Quantity")
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }




}

