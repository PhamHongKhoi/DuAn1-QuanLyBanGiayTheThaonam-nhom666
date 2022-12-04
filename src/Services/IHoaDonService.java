/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModel.HoaDon;
import ViewModels.HoaDonResponse;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public interface IHoaDonService {

    ArrayList<HoaDonResponse> getAll();

    String saveHoaDon(HoaDon hoaDon);

    String updateThanhToan(HoaDon hoaDon, String ma);

    ArrayList<HoaDonResponse> getAllByTrangThai(int trangThai);

    ArrayList<HoaDonResponse> getTTKhByID(String id);

    String updateTTKH(HoaDon hoaDon, String id);

    ArrayList<HoaDonResponse> getTTKhGiaoHangByID(String id);

    String updateTTKHGiaoHang(HoaDon hoaDon, String id);

    String updateNgayHenGiaoHang(HoaDon hoaDon, String id);

    String updateNgayShip(HoaDon hoaDon, String id);

    String updateNgayKhachNhan(HoaDon hoaDon, String id);

    String updateNgayThanhToan(HoaDon hoaDon, String id);

    ArrayList<HoaDonResponse> getAllByNgayBatDauNgayKetThuc(Date ngayBatDau, Date ngayKeThuc);

    ArrayList<HoaDonResponse> getAllByBanHangTaiQuay(String ck, String tm, String cktm);
    
    ArrayList<HoaDonResponse> getAllByGiaoHang(String cod);
    
    ArrayList<HoaDonResponse> getAllBySDT(String sdt);

}
