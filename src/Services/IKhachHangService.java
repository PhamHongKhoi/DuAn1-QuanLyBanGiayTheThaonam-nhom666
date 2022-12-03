/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QuanLyKhachHang;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IKhachHangService {

    List<QuanLyKhachHang> getAll();

    String add(QuanLyKhachHang qlkh);

    String update(QuanLyKhachHang qlkh, String id);

    String delete(String id);

    List<QuanLyKhachHang> getbyTrangThai(int trangThai);

    List<QuanLyKhachHang> getbyGioiTinh(int gioiTinh);

    List<QuanLyKhachHang> getbyTen(String ten);
}
