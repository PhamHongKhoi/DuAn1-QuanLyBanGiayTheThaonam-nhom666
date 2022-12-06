/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class KhuyenMai {

    private String id;
    private String tenKhuyenMai;
    private int loaiKhuyenMai;
    private Date ngayBatDau;
    private Date ngatKetThuc;
    private int trangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(String id, String tenKhuyenMai, int loaiKhuyenMai, Date ngayBatDau, Date ngatKetThuc, int trangThai) {
        this.id = id;
        this.tenKhuyenMai = tenKhuyenMai;
        this.loaiKhuyenMai = loaiKhuyenMai;
        this.ngayBatDau = ngayBatDau;
        this.ngatKetThuc = ngatKetThuc;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public int getLoaiKhuyenMai() {
        return loaiKhuyenMai;
    }

    public void setLoaiKhuyenMai(int loaiKhuyenMai) {
        this.loaiKhuyenMai = loaiKhuyenMai;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgatKetThuc() {
        return ngatKetThuc;
    }

    public void setNgatKetThuc(Date ngatKetThuc) {
        this.ngatKetThuc = ngatKetThuc;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "id=" + id + ", tenKhuyenMai=" + tenKhuyenMai + ", loaiKhuyenMai=" + loaiKhuyenMai + ", ngayBatDau=" + ngayBatDau + ", ngatKetThuc=" + ngatKetThuc + ", trangThai=" + trangThai + '}';
    }

}
