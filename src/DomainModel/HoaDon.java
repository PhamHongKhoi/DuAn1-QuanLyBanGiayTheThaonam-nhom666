/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {

    private String id;
    private String maHD;
    private Date ngayTao;
    private Date ngayThanhToan;
    private Date ngayShip;
    private Date ngayNhan;
    private Date ngayHenKhach;
    private int trangThai;
    private float tienShip;
    private String tenNguoiNhan;
    private String diaChi;
    private String sdt;

    public HoaDon(String maHD, Date ngayTao, int trangThai) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public HoaDon(int trangThai) {
        this.trangThai = trangThai;
    }

    public HoaDon(String maHD, Date ngayTao, int trangThai, String tenNguoiNhan, String diaChi, String sdt) {
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public HoaDon(String tenNguoiNhan, String diaChi, String sdt) {
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public HoaDon(float tienShip, String tenNguoiNhan, String diaChi, String sdt) {
        this.tienShip = tienShip;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public HoaDon() {
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public HoaDon(Date ngayHenKhach) {
        this.ngayHenKhach = ngayHenKhach;
    }

    public Date getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(Date ngayShip) {
        this.ngayShip = ngayShip;
    }

    public Date getNgayHenKhach() {
        return ngayHenKhach;
    }

    public void setNgayHenKhach(Date ngayHenKhach) {
        this.ngayHenKhach = ngayHenKhach;
    }

    public float getTienShip() {
        return tienShip;
    }

    public void setTienShip(float tienShip) {
        this.tienShip = tienShip;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
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

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

}
