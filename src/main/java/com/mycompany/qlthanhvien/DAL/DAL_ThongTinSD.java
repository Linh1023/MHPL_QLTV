/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlthanhvien.DAL;

import com.mycompany.qlthanhvien.BLL.ThongTinSD;
import java.util.List;
import org.hibernate.Session;
import com.mycompany.qlthanhvien.BLL.ThanhVien;
import com.mycompany.qlthanhvien.BLL.XuLy;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class DAL_ThongTinSD {
    private Session session;
    
    public DAL_ThongTinSD (){
         session = HibernateUtils.getSessionFactory().openSession();
    }
   
     public List<ThongTinSD> getThongTinSD() {
         
         List<ThongTinSD> thongTinSDs;
         session.beginTransaction();
        thongTinSDs = this.session.createQuery("FROM ThongTinSD WHERE  MaTB is not NULL").list();
        session.getTransaction().commit();
        return thongTinSDs;
    }
     
    public void addThongTinSD(ThongTinSD thongTinSD)
    {
        session.beginTransaction();
        session.save(thongTinSD);   
        session.getTransaction().commit();
        
    }
    public void updateThongTinSD(ThongTinSD thongTinSD)
    {
       session.beginTransaction();
       session.merge(thongTinSD);
       session.getTransaction().commit();
    }
    public void deleteThongTinSD(ThongTinSD thongTinSD)
    {
        session.beginTransaction();
        session.delete(thongTinSD);
        session.getTransaction().commit();
    }
    
    public List<ThongTinSD> searchThongTinSD_MaTV_MaTB(String col, String value) {
         
         List<ThongTinSD> thongTinSDs;
         session.beginTransaction();
        thongTinSDs = this.session.createQuery("FROM ThongTinSD WHERE  MaTB is not NULL AND " + col + "=" + value  ).list();
        session.getTransaction().commit();
        return thongTinSDs;
    }
     public List getThanhVienTheoTG() {
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
        Root<ThongTinSD> root = criteriaQuery.from(ThongTinSD.class);

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
        Root<ThongTinSD> root = criteriaQuery.from(ThongTinSD.class);
        Join<ThongTinSD, ThanhVien> join = root.join("thanhVien", JoinType.INNER);
        
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
        Root<ThongTinSD> root = criteriaQuery.from(ThongTinSD.class);
        Join<ThongTinSD, ThanhVien> join = root.join("thanhVien", JoinType.INNER);
        
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
    
     public List<ThongTinSD> getListThongTinSD() {
         
         List<ThongTinSD> thongTinSDs;
         session.beginTransaction();
        thongTinSDs = this.session.createQuery("FROM ThongTinSD WHERE  TGVao is not NULL").list();
        session.getTransaction().commit();
        return thongTinSDs;
    }
     
     public List<XuLy> checkViPham(int maTV) {
        List<XuLy> list = null;
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            list = session.createQuery("From XuLy WHERE TrangThaiXL = 0 AND MaTV = " + maTV, XuLy.class).list();
            transaction.commit();
        } catch (HibernateException e) {

            if (transaction != null) {
                transaction.rollback();
            }

        } finally {
            session.close();
        }
        return list;

    }
     
     
     public static void main(String[] args) {
        DAL_ThongTinSD dAL_ThongTinSD = new DAL_ThongTinSD();
//        ThongTinSD thongTinSD = new ThongTinSD();
//        
//        thongTinSD.setMaTV(1123330257);
//        
//        
//        dAL_ThongTinSD.addThongTinSD(thongTinSD);
//1121530087
            
        List<XuLy> xuLys = dAL_ThongTinSD.checkViPham(1121530087);
         System.out.println(xuLys.size());
        for (int i =  0; i<xuLys.size(); i++) {
            System.out.println(xuLys.get(i).getMaTV());
        }
    }
}
