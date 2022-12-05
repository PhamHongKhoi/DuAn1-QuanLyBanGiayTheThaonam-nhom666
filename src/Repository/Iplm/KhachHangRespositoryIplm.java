/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.KhachHang;
import java.util.List;
import Utilities.SQLServerConnection;
import java.sql.*;
import java.util.ArrayList;
import Repository.IKhachHangRespository;

/**
 *
 * @author Asus
 */
public class KhachHangRespositoryIplm implements IKhachHangRespository {

    @Override
    public List<KhachHang> getAll() {
        String query = "select * from DA1.dbo.KhachHang";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<KhachHang> lstkh = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                lstkh.add(kh);
            }
            return lstkh;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(KhachHang kh) {
        String query = "INSERT INTO [dbo].[KhachHang]"
                + "           ([Ma]"
                + "           ,[Ten]"
                + "           ,[GioiTinh]"
                + "           ,[NgaySinh]"
                + "           ,[Sdt]"
                + "           ,[DiaChi]"
                + "           ,[TrangThai])"
                + "     VALUES(?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getGioiTinh());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getSoDienThoai());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getTrangThai());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(KhachHang kh, String id) {
        String query = " UPDATE [dbo].[KhachHang]\n"
                + "   SET    [Ma] = ?"
                + "      ,[Ten] = ?"
                + "      ,[GioiTinh] = ?"
                + "      ,[NgaySinh] = ?"
                + "      ,[Sdt] = ?"
                + "      ,[DiaChi] = ?"
                + "      ,[TrangThai] = ?"
                + " WHERE Id = ? ";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, kh.getMa());
            ps.setObject(2, kh.getTen());
            ps.setObject(3, kh.getGioiTinh());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getSoDienThoai());
            ps.setObject(6, kh.getDiaChi());
            ps.setObject(7, kh.getTrangThai());
            ps.setObject(8, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[KhachHang]"
                + "      WHERE Id = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public List<KhachHang> getbyTrangThai(int trangThai) {
        String query = "select * from DA1.dbo.KhachHang where TrangThai = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<KhachHang> lstkh = new ArrayList<>();
            ps.setObject(1, trangThai);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                lstkh.add(kh);
            }
            return lstkh;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public List<KhachHang> getbyGioiTinh(int gioiTinh) {
        String query = "select * from DA1.dbo.KhachHang where GioiTinh = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<KhachHang> lstkh = new ArrayList<>();
            ps.setObject(1, gioiTinh);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                lstkh.add(kh);
            }
            return lstkh;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public List<KhachHang> getbyTen(String ten) {
        String query = "select * from DA1.dbo.KhachHang where Ten = ?";
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<KhachHang> lstkh = new ArrayList<>();
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                lstkh.add(kh);
            }
            return lstkh;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        List<KhachHang> lists = new KhachHangRespositoryIplm().getbyTrangThai(0);
        System.out.println("" + lists.toString());
    }
}
