package cn.vo.pojo;

public class QizheScpcWithBLOBs extends QizheScpc {
    private String beiyong1;

    private String beiyong2;

    private String fengongs;

    private String shenggs;

    private String beiyong5;

    public String getBeiyong1() {
        return beiyong1;
    }

    public void setBeiyong1(String beiyong1) {
        this.beiyong1 = beiyong1 == null ? null : beiyong1.trim();
    }

    public String getBeiyong2() {
        return beiyong2;
    }

    public void setBeiyong2(String beiyong2) {
        this.beiyong2 = beiyong2 == null ? null : beiyong2.trim();
    }

    public String getFengongs() {
        return fengongs;
    }

    public void setFengongs(String fengongs) {
        this.fengongs = fengongs == null ? null : fengongs.trim();
    }

    public String getShenggs() {
        return shenggs;
    }

    public void setShenggs(String shenggs) {
        this.shenggs = shenggs == null ? null : shenggs.trim();
    }

    public String getBeiyong5() {
        return beiyong5;
    }

    public void setBeiyong5(String beiyong5) {
        this.beiyong5 = beiyong5 == null ? null : beiyong5.trim();
    }
}