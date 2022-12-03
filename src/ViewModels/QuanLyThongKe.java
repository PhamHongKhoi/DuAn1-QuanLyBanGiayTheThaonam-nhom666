/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class QuanLyThongKe {

    private String ten;
    private int soLuong;
    private double donGia;
    private Date ngayTao;

    public QuanLyThongKe() {
    }

    public QuanLyThongKe(String ten, int soLuong, double donGia, Date ngayTao) {
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayTao = ngayTao;
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

    public double tongTien() {
        return soLuong * donGia;
    }

    public Object[] arriveThongke() {
        return new Object[]{ten, soLuong, donGia, ngayTao, tongTien()};
    }
}
