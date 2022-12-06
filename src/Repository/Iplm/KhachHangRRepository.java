/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import Repository.IKhachHangRRepository;
import Utilities.SQLServerConnection;
import ViewModels.KhachHangResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class KhachHangRRepository implements IKhachHangRRepository {

    public boolean saveKhachHang(KhachHangResponse khachHangResponse) {
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([Ten]\n"
                + "           ,[Sdt]\n"
                + "           ,[DiaChi])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, khachHangResponse.getTen());
            ps.setObject(2, khachHangResponse.getSoDienThoai());
            ps.setObject(3, khachHangResponse.getDiaChi());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }
}
