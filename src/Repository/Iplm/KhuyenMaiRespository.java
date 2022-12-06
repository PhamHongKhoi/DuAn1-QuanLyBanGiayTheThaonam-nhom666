/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.KhuyenMai;
import DomainModel.SanPhamKhuyenMai;
import Repository.IKhuyenMaiRespository;
import java.util.List;
import java.sql.*;
import Utilities.SQLServerConnection;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class KhuyenMaiRespository implements IKhuyenMaiRespository {

    @Override
    public List<KhuyenMai> getAll() {
        String query = "select id,TenKhuyenMai,LoaiKhuyenMai,NgayBatDau,NgayKetThuc,TrangThai from DA1.dbo.KhuyenMai";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<KhuyenMai> lstKm = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDate(4), rs.getDate(5), rs.getInt(6));
                lstKm.add(km);
            }
            return lstKm;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(KhuyenMai km) {
        String query = "INSERT INTO [dbo].[KhuyenMai]\n"
                + "           ([TenKhuyenMai]\n"
                + "           ,[LoaiKhuyenMai]\n"
                + "           ,[NgayBatDau]\n"
                + "           ,[NgayKetThuc]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES(?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, km.getTenKhuyenMai());
            ps.setObject(2, km.getLoaiKhuyenMai());
            ps.setObject(3, km.getNgayBatDau());
            ps.setObject(4, km.getNgatKetThuc());
            ps.setObject(5, km.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public List<SanPhamKhuyenMai> getAllSpKhuyenMai() {
        String query = "select sanPhamKhuyenMai.Id,KhuyenMai.TenKhuyenMai,SanPham.Ten,SanPhamChiTiet.GiaBan,\n"
                + "       sanPhamKhuyenMai.TrangThai,(GiaBan-((GiaBan*LoaiKhuyenMai)/100))\n"
                + "from DA1.dbo.SanPham join SanPhamChiTiet on SanPham.Id = SanPhamChiTiet.IdSanPham\n"
                + "                                join sanPhamKhuyenMai on SanPhamChiTiet.Id = sanPhamKhuyenMai.IdSanPham\n"
                + "								join KhuyenMai on KhuyenMai.Id = sanPhamKhuyenMai.IdKhuyenMai";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<SanPhamKhuyenMai> lstSpKm = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamKhuyenMai spKm = new SanPhamKhuyenMai(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getInt(5), rs.getDouble(6));
                lstSpKm.add(spKm);
            }
            return lstSpKm;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<SanPhamKhuyenMai> lstKm = new KhuyenMaiRespository().getAllSpKhuyenMai();
        for (SanPhamKhuyenMai sp : lstKm) {
            System.out.println(sp.toString());
        }
    }

}
