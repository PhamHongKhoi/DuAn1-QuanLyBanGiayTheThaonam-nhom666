/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author Asus
 */
public class ChiTietSanPham {

    private String idCtsp;
    private String moTa;
    private int soLuongTon;
    private double giaNhap;
    private double giaban;
    private int NamBanHang;
    private String hinhAnh;
    private String idKhuyenMai;
    private String idDongSp;
    private String idNSX;
    private String idKieuDang;
    private String idKichCo;
    private String idChatLieu;
    private String idMauSac;
    private String idSanPham;
    private String idThuongHieu;
    private String qrCode;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String idCtsp, String moTa, int soLuongTon, double giaNhap, double giaban, int NamBanHang, String hinhAnh, String idDongSp, String idNSX, String idKieuDang, String idKichCo, String idChatLieu, String idMauSac, String idSanPham, String idThuongHieu, String qrCode) {
        this.idCtsp = idCtsp;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaban = giaban;
        this.NamBanHang = NamBanHang;
        this.hinhAnh = hinhAnh;
        this.idDongSp = idDongSp;
        this.idNSX = idNSX;
        this.idKieuDang = idKieuDang;
        this.idKichCo = idKichCo;
        this.idChatLieu = idChatLieu;
        this.idMauSac = idMauSac;
        this.idSanPham = idSanPham;
        this.idThuongHieu = idThuongHieu;
        this.qrCode = qrCode;
    }

    public ChiTietSanPham(String idCtsp, String moTa, int soLuongTon, double giaNhap, double giaban, int NamBanHang, String hinhAnh, String idKhuyenMai, String idDongSp, String idNSX, String idKieuDang, String idKichCo, String idChatLieu, String idMauSac, String idSanPham, String idThuongHieu, String qrCode) {
        this.idCtsp = idCtsp;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaban = giaban;
        this.NamBanHang = NamBanHang;
        this.hinhAnh = hinhAnh;
        this.idKhuyenMai = idKhuyenMai;
        this.idDongSp = idDongSp;
        this.idNSX = idNSX;
        this.idKieuDang = idKieuDang;
        this.idKichCo = idKichCo;
        this.idChatLieu = idChatLieu;
        this.idMauSac = idMauSac;
        this.idSanPham = idSanPham;
        this.idThuongHieu = idThuongHieu;
        this.qrCode = qrCode;
    }

    public String getIdCtsp() {
        return idCtsp;
    }

    public void setIdCtsp(String idCtsp) {
        this.idCtsp = idCtsp;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public int getNamBanHang() {
        return NamBanHang;
    }

    public void setNamBanHang(int NamBanHang) {
        this.NamBanHang = NamBanHang;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getIdKhuyenMai() {
        return idKhuyenMai;
    }

    public void setIdKhuyenMai(String idKhuyenMai) {
        this.idKhuyenMai = idKhuyenMai;
    }

    public String getIdDongSp() {
        return idDongSp;
    }

    public void setIdDongSp(String idDongSp) {
        this.idDongSp = idDongSp;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIdKieuDang() {
        return idKieuDang;
    }

    public void setIdKieuDang(String idKieuDang) {
        this.idKieuDang = idKieuDang;
    }

    public String getIdKichCo() {
        return idKichCo;
    }

    public void setIdKichCo(String idKichCo) {
        this.idKichCo = idKichCo;
    }

    public String getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(String idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getIdThuongHieu() {
        return idThuongHieu;
    }

    public void setIdThuongHieu(String idThuongHieu) {
        this.idThuongHieu = idThuongHieu;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "idCtsp=" + idCtsp + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaban=" + giaban + ", NamBanHang=" + NamBanHang + ", hinhAnh=" + hinhAnh + ", idKhuyenMai=" + idKhuyenMai + ", idDongSp=" + idDongSp + ", idNSX=" + idNSX + ", idKieuDang=" + idKieuDang + ", idKichCo=" + idKichCo + ", idChatLieu=" + idChatLieu + ", idMauSac=" + idMauSac + ", idSanPham=" + idSanPham + ", idThuongHieu=" + idThuongHieu + ", qrCode=" + qrCode + '}';
    }

}
