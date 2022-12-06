/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Asus
 */
public class QuanLySanPhamGiamGia {

    private String id;
    private String tenKhuyenMai;
    private String tenSanPham;
    private double giaBan;
    private int trangThai;
    private double soTienConLai;

    public QuanLySanPhamGiamGia() {
    }

    public QuanLySanPhamGiamGia(String id, String tenKhuyenMai, String tenSanPham, double giaBan, int trangThai, double soTienConLai) {
        this.id = id;
        this.tenKhuyenMai = tenKhuyenMai;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.soTienConLai = soTienConLai;
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

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public double getSoTienConLai() {
        return soTienConLai;
    }

    public void setSoTienConLai(double soTienConLai) {
        this.soTienConLai = soTienConLai;
    }

    public Object[] arriveSanPhamGiamGia() {
        return new Object[]{id, tenKhuyenMai, tenSanPham, giaBan, trangThai == 0 ? "Hết hạn" : "Đang khuyến mại", soTienConLai};
    }
}
