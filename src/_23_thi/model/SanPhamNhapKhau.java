package _23_thi.model;

import java.io.Serializable;

public class SanPhamNhapKhau extends SanPham implements Serializable {
    private int giaNhapKhau;
    private String tinhNhapKhau;
    private int thueNhapKhau;

    public SanPhamNhapKhau() {
    }


    public SanPhamNhapKhau(int id, String code, String name, int gia, int soLuong, String nhaXuatBan,
                           int giaNhapKhau, String tinhNhapKhau, int thueNhapKhau) {
        super(id, code, name, gia, soLuong, nhaXuatBan);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhNhapKhau = tinhNhapKhau;
        this.thueNhapKhau = thueNhapKhau;
    }

    public int getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(int giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhNhapKhau() {
        return tinhNhapKhau;
    }

    public void setTinhNhapKhau(String tinhNhapKhau) {
        this.tinhNhapKhau = tinhNhapKhau;
    }

    public int getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(int thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" +
                ", id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gia='" + gia + '\'' +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ",giaNhapKhau=" + giaNhapKhau +
                ", tinhNhapKhau='" + tinhNhapKhau + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }
}
