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
public class ThongKe {

    private String ten;
    private int soLuong;
    private double donGia;
    private Date ngayTao;
    private int trangThai;
    private float tongTien;

    public ThongKe() {
    }

    public ThongKe(float tongTien) {
        this.tongTien = tongTien;
    }

    public ThongKe(String ten, int soLuong, double donGia, Date ngayTao, float tongTien) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
    }



    public ThongKe(String ten, int soLuong, double donGia, Date ngayTao, int trangThai) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "ThongKe{" + "ten=" + ten + ", soLuong=" + soLuong + ", donGia=" + donGia + ", ngayTao=" + ngayTao + ", trangThai=" + trangThai + ", tongTien=" + tongTien + '}';
    }



}
