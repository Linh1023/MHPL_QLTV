/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlthanhvien.UI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import com.mycompany.qlthanhvien.BLL.BLL_ThongTinSD;
import com.mycompany.qlthanhvien.BLL.ThongTinSD;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class UI_JPN_ThongTinSD extends javax.swing.JPanel {

    /**
     * Creates new form UI_ThongTinSuDung
     */
    private BLL_ThongTinSD bLL_ThongTinSD;
     DefaultTableModel model;
    
    public UI_JPN_ThongTinSD() {
        initComponents();
        bLL_ThongTinSD = new BLL_ThongTinSD();
         loadThongtinSDTable();
    }
    
    public void  loadThongtinSDTable () {
          bLL_ThongTinSD = new BLL_ThongTinSD();
          List<ThongTinSD> thongTinSDs = bLL_ThongTinSD.getThongTinSD();
          Object[][] objectses;
          objectses = bLL_ThongTinSD.convertListThongTinSD(thongTinSDs);
          String[] title = {"MaTT", "Mã thành viên", "Tên thành viên", "Mã thiết bị",
              "Tên thiết bị", "Thời gian mượn", "Thời gian trả", "Trạng thái"};
          model = new DefaultTableModel(objectses, title);
          jTable_XL_Vipham.setModel(model);
    }
    
    public void  loadThongtinSDTable_Search (List<ThongTinSD> thongTinSDs) {
          bLL_ThongTinSD = new BLL_ThongTinSD();
          Object[][] objectses;
          objectses = bLL_ThongTinSD.convertListThongTinSD(thongTinSDs);
          String[] title = {"MaTT", "Mã thành viên", "Tên thành viên", "Mã thiết bị",
              "Tên thiết bị", "Thời gian mượn", "Thời gian trả", "Trạng thái"};
          model = new DefaultTableModel(objectses, title);
          jTable_XL_Vipham.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_timKiemTheo = new javax.swing.JComboBox<>();
        jTextField_timKiem = new javax.swing.JTextField();
        jButton_timKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_XL_Vipham = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_maTT_muon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_tGMuon = new javax.swing.JTextField();
        jButton_choMuon = new javax.swing.JButton();
        jButton_capNhat_muon = new javax.swing.JButton();
        jButton_xoa = new javax.swing.JButton();
        jButton_lamMoi_muonTB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_maTV = new javax.swing.JTextField();
        jbutton_maTV = new javax.swing.JButton();
        jTextField_hoTen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_maTB = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField_tenTB = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_tGTra = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton_dangMuon = new javax.swing.JRadioButton();
        jRadioButton_daTra = new javax.swing.JRadioButton();
        jButton_lamMoi_timKiem = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel2.setText("Quản lý mượn trả thiết bị");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Tìm kiếm :");

        jComboBox_timKiemTheo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MaTV", "MaTB" }));

        jTextField_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_timKiemActionPerformed(evt);
            }
        });

        jButton_timKiem.setText("Tìm kiếm ");
        jButton_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_timKiemActionPerformed(evt);
            }
        });

        jTable_XL_Vipham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MaTT", "Mã Thành viên", "Tên thành viên", "Mã Thiết bị", "Tên Thiết bị", "TG Mượn", "TG Trả", "Trạng thái"
            }
        ));
        jTable_XL_Vipham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_XL_ViphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_XL_Vipham);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Mượn thiết bị");

        jLabel4.setText("Mã thông tin :");

        jTextField_maTT_muon.setEditable(false);
        jTextField_maTT_muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_maTT_muonActionPerformed(evt);
            }
        });

        jLabel7.setText("Thời gian mượn :");

        jTextField_tGMuon.setEditable(false);
        jTextField_tGMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_tGMuonActionPerformed(evt);
            }
        });

        jButton_choMuon.setText("Cho mượn");
        jButton_choMuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_choMuonActionPerformed(evt);
            }
        });

        jButton_capNhat_muon.setText("Cập nhật");
        jButton_capNhat_muon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_capNhat_muonActionPerformed(evt);
            }
        });

        jButton_xoa.setText("Xóa");
        jButton_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xoaActionPerformed(evt);
            }
        });

        jButton_lamMoi_muonTB.setText("Làm mới");
        jButton_lamMoi_muonTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lamMoi_muonTBActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Mã thành viên :");

        jTextField_maTV.setEditable(false);
        jTextField_maTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_maTVActionPerformed(evt);
            }
        });

        jbutton_maTV.setText("Chọn thành viên");
        jbutton_maTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_maTVActionPerformed(evt);
            }
        });

        jTextField_hoTen.setEditable(false);

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
                        .addComponent(jTextField_maTV, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbutton_maTV))
                    .addComponent(jTextField_hoTen))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_maTV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_maTV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setText("Mã thiết bị :");

        jTextField_maTB.setEditable(false);

        jButton1.setText("Chọn thiết bị");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Tên thiết bị :");

        jTextField_tenTB.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField_maTB, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField_tenTB))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_maTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField_tenTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_maTT_muon, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_tGMuon, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jButton_choMuon)
                            .addGap(18, 18, 18)
                            .addComponent(jButton_capNhat_muon, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_xoa)
                            .addGap(35, 35, 35)
                            .addComponent(jButton_lamMoi_muonTB))))
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
                    .addComponent(jTextField_maTT_muon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField_tGMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_xoa)
                    .addComponent(jButton_lamMoi_muonTB)
                    .addComponent(jButton_capNhat_muon)
                    .addComponent(jButton_choMuon))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Cập nhật trạng thái");

        jLabel12.setText("Thời gian trả :");

        jTextField_tGTra.setEditable(false);

        jLabel13.setText("Trạng thái :");

        buttonGroup1.add(jRadioButton_dangMuon);
        jRadioButton_dangMuon.setText("Đang mượn");

        buttonGroup1.add(jRadioButton_daTra);
        jRadioButton_daTra.setText("Đã trả");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_tGTra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_dangMuon)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton_daTra)
                        .addGap(94, 94, 94))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jRadioButton_dangMuon)
                    .addComponent(jRadioButton_daTra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField_tGTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButton_lamMoi_timKiem.setText("Làm mới");
        jButton_lamMoi_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_lamMoi_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 441, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_timKiemTheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_timKiem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_lamMoi_timKiem))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_timKiemTheo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_timKiem)
                    .addComponent(jLabel1)
                    .addComponent(jButton_lamMoi_timKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 213, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_timKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_timKiemActionPerformed

    private void jTextField_maTT_muonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_maTT_muonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_maTT_muonActionPerformed

    private void jButton_choMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_choMuonActionPerformed
        
        if (jTextField_maTT_muon.getText().equals("") == true){
            if (jTextField_maTV.getText().equals("") == false && jTextField_maTB.getText().equals("") == false) {
                bLL_ThongTinSD = new BLL_ThongTinSD();
            int maTV = Integer.parseInt(jTextField_maTV.getText());
            Integer maTB =  Integer.parseInt(jTextField_maTB.getText());
            Date tGMuon = new Date();
            ThongTinSD thongTinSD = new ThongTinSD();
            thongTinSD.setMaTV(maTV);
            thongTinSD.setMaTB(maTB);
            thongTinSD.setTGMuon(tGMuon);
            
            bLL_ThongTinSD.addThongTinSD(thongTinSD);
            JOptionPane.showMessageDialog(this,"Thêm thành công !");
            loadThongtinSDTable();
            } else {
                 JOptionPane.showMessageDialog(this,"Vui lòng chọn thành viên và thiết bị !");
            }
            
       } else {
           JOptionPane.showMessageDialog(this,"Vui lòng bấm reset để thêm thông tin sử dụng !");
       }
            
       

    }//GEN-LAST:event_jButton_choMuonActionPerformed

    private void jbutton_maTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_maTVActionPerformed
       
            /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_JFR_ChonTV().setVisible(true);
            }
        });
        
        
    }//GEN-LAST:event_jbutton_maTVActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
             /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_JRF_ChonTB().setVisible(true);
            }
        });
          
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable_XL_ViphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_XL_ViphamMouseClicked
        int index = jTable_XL_Vipham.getSelectedRow();
        model = (DefaultTableModel) jTable_XL_Vipham.getModel();
        
        jTextField_maTT_muon.setText(model.getValueAt(index, 0)+"");
        jTextField_maTV.setText(model.getValueAt(index, 1)+"");
        jTextField_hoTen.setText(model.getValueAt(index, 2)+"");
        jTextField_maTB.setText(model.getValueAt(index, 3)+"");
        jTextField_tenTB.setText(model.getValueAt(index, 4)+"");
        jTextField_tGMuon.setText(model.getValueAt(index, 5)+"");
        jTextField_tGTra.setText(model.getValueAt(index, 6)+"");
        if (model.getValueAt(index, 6)==null) {
            System.out.println("Đang mượn");
            jRadioButton_dangMuon.setSelected(true);
        } else {
            System.out.println("Đã trả");
            jRadioButton_daTra.setSelected(true);
        }
        
        
        
        
    }//GEN-LAST:event_jTable_XL_ViphamMouseClicked

    public void reset () {
        loadThongtinSDTable();
        jTextField_maTT_muon.setText("");
        jTextField_maTV.setText("");
        jTextField_hoTen.setText("");
        jTextField_maTB.setText("");
        jTextField_tenTB.setText("");
        jTextField_tGTra.setText("");
        jTextField_tGMuon.setText("");
        
    }
    
    private void jButton_capNhat_muonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_capNhat_muonActionPerformed
     if (jTextField_maTT_muon.getText().equals("") == false) {
         try {
            ThongTinSD thongTinSD = new ThongTinSD();
            int maTT = Integer.parseInt(jTextField_maTT_muon.getText());
            int maTV = Integer.parseInt(jTextField_maTV.getText());
            Integer maTB =  Integer.parseInt(jTextField_maTB.getText());
        
            String tGMuonText = jTextField_tGMuon.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
            Date tGMuon = sdf.parse(tGMuonText);
            
            Date tGTra;
            String tGTraText = jTextField_tGTra.getText();
            if (tGTraText.equals("null") == false)  // trả rồi
            {
                if (jRadioButton_dangMuon.isSelected() == true) { // click vào chưa trả
                     tGTra = null;
                } else { // không  click vào chưa trả
                    tGTra = sdf.parse(tGTraText);
                } 
            } else // chưa trả 
            {
                  if (jRadioButton_daTra.isSelected() == true) // click vao đã trả
                  {
                      tGTra = new Date();
                  }  else { // không click vào đã trả
                      tGTra = null;
                  }
                  
            }
            
            thongTinSD.setMaTT(maTT);
            thongTinSD.setMaTV(maTV);
            thongTinSD.setMaTB(maTB);
            thongTinSD.setTGMuon(tGMuon);
            thongTinSD.setTGTra(tGTra);
            
            bLL_ThongTinSD.updateThongTinSD(thongTinSD);
            JOptionPane.showMessageDialog(this,"Sửa thành công !");

           
            reset();
            
            
        } catch (ParseException e) {
            System.out.println("Lỗi phân tích chuỗi ngày tháng: " + e.getMessage());
        }
     } else {
         JOptionPane.showMessageDialog(this,"Vui lòng chọn dữ liệu !");
     }   
        
        

        
    }//GEN-LAST:event_jButton_capNhat_muonActionPerformed

    private void jButton_lamMoi_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lamMoi_timKiemActionPerformed
     loadThongtinSDTable();
     jTextField_timKiem.setText("");
    }//GEN-LAST:event_jButton_lamMoi_timKiemActionPerformed

    private void jButton_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xoaActionPerformed
     if (jTextField_maTT_muon.getText().equals("") == false) {
          bLL_ThongTinSD = new BLL_ThongTinSD();
        ThongTinSD thongTinSD = new ThongTinSD();
        int maTT = Integer.parseInt(jTextField_maTT_muon.getText());
        thongTinSD.setMaTT(maTT);
        bLL_ThongTinSD.deleteThongTinSD(thongTinSD);
         JOptionPane.showMessageDialog(this,"Xóa thành công !");

            reset();
     } else {
          JOptionPane.showMessageDialog(this,"Vui lòng chọn thông tin!");
     }
       
            
        
    }//GEN-LAST:event_jButton_xoaActionPerformed

    private void jButton_lamMoi_muonTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_lamMoi_muonTBActionPerformed
       reset();
    }//GEN-LAST:event_jButton_lamMoi_muonTBActionPerformed

    private void jButton_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_timKiemActionPerformed
        bLL_ThongTinSD = new BLL_ThongTinSD();
        loadThongtinSDTable_Search(bLL_ThongTinSD.searchThongTinSD_MaTV_MaTB(jComboBox_timKiemTheo.getSelectedItem().toString(), jTextField_timKiem.getText()));
    }//GEN-LAST:event_jButton_timKiemActionPerformed

    private void jTextField_tGMuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_tGMuonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_tGMuonActionPerformed

    private void jTextField_maTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_maTVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_maTVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_capNhat_muon;
    private javax.swing.JButton jButton_choMuon;
    private javax.swing.JButton jButton_lamMoi_muonTB;
    private javax.swing.JButton jButton_lamMoi_timKiem;
    private javax.swing.JButton jButton_timKiem;
    private javax.swing.JButton jButton_xoa;
    private javax.swing.JComboBox<String> jComboBox_timKiemTheo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton_daTra;
    private javax.swing.JRadioButton jRadioButton_dangMuon;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_XL_Vipham;
    public static javax.swing.JTextField jTextField_hoTen;
    public static javax.swing.JTextField jTextField_maTB;
    private javax.swing.JTextField jTextField_maTT_muon;
    public static javax.swing.JTextField jTextField_maTV;
    private javax.swing.JTextField jTextField_tGMuon;
    private javax.swing.JTextField jTextField_tGTra;
    public static javax.swing.JTextField jTextField_tenTB;
    private javax.swing.JTextField jTextField_timKiem;
    private javax.swing.JButton jbutton_maTV;
    // End of variables declaration//GEN-END:variables
}
