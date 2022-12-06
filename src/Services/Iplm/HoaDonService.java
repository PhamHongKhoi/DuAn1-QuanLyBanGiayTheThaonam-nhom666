/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.HoaDon;
import Repository.Iplm.HoaDonRepository;
import Services.IHoaDonService;
import ViewModels.HoaDonResponse;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonService implements IHoaDonService {

    private HoaDonRepository hoaDonRepository = new HoaDonRepository();

    @Override
    public ArrayList<HoaDonResponse> getAll() {
        return hoaDonRepository.getAll();
    }

    @Override
    public String saveHoaDon(HoaDon hoaDon) {
        if (hoaDonRepository.saveHoaDon(hoaDon)) {
            return "Thanh cong";
        } else {
            return "That bai";
        }
    }

    @Override
    public String updateThanhToan(HoaDon hoaDon, String ma) {
        if (hoaDonRepository.updateThanhToan(hoaDon, ma)) {
            return "Thanh cong";
        } else {
            return "That bai";
        }
    }

    @Override
    public ArrayList<HoaDonResponse> getAllByTrangThai(int trangThai) {
        return hoaDonRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public ArrayList<HoaDonResponse> getTTKhByID(String id) {
        return hoaDonRepository.getTTKhByID(id);
    }

    @Override
    public String updateTTKH(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateTTKH(hoaDon, id)) {
            return "Đã thêm thông tin khách hàng";
        } else {
            return "Chưa thêm đc thông tin khách hàng";
        }
    }

    @Override
    public ArrayList<HoaDonResponse> getTTKhGiaoHangByID(String id) {
        return hoaDonRepository.getTTKhGiaoHangByID(id);
    }

    @Override
    public String updateTTKHGiaoHang(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateTTKHGiaoHang(hoaDon, id)) {
            return "Đã thêm thông tin khách hàng";
        } else {
            return "Chưa thêm đc thông tin khách hàng";
        }
    }

    @Override
    public String updateNgayHenGiaoHang(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateNgayHenGiaoHang(hoaDon, id)) {
            return "Đã thêm thông tin ngày hẹn khách";
        } else {
            return "Chưa thêm đc thông tin ngày hẹn khách";
        }
    }

    @Override
    public String updateNgayShip(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateNgayShip(hoaDon, id)) {
            return "Đã thêm thông tin ngày Ship";
        } else {
            return "Chưa thêm đc thông tin ngày Ship";
        }
    }

    @Override
    public String updateNgayKhachNhan(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateNgayKhachNhan(hoaDon, id)) {
            return "Đã thêm thông tin ngày Nhan";
        } else {
            return "Chưa thêm đc thông tin ngày Nhan";
        }
    }

    @Override
    public String updateNgayThanhToan(HoaDon hoaDon, String id) {
        if (hoaDonRepository.updateNgayThanhToan(hoaDon, id)) {
            return "Đã thêm thông tin ngày Thanh Toán";
        } else {
            return "Chưa thêm đc thông tin ngày Thanh Toán";
        }
    }

    @Override
    public ArrayList<HoaDonResponse> getAllByNgayBatDauNgayKetThuc(Date ngayBatDau, Date ngayKeThuc) {
        return hoaDonRepository.getAllByNgayBatDauNgayKetThuc(ngayBatDau, ngayKeThuc);
    }

    @Override
    public ArrayList<HoaDonResponse> getAllByBanHangTaiQuay(String ck, String tm, String cktm) {
        return hoaDonRepository.getAllByBanHangTaiQuay(ck, tm, cktm);
    }

    @Override
    public ArrayList<HoaDonResponse> getAllByGiaoHang(String cod) {
        return hoaDonRepository.getAllByGiaoHang(cod);
    }

    @Override
    public ArrayList<HoaDonResponse> getAllBySDT(String sdt) {
        return hoaDonRepository.getAllBySDT(sdt);
    }

}
