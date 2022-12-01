/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.LoaiHinhTanhToan;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface ILoaiHinhThanhToanRepository {

    boolean saveLoaiHinhTT(LoaiHinhTanhToan loaiHinhThanhToan);

    ArrayList<LoaiHinhTanhToan> getTTThanhToanByID(String id);
}
