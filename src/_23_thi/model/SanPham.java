package _23_thi.model;

import java.io.Serializable;

public  abstract  class SanPham  implements Serializable {
    protected int id;
    protected String code;
    protected String name;
    protected int gia;
    protected int soLuong;
    protected String nhaXuatBan;

    public SanPham() {
    }

    public SanPham(int id, String code, String name, int gia,
                   int soLuong, String nhaXuatBan) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gia='" + gia + '\'' +
                ", soLuong=" + soLuong +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                '}';
    }
}
