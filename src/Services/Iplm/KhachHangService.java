/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.KhachHang;
import Repository.Iplm.KhachHangRespositoryIplm;
import Services.IKhachHangService;
import ViewModels.QuanLyKhachHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class KhachHangService implements IKhachHangService {
    
    KhachHangRespositoryIplm khr = new KhachHangRespositoryIplm();
    
    @Override
    public List<QuanLyKhachHang> getAll() {
        List<KhachHang> kh = khr.getAll();
        List<QuanLyKhachHang> lstQlKh = new ArrayList<>();
        
        for (KhachHang ql : kh) {
            QuanLyKhachHang qlKh = new QuanLyKhachHang(ql.getId(), ql.getMa(), ql.getTen(), ql.getGioiTinh(), ql.getNgaySinh(), ql.getSoDienThoai(), ql.getDiaChi(), ql.getTrangThai());
            lstQlKh.add(qlKh);
        }
        
        return lstQlKh;
    }
    
    @Override
    public String add(QuanLyKhachHang qlkh) {
        KhachHang kh = new KhachHang(null, qlkh.getMa(), qlkh.getTen(), qlkh.getGioiTinh(), qlkh.getNgaySinh(), qlkh.getSoDienThoai(), qlkh.getDiaChi(), qlkh.getTrangThai());
        boolean add = khr.add(kh);
        if (add == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }
    
    @Override
    public String update(QuanLyKhachHang qlkh, String id) {
        KhachHang kh = new KhachHang(null, qlkh.getMa(), qlkh.getTen(), qlkh.getGioiTinh(), qlkh.getNgaySinh(), qlkh.getSoDienThoai(), qlkh.getDiaChi(), qlkh.getTrangThai());
        boolean update = khr.update(kh, id);
        if (update = true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }
    
    @Override
    public String delete(String id) {
        boolean delete = khr.delete(id);
        if (delete = true) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }
    
    @Override
    public List<QuanLyKhachHang> getbyTrangThai(int trangThai) {
        List<KhachHang> kh = khr.getbyTrangThai(trangThai);
        List<QuanLyKhachHang> lstQlKh = new ArrayList<>();
        
        for (KhachHang ql : kh) {
            QuanLyKhachHang qlKh = new QuanLyKhachHang(ql.getId(), ql.getMa(), ql.getTen(), ql.getGioiTinh(), ql.getNgaySinh(), ql.getSoDienThoai(), ql.getDiaChi(), ql.getTrangThai());
            lstQlKh.add(qlKh);
        }
        
        return lstQlKh;
    }
    
    @Override
    public List<QuanLyKhachHang> getbyGioiTinh(int gioiTinh) {
        List<KhachHang> kh = khr.getbyGioiTinh(gioiTinh);
        List<QuanLyKhachHang> lstQlKh = new ArrayList<>();
        
        for (KhachHang ql : kh) {
            QuanLyKhachHang qlKh = new QuanLyKhachHang(ql.getId(), ql.getMa(), ql.getTen(), ql.getGioiTinh(), ql.getNgaySinh(), ql.getSoDienThoai(), ql.getDiaChi(), ql.getTrangThai());
            lstQlKh.add(qlKh);
        }
        
        return lstQlKh;
    }
    
    @Override
    public List<QuanLyKhachHang> getbyTen(String ten) {
        List<KhachHang> kh = khr.getbyTen(ten);
        List<QuanLyKhachHang> lstQlKh = new ArrayList<>();
        
        for (KhachHang ql : kh) {
            QuanLyKhachHang qlKh = new QuanLyKhachHang(ql.getId(), ql.getMa(), ql.getTen(), ql.getGioiTinh(), ql.getNgaySinh(), ql.getSoDienThoai(), ql.getDiaChi(), ql.getTrangThai());
            lstQlKh.add(qlKh);
        }
        
        return lstQlKh;
    }
    
}
