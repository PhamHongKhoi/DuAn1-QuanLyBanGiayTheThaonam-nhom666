/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import DomainModel.LoaiHinhTanhToan;
import Repository.Iplm.LoaiHinhThanhToanRepository;
import Services.ILoaiHinhThanhToanService;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LoaiHinhThanhToanService implements ILoaiHinhThanhToanService{
    LoaiHinhThanhToanRepository loaiHinhThanhToanRepository = new LoaiHinhThanhToanRepository();

    @Override
    public String saveLoaiHinhTT(LoaiHinhTanhToan loaiHinhThanhToan) {
        if (loaiHinhThanhToanRepository.saveLoaiHinhTT(loaiHinhThanhToan)) {
            return "Đã thêm loai Hinh Thanh Toan";
        } else {
            return "Chưa thêm đc loai Hinh Thanh Toan";
        }
    }

    @Override
    public ArrayList<LoaiHinhTanhToan> getTTThanhToanByID(String id) {
        return loaiHinhThanhToanRepository.getTTThanhToanByID(id);
    }
    
    
}
