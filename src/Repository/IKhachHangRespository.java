/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.KhachHang;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IKhachHangRespository {

    List<KhachHang> getAll();

    boolean add(KhachHang kh);

    boolean update(KhachHang kh, String id);

    boolean delete(String id);
}
