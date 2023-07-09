package Model;

import java.util.List;


public class Period {
    private int id;
    private String trieuDai;
    private String thoiKy;
    private String thoiGian;
    private List<String> vua;

    public Period(int id, String trieuDai, String thoiKy, String thoiGian, List<String> vua) {
        this.id = id;
        this.trieuDai = trieuDai;
        this.thoiKy = thoiKy;
        this.thoiGian = thoiGian;
        this.vua = vua;
    }

    public Period() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrieuDai() {
        return trieuDai;
    }

    public void setTrieuDai(String trieuDai) {
        this.trieuDai = trieuDai;
    }

    public String getThoiKy() {
        return thoiKy;
    }

    public void setThoiKy(String thoiKy) {
        this.thoiKy = thoiKy;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public List<String> getVua() {
        return vua;
    }

    public void setVua(List<String> vua) {
        this.vua = vua;
    }



}
