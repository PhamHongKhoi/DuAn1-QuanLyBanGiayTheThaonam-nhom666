/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.HoaDon;
import Repository.IHoaDonRepository;
import Utilities.SQLServerConnection;
import ViewModels.DanhSachSanPhamResponse;
import ViewModels.HoaDonResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonRepository implements IHoaDonRepository {

    @Override
    public ArrayList<HoaDonResponse> getAll() {
        String query = "SELECT Id, Ma, NgayTao, TrangThai, TenKhachHang, SDT, DiaChi\n"
                + "FROM     dbo.HoaDon";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveHoaDon(HoaDon hoaDon) {
        String query = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[TrangThai])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getMaHD());
            ps.setObject(2, hoaDon.getNgayTao());
            ps.setObject(3, hoaDon.getTrangThai());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    @Override
    public boolean updateThanhToan(HoaDon hoaDon, String ma) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [TrangThai] = ?"
                + " WHERE Ma = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getTrangThai());
            ps.setObject(2, ma);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public ArrayList<HoaDonResponse> getAllByTrangThai(int trangThai) {
        String query = "SELECT Id, Ma, NgayTao, TrangThai\n"
                + "                FROM     dbo.HoaDon Where TrangThai = ?";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, trangThai);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<HoaDonResponse> getTTKhByID(String id) {
        String query = "SELECT [NgayThanhToan]\n"
                + "      ,[TenKhachHang]\n"
                + "      ,[SDT]\n"
                + "      ,[DiaChi]\n"
                + "  FROM [dbo].[HoaDon] Where Id = ?";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateTTKH(HoaDon hoaDon, String id) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [TenKhachHang] = ?"
                + "      ,[SDT] = ?"
                + "      ,[DiaChi] = ?"
                + " WHERE Id = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getTenNguoiNhan());
            ps.setObject(2, hoaDon.getSdt());
            ps.setObject(3, hoaDon.getDiaChi());
            ps.setObject(4, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public ArrayList<HoaDonResponse> getTTKhGiaoHangByID(String id) {
        String query = "SELECT [NgayShip]\n"
                + "      ,[NgayNhan]\n"
                + "      ,[NgayHenKhach]\n"
                + "      ,[TienShip]\n"
                + "      ,[TenKhachHang]\n"
                + "      ,[SDT]\n"
                + "      ,[DiaChi]\n"
                + "  FROM [dbo].[HoaDon] Where Id = ?";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getFloat(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateTTKHGiaoHang(HoaDon hoaDon, String id) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [TienShip] = ?"
                + "      ,[TenKhachHang] = ?"
                + "      ,[SDT] = ?"
                + "      ,[DiaChi] = ?"
                + " WHERE Id = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getTienShip());
            ps.setObject(2, hoaDon.getTenNguoiNhan());
            ps.setObject(3, hoaDon.getSdt());
            ps.setObject(4, hoaDon.getDiaChi());
            ps.setObject(5, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean updateNgayHenGiaoHang(HoaDon hoaDon, String id) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [NgayHenKhach] = ?"
                + " WHERE Id = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getNgayHenKhach());
            ps.setObject(2, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean updateNgayShip(HoaDon hoaDon, String id) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [NgayShip] = ?"
                + " WHERE Id = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getNgayShip());
            ps.setObject(2, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean updateNgayKhachNhan(HoaDon hoaDon, String id) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [NgayNhan] = ?"
                + " WHERE Id = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getNgayNhan());
            ps.setObject(2, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public boolean updateNgayThanhToan(HoaDon hoaDon, String id) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [NgayThanhToan] = ?"
                + " WHERE Id = ?";
        int check = 0;
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hoaDon.getNgayThanhToan());
            ps.setObject(2, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public ArrayList<HoaDonResponse> getAllByNgayBatDauNgayKetThuc(Date ngayBatDau, Date ngayKeThuc) {
        String query = "SELECT Id, Ma, NgayTao, TrangThai, TenKhachHang, SDT, DiaChi\n"
                + "FROM     dbo.HoaDon where NgayTao BETWEEN ? AND ?";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ngayBatDau);
            ps.setObject(2, ngayKeThuc);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<HoaDonResponse> getAllByBanHangTaiQuay(String ck, String tm, String cktm) {
        String query = "SELECT dbo.HoaDon.Id, dbo.HoaDon.Ma, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.LoaiHinhThanhToan ON dbo.HoaDon.Id = dbo.LoaiHinhThanhToan.IdHD where TenPTTT = ? or TenPTTT = ? or TenPTTT = ?";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ck);
            ps.setObject(2, tm);
            ps.setObject(3, cktm);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<HoaDonResponse> getAllByGiaoHang(String cod) {
        String query = "SELECT dbo.HoaDon.Id, dbo.HoaDon.Ma, dbo.HoaDon.NgayTao, dbo.HoaDon.TrangThai\n"
                + "FROM     dbo.HoaDon INNER JOIN\n"
                + "                  dbo.LoaiHinhThanhToan ON dbo.HoaDon.Id = dbo.LoaiHinhThanhToan.IdHD where TenPTTT = ?";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, cod);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<HoaDonResponse> getAllBySDT(String sdt) {
        String query = "SELECT Id, Ma, NgayTao, TrangThai\n"
                + "FROM     dbo.HoaDon where SDT = ?";
        ArrayList<HoaDonResponse> list = new ArrayList<>();
        try (Connection con = SQLServerConnection.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, sdt);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonResponse hoaDonResponse = new HoaDonResponse(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
                list.add(hoaDonResponse);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
