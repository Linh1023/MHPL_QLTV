/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlthanhvien.UI;

import com.mycompany.qlthanhvien.BLL.BLL_XuLy;
import com.mycompany.qlthanhvien.BLL.XuLy;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quang
 */
public class UI_JPN_XuLyViPham extends javax.swing.JPanel {

    /**
     * Creates new form ThongKe
     */
    private BLL_XuLy bLL_xuLy;
    DefaultTableModel model;

    public UI_JPN_XuLyViPham() {
        initComponents();

        bLL_xuLy = new BLL_XuLy();
        loadThongtinXuLyTable();
    }

    public void loadThongtinXuLyTable() {
        bLL_xuLy = new BLL_XuLy();

        List<XuLy> thongTinXuLy = bLL_xuLy.load_xuLy();
        Object[][] objectses;
        objectses = bLL_xuLy.convertList(thongTinXuLy);
        String[] title = {"Ma Xu Ly", "Mã thành viên", "Hinh Thuc Xu Ly", "SO Tien",
            "Ngay Xu Ly", "Trang Thai"};
        model = new DefaultTableModel(objectses, title);
        jtab_xuly.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtab_xuly = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_tGMuon = new javax.swing.JTextField();
        jButton_Them = new javax.swing.JButton();
        jButton_capNhat = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jButton_refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_maTV_XuLy = new javax.swing.JTextField();
        jbutton_maTV_xuLy = new javax.swing.JButton();
        jTextField_hoTen_XuLy = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jbutton_ma_hinhThucPhat = new javax.swing.JButton();
        jtx_ma_vi_pham = new javax.swing.JTextField();
        jtxt_soTien = new javax.swing.JTextField();
        txt_hinhThuc = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(1000, 700));

        jtab_xuly.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaTT", "Mã Thành viên", "Tên thành viên", "Mã Thiết bị", "Tên Thiết bị", "TG Mượn", "TG Trả", "Trạng thái"
            }
        ));
        jtab_xuly.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtab_xulyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtab_xuly);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setText("Xử Lý Vi Phạm");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Vi Pham");

        jLabel4.setText("Ma Vi Pham");

        jLabel7.setText("Thời gian mượn :");

        jTextField_tGMuon.setEditable(false);

        jButton_Them.setText("Them");
        jButton_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ThemActionPerformed(evt);
            }
        });

        jButton_capNhat.setText("Cập nhật");
        jButton_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_capNhatActionPerformed(evt);
            }
        });

        jButton_xoa.setText("Xóa");
        jButton_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xoaActionPerformed(evt);
            }
        });

        jButton_refresh.setText("Làm mới");
        jButton_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_refreshActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Mã thành viên :");

        jTextField_maTV_XuLy.setEditable(false);
        jTextField_maTV_XuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_maTV_XuLyActionPerformed(evt);
            }
        });

        jbutton_maTV_xuLy.setText("Chọn thành viên");
        jbutton_maTV_xuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_maTV_xuLyActionPerformed(evt);
            }
        });

        jTextField_hoTen_XuLy.setEditable(false);
        jTextField_hoTen_XuLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_hoTen_XuLyActionPerformed(evt);
            }
        });

        jLabel9.setText("Tên thành viên :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField_maTV_XuLy, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbutton_maTV_xuLy))
                    .addComponent(jTextField_hoTen_XuLy))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_maTV_XuLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_maTV_xuLy))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_hoTen_XuLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("So Tien");

        jLabel10.setText("Hinh Thuc Xu Ly");

        jbutton_ma_hinhThucPhat.setText("Chon Hinh Thuc");
        jbutton_ma_hinhThucPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_ma_hinhThucPhatActionPerformed(evt);
            }
        });

        jtx_ma_vi_pham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtx_ma_vi_phamActionPerformed(evt);
            }
        });

        jtxt_soTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_soTienActionPerformed(evt);
            }
        });

        txt_hinhThuc.setText("jTextField1");
        txt_hinhThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hinhThucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_hinhThuc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jbutton_ma_hinhThucPhat))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtx_ma_vi_pham, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(337, 337, 337))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxt_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_tGMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Them)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_capNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_xoa)
                        .addGap(35, 35, 35)
                        .addComponent(jButton_refresh)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtx_ma_vi_pham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxt_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jbutton_ma_hinhThucPhat)
                    .addComponent(txt_hinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_tGMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_xoa)
                    .addComponent(jButton_refresh)
                    .addComponent(jButton_capNhat)
                    .addComponent(jButton_Them))
                .addGap(18, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(298, 298, 298))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtab_xulyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtab_xulyMouseClicked

//  
        int index = jtab_xuly.getSelectedRow();
        model = (DefaultTableModel) jtab_xuly.getModel();

        jtx_ma_vi_pham.setText(model.getValueAt(index, 0) + "");
        jTextField_maTV_XuLy.setText(model.getValueAt(index, 1) + "");
        txt_hinhThuc.setText(model.getValueAt(index, 2) + "");
        jtxt_soTien.setText(model.getValueAt(index, 3) + "");
        jTextField_tGMuon.setText(model.getValueAt(index, 4) + "");
