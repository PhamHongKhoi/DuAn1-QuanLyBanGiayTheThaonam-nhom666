/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.KhuyenMai;
import DomainModel.SanPhamKhuyenMai;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IKhuyenMaiRespository {

    List<KhuyenMai> getAll();

    boolean add(KhuyenMai km);

    List<SanPhamKhuyenMai> getAllSpKhuyenMai();
}
