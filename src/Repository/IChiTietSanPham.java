/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import DomainModel.ChiTietSanPham;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IChiTietSanPham {

    List<ChiTietSanPham> getAll();

    boolean add(ChiTietSanPham ctSp);

    boolean update(ChiTietSanPham ctSp, String id);

    boolean delete(String id);
}
