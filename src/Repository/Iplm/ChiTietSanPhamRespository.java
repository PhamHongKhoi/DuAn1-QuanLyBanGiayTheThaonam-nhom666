/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository.Iplm;

import DomainModel.ChiTietSanPham;
import Repository.IChiTietSanPham;
import java.util.List;
import java.sql.*;
import Utilities.SQLServerConnection;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ChiTietSanPhamRespository implements IChiTietSanPham {

    String query = "SELECT SanPhamChiTiet.Id,SanPhamChiTiet.MoTa,SanPhamChiTiet.SoLuongTon,SanPhamChiTiet.GiaNhap,SanPhamChiTiet.GiaBan,SanPhamChiTiet.NamBH,\n"
            + "                   SanPhamChiTiet.HinhAnh,DongSP.Ten,NSX.Ten,KieuDang.Ten,KichCo.Ten,ChatLieu.DaChinh,\n"
            + "            	   MauSac.Ten,SanPham.Ten,ThuongHieu.Ten,SanPhamChiTiet.QrCode\n"
            + "            from DA1.dbo.SanPhamChiTiet inner join DongSP on SanPhamChiTiet.IdDongSP = DongSP.Id\n"
            + "            							inner join NSX on SanPhamChiTiet.IdNSX = NSX.Id\n"
            + "            							inner join KieuDang on SanPhamChiTiet.IdKieuDang = KieuDang.Id\n"
            + "            							inner join KichCo on SanPhamChiTiet.IdKichCo = KichCo.Id\n"
            + "            							inner join ChatLieu on SanPhamChiTiet.IdChatLieu = ChatLieu.Id\n"
            + "            							inner join MauSac on SanPhamChiTiet.IdMauSac = MauSac.Id\n"
            + "            							inner join SanPham on SanPhamChiTiet.IdSanPham = SanPham.Id\n"
            + "            							inner join ThuongHieu on SanPhamChiTiet.IdThuongHieu = ThuongHieu.Id";

    @Override
    public List<ChiTietSanPham> getAll() {
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            List<ChiTietSanPham> lstCtSp = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSanPham ctSp = new ChiTietSanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16));
                lstCtSp.add(ctSp);
            }
            return lstCtSp;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean add(ChiTietSanPham ctSp) {
        String query = "INSERT INTO [dbo].[SanPhamChiTiet]\n"
                + "           ([MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan]\n"
                + "           ,[NamBH]\n"
                + "           ,[HinhAnh]\n"
                + "           ,[IdKhuyenMai]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[IdNSX]\n"
                + "           ,[IdKieuDang]\n"
                + "           ,[IdKichCo]\n"
                + "           ,[IdChatLieu]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdSanPham]\n"
                + "           ,[IdThuongHieu]\n"
                + "           ,[QrCode])\n"
                + "     VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ctSp.getMoTa());
            ps.setObject(2, ctSp.getSoLuongTon());
            ps.setObject(3, ctSp.getGiaNhap());
            ps.setObject(4, ctSp.getGiaban());
            ps.setObject(5, ctSp.getNamBanHang());
            ps.setObject(6, ctSp.getHinhAnh());
            ps.setObject(7, ctSp.getIdKhuyenMai());
            ps.setObject(8, ctSp.getIdDongSp());
            ps.setObject(9, ctSp.getIdNSX());
            ps.setObject(10, ctSp.getIdKieuDang());
            ps.setObject(11, ctSp.getIdKichCo());
            ps.setObject(12, ctSp.getIdChatLieu());
            ps.setObject(13, ctSp.getIdMauSac());
            ps.setObject(14, ctSp.getIdSanPham());
            ps.setObject(15, ctSp.getIdThuongHieu());
            ps.setObject(16, ctSp.getQrCode());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean update(ChiTietSanPham ctSp, String id) {
        String query = "UPDATE [dbo].[SanPhamChiTiet]\n"
                + "   SET [MoTa] = ?\n"
                + "      ,[SoLuongTon] = ?\n"
                + "      ,[GiaNhap] = ?\n"
                + "      ,[GiaBan] = ?\n"
                + "      ,[NamBH] = ?\n"
                + "      ,[HinhAnh] = ?\n"
                + "      ,[IdKhuyenMai] = ?\n"
                + "      ,[IdDongSP] = ?\n"
                + "      ,[IdNSX] = ?\n"
                + "      ,[IdKieuDang] = ?\n"
                + "      ,[IdKichCo] = ?\n"
                + "      ,[IdChatLieu] = ?\n"
                + "      ,[IdMauSac] = ?\n"
                + "      ,[IdSanPham] = ?\n"
                + "      ,[IdThuongHieu] = ?\n"
                + "      ,[QrCode] = ?\n"
                + " WHERE [Id] = ?";
        int check = 0;
        try ( Connection con = SQLServerConnection.getConnection();  PreparedStatement ps = con.prepareCall(query)) {
            ps.setObject(1, ctSp.getMoTa());
            ps.setObject(2, ctSp.getSoLuongTon());
            ps.setObject(3, ctSp.getGiaNhap());
            ps.setObject(4, ctSp.getGiaban());
            ps.setObject(5, ctSp.getNamBanHang());
            ps.setObject(6, ctSp.getHinhAnh());
            ps.setObject(7, ctSp.getIdKhuyenMai());
            ps.setObject(8, ctSp.getIdDongSp());
            ps.setObject(9, ctSp.getIdNSX());
            ps.setObject(10, ctSp.getIdKieuDang());
            ps.setObject(11, ctSp.getIdKichCo());
            ps.setObject(12, ctSp.getIdChatLieu());
            ps.setObject(13, ctSp.getIdMauSac());
            ps.setObject(14, ctSp.getIdSanPham());
            ps.setObject(15, ctSp.getIdThuongHieu());
            ps.setObject(16, ctSp.getQrCode());
            ps.setObject(17, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    @Override
    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[SanPhamChiTiet]\n"
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

}
