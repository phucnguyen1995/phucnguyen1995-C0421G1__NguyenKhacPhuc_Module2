package _23_thi.model;

import java.io.Serializable;

public class SanPhamXuatKhau extends SanPham implements Serializable {
    private int giaXuatKhau;
    private String quocGiaNhapSanPham;


    public SanPhamXuatKhau() {
    }

    public SanPhamXuatKhau(int id, String code, String name, int gia, int soLuong, String nhaXuatBan,
                           int giaXuatKhau, String quocGiaNhapSanPham) {
        super(id, code, name, gia, soLuong, nhaXuatBan);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    public int getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(int giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapSanPham() {
        return quocGiaNhapSanPham;
    }

    public void setQuocGiaNhapSanPham(String quocGiaNhapSanPham) {
        this.quocGiaNhapSanPham = quocGiaNhapSanPham;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                ", id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gia='" + gia + '\'' +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ",giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapSanPham='" + quocGiaNhapSanPham + '\'' +
                '}';
    }

}
