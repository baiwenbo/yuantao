package cn.vo.pojo.entity;

public class XiaodianAddress {
    private Long id;

    private String yetai;

    private String pianqu;

    private String daqu;

    private String company;

    private String code;

    private String name;

    private String province;

    private String city;

    private String area;

    private String redundance1;

    private String redundance2;

    private String redundance3;

    private Integer disabled;

    private String address;

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
        this.yetai = yetai == null ? null : yetai.trim();
    }

    public String getPianqu() {
        return pianqu;
    }

    public void setPianqu(String pianqu) {
        this.pianqu = pianqu == null ? null : pianqu.trim();
    }

    public String getDaqu() {
        return daqu;
    }

    public void setDaqu(String daqu) {
        this.daqu = daqu == null ? null : daqu.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRedundance1() {
        return redundance1;
    }

    public void setRedundance1(String redundance1) {
        this.redundance1 = redundance1 == null ? null : redundance1.trim();
    }

    public String getRedundance2() {
        return redundance2;
    }

    public void setRedundance2(String redundance2) {
        this.redundance2 = redundance2 == null ? null : redundance2.trim();
    }

    public String getRedundance3() {
        return redundance3;
    }

    public void setRedundance3(String redundance3) {
        this.redundance3 = redundance3 == null ? null : redundance3.trim();
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}