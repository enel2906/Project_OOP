package Model;

import java.util.ArrayList;



public class Kings {
    private int id;
    private String ten;
    private String trieuDai;
    private String namSinh;
    private String namMat;
    private String nienHieu;
    private String theThu;
    private String namTriVi;

    private static int numberOfKings = 0;

    public Kings() {

    }

    public int getNumberOfKings(){
        return numberOfKings;
    }
    public static ArrayList<Kings> kingsList = new ArrayList<>();

    public Kings(int id, String ten, String trieuDai, String namSinh, String namMat,
                 String nienHieu, String theThu, String namTriVi) {
        this.id = id;
        this.ten = ten;
        this.trieuDai = trieuDai;
        this.namSinh = namSinh;
        this.namMat = namMat;
        this.nienHieu = nienHieu;
        this.theThu = theThu;
        this.namTriVi = namTriVi;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTrieuDai() {
        return trieuDai;
    }

    public void setTrieuDai(String trieuDai) {
        this.trieuDai = trieuDai;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getNamMat() {
        return namMat;
    }

    public void setNamMat(String namMat) {
        this.namMat = namMat;
    }

    public String getNienHieu() {
        return nienHieu;
    }

    public void setNienHieu(String nienHieu) {
        this.nienHieu = nienHieu;
    }

    public String getTheThu() {
        return theThu;
    }

    public void setTheThu(String theThu) {
        this.theThu = theThu;
    }

    public String getNamTriVi() {
        return namTriVi;
    }

    public void setNamTriVi(String namTriVi) {
        this.namTriVi = namTriVi;
    }

    public static ArrayList<Kings> getKingsList() {
        return kingsList;
    }

    public static void addKing(Kings king) {
        kingsList.add(king);
        numberOfKings++;
    }

    public static void printAllKings() {
        for (Kings king : kingsList) {
            System.out.println(king.toString());
        }
    }




}
