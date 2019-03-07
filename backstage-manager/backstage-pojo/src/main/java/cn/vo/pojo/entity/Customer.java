package cn.vo.pojo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

    @Id   // 表明id
    @GeneratedValue   //  自动生成
    private  Integer id;

    private Integer xiaoDianId;

    private  String customerName;

    private String cashName;

    private  String amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXiaoDianId() {
        return xiaoDianId;
    }

    public void setXiaoDianId(Integer xiaoDianId) {
        this.xiaoDianId = xiaoDianId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