//        jTextField_tGMuon.setText(model.getValueAt(index, 5)+"");
    }//GEN-LAST:event_jtab_xulyMouseClicked

    private void jButton_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ThemActionPerformed

        try {
            bLL_xuLy = new BLL_XuLy();
            int maThanhVien = Integer.parseInt(jTextField_maTV_XuLy.getText());
//                Integer maTB =  Integer.parseInt(jTextField_maTB.getText());
            int maViPham = Integer.parseInt(jtx_ma_vi_pham.getText());
            float tien = Float.parseFloat(jtxt_soTien.getText());
            Date tGMuon = new Date();
            XuLy thongTinXuLy = new XuLy();

            thongTinXuLy.setMaXL(maViPham);
            thongTinXuLy.setMaTV(maThanhVien);
//                thongTinXuLy.setMaTB(maTB);
            thongTinXuLy.setNgayXL(tGMuon);
            thongTinXuLy.setSoTien((int) tien);
            thongTinXuLy.setHinhThucSX(null);

            thongTinXuLy.setTrangThaiXL(1);

            System.out.println("----------------" + thongTinXuLy);
            bLL_xuLy.newXuLy(thongTinXuLy);
            JOptionPane.showMessageDialog(this, "Thêm thành công !");
            loadThongtinXuLyTable();
        } catch (Exception e) {
            System.out.println("com.mycompany.qlthanhvien.UI.UI_JPN_XuLyViPham.jButton_ThemActionPerformed()");
        }



    }//GEN-LAST:event_jButton_ThemActionPerformed

    private void jButton_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_capNhatActionPerformed
//      
             try {
            XuLy thongTinXuLy = new XuLy();
            int maVP = Integer.parseInt(jtx_ma_vi_pham.getText());
            int maTV = Integer.parseInt(jTextField_maTV_XuLy.getText());
//                Integer maTB = Integer.parseInt(jTextField_maTB.getText());
            String hinhThuc = txt_hinhThuc.getText();
            String tGMuonText = jTextField_tGMuon.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            Date tGMuon = sdf.parse(tGMuonText);

            float tien = Float.parseFloat(jtxt_soTien.getText());

            thongTinXuLy.setMaXL(maVP);
            thongTinXuLy.setMaTV(maTV);
            thongTinXuLy.setHinhThucSX(hinhThuc);
            thongTinXuLy.setSoTien((int) tien);
            thongTinXuLy.setNgayXL(tGMuon);
            thongTinXuLy.setTrangThaiXL(1);

            System.out.println("-----------------------" + thongTinXuLy);

            bLL_xuLy.UpdateXuLy(thongTinXuLy);

            JOptionPane.showMessageDialog(this, "Sửa thành công !");
            loadThongtinXuLyTable();

        } catch (ParseException e) {
            System.out.println("Lỗi phân tích chuỗi ngày tháng: " + e.getMessage());
        }

      

    }//GEN-LAST:event_jButton_capNhatActionPerformed

    private void jButton_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xoaActionPerformed
//        bLL_xuLy = new BLL_XuLy();

        XuLy xl = new XuLy();
        int maXL = Integer.parseInt(jtx_ma_vi_pham.getText());
        xl.setMaXL(maXL);
        bLL_xuLy.DeleteXuLy(xl);
        JOptionPane.showMessageDialog(this, "Xóa thành công !");
        loadThongtinXuLyTable();
    }//GEN-LAST:event_jButton_xoaActionPerformed

    private void jButton_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_refreshActionPerformed
//      
  loadThongtinXuLyTable();

    }//GEN-LAST:event_jButton_refreshActionPerformed

    private void jbutton_maTV_xuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_maTV_xuLyActionPerformed

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_JFR_ChonTV().setVisible(true);
            }
        });

    }//GEN-LAST:event_jbutton_maTV_xuLyActionPerformed

    private void jTextField_maTV_XuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_maTV_XuLyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_maTV_XuLyActionPerformed

    private void jbutton_ma_hinhThucPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_ma_hinhThucPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_ma_hinhThucPhatActionPerformed

    private void jtx_ma_vi_phamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtx_ma_vi_phamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtx_ma_vi_phamActionPerformed

    private void jtxt_soTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_soTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_soTienActionPerformed

    private void jTextField_hoTen_XuLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_hoTen_XuLyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_hoTen_XuLyActionPerformed

    private void txt_hinhThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hinhThucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hinhThucActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Them;
    private javax.swing.JButton jButton_capNhat;
    private javax.swing.JButton jButton_refresh;
    private javax.swing.JButton jButton_xoa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTextField_hoTen_XuLy;
    public static javax.swing.JTextField jTextField_maTV_XuLy;
    private javax.swing.JTextField jTextField_tGMuon;
    private javax.swing.JButton jbutton_maTV_xuLy;
    private javax.swing.JButton jbutton_ma_hinhThucPhat;
    private javax.swing.JTable jtab_xuly;
    private javax.swing.JTextField jtx_ma_vi_pham;
    private javax.swing.JTextField jtxt_soTien;
    private javax.swing.JTextField txt_hinhThuc;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
