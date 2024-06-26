/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.BLL;

import com.mycompany.qlthanhvien.DAL.DAL_ThanhVien;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Admin
 */
public class BLL_ThanhVien {
    private DAL_ThanhVien thanhVienDAL;
    // private static SessionFactory factory;

    public BLL_ThanhVien() {
        thanhVienDAL = new DAL_ThanhVien();
    }

    public List<ThanhVien> getThanhVien() {
        List<ThanhVien> ThanhViens = thanhVienDAL.getThanhvien();
        return ThanhViens;
    }

    public List<ThanhVien> SearchThanhVien(String column, String value) {
        List<ThanhVien> ThanhViens = thanhVienDAL.SearchThanhvien(column, value);
        return ThanhViens;
    }

    public void addThanhVien(ThanhVien ThanhVien) {

        thanhVienDAL.addThanhVien(ThanhVien);

    }

    public void updateThanhVien(ThanhVien ThanhVien) {

        thanhVienDAL.updateThanhVien(ThanhVien);

    }

    public void deleteThanhVien(ThanhVien ThanhVien) throws Exception {

        thanhVienDAL.deleteThanhVien(ThanhVien);

    }

    public boolean importExcel(ArrayList<ThanhVien> danhsachThanhvien) {
        // System.out.println("tới đây rồi");
        int a = 0;
        for (ThanhVien thanhVien : danhsachThanhvien) {
            thanhVienDAL.mergeThanhVien(thanhVien);
            // System.out.println(a);
            a++;
        }
        return true;
    }

    // Gọi hàm từ DAL để lấy danh sách các năm nhập học
    public List<Integer> getDistinctYears() {
        return thanhVienDAL.getDistinctYears();
    }

    public List<ThanhVien> getThanhVienByYear(int year) {
        return thanhVienDAL.getThanhVienByYear(year);
    }

    public boolean deleteThanhVienByYear(int year) {
        return thanhVienDAL.deleteThanhVienByYear(year);
    }

}
