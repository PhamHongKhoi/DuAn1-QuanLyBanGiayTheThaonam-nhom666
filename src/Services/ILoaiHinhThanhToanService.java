/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModel.LoaiHinhTanhToan;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ILoaiHinhThanhToanService {
    String saveLoaiHinhTT(LoaiHinhTanhToan loaiHinhThanhToan);
    
    ArrayList<LoaiHinhTanhToan> getTTThanhToanByID(String id);
}
