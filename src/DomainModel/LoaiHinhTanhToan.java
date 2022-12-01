/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author Admin
 */
public class LoaiHinhTanhToan {

    private String idHD;
    private String tenPTTT;
    private float tienMat;
    private float tienChuyenKhoan;

    public LoaiHinhTanhToan() {
    }

    public LoaiHinhTanhToan(String idHD, String tenPTTT, float tienMat, float tienChuyenKhoan) {
        this.idHD = idHD;
        this.tenPTTT = tenPTTT;
        this.tienMat = tienMat;
        this.tienChuyenKhoan = tienChuyenKhoan;
    }

    public LoaiHinhTanhToan(String tenPTTT, float tienMat, float tienChuyenKhoan) {
        this.tenPTTT = tenPTTT;
        this.tienMat = tienMat;
        this.tienChuyenKhoan = tienChuyenKhoan;
    }

    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public String getTenPTTT() {
        return tenPTTT;
    }

    public void setTenPTTT(String tenPTTT) {
        this.tenPTTT = tenPTTT;
    }

    public float getTienMat() {
        return tienMat;
    }

    public void setTienMat(float tienMat) {
        this.tienMat = tienMat;
    }

    public float getTienChuyenKhoan() {
        return tienChuyenKhoan;
    }

    public void setTienChuyenKhoan(float tienChuyenKhoan) {
        this.tienChuyenKhoan = tienChuyenKhoan;
    }

}
