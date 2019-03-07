package cn.vo.pojo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author <a href="wenbo.bai@vtradex.net">柏文博</a>
 * @since 2019-03-07 13:25
 */
@Entity
@Table(name="HANS_XIAODIAN_ADDRESS")
public class HansXiaoDianAddress {

    @Id   // 表明id
    @GeneratedValue   //  自动生成
    private Long id ;

    private String yetai ;

    private String pianqu ;

    private String daqu ;

    private String company ;

    private String code ;

    private String name;

    private String province ;

    private String city ;

    private String area;

    private String address ;

    private String redundance1;

    private String redundance2 ;

    private String redundance3;

    private  Integer disabled;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYetai() {
        return yetai;
    }

    public void setYetai(String yetai) {
        this.yetai = yetai;
    }

    public String getPianqu() {
        return pianqu;
    }

    public void setPianqu(String pianqu) {
        this.pianqu = pianqu;
    }

    public String getDaqu() {
        return daqu;
    }

    public void setDaqu(String daqu) {
        this.daqu = daqu;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRedundance1() {
        return redundance1;
    }

    public void setRedundance1(String redundance1) {
        this.redundance1 = redundance1;
    }

    public String getRedundance2() {
        return redundance2;
    }

    public void setRedundance2(String redundance2) {
        this.redundance2 = redundance2;
    }

    public String getRedundance3() {
        return redundance3;
    }

    public void setRedundance3(String redundance3) {
        this.redundance3 = redundance3;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }
}
