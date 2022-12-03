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
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ThongKeRespository implements IThongKeRespository {

    @Override
    public List<ThongKe> getAll() {
        String query = "SELECT dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.HoaDonChiTiet.DonGia, dbo.HoaDon.NgayTao\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.HoaDon.Id = dbo.HoaDonChiTiet.IdHD INNER JOIN\n"
                + "                  dbo.SanPhamChiTiet ON dbo.HoaDonChiTiet.IdCTSP = dbo.SanPhamChiTiet.Id INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.SanPhamChiTiet.IdSanPham = dbo.SanPham.Id";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ThongKe> lsttk = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe tk = new ThongKe(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getDate(4));
                lsttk.add(tk);
            }
            return lsttk;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

}
