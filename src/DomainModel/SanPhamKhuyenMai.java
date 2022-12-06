/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author Asus
 */
public class SanPhamKhuyenMai {
    private String id;
    private String tenKhuyenMai;
    private String tenSanPham;
    private double giaBan;
    private int trangThai;
    private double soTienConLai;

    public SanPhamKhuyenMai() {
    }

    public SanPhamKhuyenMai(String id, String tenKhuyenMai, String tenSanPham, double giaBan, int trangThai, double soTienConLai) {
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

    @Override
    public String toString() {
        return "SanPhamKhuyenMai{" + "id=" + id + ", tenKhuyenMai=" + tenKhuyenMai + ", tenSanPham=" + tenSanPham + ", giaBan=" + giaBan + ", trangThai=" + trangThai + ", soTienConLai=" + soTienConLai + '}';
    }
    
    
}
