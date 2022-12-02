/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services.Iplm;

import Repository.Iplm.KhachHangRRepository;
import Services.IKhachHangRService;
import ViewModels.KhachHangResponse;

/**
 *
 * @author Admin
 */
public class KhachHangRService implements IKhachHangRService{
    KhachHangRRepository khachHangRRepository = new KhachHangRRepository();

    @Override
    public String saveKhachHang(KhachHangResponse khachHangResponse) {
        if (khachHangRRepository.saveKhachHang(khachHangResponse)) {
            return "Đã them khach hang";
        } else {
            return "ko them khach hang";
        }
    }
    
}
