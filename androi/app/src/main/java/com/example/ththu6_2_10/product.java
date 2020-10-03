package com.example.ththu6_2_10;

public class product {
    private int img;
    private String tenbai;
    private String tencasi;
    private int caidat;

    public product(int ing,String tenbai,String tencasi,int caidat){
        super();
        this.img=img;
        this.tenbai=tenbai;
        this.tencasi=tencasi;
        this.caidat=caidat;
        }

    public int getCaidat() {
        return caidat;
    }

    public int getImg() {
        return img;
    }

    public String getTencasi() {
        return tencasi;
    }

    public String getTenbai() {
        return tenbai;
    }

    public void setCaidat(int caidat) {
        this.caidat = caidat;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTenbai(String tenbai) {
        this.tenbai = tenbai;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    @Override
    public String toString() {
        return "product{" +
                "img='" + img + '\'' +
                ", tenbai='" + tenbai + '\'' +
                ", tencasi='" + tencasi + '\'' +
                ", caidat='" + caidat + '\'' +
                '}';
    }

}
