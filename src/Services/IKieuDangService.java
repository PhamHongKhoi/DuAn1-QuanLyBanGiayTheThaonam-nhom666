/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QuanLyKieuDang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IKieuDangService {

    List<QuanLyKieuDang> getAll();

    String add(QuanLyKieuDang t);

    String delete(String id);

    String update(QuanLyKieuDang cv, String id);

    String themNhanhKd(QuanLyKieuDang kd);
}
