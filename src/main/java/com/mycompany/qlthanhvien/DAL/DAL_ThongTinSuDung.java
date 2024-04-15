/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThanhVien;
import com.mycompany.qlthanhvien.BLL.ThongTinSuDung;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import org.hibernate.Session;

public class DAL_ThongTinSuDung {

    Session session;

    public DAL_ThongTinSuDung() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List getThanhVienTheoTG() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<ThongTinSuDung> root = criteriaQuery.from(ThongTinSuDung.class);

        criteriaQuery.multiselect(builder.countDistinct(root.get("maTV")), builder.function("date", Date.class, root.get("tGVao")));
        criteriaQuery.where(builder.isNotNull(root.get("tGVao")));
        criteriaQuery.groupBy(builder.function("date", Date.class, root.get("tGVao")));

        List<Object[]> results = session.createQuery(criteriaQuery).getResultList();
        for (Object[] result : results) {
            Long soluong = (Long) result[0];
            Date date = (Date) result[1];
            System.out.println("So luong: " + soluong + ", date: " + date.toString());
        }
        return results;
    }

    public List getThanhVienTheoKhoa() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<ThongTinSuDung> root = criteriaQuery.from(ThongTinSuDung.class);
        Join<ThongTinSuDung, ThanhVien> join = root.join("thanhvien", JoinType.INNER);
        
        criteriaQuery.multiselect(builder.countDistinct(join.get("maTV")),join.get("khoa"));
        criteriaQuery.where(builder.isNotNull(root.get("tGVao")));
        criteriaQuery.groupBy(join.get("khoa"));
        
        List<Object[]> results = session.createQuery(criteriaQuery).getResultList();
        for (Object[] result : results) {
            Long soluong = (Long) result[0];
            String khoa = (String) result[1];
            System.out.println("So luong: " + soluong + ", date: " + khoa);
        }
        return results;
    }
    
    public List getThanhVienTheoNganh() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<ThongTinSuDung> root = criteriaQuery.from(ThongTinSuDung.class);
        Join<ThongTinSuDung, ThanhVien> join = root.join("thanhvien", JoinType.INNER);
        
        criteriaQuery.multiselect(builder.countDistinct(join.get("maTV")),join.get("nganh"));
        criteriaQuery.where(builder.isNotNull(root.get("tGVao")));
        criteriaQuery.groupBy(join.get("nganh"));
        
        List<Object[]> results = session.createQuery(criteriaQuery).getResultList();
        for (Object[] result : results) {
            Long soluong = (Long) result[0];
            String nganh = (String) result[1];
            System.out.println("So luong: " + soluong + ", nganh: " + nganh);
        }
        return results;
    }
}
