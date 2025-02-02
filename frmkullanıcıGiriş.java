/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package otelotamsyonu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class frmkullanıcıGiriş extends javax.swing.JFrame {

    public frmkullanıcıGiriş() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_ad = new javax.swing.JTextField();
        txt_soyad = new javax.swing.JTextField();
        txt_tc = new javax.swing.JTextField();
        txt_şifre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Hoefler Text", 2, 12)); // NOI18N
        jLabel1.setText("Ad:");

        jLabel2.setFont(new java.awt.Font("Hiragino Mincho ProN", 2, 14)); // NOI18N
        jLabel2.setText("Soyad:");

        jLabel3.setFont(new java.awt.Font("Hiragino Sans", 3, 13)); // NOI18N
        jLabel3.setText("Tc No:");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel4.setText("Şifre:");

        txt_soyad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soyadActionPerformed(evt);
            }
        });

        txt_tc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tcActionPerformed(evt);
            }
        });

        jButton1.setText("Giriş");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("Kokonor", 0, 18)); // NOI18N
        jLabel5.setText("Otel Kullanıcı Girişi");

        jButton2.setText("Geri");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_ad)
                                    .addComponent(txt_soyad)
                                    .addComponent(txt_tc)
                                    .addComponent(txt_şifre, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_şifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tcActionPerformed

    }//GEN-LAST:event_txt_tcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Sadece otel yöneticilerinin girebilecği bölüm için bu girş kullanılır.Sqlde kayıtlı kullanıcılar girebilir sadece.

        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema1", "root", "12345678");
            Statement st = c.createStatement();

            String kullanıcıAdı = txt_ad.getText();
            if (!kullanıcıAdı.matches("^[a-zA-Z0-9]{3,16}$")) {
                JOptionPane.showMessageDialog(null, "Geçersiz kullanıcı adı.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String soyad = txt_soyad.getText();
            if (!soyad.matches("^[a-zA-Z]{2,}$")) {
                JOptionPane.showMessageDialog(null, "Geçersiz soyad.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String şifre = txt_şifre.getText();
            // Şifre en az 3 rakam içermeli
            if (!şifre.matches("^\\w{3,}$")) {
                JOptionPane.showMessageDialog(null, "Geçersiz şifre.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String tcNo = txt_tc.getText();
            if (!tcNo.matches("[1-9]{1}[0-9]{10}")) {
                JOptionPane.showMessageDialog(null, "Geçersiz TC kimlik numarası.", "Hata", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String sorgu = "SELECT * FROM new_schema1.new_table1 WHERE Ad = ?";
            PreparedStatement ps = c.prepareStatement(sorgu);
            ps.setString(1, kullanıcıAdı);
            ResultSet rs = ps.executeQuery();
// Kullanıcı bulunursa
            if (rs.next()) {
                 // Kullanıcı bilgilerini alır
                String ad = rs.getString("Ad");
// TC kimlik numarasını kontrol eder
                if (!tcNo.equals(rs.getString("Tc"))) {

                    JOptionPane.showMessageDialog(null, "Geçersiz TC kimlik numarası.", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;

                }
                if (!şifre.equals(rs.getString("Şifre"))) {
                    JOptionPane.showMessageDialog(null, "Geçersiz ŞİFRE.", "Hata", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                System.out.println("Ad: " + ad + ", Soyad: " + soyad + ", Tc: " + tcNo + ", Şifre: " + şifre);
                JOptionPane.showMessageDialog(null, "Giriş yaptınız.", "Bilgi", JOptionPane.INFORMATION_MESSAGE);

                frmkullanıcısayfası yenıkul = new frmkullanıcısayfası();
                dispose();
                yenıkul.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Kayıt bulunamadı.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bir hata oluştu: " + e.getMessage(), "Hata", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_soyadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soyadActionPerformed

    }//GEN-LAST:event_txt_soyadActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        frmIlkEkran yenEkran = new frmIlkEkran();
        dispose();
        yenEkran.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmkullanıcıGiriş().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_ad;
    private javax.swing.JTextField txt_soyad;
    private javax.swing.JTextField txt_tc;
    private javax.swing.JTextField txt_şifre;
    // End of variables declaration//GEN-END:variables
}
