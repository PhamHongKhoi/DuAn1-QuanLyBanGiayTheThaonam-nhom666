/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.KhuyenMai;
import DomainModel.SanPhamKhuyenMai;
import Repository.Iplm.KhuyenMaiRespository;
import Services.IKhuyenMaiService;
import ViewModels.QuanLyKhuyenMai;
import ViewModels.QuanLySanPhamGiamGia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class KhuyenMaiService implements IKhuyenMaiService {

    KhuyenMaiRespository kmr = new KhuyenMaiRespository();

    @Override
    public List<QuanLyKhuyenMai> getAll() {
        List<KhuyenMai> lstkm = kmr.getAll();
        List<QuanLyKhuyenMai> lstQl = new ArrayList<>();
        for (KhuyenMai km : lstkm) {
            QuanLyKhuyenMai qlKm = new QuanLyKhuyenMai(km.getId(), km.getTenKhuyenMai(), km.getLoaiKhuyenMai(), km.getNgayBatDau(), km.getNgatKetThuc(), km.getTrangThai());
            lstQl.add(qlKm);
        }
        return lstQl;
    }

    @Override
    public String add(QuanLyKhuyenMai qlKm) {
        KhuyenMai km = new KhuyenMai(null, qlKm.getTenKhuyenMai(), qlKm.getLoaiKhuyenMai(), qlKm.getNgayBatDau(), qlKm.getNgatKetThuc(), qlKm.getTrangThai());
        boolean add = kmr.add(km);
        if (add == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public List<QuanLySanPhamGiamGia> getAllSanPhamGiamGia() {
        List<SanPhamKhuyenMai> lstSpKm = kmr.getAllSpKhuyenMai();
        List<QuanLySanPhamGiamGia> lstSpGiamGia = new ArrayList<>();
        for (SanPhamKhuyenMai sp : lstSpKm) {
            QuanLySanPhamGiamGia ql = new QuanLySanPhamGiamGia(sp.getId(), sp.getTenKhuyenMai(), sp.getTenSanPham(), sp.getGiaBan(), sp.getTrangThai(), sp.getSoTienConLai());
            lstSpGiamGia.add(ql);
        }
        return lstSpGiamGia;
    }

}
