/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.HoaDon;
import ViewModels.HoaDonResponse;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public interface IHoaDonRepository {

    ArrayList<HoaDonResponse> getAll();

    boolean saveHoaDon(HoaDon hoaDon);

    boolean updateThanhToan(HoaDon hoaDon, String ma);

    ArrayList<HoaDonResponse> getAllByTrangThai(int trangThai);

    ArrayList<HoaDonResponse> getTTKhByID(String id);

    boolean updateTTKH(HoaDon hoaDon, String id);

    ArrayList<HoaDonResponse> getTTKhGiaoHangByID(String id);

    boolean updateTTKHGiaoHang(HoaDon hoaDon, String id);

    boolean updateNgayHenGiaoHang(HoaDon hoaDon, String id);

    boolean updateNgayShip(HoaDon hoaDon, String id);

    boolean updateNgayKhachNhan(HoaDon hoaDon, String id);

    boolean updateNgayThanhToan(HoaDon hoaDon, String id);

    ArrayList<HoaDonResponse> getAllByNgayBatDauNgayKetThuc(Date ngayBatDau, Date ngayKeThuc);

    ArrayList<HoaDonResponse> getAllByBanHangTaiQuay(String ck, String tm, String cktm);

    ArrayList<HoaDonResponse> getAllByGiaoHang(String cod);

    ArrayList<HoaDonResponse> getAllBySDT(String sdt);
}
