/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.ThongKe;
import Repository.IThongKeRespository;
import java.util.List;
import java.sql.*;
import Utilities.SQLServerConnection;
import ViewModels.QuanLyThongKe;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ThongKeRespository implements IThongKeRespository {

    @Override
    public List<ThongKe> getAll() {
        String query = "SELECT dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, dbo.HoaDon.NgayTao,sum(SoLuong*DonGia)\n"
                + "                FROM     dbo.HoaDon INNER JOIN\n"
                + "                                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                                  dbo.SanPhamChiTiet ON dbo.HoaDonChiTiet.IdCTSP = dbo.SanPhamChiTiet.Id INNER JOIN\n"
                + "                                  dbo.SanPham ON dbo.SanPhamChiTiet.IdSanPham = dbo.SanPham.Id\n"
                + "group by dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, dbo.HoaDon.NgayTao";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ThongKe> lsttk = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe tk = new ThongKe(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDate(4), rs.getFloat(5));
                lsttk.add(tk);
            }
            return lsttk;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public List<ThongKe> getHangHuy() {
        String query = "SELECT dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.SanPhamChiTiet ON dbo.HoaDonChiTiet.IdCTSP = dbo.SanPhamChiTiet.Id INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.SanPhamChiTiet.IdSanPham = dbo.SanPham.Id\n"
                + "where HoaDon.TrangThai = 2";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ThongKe> lsttk = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe tk = new ThongKe(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDate(4), rs.getInt(5));
                lsttk.add(tk);
            }
            return lsttk;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public List<ThongKe> getTongTien() {
        String query = "select sum(SoLuong*DonGia) from HoaDonChiTiet join SanPhamChiTiet on SanPhamChiTiet.Id = HoaDonChiTiet.IdCTSP";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ThongKe> lsttk = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe tk = new ThongKe(rs.getFloat(1));
                lsttk.add(tk);
            }
            return lsttk;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
