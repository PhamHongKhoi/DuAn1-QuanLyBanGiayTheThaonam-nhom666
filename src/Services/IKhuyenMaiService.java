/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QuanLyKhuyenMai;
import ViewModels.QuanLySanPhamGiamGia;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IKhuyenMaiService {

    List<QuanLyKhuyenMai> getAll();

    String add(QuanLyKhuyenMai qlKm);

    List<QuanLySanPhamGiamGia> getAllSanPhamGiamGia();
}
