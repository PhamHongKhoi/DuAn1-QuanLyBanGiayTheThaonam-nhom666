/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.ChiTietHoaDon;
import DomainModel.LoaiHinhTanhToan;
import Repository.ILoaiHinhThanhToanRepository;
import Utilities.SQLServerConnection;
import ViewModels.HoaDonResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class LoaiHinhThanhToanRepository implements ILoaiHinhThanhToanRepository {

    public boolean saveLoaiHinhTT(LoaiHinhTanhToan loaiHinhThanhToan) {
        String query = "INSERT INTO [dbo].[LoaiHinhThanhToan]\n"
                + "           ([IdHD]\n"
                + "           ,[TenPTTT]\n"
                + "           ,[TienMat]\n"
                + "           ,[TienChuyenKhoan])\n"
                + "     VALUES\n"
                + "           (?,?,?,?)";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, loaiHinhThanhToan.getIdHD());
            ps.setObject(2, loaiHinhThanhToan.getTenPTTT());
            ps.setObject(3, loaiHinhThanhToan.getTienMat());
            ps.setObject(4, loaiHinhThanhToan.getTienChuyenKhoan());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;

    }

    public ArrayList<LoaiHinhTanhToan> getTTThanhToanByID(String id) {
        String query = "SELECT dbo.LoaiHinhThanhToan.TenPTTT, dbo.LoaiHinhThanhToan.TienMat, dbo.LoaiHinhThanhToan.TienChuyenKhoan\n"
                + "FROM     dbo.LoaiHinhThanhToan INNER JOIN\n"
                + "                  dbo.HoaDon ON dbo.LoaiHinhThanhToan.IdHD = dbo.HoaDon.Id Where Id = ?";
        ArrayList<LoaiHinhTanhToan> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                LoaiHinhTanhToan loaiHinhTanhToan = new LoaiHinhTanhToan(rs.getString(1), rs.getFloat(2), rs.getFloat(3));
                list.add(loaiHinhTanhToan);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
